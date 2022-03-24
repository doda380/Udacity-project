/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ahmed
 */
public class Invoice {

     ArrayList<Items> items=new ArrayList<Items>();
     int invoiceNo;
     Date date;
     String customerName;
     double invoiceTotal;

    Invoice(int invoiceNo) {
    this.invoiceNo = invoiceNo;
    }

    public Invoice(int invoiceNo, Date date, String customerName) {
        this.invoiceNo = invoiceNo;
        this.date = date;
        this.customerName = customerName;
       
    }

   

    Invoice() {
        
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Date getDate() {
        return date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setInvoiceTotal(double invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    public void invoiceTotal(Items x) {
        items.add(x);

    }

    public void RemoveInvoiceTotal(Items x) {
        items.remove(x);

    }

    public double getInvoiceTotal() {
        return invoiceTotal;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

public double addItem(Items itm){
getItems().add(itm);
setInvoiceTotal(getInvoiceTotal()+itm.getItemTotal());

return  getInvoiceTotal();
}

    public void setDate(Date date) {
        this.date = date;
    }

}