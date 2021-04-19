package com.codegym;

import java.util.Scanner;

public class Student {
    private String name;

    private int id;

    private String dateOfBirth;

    private String className;

    public Student() {
    }

    public Student(String name, int id, String dateOfBirth, String className) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public void inputStudentInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mã sinh viên:");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Họ tên:");
        name = scanner.nextLine();
        System.out.println("Ngày sinh:");
        dateOfBirth = scanner.nextLine();
        System.out.println("Lớp học:");
        className = scanner.nextLine();
    }
}
