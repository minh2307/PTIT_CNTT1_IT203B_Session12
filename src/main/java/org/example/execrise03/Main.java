package org.example.execrise03;
import java.math.BigDecimal;
// JDBC bắt buộc phải gọi registerOutParameter() trước khi thực thi vì với CallableStatement, driver cần biết trước tham số nào là OUT và kiểu dữ liệu của nó để chuẩn bị vùng nhận kết quả từ Stored Procedure.
public class Main {
    public static void main(String[] args) {
        SurgeryFeeService service = new SurgeryFeeService();

        int surgeryId = 505;
        BigDecimal fee = service.getSurgeryFee(surgeryId);

        if (fee != null) {
            System.out.println("Tổng chi phí phẫu thuật: " + fee);
        } else {
            System.out.println("Không lấy được chi phí phẫu thuật.");
        }
    }
}
