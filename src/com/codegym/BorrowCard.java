package com.codegym;

import java.util.Scanner;

public class BorrowCard {
    private String numberOfBorrowCard;
    private String borrowedDate;
    private String returnedDate;
    private int numberOfBook;
    private Student student = new Student();

    public BorrowCard() {
    }

    public BorrowCard(String numberOfBorrowCard, String borrowedDate, String returnedDate, int numberOfBook, Student student) {
        this.numberOfBorrowCard = numberOfBorrowCard;
        this.borrowedDate = borrowedDate;
        this.returnedDate = returnedDate;
        this.numberOfBook = numberOfBook;
        this.student = student;
    }

    @Override
    public String toString() {
        return "BorrowCard{" +
                "numberOfBorrowCard='" + numberOfBorrowCard + '\'' +
                ", borrowedDate='" + borrowedDate + '\'' +
                ", returnedDate='" + returnedDate + '\'' +
                ", numberOfBook=" + numberOfBook +
                ", student=" + student +
                '}';
    }

    public void inputBorrowCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phiếu mượn:");
        numberOfBorrowCard = scanner.nextLine();
        System.out.println("Nhập ngày mượn:");
        borrowedDate = scanner.nextLine();
        System.out.println("Nhập ngày trả:");
        returnedDate = scanner.nextLine();
        System.out.println("Số hiệu sách:");
        numberOfBook = scanner.nextInt();
        System.out.println("Nhập thông tin sinh viên:");
        student.inputStudentInfo();
    }

    public String getNumberOfBorrowCard() {
        return numberOfBorrowCard;
    }

    public void setNumberOfBorrowCard(String numberOfBorrowCard) {
        this.numberOfBorrowCard = numberOfBorrowCard;
    }

    public String getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(String borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public String getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(String returnedDate) {
        this.returnedDate = returnedDate;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void getStudentInfoInTheReturningDay() {
        String day = returnedDate.split("-")[0];
        if (Integer.parseInt(day) == 31) {
            System.out.println(this);
        }
    }
}
