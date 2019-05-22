package ru.geekbrains.JavaCore2.lesson3Collections;

import java.util.*;

public class PhoneBook {

    Map<Integer, String> phoneBook = new HashMap<>();

    public PhoneBook(Map<Integer, String> phoneBook) {
        this.phoneBook = phoneBook;
    }


    //    public PhoneBook() {
//        this.phoneBook = new HashMap<>();
//    }
//
//        String searchName = "Иванов";
//
//        HashMap<Integer, String> phoneBook = new HashMap<>();
//        phoneBook.put(8888888, "Иванов");
//        phoneBook.put(8888887, "Иванов");
//        phoneBook.put(8888886, "Иванов");
//        phoneBook.put(8888885, "Иванов");
//        phoneBook.put(5555555, "Петров");
//        phoneBook.put(4444444, "Петров");
//        phoneBook.put(3333333, "Сидоров");
//        phoneBook.put(2222222, "Овсов");
//        phoneBook.put(1111111, "Конев");
//
//        Integer phoneNumber = phoneBook.get()
//        System.out.println();
//
//    }
//    private Map<String, Integer> phoneBook;
//
//    // конструктор
//    public PhoneBook() {
//        this.phoneBook = new HashMap<>();
//    }
//
//    //  добавить запись в телефонную книгу
//    public void addRecord (Integer phoneNumber, String surname) {
//        return phoneBook;
//    }
//
//    public void setPhoneBook(Map<String, Integer> phoneBook) {
//        this.phoneBook = phoneBook;
//    }
}
