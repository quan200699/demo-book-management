package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Nhập thông tin sách bạn cần thêm:");
                    bookManagement.inputBorrowCard();
                    break;
                }
                case 2: {
                    System.out.println("Thông tin danh sách các phiếu mượn");
                    bookManagement.showListBorrowCard();
                    break;
                }
                case 3: {
                    bookManagement.getStudentMustReturnBook();
                    break;
                }
            }
        } while (choice != 0);

    }

    private static void menu() {
        System.out.println("1. Thêm thẻ mượn");
        System.out.println("2. Hiển thị danh sách thẻ mượn");
        System.out.println("3. In ra danh sách sinh viên, tên sách mượn cần trả vào ngày cuối tháng");
        System.out.println("0. Thoát");
    }
}
