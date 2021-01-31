/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formCadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.Timer;

/**
 *
 * @author Dell
 */
public class FormAlbum extends javax.swing.JDialog {

    /**
     * Creates new form FormAlbum
     */
   
    private Timer timer;
    private ActionListener a1;
    
    public FormAlbum(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Grupo de botoes
        gpBtn.add(rdFisica);
        gpBtn.add(rdDownload);
        
        txtDatCompra.setHorizontalAlignment(JFormattedTextField.CENTER);
    
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpBtn = new javax.swing.ButtonGroup();
        lblCadAlbum = new javax.swing.JLabel();
        panelCadAlbum = new javax.swing.JPanel();
        lblNomeAlbum = new javax.swing.JLabel();
        txtNomeAlbum = new javax.swing.JTextField();
        lblGravAlbum = new javax.swing.JLabel();
        btnGravAlbum = new javax.swing.JButton();
        lblCodAlbum = new javax.swing.JLabel();
        txtCodAlbum = new javax.swing.JTextField();
        lblPrecoCompra = new javax.swing.JLabel();
        txtPrecoCompra = new javax.swing.JTextField();
        lblDataCompra = new javax.swing.JLabel();
        lblTipoCompra = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        comboTipoCompra = new javax.swing.JComboBox<>();
        rdFisica = new javax.swing.JRadioButton();
        rdDownload = new javax.swing.JRadioButton();
        txtDatCompra = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCadAlbum.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblCadAlbum.setText("Cadastro de Álbum");

        panelCadAlbum.setBackground(new java.awt.Color(204, 204, 240));
        panelCadAlbum.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomeAlbum.setText("Nome do Álbum");

        lblGravAlbum.setText("Gravadora do Álbum");

        btnGravAlbum.setText("Escolher Gravadora");

        lblCodAlbum.setText("Código do Álbum");

        lblPrecoCompra.setText("Preço de Compra");

        lblDataCompra.setText("Data da Compra");

        lblTipoCompra.setText("Tipo da Compra");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comboTipoCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desconhecido", " " }));

        rdFisica.setText("Física");
        rdFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdFisicaActionPerformed(evt);
            }
        });

        rdDownload.setText("Download");
        rdDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdDownloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdFisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(comboTipoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdDownload)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdFisica)
                    .addComponent(comboTipoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdDownload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {
            txtDatCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelCadAlbumLayout = new javax.swing.GroupLayout(panelCadAlbum);
        panelCadAlbum.setLayout(panelCadAlbumLayout);
        panelCadAlbumLayout.setHorizontalGroup(
            panelCadAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadAlbumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeAlbum, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCadAlbumLayout.createSequentialGroup()
                        .addGroup(panelCadAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeAlbum)
                            .addComponent(lblGravAlbum)
                            .addComponent(btnGravAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoCompra))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelCadAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDataCompra)
                    .addComponent(lblCodAlbum)
                    .addComponent(lblPrecoCompra)
                    .addComponent(txtPrecoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(txtCodAlbum)
                    .addComponent(txtDatCompra))
                .addContainerGap())
        );
        panelCadAlbumLayout.setVerticalGroup(
            panelCadAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadAlbumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeAlbum)
                    .addComponent(lblCodAlbum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomeAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCadAlbumLayout.createSequentialGroup()
                        .addComponent(txtCodAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addGroup(panelCadAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGravAlbum)
                    .addComponent(lblPrecoCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGravAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtPrecoCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataCompra)
                    .addComponent(lblTipoCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvar.setText("Salvar");

        btnLimpar.setText("Limpar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCadAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(lblCadAlbum))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar)))
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadAlbum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCadAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
  
    }//GEN-LAST:event_formWindowOpened

    private void rdFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdFisicaActionPerformed
        comboTipoCompra.removeAllItems();
        comboTipoCompra.addItem("CD");
        comboTipoCompra.addItem("Vinil");
        
    }//GEN-LAST:event_rdFisicaActionPerformed

    private void rdDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdDownloadActionPerformed
        comboTipoCompra.removeAllItems();
        comboTipoCompra.addItem("Download");
    }//GEN-LAST:event_rdDownloadActionPerformed

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
            java.util.logging.Logger.getLogger(FormAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormAlbum dialog = new FormAlbum(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravAlbum;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboTipoCompra;
    private javax.swing.ButtonGroup gpBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadAlbum;
    private javax.swing.JLabel lblCodAlbum;
    private javax.swing.JLabel lblDataCompra;
    private javax.swing.JLabel lblGravAlbum;
    private javax.swing.JLabel lblNomeAlbum;
    private javax.swing.JLabel lblPrecoCompra;
    private javax.swing.JLabel lblTipoCompra;
    private javax.swing.JPanel panelCadAlbum;
    private javax.swing.JRadioButton rdDownload;
    private javax.swing.JRadioButton rdFisica;
    private javax.swing.JTextField txtCodAlbum;
    private javax.swing.JFormattedTextField txtDatCompra;
    private javax.swing.JTextField txtNomeAlbum;
    private javax.swing.JTextField txtPrecoCompra;
    // End of variables declaration//GEN-END:variables
}
