/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.subhan.pertemuan8;


public class ObjekGeometri {
    private String color;
    private boolean filled = false;

    public ObjekGeometri(){}

    public ObjekGeometri(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public String toString(){
        return "Warna: " + color + ", Terisi: " + filled;
    }
}
