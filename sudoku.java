/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashu
 */
import java.awt.Color;
import javax.swing.*;
import java.util.*;
public class sudoku extends javax.swing.JFrame {
    /**
     * Creates new form sudoku
     */
    int arr[][] = new int[9][9];
    int flag = 0,i,j,k;
    JButton bb;
    String s;
   
    void initail()
    {
        for(int v =0;v<=22;v++)
        {
            int m,n;
            Random rand = new Random();
            int value = rand.nextInt(9)+1;
            m = rand.nextInt(9);
            n = rand.nextInt(9);
                    if(m<3)
                    {
                        if(n<3)
                            k=0;
                        else if(n<6)
                            k=3;
                        else 
                            k=6;
                    }
                    else if(m<6)
                    {
                        if(n<3)
                            k=1;
                        else if(n<6)
                            k=4;
                        else 
                            k=7;
                    }
                    else
                    {
                        if(n<3)
                            k=2;
                        else if(n<6)
                            k=5;
                        else 
                            k=8;
                    }
                    if(call(m,n,k,value))
                    {
                        arr[m][n]=value;
                        s = Integer.toString(value);
                    
            if((m==0)&&(n==0))
            {
                jb0.setLabel(s);
                jb0.setEnabled(false);
            }
            else if((m==1)&&(n==0))
            {
                jb9.setLabel(s);
                jb9.setEnabled(false);
            }
            else if((m==2)&&(n==0))
            {
                jb18.setLabel(s);
                jb18.setEnabled(false);
            }
            else if((m==3)&&(n==0))
            {
                jb27.setLabel(s);
                jb27.setEnabled(false);
            }
            else if((m==4)&&(n==0))
            {
                jb36.setLabel(s);
                jb36.setEnabled(false);
            }
            else if((m==5)&&(n==0))
            {
                jb45.setLabel(s);
                jb45.setEnabled(false);
            }
            else if((m==6)&&(n==0))
            {
                jb54.setLabel(s);
                jb54.setEnabled(false);
            }
            else if((m==7)&&(n==0))
            {
                jb63.setLabel(s);
                jb63.setEnabled(false);
            }
            else if((m==8)&&(n==0))
            {
                jb72.setLabel(s);
                jb72.setEnabled(false);
            }
            
            
            else if((m==0)&&(n==1))
            {
                jb1.setLabel(s);
                jb1.setEnabled(false);
            }
            else if((m==1)&&(n==1))
            {
                jb10.setLabel(s);
                jb10.setEnabled(false);
            }
            else if((m==2)&&(n==1))
            {
                jb19.setLabel(s);
                jb19.setEnabled(false);
            }
            else if((m==3)&&(n==1))
            {
                jb28.setLabel(s);
                jb28.setEnabled(false);                
            }
            else if((m==4)&&(n==1))
            {
                jb37.setLabel(s);
                jb37.setEnabled(false);
            }
            else if((m==5)&&(n==1))
            {
                jb46.setLabel(s);
                jb46.setEnabled(false);
            }
            else if((m==6)&&(n==1))
            {
                jb55.setLabel(s);
                jb55.setEnabled(false);
            }
            else if((m==7)&&(n==1))
            {
                jb64.setLabel(s);
                jb64.setEnabled(false);
            }
            else if((m==8)&&(n==1))
            {
                jb73.setLabel(s);
                jb73.setEnabled(false);
            }
            
            
            else if((m==0)&&(n==2))
            {
                jb2.setLabel(s);
                jb2.setEnabled(false);
            }
            else if((m==1)&&(n==2))
            {
                jb11.setLabel(s);
                jb11.setEnabled(false);
            }
            else if((m==2)&&(n==2))
            {
                jb20.setLabel(s);
                jb20.setEnabled(false);
            }
            else if((m==3)&&(n==2))
            {
                jb29.setLabel(s);
                jb29.setEnabled(false);
            }
            else if((m==4)&&(n==2))
            {
                jb38.setLabel(s);
                jb38.setEnabled(false);
            }
            else if((m==5)&&(n==2))
            {
                jb47.setLabel(s);
                jb47.setEnabled(false);
            }
            else if((m==6)&&(n==2))
            {
                jb56.setLabel(s);
                jb56.setEnabled(false);
            }
            else if((m==7)&&(n==2))
            {
                jb65.setLabel(s);
                jb65.setEnabled(false);
            }
            else if((m==8)&&(n==2))
            {
                jb74.setLabel(s);
                jb74.setEnabled(false);
            }
            
            
            else if((m==0)&&(n==3))
            {
                jb3.setLabel(s);
                jb3.setEnabled(false);
            }
            else if((m==1)&&(n==3))
            {
                jb12.setLabel(s);
                jb12.setEnabled(false);
            }
            else if((m==2)&&(n==3))
            {
                jb21.setLabel(s);
                jb21.setEnabled(false);
            }
            else if((m==3)&&(n==3))
            {
                jb30.setLabel(s);
                jb30.setEnabled(false);
            }
            else if((m==4)&&(n==3))
            {
                jb39.setLabel(s);
                jb39.setEnabled(false);
            }
            else if((m==5)&&(n==3))
            {
                jb48.setLabel(s);
                jb48.setEnabled(false);
            }
            else if((m==6)&&(n==3))
            {
                jb57.setLabel(s);
                jb57.setEnabled(false);
            }
            else if((m==7)&&(n==3))
            {
                jb66.setLabel(s);
                jb66.setEnabled(false);
            }
            else if((m==8)&&(n==3))
            {
                jb75.setLabel(s);
                jb75.setEnabled(false);
            }
            
            
            else if((m==0)&&(n==4))
            {
                jb4.setLabel(s);
                jb4.setEnabled(false);
            }
            else if((m==1)&&(n==4))
            {
                jb13.setLabel(s);
                jb13.setEnabled(false);
            }
            else if((m==2)&&(n==4))
            {
                jb22.setLabel(s);
                jb22.setEnabled(false);
            }
            else if((m==3)&&(n==4))
            {
                jb31.setLabel(s);
                jb31.setEnabled(false);
            }
            else if((m==4)&&(n==4))
            {
                jb40.setLabel(s);
                jb40.setEnabled(false);
            }
            else if((m==5)&&(n==4))
            {
                jb49.setLabel(s);
                jb49.setEnabled(false);
            }
            else if((m==6)&&(n==4))
            {
                jb58.setLabel(s);
                jb58.setEnabled(false);
            }
            else if((m==7)&&(n==4))
            {
                jb67.setLabel(s);
                jb67.setEnabled(false);
            }
            else if((m==8)&&(n==4))
            {
                jb76.setLabel(s);
                jb76.setEnabled(false);
            }
            
            
            else if((m==0)&&(n==5))
            {
                jb5.setLabel(s);
                jb5.setEnabled(false);
            }
            else if((m==1)&&(n==5))
            {
                jb14.setLabel(s);
                jb14.setEnabled(false);
            }
            else if((m==2)&&(n==5))
            {
                jb23.setLabel(s);
                jb23.setEnabled(false);
            }
            else if((m==3)&&(n==5))
            {
                jb32.setLabel(s);
                jb32.setEnabled(false);
            }
            else if((m==4)&&(n==5))
            {
                jb41.setLabel(s);
                jb41.setEnabled(false);
            }
            else if((m==5)&&(n==5))
            {
                jb50.setLabel(s);
                jb50.setEnabled(false);
            }
            else if((m==6)&&(n==5))
            {
                jb59.setLabel(s);
                jb59.setEnabled(false);
            }
            else if((m==7)&&(n==5))
            {
                jb68.setLabel(s);
                jb68.setEnabled(false);
            }
            else if((m==8)&&(n==5))
            {
                jb77.setLabel(s);
                jb77.setEnabled(false);
            }
            
            
            else if((m==0)&&(n==6))
            {
                jb6.setLabel(s);
                jb6.setEnabled(false);
            }
            else if((m==1)&&(n==6))
            {
                jb15.setLabel(s);
                jb15.setEnabled(false);
            }
            else if((m==2)&&(n==6))
            {
                jb24.setLabel(s);
                jb24.setEnabled(false);
            }
            else if((m==3)&&(n==6))
            {
                jb33.setLabel(s);
                jb33.setEnabled(false);
            }
            else if((m==4)&&(n==6))
            {
                jb42.setLabel(s);
                jb42.setEnabled(false);
            }
            else if((m==5)&&(n==6))
            {
                jb51.setLabel(s);
                jb51.setEnabled(false);
            }
            else if((m==6)&&(n==6))
            {
                jb60.setLabel(s);
                jb60.setEnabled(false);
            }
            else if((m==7)&&(n==6))
            {
                jb69.setLabel(s);
                jb69.setEnabled(false);
            }
            else if((m==8)&&(n==6))
            {
                jb78.setLabel(s);
                jb78.setEnabled(false);
            }
            
            
            else if((m==0)&&(n==7))
            {
                jb7.setLabel(s);
                jb7.setEnabled(false);
            }
            else if((m==1)&&(n==7))
            {
                jb16.setLabel(s);
                jb16.setEnabled(false);
            }
            else if((m==2)&&(n==7))
            {
                jb25.setLabel(s);
                jb25.setEnabled(false);
            }
            else if((m==3)&&(n==7))
            {
                jb34.setLabel(s);
                jb34.setEnabled(false);
            }
            else if((m==4)&&(n==7))
            {
                jb43.setLabel(s);
                jb43.setEnabled(false);
            }
            else if((m==5)&&(n==7))
            {
                jb52.setLabel(s);
                jb52.setEnabled(false);
            }
            else if((m==6)&&(n==7))
            {
                jb61.setLabel(s);
                jb61.setEnabled(false);
            }
            else if((m==7)&&(n==7))
            {
                jb70.setLabel(s);
                jb70.setEnabled(false);
            }
            else if((m==8)&&(n==7))
            {
                jb79.setLabel(s);
                jb79.setEnabled(false);
            }
            
            
            else if((m==0)&&(n==8))
            {
                //jb8.setForeground(Color.red);
               // jb8.setBackground(Color.blue);
                jb8.setLabel(s);
                jb8.setEnabled(false);
            }
            else if((m==1)&&(n==8))
            {
                //jb17.setForeground(Color.red);
                //jb17.setBackground(Color.blue);
                jb17.setLabel(s);
                jb17.setEnabled(false);
            }
            else if((m==2)&&(n==8))
            {
               // jb26.setForeground(Color.red);
                //jb26.setBackground(Color.blue);
                jb26.setLabel(s);
                jb26.setEnabled(false);
            }
            else if((m==3)&&(n==8))
            {
                //jb35.setForeground(Color.red);
                //jb35.setBackground(Color.blue);
                jb35.setLabel(s);
                jb35.setEnabled(false);
            }
            else if((m==4)&&(n==8))
            {
              //jb44.setForeground(Color.red);
                //jb44.setBackground(Color.blue);
                jb44.setLabel(s);
                jb44.setEnabled(false);
            }
            else if((m==5)&&(n==8))
            {
                //jb53.setBackground(Color.blue);
               // jb53.setForeground(Color.red);
                jb53.setLabel(s);
                jb53.setEnabled(false);
            }
            else if((m==6)&&(n==8))
            {
                //jb62.setBackground(Color.blue);
                //jb62.setForeground(Color.red);
                jb62.setLabel(s);
                jb62.setEnabled(false);
            }
            else if((m==7)&&(n==8))
            {
                //jb71.setBackground(Color.blue);
               //jb71.setForeground(Color.red);
                jb71.setLabel(s);
                jb71.setEnabled(false);
            }
            else if((m==8)&&(n==8))
            {
               // jb80.setBackground(Color.blue);
               // jb80.setForeground(Color.red);
                jb80.setLabel(s);
                jb80.setEnabled(false);
            }
        }
    }
}
    boolean call(int i,int j,int k,Integer no){
        for(int l=0;l<9;l++)
        {
            if((arr[i][l] == no)&&(l!=j))
            {
                return false;
            }
            if((arr[l][j] == no)&&(l!=i))
            {
                return false;
            }
        }
        if(k%3==0)
        for(int m=k;m<k+3;m++)
            for(int n=0;n<3;n++)
            {
               if((arr[m][n]==no)&&(m!=i)&&(n!=j))
                {
                    return false;
                }
            }
        if(k%3==1)
        for(int m=k-1;m<k+2;m++)
            for(int n=3;n<6;n++)
            {
               if((arr[m][n]==no)&&(m!=i)&&(n!=j))
                {
                    return false;
                }
            }
        if(k%3==2)
        for(int m=k-2;m<k+1;m++)
            for(int n=6;n<9;n++)
            {
               if((arr[m][n]==no)&&(m!=i)&&(n!=j))
                {
                    return false;
                }
            }
        return true;
    }
    public sudoku() {
        initComponents();
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                arr[i][j] = 0;
        initail();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb10 = new javax.swing.JButton();
        jb11 = new javax.swing.JButton();
        jb12 = new javax.swing.JButton();
        jb13 = new javax.swing.JButton();
        jb14 = new javax.swing.JButton();
        jb15 = new javax.swing.JButton();
        jb16 = new javax.swing.JButton();
        jb17 = new javax.swing.JButton();
        jb18 = new javax.swing.JButton();
        jb19 = new javax.swing.JButton();
        jb20 = new javax.swing.JButton();
        jb21 = new javax.swing.JButton();
        jb22 = new javax.swing.JButton();
        jb23 = new javax.swing.JButton();
        jb24 = new javax.swing.JButton();
        jb25 = new javax.swing.JButton();
        jb26 = new javax.swing.JButton();
        jb27 = new javax.swing.JButton();
        jb28 = new javax.swing.JButton();
        jb29 = new javax.swing.JButton();
        jb30 = new javax.swing.JButton();
        jb31 = new javax.swing.JButton();
        jb32 = new javax.swing.JButton();
        jb33 = new javax.swing.JButton();
        jb34 = new javax.swing.JButton();
        jb35 = new javax.swing.JButton();
        jb36 = new javax.swing.JButton();
        jb37 = new javax.swing.JButton();
        jb38 = new javax.swing.JButton();
        jb39 = new javax.swing.JButton();
        jb40 = new javax.swing.JButton();
        jb41 = new javax.swing.JButton();
        jb42 = new javax.swing.JButton();
        jb43 = new javax.swing.JButton();
        jb44 = new javax.swing.JButton();
        jb45 = new javax.swing.JButton();
        jb46 = new javax.swing.JButton();
        jb47 = new javax.swing.JButton();
        jb48 = new javax.swing.JButton();
        jb49 = new javax.swing.JButton();
        jb50 = new javax.swing.JButton();
        jb51 = new javax.swing.JButton();
        jb52 = new javax.swing.JButton();
        jb53 = new javax.swing.JButton();
        jb54 = new javax.swing.JButton();
        jb55 = new javax.swing.JButton();
        jb56 = new javax.swing.JButton();
        jb57 = new javax.swing.JButton();
        jb58 = new javax.swing.JButton();
        jb59 = new javax.swing.JButton();
        jb60 = new javax.swing.JButton();
        jb61 = new javax.swing.JButton();
        jb62 = new javax.swing.JButton();
        jb63 = new javax.swing.JButton();
        jb64 = new javax.swing.JButton();
        jb65 = new javax.swing.JButton();
        jb66 = new javax.swing.JButton();
        jb67 = new javax.swing.JButton();
        jb68 = new javax.swing.JButton();
        jb69 = new javax.swing.JButton();
        jb70 = new javax.swing.JButton();
        jb71 = new javax.swing.JButton();
        jb72 = new javax.swing.JButton();
        jb73 = new javax.swing.JButton();
        jb74 = new javax.swing.JButton();
        jb75 = new javax.swing.JButton();
        jb76 = new javax.swing.JButton();
        jb77 = new javax.swing.JButton();
        jb78 = new javax.swing.JButton();
        jb79 = new javax.swing.JButton();
        jb80 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jb1.setPreferredSize(new java.awt.Dimension(33, 70));
        jb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb1MouseClicked(evt);
            }
        });

        jb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb2MouseClicked(evt);
            }
        });

        jb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb3MouseClicked(evt);
            }
        });

        jb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb4MouseClicked(evt);
            }
        });

        jb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb5MouseClicked(evt);
            }
        });

        jb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb6MouseClicked(evt);
            }
        });

        jb7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb7MouseClicked(evt);
            }
        });

        jb8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb8MouseClicked(evt);
            }
        });

        jb0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb0MouseClicked(evt);
            }
        });

        jb9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb9MouseClicked(evt);
            }
        });

        jb10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb10MouseClicked(evt);
            }
        });

        jb11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb11MouseClicked(evt);
            }
        });

        jb12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb12MouseClicked(evt);
            }
        });

        jb13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb13MouseClicked(evt);
            }
        });

        jb14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb14MouseClicked(evt);
            }
        });

        jb15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb15MouseClicked(evt);
            }
        });

        jb16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb16MouseClicked(evt);
            }
        });

        jb17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb17MouseClicked(evt);
            }
        });

        jb18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb18MouseClicked(evt);
            }
        });

        jb19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb19MouseClicked(evt);
            }
        });

        jb20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb20MouseClicked(evt);
            }
        });

        jb21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb21MouseClicked(evt);
            }
        });

        jb22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb22MouseClicked(evt);
            }
        });

        jb23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb23MouseClicked(evt);
            }
        });

        jb24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb24MouseClicked(evt);
            }
        });
        jb24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb24ActionPerformed(evt);
            }
        });

        jb25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb25MouseClicked(evt);
            }
        });

        jb26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb26MouseClicked(evt);
            }
        });

        jb27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb27MouseClicked(evt);
            }
        });
        jb27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb27ActionPerformed(evt);
            }
        });

        jb28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb28MouseClicked(evt);
            }
        });

        jb29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb29MouseClicked(evt);
            }
        });

        jb30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb30MouseClicked(evt);
            }
        });

        jb31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb31MouseClicked(evt);
            }
        });

        jb32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb32MouseClicked(evt);
            }
        });

        jb33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb33MouseClicked(evt);
            }
        });

        jb34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb34MouseClicked(evt);
            }
        });

        jb35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb35MouseClicked(evt);
            }
        });

        jb36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb36MouseClicked(evt);
            }
        });

        jb37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb37MouseClicked(evt);
            }
        });

        jb38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb38MouseClicked(evt);
            }
        });

        jb39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb39MouseClicked(evt);
            }
        });

        jb40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb40MouseClicked(evt);
            }
        });

        jb41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb41MouseClicked(evt);
            }
        });

        jb42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb42MouseClicked(evt);
            }
        });

        jb43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb43MouseClicked(evt);
            }
        });

        jb44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb44MouseClicked(evt);
            }
        });

        jb45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb45MouseClicked(evt);
            }
        });

        jb46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb46MouseClicked(evt);
            }
        });

        jb47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb47MouseClicked(evt);
            }
        });

        jb48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb48MouseClicked(evt);
            }
        });

        jb49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb49MouseClicked(evt);
            }
        });

        jb50.setPreferredSize(new java.awt.Dimension(55, 40));
        jb50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb50MouseClicked(evt);
            }
        });

        jb51.setPreferredSize(new java.awt.Dimension(55, 40));
        jb51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb51MouseClicked(evt);
            }
        });

        jb52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb52MouseClicked(evt);
            }
        });

        jb53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb53MouseClicked(evt);
            }
        });

        jb54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb54MouseClicked(evt);
            }
        });

        jb55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb55MouseClicked(evt);
            }
        });

        jb56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb56MouseClicked(evt);
            }
        });

        jb57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb57MouseClicked(evt);
            }
        });

        jb58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb58MouseClicked(evt);
            }
        });

        jb59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb59MouseClicked(evt);
            }
        });

        jb60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb60MouseClicked(evt);
            }
        });

        jb61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb61MouseClicked(evt);
            }
        });

        jb62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb62MouseClicked(evt);
            }
        });

        jb63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb63MouseClicked(evt);
            }
        });

        jb64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb64MouseClicked(evt);
            }
        });

        jb65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb65MouseClicked(evt);
            }
        });

        jb66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb66MouseClicked(evt);
            }
        });

        jb67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb67MouseClicked(evt);
            }
        });

        jb68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb68MouseClicked(evt);
            }
        });

        jb69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb69MouseClicked(evt);
            }
        });

        jb70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb70MouseClicked(evt);
            }
        });

        jb71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb71MouseClicked(evt);
            }
        });

        jb72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb72MouseClicked(evt);
            }
        });

        jb73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb73MouseClicked(evt);
            }
        });

        jb74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb74MouseClicked(evt);
            }
        });

        jb75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb75MouseClicked(evt);
            }
        });

        jb76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb76MouseClicked(evt);
            }
        });

        jb77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb77MouseClicked(evt);
            }
        });

        jb78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb78MouseClicked(evt);
            }
        });

        jb79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb79MouseClicked(evt);
            }
        });

        jb80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb80MouseClicked(evt);
            }
        });

        jButton1.setText("1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(jb62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb80, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jb0, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jb5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jb8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jb1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jb2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jb27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jb29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jb28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jb32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jb36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jb37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jb38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jb45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jb46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jb47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jb54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jb55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jb56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jb65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jb63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jb64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jb73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jb72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jb74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jb57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jb66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jb75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jb60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jb59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jb68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jb77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jb69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jb78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jb61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton7))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton8))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton9))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jb0, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jb9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jb36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton7)
                                    .addComponent(jButton8)
                                    .addComponent(jButton9))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 185, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jb16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jb23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jb14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jb62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb80, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jb51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jb60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jb69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jb78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jb61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jb70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jb79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jb52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jb34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jb43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(5, 5, 5)))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(825, 825, 825))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb0MouseClicked
        // TODO add your handling code here:
            bb = (JButton)evt.getSource();
            i=0;j=0;k=0;
    }//GEN-LAST:event_jb0MouseClicked

    private void jb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb1MouseClicked
    // TODO add your handling code here:
            bb = (JButton)evt.getSource();
            i=0;j=1;k=0;
    }//GEN-LAST:event_jb1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int l = Integer.parseInt(jButton1.getLabel());
        if(bb.isEnabled())
        if(call(i,j,k,l))
        {
            arr[i][j] = l;
            String s = Integer.toString(l);
            bb.setLabel(s);
            bb =null;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Repetitions of the number is not allowed");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int l = Integer.parseInt(jButton2.getLabel());
        if(bb.isEnabled())
        if(call(i,j,k,l))
        {
            arr[i][j] = l;
            String s = Integer.toString(l);
            bb.setLabel(s);
            bb =null;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Repetitions of the number is not allowed");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int l = Integer.parseInt(jButton3.getLabel());
        if(bb.isEnabled())
        if(call(i,j,k,l))
        {
            arr[i][j] = l;
            String s = Integer.toString(l);
            bb.setLabel(s);
            bb =null;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Repetitions of the number is not allowed");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int l = Integer.parseInt(jButton4.getLabel());
        if(bb.isEnabled())
        if(call(i,j,k,l))
        {
            arr[i][j] = l;
            String s = Integer.toString(l);
            bb.setLabel(s);
            bb =null;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Repetitions of the number is not allowed");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int l = Integer.parseInt(jButton5.getLabel());
        if(bb.isEnabled())
        if(call(i,j,k,l))
        {
            arr[i][j] = l;
            String s = Integer.toString(l);
            bb.setLabel(s);
            bb =null;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Repetitions of the number is not allowed");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int l = Integer.parseInt(jButton6.getLabel());
        if(bb.isEnabled())
        if(call(i,j,k,l))
        {
            arr[i][j] = l;
            String s = Integer.toString(l);
            bb.setLabel(s);
            bb =null;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Repetitions of the number is not allowed");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int l = Integer.parseInt(jButton7.getLabel());
        if(bb.isEnabled())
        if(call(i,j,k,l))
        {
            arr[i][j] = l;
            String s = Integer.toString(l);
            bb.setLabel(s);
            bb =null;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Repetitions of the number is not allowed");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int l = Integer.parseInt(jButton8.getLabel());
        if(bb.isEnabled())
        if(call(i,j,k,l))
        {
            arr[i][j] = l;
            String s = Integer.toString(l);
            bb.setLabel(s);
            bb =null;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Repetitions of the number is not allowed");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int l = Integer.parseInt(jButton9.getLabel());
        if(bb.isEnabled())
        if(call(i,j,k,l))
        {
            arr[i][j] = l;
            String s = Integer.toString(l);
            bb.setLabel(s);
            bb= null;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Repetitions of the number is not allowed");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jb18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb18MouseClicked
        // TODO add your handling code here:
        
            bb = (JButton)evt.getSource();
            i=2;j=0;k=0;
    }//GEN-LAST:event_jb18MouseClicked

    private void jb11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb11MouseClicked
        // TODO add your handling code here:
            bb = (JButton)evt.getSource();
            i=1;j=2;k=0;
    }//GEN-LAST:event_jb11MouseClicked

    private void jb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb2MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=0;j=2;k=0;
    }//GEN-LAST:event_jb2MouseClicked

    private void jb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb3MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=0;j=3;k=1;
    }//GEN-LAST:event_jb3MouseClicked

    private void jb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb4MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=0;j=4;k=1;
    }//GEN-LAST:event_jb4MouseClicked

    private void jb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb5MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=0;j=5;k=1;
    }//GEN-LAST:event_jb5MouseClicked

    private void jb6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb6MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=0;j=6;k=2;
    }//GEN-LAST:event_jb6MouseClicked

    private void jb7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb7MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=0;j=7;k=2;
    }//GEN-LAST:event_jb7MouseClicked

    private void jb8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb8MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=0;j=8;k=2;
    }//GEN-LAST:event_jb8MouseClicked

    private void jb9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb9MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=1;j=0;k=0;
    }//GEN-LAST:event_jb9MouseClicked

    private void jb10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb10MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=1;j=1;k=0;
    }//GEN-LAST:event_jb10MouseClicked

    private void jb12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb12MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=1;j=3;k=1;
    }//GEN-LAST:event_jb12MouseClicked

    private void jb13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb13MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=1;
            j=4;
            k=1;
    }//GEN-LAST:event_jb13MouseClicked

    private void jb14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb14MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=1;
            j=5;
            k=1;
    }//GEN-LAST:event_jb14MouseClicked

    private void jb15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb15MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=1;
            j=6;
            k=2;
    }//GEN-LAST:event_jb15MouseClicked

    private void jb16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb16MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=1;
            j=7;
            k=2;
    }//GEN-LAST:event_jb16MouseClicked

    private void jb17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb17MouseClicked
        // TO2 add your handling code here:
        bb = (JButton)evt.getSource();
            i=1;
            j=8;
            k=2;
    }//GEN-LAST:event_jb17MouseClicked

    private void jb19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb19MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=2;
            j=1;
            k=0;
    }//GEN-LAST:event_jb19MouseClicked

    private void jb20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb20MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=2;
            j=2;
            k=0;
    }//GEN-LAST:event_jb20MouseClicked

    private void jb21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb21MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=2;
            j=3;
            k=1;
    }//GEN-LAST:event_jb21MouseClicked

    private void jb22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb22MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=2;
            j=4;
            k=1;
    }//GEN-LAST:event_jb22MouseClicked

    private void jb23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb23MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=2;
            j=5;
            k=1;
    }//GEN-LAST:event_jb23MouseClicked

    private void jb24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb24MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=2;
            j=6;
            k=2;
    }//GEN-LAST:event_jb24MouseClicked

    private void jb25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb25MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=2;
            j=7;
            k=2;
    }//GEN-LAST:event_jb25MouseClicked

    private void jb26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb26MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=2;
            j=8;
            k=2;
    }//GEN-LAST:event_jb26MouseClicked

    private void jb27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb27MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=3;
            j=0;
            k=3;
    }//GEN-LAST:event_jb27MouseClicked

    private void jb28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb28MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=3;
            j=1;
            k=3;
    }//GEN-LAST:event_jb28MouseClicked

    private void jb29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb29MouseClicked
        // TODO1add your handling code here:
        bb = (JButton)evt.getSource();
            i=3;
            j=2;
            k=3;
    }//GEN-LAST:event_jb29MouseClicked

    private void jb30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb30MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=3;
            j=3;
            k=4;
        
    }//GEN-LAST:event_jb30MouseClicked

    private void jb31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb31MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=3;
            j=4;
            k=4;
    }//GEN-LAST:event_jb31MouseClicked

    private void jb32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb32MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=3;
            j=5;
            k=4;
    }//GEN-LAST:event_jb32MouseClicked

    private void jb33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb33MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=3;
            j=6;
            k=5;
    }//GEN-LAST:event_jb33MouseClicked

    private void jb34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb34MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=3;
            j=7;
            k=5;
    }//GEN-LAST:event_jb34MouseClicked

    private void jb35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb35MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=3;
            j=8;
            k=5;
    }//GEN-LAST:event_jb35MouseClicked

    private void jb27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb27ActionPerformed

    private void jb36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb36MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=4;
            j=0;
            k=3;
    }//GEN-LAST:event_jb36MouseClicked

    private void jb37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb37MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=4;
            j=1;
            k=3;
    }//GEN-LAST:event_jb37MouseClicked

    private void jb38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb38MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=4;
            j=2;
            k=3;
    }//GEN-LAST:event_jb38MouseClicked

    private void jb39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb39MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=4;
            j=3;
            k=4;
    }//GEN-LAST:event_jb39MouseClicked

    private void jb40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb40MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=4;
            j=4;
            k=4;
    }//GEN-LAST:event_jb40MouseClicked

    private void jb41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb41MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=4;
            j=5;
            k=4;
    }//GEN-LAST:event_jb41MouseClicked

    private void jb42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb42MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=4;
            j=6;
            k=5;
    }//GEN-LAST:event_jb42MouseClicked

    private void jb43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb43MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=4;
            j=7;
            k=5;
    }//GEN-LAST:event_jb43MouseClicked

    private void jb44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb44MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=4;
            j=8;
            k=5;
    }//GEN-LAST:event_jb44MouseClicked

    private void jb45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb45MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=5;
            j=0;
            k=3;
    }//GEN-LAST:event_jb45MouseClicked

    private void jb46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb46MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=5;
            j=1;
            k=3;
    }//GEN-LAST:event_jb46MouseClicked

    private void jb47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb47MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=5;
            j=2;
            k=3;
    }//GEN-LAST:event_jb47MouseClicked

    private void jb48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb48MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=5;
            j=3;
            k=4;
    }//GEN-LAST:event_jb48MouseClicked

    private void jb49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb49MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=5;
            j=4;
            k=4;
                                    

    }//GEN-LAST:event_jb49MouseClicked

    private void jb50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb50MouseClicked
        // TODO add your handling code here:
 bb = (JButton)evt.getSource();
            i=5;
            j=5;
            k=4;
                                 

    }//GEN-LAST:event_jb50MouseClicked

    private void jb51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb51MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=5;
            j=6;
            k=5;
                                 

        
    }//GEN-LAST:event_jb51MouseClicked

    private void jb52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb52MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=5;
            j=7;
            k=5;
                                 

    }//GEN-LAST:event_jb52MouseClicked

    private void jb53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb53MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=5;
            j=8;
            k=5;
                                 

    }//GEN-LAST:event_jb53MouseClicked

    private void jb54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb54MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=6;
            j=0;
            k=6;
                                 

    }//GEN-LAST:event_jb54MouseClicked

    private void jb55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb55MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=6;
            j=1;
            k=6;
                                 

    }//GEN-LAST:event_jb55MouseClicked

    private void jb56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb56MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=6;
            j=2;
            k=6;
                                 

    }//GEN-LAST:event_jb56MouseClicked

    private void jb57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb57MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=6;
            j=3;
            k=7;
                                 

    }//GEN-LAST:event_jb57MouseClicked

    private void jb58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb58MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=6;
            j=4;
            k=7;
                                 

    }//GEN-LAST:event_jb58MouseClicked

    private void jb59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb59MouseClicked
        // TODO add your handling code here
        bb = (JButton)evt.getSource();
            i=6;
            j=5;
            k=7;
                                 

    }//GEN-LAST:event_jb59MouseClicked

    private void jb60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb60MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=6;
            j=6;
            k=8;
                                 

    }//GEN-LAST:event_jb60MouseClicked

    private void jb61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb61MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=6;
            j=7;
            k=8;
                                 

    }//GEN-LAST:event_jb61MouseClicked

    private void jb62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb62MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=6;
            j=8;
            k=8;
                                 

    }//GEN-LAST:event_jb62MouseClicked

    private void jb63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb63MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=7;
            j=0;
            k=6;
                                 

    }//GEN-LAST:event_jb63MouseClicked

    private void jb64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb64MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=7;
            j=1;
            k=6;
                                 


    }//GEN-LAST:event_jb64MouseClicked

    private void jb65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb65MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=7;
            j=2;
            k=6;
                                 


    }//GEN-LAST:event_jb65MouseClicked

    private void jb66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb66MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=7;
            j=3;
            k=7;
                                 


                                 


    }//GEN-LAST:event_jb66MouseClicked

    private void jb67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb67MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=7;
            j=4;
            k=7;
                                 


    }//GEN-LAST:event_jb67MouseClicked

    private void jb68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb68MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=7;
            j=5;
            k=7;
                                 


    }//GEN-LAST:event_jb68MouseClicked

    private void jb69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb69MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=7;
            j=6;
            k=8;
                                 


    }//GEN-LAST:event_jb69MouseClicked

    private void jb70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb70MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=7;
            j=7;
            k=8;
                                 


    }//GEN-LAST:event_jb70MouseClicked

    private void jb71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb71MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=7;
            j=8;
            k=8;
                                 


    }//GEN-LAST:event_jb71MouseClicked

    private void jb72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb72MouseClicked
        // TODO add your handling code here:
         bb = (JButton)evt.getSource();
            i=8;
            j=0;
            k=6;
                                 


    }//GEN-LAST:event_jb72MouseClicked

    private void jb73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb73MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=8;
            j=1;
            k=6;
                       
    }//GEN-LAST:event_jb73MouseClicked

    private void jb74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb74MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=8;
            j=2;
            k=6;
                       
    }//GEN-LAST:event_jb74MouseClicked

    private void jb75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb75MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=8;
            j=3;
            k=7;
                       
    }//GEN-LAST:event_jb75MouseClicked

    private void jb76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb76MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=8;
            j=4;
            k=7;
                       
    }//GEN-LAST:event_jb76MouseClicked

    private void jb77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb77MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=8;
            j=5;
            k=7;
                       
    }//GEN-LAST:event_jb77MouseClicked

    private void jb78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb78MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=8;
            j=6;
            k=8;
                       
    }//GEN-LAST:event_jb78MouseClicked

    private void jb79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb79MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=8;
            j=7;
            k=8;
                       
    }//GEN-LAST:event_jb79MouseClicked

    private void jb80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb80MouseClicked
        // TODO add your handling code here:
        bb = (JButton)evt.getSource();
            i=8;
            j=8;
            k=8;
                       
    }//GEN-LAST:event_jb80MouseClicked

    private void jb24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb24ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sudoku().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb10;
    private javax.swing.JButton jb11;
    private javax.swing.JButton jb12;
    private javax.swing.JButton jb13;
    private javax.swing.JButton jb14;
    private javax.swing.JButton jb15;
    private javax.swing.JButton jb16;
    private javax.swing.JButton jb17;
    private javax.swing.JButton jb18;
    private javax.swing.JButton jb19;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb20;
    private javax.swing.JButton jb21;
    private javax.swing.JButton jb22;
    private javax.swing.JButton jb23;
    private javax.swing.JButton jb24;
    private javax.swing.JButton jb25;
    private javax.swing.JButton jb26;
    private javax.swing.JButton jb27;
    private javax.swing.JButton jb28;
    private javax.swing.JButton jb29;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb30;
    private javax.swing.JButton jb31;
    private javax.swing.JButton jb32;
    private javax.swing.JButton jb33;
    private javax.swing.JButton jb34;
    private javax.swing.JButton jb35;
    private javax.swing.JButton jb36;
    private javax.swing.JButton jb37;
    private javax.swing.JButton jb38;
    private javax.swing.JButton jb39;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb40;
    private javax.swing.JButton jb41;
    private javax.swing.JButton jb42;
    private javax.swing.JButton jb43;
    private javax.swing.JButton jb44;
    private javax.swing.JButton jb45;
    private javax.swing.JButton jb46;
    private javax.swing.JButton jb47;
    private javax.swing.JButton jb48;
    private javax.swing.JButton jb49;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb50;
    private javax.swing.JButton jb51;
    private javax.swing.JButton jb52;
    private javax.swing.JButton jb53;
    private javax.swing.JButton jb54;
    private javax.swing.JButton jb55;
    private javax.swing.JButton jb56;
    private javax.swing.JButton jb57;
    private javax.swing.JButton jb58;
    private javax.swing.JButton jb59;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb60;
    private javax.swing.JButton jb61;
    private javax.swing.JButton jb62;
    private javax.swing.JButton jb63;
    private javax.swing.JButton jb64;
    private javax.swing.JButton jb65;
    private javax.swing.JButton jb66;
    private javax.swing.JButton jb67;
    private javax.swing.JButton jb68;
    private javax.swing.JButton jb69;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb70;
    private javax.swing.JButton jb71;
    private javax.swing.JButton jb72;
    private javax.swing.JButton jb73;
    private javax.swing.JButton jb74;
    private javax.swing.JButton jb75;
    private javax.swing.JButton jb76;
    private javax.swing.JButton jb77;
    private javax.swing.JButton jb78;
    private javax.swing.JButton jb79;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb80;
    private javax.swing.JButton jb9;
    // End of variables declaration//GEN-END:variables
}
