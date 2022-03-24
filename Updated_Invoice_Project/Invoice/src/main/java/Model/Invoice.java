/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.util.ArrayList;


/**
 *
 * @author ahmed
 */
public class Invoice {

    public ArrayList<Items> items = new ArrayList<Items>();
    public int invoiceNo;
    public String date;
    public String customerName;
    public double invoiceTotal;

    Invoice(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Invoice(int invoiceNo, String date, String customerName) {
        this.invoiceNo = invoiceNo;
        this.date = date;
        this.customerName = customerName;

    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getDate() {
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

    public void Remove(int x) {

        for (int i = 0; i < items.size(); i++) {

            items.get(i).invoice.remove(x);
        }

    }

    public double getInvoiceTotal() {
        return invoiceTotal;
    }

    public ArrayList<Items> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public void addItem(Items itm) {
        getItems().add(itm);
        calculateInoviceTotal();

    }

    public void calculateInoviceTotal() {
        invoiceTotal = 0;
        for (int i = 0; i < items.size(); i++) {
         //   System.out.print(items.get(i).getItPrice());
            invoiceTotal += (items.get(i).getItPrice() * items.get(i).itCount);
        }
    }

    public void setDate(String date) {
        this.date = date;
    }

}
