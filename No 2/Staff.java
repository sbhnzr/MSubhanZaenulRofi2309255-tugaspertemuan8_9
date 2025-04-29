/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.subhan.pertemuan9;

/**
 *
 * @author user
 */
// Menggunakan final agar tidak bisa diwarisi (Preventing inheritance)
public final class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    // Menggunakan final agar method tidak bisa di-override
    @Override
    public final String toString() {
        return "Class: Staff, Name: " + name;
    }
}
