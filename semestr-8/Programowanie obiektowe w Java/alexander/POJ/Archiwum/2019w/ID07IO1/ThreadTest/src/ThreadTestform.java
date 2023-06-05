
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadTestform extends javax.swing.JFrame 
{
    private static final int MIN_VALUE=1;
    private static final int MAX_VALUE=10000;
    private static final int THREAD_COUNT=4;
    private long Sum=0;
    private AtomicLong AtomicSum=new AtomicLong();
    public ThreadTestform() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnStart = new javax.swing.JButton();
        EdResult = new javax.swing.JTextField();
        BtnLock = new javax.swing.JButton();
        BtnSync = new javax.swing.JButton();
        BtnAtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnStart.setText("Start");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        EdResult.setEditable(false);
        EdResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        EdResult.setText("0");

        BtnLock.setText("Lock");
        BtnLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLockActionPerformed(evt);
            }
        });

        BtnSync.setText("Synch");
        BtnSync.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSyncActionPerformed(evt);
            }
        });

        BtnAtom.setText("Atom");
        BtnAtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EdResult, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 233, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnStart)
                            .addComponent(BtnLock)
                            .addComponent(BtnSync)
                            .addComponent(BtnAtom))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EdResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(BtnAtom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSync)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnStart)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showResult(String src)
    {
        //EdResult.setText(String.format("%.0f", Sum));
        EdResult.setText(String.format("%s: %d",src,Sum));
    }
    
    private void showResultAtomic()
    {
        //EdResult.setText(String.format("%.0f", Sum));
        EdResult.setText(String.format("Atom: %d", AtomicSum.get()));
    }
    
    private void calc_norm()
    {
        for(int i=MIN_VALUE;i<=MAX_VALUE;++i)
        {
            Sum+=i;
            //showResult();
        }
    }
    
    private void calc_lock(ReentrantLock lock)
    {
        for(int i=MIN_VALUE;i<=MAX_VALUE;++i)
        {
            lock.lock();
            try
            {
                Sum+=i;
            }
            finally
            {
                lock.unlock();
            }
        }
    }
    
    private synchronized void add(int i)
    {
        Sum+=i;
    }
    
    private void calc_synch()
    {
        for(int i=MIN_VALUE;i<=MAX_VALUE;++i)
        {
            add(i);
        }
    }
    
    private void calc_atom()
    {
        for(int i=MIN_VALUE;i<=MAX_VALUE;++i)
        {
            AtomicSum.addAndGet(i);
        }
    }
    
    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed
        Sum=0;
        Thread[] tb=new Thread[THREAD_COUNT];
        for(int i=0;i<THREAD_COUNT;++i) tb[i]=new Thread(this::calc_norm);
        for(Thread th:tb) th.start();
        for(Thread th:tb) try { th.join(); } catch (InterruptedException ex) {}
        showResult("Norm");
    }//GEN-LAST:event_BtnStartActionPerformed

    private void BtnLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLockActionPerformed
        Sum=0;
        ReentrantLock lock=new ReentrantLock();
        Thread[] tb=new Thread[THREAD_COUNT];
        for(int i=0;i<THREAD_COUNT;++i) tb[i]=new Thread(() -> calc_lock(lock));
        for(Thread th:tb) th.start();
        for(Thread th:tb) try { th.join(); } catch (InterruptedException ex) {}
        showResult("Lock");
    }//GEN-LAST:event_BtnLockActionPerformed

    private void BtnSyncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSyncActionPerformed
        Sum=0;
        ReentrantLock lock=new ReentrantLock();
        Thread[] tb=new Thread[THREAD_COUNT];
        for(int i=0;i<THREAD_COUNT;++i) tb[i]=new Thread(() -> calc_synch());
        for(Thread th:tb) th.start();
        for(Thread th:tb) try { th.join(); } catch (InterruptedException ex) {}
        showResult("Synch");
    }//GEN-LAST:event_BtnSyncActionPerformed

    private void BtnAtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtomActionPerformed
        AtomicSum.set(0);
        ReentrantLock lock=new ReentrantLock();
        Thread[] tb=new Thread[THREAD_COUNT];
        for(int i=0;i<THREAD_COUNT;++i) tb[i]=new Thread(() -> calc_atom());
        for(Thread th:tb) th.start();
        for(Thread th:tb) try { th.join(); } catch (InterruptedException ex) {}
        showResultAtomic();
    }//GEN-LAST:event_BtnAtomActionPerformed

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
            java.util.logging.Logger.getLogger(ThreadTestform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThreadTestform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThreadTestform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThreadTestform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThreadTestform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtom;
    private javax.swing.JButton BtnLock;
    private javax.swing.JButton BtnStart;
    private javax.swing.JButton BtnSync;
    private javax.swing.JTextField EdResult;
    // End of variables declaration//GEN-END:variables
}
