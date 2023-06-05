
import java.awt.Graphics;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class FabricMain extends javax.swing.JFrame {

   private final DefaultListModel<Shape> model=new DefaultListModel<>();
   private final DefaultComboBoxModel<String> kinds=new DefaultComboBoxModel<>();
   public FabricMain() 
   {
      initComponents();
      shapeList.setModel(model);
      shapeKind.setModel(kinds);
      for(String kind : ShapeFabric.keySet()) kinds.addElement(kind);
      ((DrawablePanel)drawPanel).setDrawing((Drawing)(Graphics) -> panelPaint(Graphics) );
   }

   public void panelPaint(Graphics g)
   {
      for(int i=0;i<model.size();++i) model.get(i).draw(g, 0, 0);
      return;
   }
   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      shapeKind = new javax.swing.JComboBox<>();
      editSize = new javax.swing.JTextField();
      shapeListScroller = new javax.swing.JScrollPane();
      shapeList = new javax.swing.JList<>();
      BtnAdd = new javax.swing.JButton();
      drawPanel = new DrawablePanel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      editSize.setText("100");

      shapeListScroller.setViewportView(shapeList);

      BtnAdd.setText("Add");
      BtnAdd.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            BtnAddActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout drawPanelLayout = new javax.swing.GroupLayout(drawPanel);
      drawPanel.setLayout(drawPanelLayout);
      drawPanelLayout.setHorizontalGroup(
         drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 273, Short.MAX_VALUE)
      );
      drawPanelLayout.setVerticalGroup(
         drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
               .addComponent(shapeListScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
               .addComponent(shapeKind, javax.swing.GroupLayout.Alignment.LEADING, 0, 101, Short.MAX_VALUE)
               .addComponent(editSize, javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(BtnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(shapeKind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(editSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(BtnAdd)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(shapeListScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
      String kind=(String)shapeKind.getSelectedItem();         
      int size=Integer.parseInt(editSize.getText());
      model.addElement(ShapeFabric.make(kind,size));
      drawPanel.repaint();
   }//GEN-LAST:event_BtnAddActionPerformed

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
         java.util.logging.Logger.getLogger(FabricMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(FabricMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(FabricMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(FabricMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new FabricMain().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton BtnAdd;
   private javax.swing.JPanel drawPanel;
   private javax.swing.JTextField editSize;
   private javax.swing.JComboBox<String> shapeKind;
   private javax.swing.JList<Shape> shapeList;
   private javax.swing.JScrollPane shapeListScroller;
   // End of variables declaration//GEN-END:variables
}
