/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test011;

import java.awt.Component;
import javax.swing.JButton;

/**
 *
 * @author alex
 */
public class Test011 extends javax.swing.JFrame {

    /**
     * Creates new form Test011
     */
    public Test011() {
        initComponents();
        setResizable(false);
        ShowValue.requestFocusInWindow();
        PrevValue=0;
        NeedClear=true;
        Operation="";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowValue = new javax.swing.JTextField();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        BtnAdd = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        BtnSub = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        BtnMul = new javax.swing.JButton();
        BtnPoint = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        BtnEnter = new javax.swing.JButton();
        BtnDiv = new javax.swing.JButton();
        BtnAdd1 = new javax.swing.JButton();
        BtnAdd2 = new javax.swing.JButton();
        BtnAdd3 = new javax.swing.JButton();
        BtnAdd4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        ShowValue.setEditable(false);
        ShowValue.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        ShowValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ShowValue.setText("0");
        ShowValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        Btn7.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        Btn7.setText("7");
        Btn7.setMaximumSize(new java.awt.Dimension(70, 70));
        Btn7.setMinimumSize(new java.awt.Dimension(70, 70));
        Btn7.setPreferredSize(new java.awt.Dimension(70, 70));
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitClick(evt);
            }
        });

        Btn8.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        Btn8.setText("8");
        Btn8.setMaximumSize(new java.awt.Dimension(70, 70));
        Btn8.setMinimumSize(new java.awt.Dimension(70, 70));
        Btn8.setPreferredSize(new java.awt.Dimension(70, 70));
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitClick(evt);
            }
        });

        Btn9.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        Btn9.setText("9");
        Btn9.setMaximumSize(new java.awt.Dimension(70, 70));
        Btn9.setMinimumSize(new java.awt.Dimension(70, 70));
        Btn9.setPreferredSize(new java.awt.Dimension(70, 70));
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitClick(evt);
            }
        });

        BtnAdd.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        BtnAdd.setText("+");
        BtnAdd.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnAdd.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnAdd.setPreferredSize(new java.awt.Dimension(70, 70));
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperationClick(evt);
            }
        });

        Btn4.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        Btn4.setText("4");
        Btn4.setMaximumSize(new java.awt.Dimension(70, 70));
        Btn4.setMinimumSize(new java.awt.Dimension(70, 70));
        Btn4.setPreferredSize(new java.awt.Dimension(70, 70));
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitClick(evt);
            }
        });

        Btn5.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        Btn5.setText("5");
        Btn5.setMaximumSize(new java.awt.Dimension(70, 70));
        Btn5.setMinimumSize(new java.awt.Dimension(70, 70));
        Btn5.setPreferredSize(new java.awt.Dimension(70, 70));
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitClick(evt);
            }
        });

        Btn6.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        Btn6.setText("6");
        Btn6.setMaximumSize(new java.awt.Dimension(70, 70));
        Btn6.setMinimumSize(new java.awt.Dimension(70, 70));
        Btn6.setPreferredSize(new java.awt.Dimension(70, 70));
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitClick(evt);
            }
        });

        BtnSub.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        BtnSub.setText("-");
        BtnSub.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnSub.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnSub.setPreferredSize(new java.awt.Dimension(70, 70));
        BtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperationClick(evt);
            }
        });

        Btn1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        Btn1.setText("1");
        Btn1.setMaximumSize(new java.awt.Dimension(70, 70));
        Btn1.setMinimumSize(new java.awt.Dimension(70, 70));
        Btn1.setPreferredSize(new java.awt.Dimension(70, 70));
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitClick(evt);
            }
        });

        Btn2.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        Btn2.setText("2");
        Btn2.setMaximumSize(new java.awt.Dimension(70, 70));
        Btn2.setMinimumSize(new java.awt.Dimension(70, 70));
        Btn2.setPreferredSize(new java.awt.Dimension(70, 70));
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitClick(evt);
            }
        });

        Btn3.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        Btn3.setText("3");
        Btn3.setToolTipText("");
        Btn3.setMaximumSize(new java.awt.Dimension(70, 70));
        Btn3.setMinimumSize(new java.awt.Dimension(70, 70));
        Btn3.setPreferredSize(new java.awt.Dimension(70, 70));
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitClick(evt);
            }
        });

        BtnMul.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        BtnMul.setText("*");
        BtnMul.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnMul.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnMul.setPreferredSize(new java.awt.Dimension(70, 70));
        BtnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperationClick(evt);
            }
        });

        BtnPoint.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        BtnPoint.setText(".");
        BtnPoint.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnPoint.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnPoint.setPreferredSize(new java.awt.Dimension(70, 70));
        BtnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointClick(evt);
            }
        });

        Btn0.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        Btn0.setText("0");
        Btn0.setMaximumSize(new java.awt.Dimension(70, 70));
        Btn0.setMinimumSize(new java.awt.Dimension(70, 70));
        Btn0.setPreferredSize(new java.awt.Dimension(70, 70));
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitClick(evt);
            }
        });

        BtnEnter.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        BtnEnter.setText("=");
        BtnEnter.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnEnter.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnEnter.setPreferredSize(new java.awt.Dimension(70, 70));
        BtnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperationClick(evt);
            }
        });

        BtnDiv.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        BtnDiv.setText("/");
        BtnDiv.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnDiv.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnDiv.setPreferredSize(new java.awt.Dimension(70, 70));
        BtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperationClick(evt);
            }
        });

        BtnAdd1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        BtnAdd1.setText("C");
        BtnAdd1.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnAdd1.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnAdd1.setPreferredSize(new java.awt.Dimension(70, 70));
        BtnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackClick(evt);
            }
        });

        BtnAdd2.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        BtnAdd2.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnAdd2.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnAdd2.setPreferredSize(new java.awt.Dimension(70, 70));

        BtnAdd3.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        BtnAdd3.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnAdd3.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnAdd3.setPreferredSize(new java.awt.Dimension(70, 70));

        BtnAdd4.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        BtnAdd4.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnAdd4.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnAdd4.setPreferredSize(new java.awt.Dimension(70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShowValue, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BtnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BtnSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAdd1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ShowValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private double PrevValue;
    private boolean NeedClear;
    private String Operation;
    
    private void DigitClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DigitClick
        if(NeedClear) ShowValue.setText("");
        ShowValue.setText(ShowValue.getText()+((JButton)evt.getSource()).getText());
        NeedClear=false;
        ShowValue.requestFocusInWindow();
    }//GEN-LAST:event_DigitClick

    private void PointClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointClick
        if(NeedClear) ShowValue.setText("0");
        if(!ShowValue.getText().contains(".")) {
            ShowValue.setText(ShowValue.getText()+".");
        }
        NeedClear=false;
        ShowValue.requestFocusInWindow();
    }//GEN-LAST:event_PointClick

    private void OperationClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperationClick
        double NextValue= Double.parseDouble(ShowValue.getText());
        switch(Operation) {
            case "+": PrevValue+=NextValue; break;
            case "-": PrevValue-=NextValue; break;
            case "*": PrevValue*=NextValue; break;
            case "/": PrevValue/=NextValue; break;
            default:  PrevValue=NextValue;  break;
        }
        ShowValue.setText(Double.toString(PrevValue));
        Operation=((JButton)evt.getSource()).getText();
        NeedClear=true;
        ShowValue.requestFocusInWindow();
    }//GEN-LAST:event_OperationClick

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        String Key=Character.toString(evt.getKeyChar());
        if(Key.equals("\n")) Key="=";
        else if(Key.equals("\b")) Key="C";
        else if(Key.equals(",")) Key=".";
        for(Component btn:getContentPane().getComponents()) {
            if((btn instanceof JButton)&&(((JButton)btn).getText().equals(Key))) {
                ((JButton)btn).doClick(150);
                break;
            }   
        }
    }//GEN-LAST:event_formKeyTyped

    private void BackClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackClick
        String text=ShowValue.getText();
        int len=text.length();
        if(len>1) ShowValue.setText(text.substring(len-1));
        else ShowValue.setText("0");
        ShowValue.requestFocusInWindow();
    }//GEN-LAST:event_BackClick

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
            java.util.logging.Logger.getLogger(Test011.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test011.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test011.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test011.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test011().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnAdd1;
    private javax.swing.JButton BtnAdd2;
    private javax.swing.JButton BtnAdd3;
    private javax.swing.JButton BtnAdd4;
    private javax.swing.JButton BtnDiv;
    private javax.swing.JButton BtnEnter;
    private javax.swing.JButton BtnMul;
    private javax.swing.JButton BtnPoint;
    private javax.swing.JButton BtnSub;
    private javax.swing.JTextField ShowValue;
    // End of variables declaration//GEN-END:variables
}
