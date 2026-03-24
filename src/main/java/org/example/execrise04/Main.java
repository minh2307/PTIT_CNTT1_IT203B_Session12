package org.example.execrise04;

import java.util.ArrayList;
import java.util.List;

// Khi Database Server phải Parse và tạo Execution Plan 1.000 lần cho cùng một cấu trúc câu lệnh, đó là một sự lãng phí tài nguyên rất lớn vì server cứ phải lặp lại cùng một công việc mà lẽ ra chỉ cần làm một lần.
public class Main {
    public static void main(String[] args) {
        List<TestResult> list = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            list.add(new TestResult("Ket qua xet nghiem so " + i));
        }

        ResultDAO dao = new ResultDAO();

        System.out.println("=== Chay bang Statement ===");
        dao.insertWithStatement(list);

        System.out.println("=== Chay bang PreparedStatement ===");
        dao.insertWithPreparedStatement(list);
    }
}
