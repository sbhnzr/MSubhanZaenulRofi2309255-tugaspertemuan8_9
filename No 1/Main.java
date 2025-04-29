/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import com.subhan.pertemuan8.Segitiga;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Masukkan sisi 1: ");
            double side1 = myObj.nextDouble();
            
            System.out.print("Masukkan sisi 2: ");
            double side2 = myObj.nextDouble();
            
            System.out.print("Masukkan sisi 3: ");
            double side3 = myObj.nextDouble();
            
            System.out.print("Masukkan warna segitiga: ");
            String color = myObj.next();
            
            System.out.print("Apakah segitiga terisi (true/false)? ");
            boolean filled= myObj.nextBoolean();
            
            Segitiga segitiga = new Segitiga(side1, side2, side3, color, filled);
            
            System.out.println("\n" + segitiga.toString());
            System.out.println("Luas: " + segitiga.getArea());
            System.out.println("Keliling: " + segitiga.getPerimeter());
            System.out.println("Warna: " + segitiga.getColor());
            System.out.println("Terisi: " + segitiga.isFilled());
        }
    }
    
}
