/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Invoice;
import Model.Items;
import View.InvoiceGUI;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahmed
 */
public class FileOperations {

    private String savepath = "";
    private String path = "";
    public ArrayList<Invoice> invs = new ArrayList<>();
    public ArrayList<Items> itms = new ArrayList<>();
    private SimpleDateFormat d = new SimpleDateFormat("dd-mm-yyyy");

    public void ReadFile() {
        ArrayList<Items> items = null;
        invs.clear();
        JFileChooser filechooser = new JFileChooser();

        int response = filechooser.showOpenDialog(null);
        if (response == JFileChooser.APPROVE_OPTION) {
            path = filechooser.getSelectedFile().getAbsolutePath();
        }

        File f = new File(path);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            Object[] lines = br.lines().toArray();
            for (int i = 0; i < lines.length; i++) {

                String[] segmnts = lines[i].toString().split(",");
                String invNoStr = segmnts[0];
                String invDateStr = segmnts[1];
                String invCustNameStr = segmnts[2];

                int invNo = Integer.parseInt(invNoStr);
                Invoice invh = new Invoice(invNo, invDateStr, invCustNameStr);
                invs.add(invh);
            }
            br.close();
            fr.close();

            int responsse = filechooser.showOpenDialog(null);
            if (responsse == JFileChooser.APPROVE_OPTION) {
                this.savepath = filechooser.getSelectedFile().getAbsolutePath();
            }
            f = new File(savepath);
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            Object[] liness = br.lines().toArray();
            for (int i = 0; i < liness.length; i++) {
                String[] lSegmnts = liness[i].toString().split(",");
                String invNoStr = lSegmnts[0];
                String itmNameStr = lSegmnts[1];
                String itmPriceStr = lSegmnts[2];
                String ietmCountStr = lSegmnts[3];
                int invNum = Integer.parseInt(invNoStr);
                double itemPrice = Double.parseDouble(itmPriceStr);
                int itemCount = Integer.parseInt(ietmCountStr);
                Invoice inv = findNum(invNum);

                Items itm = new Items(itmNameStr, itemPrice, itemCount, inv);

                inv.addItem(itm);
                double x = itm.getItemTotal();

            }

            br.close();
            fr.close();

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }

    }

    public Invoice findNum(int num) {

        for (Invoice inv : invs) {
            if (inv.getInvoiceNo() == num) {
                return inv;
            }
        }

        return null;
    }

    public void WriteItemFile() {

        try {

            File f = new File(savepath);
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int b = 0; b < invs.size(); b++) {
                for (int c = 0; c < invs.get(b).items.size(); c++) {

                    bw.write(invs.get(b).invoiceNo + "," + invs.get(b).items.get(c).getItName() + "," + invs.get(b).items.get(c).getItPrice() + ","
                            + invs.get(b).items.get(c).getItCount() + "," + invs.get(b).items.get(c).getItemTotal());
                    bw.newLine();
                }

            }

            bw.close();
            fw.close();

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }

    }

    public void WriteInvoiceFile() {
        JFileChooser filechooser = new JFileChooser();
        int response = filechooser.showSaveDialog(null);
        if (response == JFileChooser.APPROVE_OPTION) {
            path = filechooser.getSelectedFile().getAbsolutePath();
        }

        try {
            File f = new File(path);
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int b = 0; b < invs.size(); b++) {

                bw.write(invs.get(b).getInvoiceNo() + "," + invs.get(b).getDate() + "," + invs.get(b).getCustomerName() + "," + invs.get(b).getInvoiceTotal());
                bw.newLine();
            }

            bw.close();
            fw.close();

        } catch (IOException ex) {
        }

    }
public void test(){

  for (int b = 0; b < invs.size(); b++) {
      System.out.println("invoce Number "+invs.get(b).getInvoiceNo()+": ");
     System.out.println(invs.get(b).getDate()+" , "+invs.get(b).getCustomerName());
                for (int c = 0; c < invs.get(b).items.size(); c++) {
                    System.out.println(invs.get(b).items.get(c).getItName()+" , "+invs.get(b).items.get(c).getItPrice()+" , "+invs.get(b).items.get(c).getItCount());     
                }
            }
}
}
