/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.subhan.pertemuan9;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
       // Polymorphism: objek disimpan sebagai tipe induk
        Person p1 = new Person("Subhan", "suakabumi", "08937382223", "subhan@gmail.com");
        Person p2 = new Student("Ryan", "Bogor", "0811111111", "ryan@email.com", Student.SENIOR);
        Person p3 = new Employee("Opik", "Pangandaran", "0822222222", "opik@email.com", "Ruang A", 
                    5000000, new MyDate(2022, 2, 15));
        Person p4 = new Faculty("Aam", "Garut", "0833333333", "aam@email.com", "Ruang B", 
                    6000000, new MyDate(2020, 6, 10), "08:00-16:00", "Lektor");
        Person p5 = new Staff("Naufal", "Bandung", "0844444444", "naufal@email.com", "Ruang C", 
                    4000000, new MyDate(2021, 3, 22), "Administrasi");

        // Semua panggil toString() yang sudah dioverride
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
    }
    
}
