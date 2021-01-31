/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formCadastro;

import connect.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.TelaPrincipal;

/**
 *
 * @author Dell
 */
public class FormPerMusical extends javax.swing.JDialog {
    
    
    TelaPrincipal t = new TelaPrincipal();
    public FormPerMusical(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadPerMus = new javax.swing.JLabel();
        panelCadPerMus = new javax.swing.JPanel();
        lblNomePerMus = new javax.swing.JLabel();
        txtNomePerMus = new javax.swing.JTextField();
        lblCodPerMus = new javax.swing.JLabel();
        txtCodPerMus = new javax.swing.JTextField();
        lblTempoInicio = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JFormattedTextField();
        lblTempoFim = new javax.swing.JLabel();
        txtDataFim = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCadPerMus.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblCadPerMus.setText("Cadastro de Período Musical");

        panelCadPerMus.setBackground(new java.awt.Color(204, 204, 255));
        panelCadPerMus.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomePerMus.setText("Nome do Período Musical");

        lblCodPerMus.setText("Código do Período Musical");

        lblTempoInicio.setText("Data Inicio");

        try {
            txtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblTempoFim.setText("Data Fim");

        try {
            txtDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelCadPerMusLayout = new javax.swing.GroupLayout(panelCadPerMus);
        panelCadPerMus.setLayout(panelCadPerMusLayout);
        panelCadPerMusLayout.setHorizontalGroup(
            panelCadPerMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadPerMusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadPerMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadPerMusLayout.createSequentialGroup()
                        .addGroup(panelCadPerMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCodPerMus, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodPerMus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelCadPerMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadPerMusLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadPerMusLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(lblTempoFim)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadPerMusLayout.createSequentialGroup()
                        .addGroup(panelCadPerMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomePerMus)
                            .addComponent(txtNomePerMus, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCadPerMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTempoInicio))))
                .addContainerGap())
        );
        panelCadPerMusLayout.setVerticalGroup(
            panelCadPerMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadPerMusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadPerMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomePerMus)
                    .addComponent(lblTempoInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadPerMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomePerMus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadPerMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadPerMusLayout.createSequentialGroup()
                        .addComponent(lblCodPerMus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodPerMus))
                    .addGroup(panelCadPerMusLayout.createSequentialGroup()
                        .addComponent(lblTempoFim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCadPerMus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lblCadPerMus))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar)))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCadPerMus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCadPerMus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtCodPerMus.getText().equals("") || txtDataFim.getText().equals("")  ||
                txtDataInicio.getText().equals("")  || txtNomePerMus.getText().equals("")){
          
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        
        }else{
              try {
                PreparedStatement ps = t.conecta.con.prepareStatement("insert into PERIODO_MUSICAL"
                        + "(CODIGO_PERIODO, DESCRICAO_PERIODO,"+
                        " DATA_INICIO, DATA_FIM) values(?,?,?,?)");
                ps.setInt(1, Integer.parseInt(txtCodPerMus.getText()));
                ps.setString(2, txtNomePerMus.getText());
                String dataInicio = txtDataInicio.getText();
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                java.sql.Date dataI = new java.sql.Date(format.parse(dataInicio).getTime());
                ps.setDate(3, dataI);
                String dataFim = txtDataFim.getText();
                java.sql.Date dataF = new java.sql.Date(format.parse(dataFim).getTime());
                ps.setDate(4, dataF);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Período Musical cadastrado com sucesso");
                txtCodPerMus.setText("");
                txtDataFim.setText("");
                txtDataInicio.setText("");
                txtNomePerMus.setText("");
                dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar Período Musical\n"+ex.getMessage());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Algum dado é inválido\n"+ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
                txtCodPerMus.setText("");
                txtDataFim.setText("");
                txtDataInicio.setText("");
                txtNomePerMus.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(FormPerMusical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPerMusical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPerMusical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPerMusical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormPerMusical dialog = new FormPerMusical(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCadPerMus;
    private javax.swing.JLabel lblCodPerMus;
    private javax.swing.JLabel lblNomePerMus;
    private javax.swing.JLabel lblTempoFim;
    private javax.swing.JLabel lblTempoInicio;
    private javax.swing.JPanel panelCadPerMus;
    private javax.swing.JTextField txtCodPerMus;
    private javax.swing.JFormattedTextField txtDataFim;
    private javax.swing.JFormattedTextField txtDataInicio;
    private javax.swing.JTextField txtNomePerMus;
    // End of variables declaration//GEN-END:variables
}
