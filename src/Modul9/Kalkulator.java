package Modul9;

import java.awt.*;
import javax.swing.*;

public class Kalkulator extends javax.swing.JFrame {
    private JTextField display;    
    private String angka = "";
    private String operator;
    private double bil1, bil2, hasil;

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt){
        //To Do add ur handling code here
        angka += "0";
        display.setText(angka);
    }

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt){
        //To Do add ur handling code here
        angka += "1";
        display.setText(angka);
    }
    
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt){
        //To Do add ur handling code here
        angka += "2";
        display.setText(angka);
    }
    
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt){
        //To Do add ur handling code here
        angka += "3";
        display.setText(angka);
    }
    
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt){
        //To Do add ur handling code here
        angka += "4";
        display.setText(angka);
    }    

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt){
        //To Do add ur handling code here
        angka += "5";
        display.setText(angka);
    }
    
    private void jButton7MouseClicked(java.awt.event.MouseEvent evt){
        //To Do add ur handling code here
        angka += "6";
        display.setText(angka);
    }
    
    private void jButton8MouseClicked(java.awt.event.MouseEvent evt){
        //To Do add ur handling code here
        angka += "7";
        display.setText(angka);
    }

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt){
        //To Do add ur handling code here
       angka += "8";
       display.setText(angka);
    }

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt){
        //To Do add ur handling code here
       angka += "9";
       display.setText(angka);
    }

    private void jButtonDotMouseClicked(java.awt.event.MouseEvent evt){
        //To Do add ur handling code here
        if (!angka.contains(".")){
        angka += ".";
        display.setText(angka);
        }
    }

    private void jButtonPlusMouseClicked(java.awt.event.MouseEvent evt){
        //To Do add ur handling code here
        try{
            bil1 = Double.parseDouble(angka);
            operator = "+";
            angka = "";
            display.setText(angka);
        }
        catch(NumberFormatException error){
            display.setText("Terjadi kesalahan");
        }
    }

    private void jButtonMinusMouseClicked(java.awt.event.MouseEvent evt){
        //To Do add ur handling code here
        try{
            bil1 = Double.parseDouble(angka);
            operator = "-";
            angka = "";
            display.setText(angka);
        } 
        catch(NumberFormatException error){
            display.setText("Terjadi Kesalahan");
        }
    }

    private void jButtonMultiplyMouseClicked(java.awt.event.MouseEvent evt){
        // To Do ur handling code here
        try{
            bil1 = Double.parseDouble(angka);
            operator = "*";
            angka = "";
            display.setText(angka);
        }
        catch(NumberFormatException error){
            display.setText("Terjadi kesalahan");
        }
    }

    private void jButtonDivideMouseClicked(java.awt.event.MouseEvent evt){
        //To Do ur handling code here
        try{
            bil1 = Double.parseDouble(angka);
            operator = "/";
            angka = "";
            display.setText(angka);
        }
        catch(NumberFormatException error){
            display.setText("Terjadi kesalahan");
        }
    }

    private void jButtonPercentMouseClicked(java.awt.event.MouseEvent evt){
        //To Do ur handling code here
        try{
            bil1 = Double.parseDouble(angka);
            operator = "%";
            angka = "";
            display.setText(angka);
        }
        catch(NumberFormatException error){
            display.setText("Terjadi kesalahan");
        }
    }

    private void jButtonModulusMouseClicked(java.awt.event.MouseEvent evt){
        //To Do ur handling code here
        try{
            bil1 = Double.parseDouble(angka);
            operator = "mod";
            angka = "";
            display.setText(angka);
        }
        catch(NumberFormatException error){
            display.setText("Terjadi kesalahan");
        }
    }

    private void jButtonSquareMouseClicked(java.awt.event.MouseEvent evt){
        //To Do ur handling code here
        try{
            bil1 = Double.parseDouble(angka);
            double hasil = Math.pow(bil1, 2);
            angka = String.valueOf(hasil);
            display.setText(angka);
        }
        catch(NumberFormatException error){
            display.setText("Terjadi kesalahan");
        }
    }

    private void jButtonCubicMouseClicked(java.awt.event.MouseEvent evt){
        //To Do ur handling code here
        try{
            bil1 = Double.parseDouble(angka);
            hasil = Math.pow(bil1,3);
            angka = String.valueOf(hasil);
            display.setText(angka);
        }
        catch(NumberFormatException error){
            display.setText("Terjadi kesalahan");
        }
    }

    private void jButtonSquareRootMouseClicked(java.awt.event.MouseEvent evt){
        //To Do ur handling code here
        try{
            bil1 = Double.parseDouble(angka);
            if(bil1 >= 0){
                double hasil = Math.sqrt(bil1);
                angka = String.valueOf(hasil);
                display.setText(angka);
            }
        }
        catch(NumberFormatException error){
            display.setText("Terjadi kesalahan");
        }
    }
    
    private void jButtonDeleteMouseClicked(java.awt.event.MouseEvent evt){
        //To Do ur handling code here
        if(!angka.isEmpty()){
            angka = angka.substring(0, angka.length() - 1);
            display.setText(angka);
        }
    }

    private void jButtonClearMouseClicked(java.awt.event.MouseEvent evt){
        //To Do ur handling code here
       angka = "";
       operator = null;
       bil1 = 0;
       bil2 = 0;
       hasil = 0;
       display.setText("");
    }

    private void jButtonEqualMouseClicked(java.awt.event.MouseEvent evt){
        try{
            bil2 = Double.parseDouble(angka);
            double hasil;
            switch (operator) {
                case "+":
                    hasil = bil1 + bil2;
                    break;
                case "-":
                    hasil = bil1 - bil2;
                    break;
                case "*":
                    hasil = bil1 * bil2;
                    break;
                case "/":
                    if(bil2 != 0){
                        hasil = bil1 / bil2;
                    }        
                    else{
                        display.setText("Tidak terdefinisi");
                        return;
                    }
                    break;
                case "%":
                    if(bil2 == 0){
                        hasil = bil1/100; 
                    }
                    else{
                    hasil = bil1 * bil2 / 100;
                    }
                    break;
                case "mod":
                    if(bil2 != 0){
                    hasil = bil1 % bil2;
                    }
                    else {
                        display.setText("Terjadi kesalahan");
                        return;
                    }
                    break;
                case "square":
                    hasil = Math.pow(bil1, 2);
                    break;
                case "cube":
                    hasil = Math.pow(bil1, 3);
                    break;
                case "root":
                    if(bil1 >= 0){
                        hasil = Math.sqrt(bil1);
                    }        
                    else{
                        display.setText("Terjadi kesalahan");
                        return;
                    }
                    break;
                default:
                    display.setText("Error");
                    return;
            }
            angka = String.valueOf(hasil);
            display.setText(angka);
        } catch(NumberFormatException error){
            display.setText("Terjadi kesalahan");
        }
    }

    public void initComponents(){
        setTitle("Kalkulator Sulthan");
        setSize(1000, 1100);
        setMinimumSize(new java.awt.Dimension(500,550));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display, BorderLayout.NORTH);

        //wadah untuk tombol
        JPanel buttonPanel = new JPanel(new GridLayout(6, 4, 5, 5));

        JButton tombolClear = new JButton("AC");
        tombolClear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombolClear.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
               jButtonClearMouseClicked(evt);
            }
        });
        buttonPanel.add(tombolClear);

        JButton tombolHapus = new JButton("Del");
        tombolHapus.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombolHapus.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButtonDeleteMouseClicked(evt);
            }
        });
        buttonPanel.add(tombolHapus);

        JButton tombolModulus = new JButton("mod");
        tombolModulus.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombolModulus.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButtonModulusMouseClicked(evt);
            }
        });
        buttonPanel.add(tombolModulus);

        JButton tombolBagi = new JButton("/");
        tombolBagi.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombolBagi.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButtonDivideMouseClicked(evt);
            }
        });
        buttonPanel.add(tombolBagi);

        JButton tombolPangkat2 = new JButton("X²");
        tombolPangkat2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombolPangkat2.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButtonSquareMouseClicked(evt);
            }    
        });
        buttonPanel.add(tombolPangkat2);

        JButton tombolPangkat3 = new JButton("X³");
        tombolPangkat3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombolPangkat3.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
               jButtonCubicMouseClicked(evt);
            }    
        });
        buttonPanel.add(tombolPangkat3);

        JButton tombolAkar = new JButton("√");
        tombolAkar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombolAkar.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButtonSquareRootMouseClicked(evt);
            }
        });
        buttonPanel.add(tombolAkar);

        JButton tombolKali = new JButton("x");
        tombolKali.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombolKali.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButtonMultiplyMouseClicked(evt);
            }
        });
        buttonPanel.add(tombolKali);

        JButton tombol7 = new JButton("7");
        tombol7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombol7.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton8MouseClicked(evt);
            }    
        });
        buttonPanel.add(tombol7);
        
        JButton tombol8 = new JButton("8");
        tombol8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombol8.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton9MouseClicked(evt);
            }
        });
        buttonPanel.add(tombol8);
        
        JButton tombol9 = new JButton("9");
        tombol9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombol9.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton10MouseClicked(evt);
            }
        });
        buttonPanel.add(tombol9);

        JButton tombolMinus = new JButton("-");
        tombolMinus.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombolMinus.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButtonMinusMouseClicked(evt);
            }
        });
        buttonPanel.add(tombolMinus);

        JButton tombol4 = new JButton("4");
        tombol4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombol4.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton5MouseClicked(evt);
            }
        });
        buttonPanel.add(tombol4);

        JButton tombol5 = new JButton("5");
        tombol5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombol5.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton6MouseClicked(evt);
            }
        });
        buttonPanel.add(tombol5);

        JButton tombol6 = new JButton("6");
        tombol6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombol6.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton7MouseClicked(evt);
            }
        });
        buttonPanel.add(tombol6);

        JButton tombolPlus = new JButton("+");
        tombolPlus.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombolPlus.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButtonPlusMouseClicked(evt);
            }
        });
        buttonPanel.add(tombolPlus);

        JButton tombol1 = new JButton("1");
        tombol1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombol1.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton2MouseClicked(evt);
            }
        });
        buttonPanel.add(tombol1);

        JButton tombol2 = new JButton("2");
        tombol2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombol2.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton3MouseClicked(evt);
            }
        });
        buttonPanel.add(tombol2);

        JButton tombol3 = new JButton("3");
        tombol3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombol3.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton4MouseClicked(evt);
            }
        });
        buttonPanel.add(tombol3);
        
        JButton tombolEquals = new JButton("=");
        tombolEquals.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombolEquals.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButtonEqualMouseClicked(evt);
            }
        });
        buttonPanel.add(tombolEquals);

        JButton tombolPersen = new JButton("%");
        tombolPersen.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombolPersen.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButtonPercentMouseClicked(evt);
            }
        });
        buttonPanel.add(tombolPersen);

        JButton tombol0 = new JButton("0");
        tombol0.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombol0.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked(evt);
            }
        });
        buttonPanel.add(tombol0);

        JButton tombolTitik = new JButton(".");
        tombolTitik.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tombolTitik.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButtonDotMouseClicked(evt);
            }
        });
        buttonPanel.add(tombolTitik);

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public Kalkulator(){
        initComponents();
    }
}