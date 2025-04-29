/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.subhan.pertemuan9;

/**
 *
 * @author user
 */
public class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + name;
    }
}
