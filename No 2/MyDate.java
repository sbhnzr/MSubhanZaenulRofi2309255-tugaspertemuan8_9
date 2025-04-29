/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.subhan.pertemuan9;

/**
 *
 * @author user
 */
public class MyDate {
    private int year;
    private int month; 
    private int day;

    // Constructor tanpa argumen: set default tanggal tetap, misalnya 1 Januari 2020
    public MyDate() {
        this.year = 2020;
        this.month = 0; // Januari
        this.day = 1;
    }

    // Constructor pakai parameter tahun, bulan, hari
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    
}
