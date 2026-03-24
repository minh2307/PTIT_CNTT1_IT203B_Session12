package org.example.execrise02;

import java.util.Scanner;

//Vì setDouble(), setInt() của PreparedStatement không truyền dữ liệu kiểu chuỗi theo định dạng do hệ điều hành hay người dùng quyết định, mà truyền giá trị đúng kiểu dữ liệu Java xuống JDBC Driver để driver tự chuyển sang định dạng mà DB hiểu.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatinesDAO dao = new PatinesDAO();

        System.out.print("Nhập mã bệnh nhân: ");
        String patientId = sc.nextLine();

        System.out.print("Nhập nhiệt độ mới: ");
        double temp = Double.parseDouble(sc.nextLine());

        dao.updateTemp(patientId, temp);

        sc.close();
    }
}
