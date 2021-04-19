package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {
    List<BorrowCard> borrowCards = new ArrayList<>();

    public BookManagement() {
    }

    public BookManagement(List<BorrowCard> borrowCards) {
        this.borrowCards = borrowCards;
    }

    public void showListBorrowCard() {
        for (BorrowCard borrowCard : borrowCards) {
            System.out.println(borrowCard);
        }
    }

    public void inputBorrowCard() {
        BorrowCard borrowCard = new BorrowCard();
        borrowCard.inputBorrowCard();
        borrowCards.add(borrowCard);
    }

    public void getStudentMustReturnBook() {
        for (BorrowCard borrowCard : borrowCards) {
            borrowCard.getStudentInfoInTheReturningDay();
        }
    }
}
