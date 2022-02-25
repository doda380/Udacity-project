/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

;

import java.util.ArrayList;

/**
 *
 * @author ahmed
 */
public class Items {

     String itName;
      double itPrice;
     double itemTotal;
     int itCount;
     Invoice inv;
    ArrayList<Invoice> invoice =new ArrayList<Invoice>();
    Items() {

    }

    public Items(String itName, double itPrice, int itCount, Invoice inv) {
        this.itName = itName;
        this.itPrice = itPrice;
        this.itCount = itCount;
        this.inv = inv;
        this.setItemTotal(this.itPrice*this.itCount);
    }

    

    public String getItName() {
        return itName;
    }

    public void setItName(String itName) {
        this.itName = itName;
    }

    public double getItPrice() {
        return itPrice;
    }

    public void setItPrice(double itPrice) {
        this.itPrice = itPrice;
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }

    public int getItCount() {
        return itCount;
    }

    public void setItCount(int itCount) {
        this.itCount = itCount;
    }

    public Invoice getInv() {
        return inv;
    }

    public void setInv(Invoice inv) {
        this.inv = inv;
    }



}
