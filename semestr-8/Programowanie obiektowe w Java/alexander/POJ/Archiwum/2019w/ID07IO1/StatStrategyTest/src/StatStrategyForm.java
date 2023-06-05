
import javax.swing.DefaultComboBoxModel;
import helpers.*;
import statistics.*;
import iterators.*;


public class StatStrategyForm extends javax.swing.JFrame 
{
    private final DefaultComboBoxModel<NamedTableIteratorMaker> IteratorModel=new DefaultComboBoxModel<>();
    private final DefaultComboBoxModel<NamedStatStrategyMaker> StatFirstModel=new DefaultComboBoxModel<>();
    private final DefaultComboBoxModel<NamedStatStrategyMaker> StatSecondModel=new DefaultComboBoxModel<>();
    public StatStrategyForm() 
    {
        initComponents();
        CbIterator.setModel(IteratorModel);
        CbStatFirst.setModel(StatFirstModel);
        CbStatSecond.setModel(StatSecondModel);
        for(NamedTableIteratorMaker nim:TableIteratorFabric.MAP) IteratorModel.addElement(nim);
        for(NamedStatStrategyMaker nsm:StatStrategyFabric.MAP) StatFirstModel.addElement(nsm);
        for(NamedStatStrategyMaker nsm:StatStrategyFabric.MAP) StatSecondModel.addElement(nsm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CbIterator = new javax.swing.JComboBox<>();
        CbStatFirst = new javax.swing.JComboBox<>();
        CbStatSecond = new javax.swing.JComboBox<>();
        BtnCalc = new javax.swing.JButton();
        EdDataScroll = new javax.swing.JScrollPane();
        EdData = new javax.swing.JTextArea();
        EdResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CbIterator.setName(""); // NOI18N

        CbStatFirst.setName(""); // NOI18N

        CbStatSecond.setName(""); // NOI18N

        BtnCalc.setText("Calc");
        BtnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcActionPerformed(evt);
            }
        });

        EdData.setColumns(20);
        EdData.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        EdData.setRows(5);
        EdData.setText("7\t8\t0\t2\t6\n1\t4\t0\t7\t3\n6\t5\t4\t2\t9\n9\t2\t2\t7\t0\n6\t7\t6\t1\t9\n");
        EdDataScroll.setViewportView(EdData);

        EdResult.setEditable(false);
        EdResult.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EdDataScroll)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CbIterator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CbStatFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CbStatSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                        .addComponent(BtnCalc))
                    .addComponent(EdResult))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbIterator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbStatFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbStatSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCalc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EdDataScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EdResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcActionPerformed
        double[][] tb=TableHelper.SplitDouble2D(EdData.getText());
        if(tb==null) EdResult.setText("Niepoprawna tablica");
        else
        {
            ITableIterator iterator=((ITableIteratorMaker)CbIterator.getSelectedItem()).make();
            IStatStrategy first=((IStatStrategyMaker)CbStatFirst.getSelectedItem()).make();
            IStatStrategy second=((IStatStrategyMaker)CbStatSecond.getSelectedItem()).make();
            EdResult.setText(String.format("%f",iterator.calc(tb,first,second)));
        }
    }//GEN-LAST:event_BtnCalcActionPerformed

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
            java.util.logging.Logger.getLogger(StatStrategyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatStrategyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatStrategyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatStrategyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new StatStrategyForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalc;
    private javax.swing.JComboBox<NamedTableIteratorMaker> CbIterator;
    private javax.swing.JComboBox<NamedStatStrategyMaker> CbStatFirst;
    private javax.swing.JComboBox<NamedStatStrategyMaker> CbStatSecond;
    private javax.swing.JTextArea EdData;
    private javax.swing.JScrollPane EdDataScroll;
    private javax.swing.JTextField EdResult;
    // End of variables declaration//GEN-END:variables
}
