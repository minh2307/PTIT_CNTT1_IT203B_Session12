package org.example.execrise01;

import java.util.Scanner;

// PreparedStatement được coi là “tấm khiên” chống SQL Injection vì nó tách riêng câu lệnh SQL và dữ liệu đầu vào của người dùng.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DocoterDAO login = new DocoterDAO();

        System.out.print("Nhập mã bác sĩ: ");
        String doctor_code = sc.nextLine();

        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();

        boolean result = login.LoginDocoter(doctor_code,password);

        if(result){
            System.out.println("Đăng ký thành công.");
        }else {
            System.out.println("Sai mã bác sĩ hoặc mật khẩu");
        }
    }
}
