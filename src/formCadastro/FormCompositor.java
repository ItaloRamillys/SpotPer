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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import telasAcessoDados.TelaDadosPerMusical;
import view.TelaPrincipal;

public class FormCompositor extends javax.swing.JDialog {

    TelaPrincipal t = new TelaPrincipal();
    
        public FormCompositor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtNomeComp.setHorizontalAlignment(JTextField.CENTER);
        txtCodComp.setHorizontalAlignment(JTextField.CENTER);
        txtDatMorte.setHorizontalAlignment(JTextField.CENTER);
        txtDatNasc.setHorizontalAlignment(JTextField.CENTER);
        txtPaisNasc.setHorizontalAlignment(JTextField.CENTER);
        lblCodComp.setHorizontalTextPosition(lblCodComp.CENTER);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastroComp = new javax.swing.JLabel();
        panelCadComp = new javax.swing.JPanel();
        lblNomeComp = new javax.swing.JLabel();
        txtNomeComp = new javax.swing.JTextField();
        lblPaisNasc = new javax.swing.JLabel();
        txtPaisNasc = new javax.swing.JTextField();
        lblDatNasc = new javax.swing.JLabel();
        txtDatNasc = new javax.swing.JFormattedTextField();
        lblDatMorte = new javax.swing.JLabel();
        txtDatMorte = new javax.swing.JFormattedTextField();
        lblCodComp = new javax.swing.JLabel();
        txtCodComp = new javax.swing.JTextField();
        btnPerMus = new javax.swing.JButton();
        lblPeriodoMusical = new javax.swing.JLabel();
        lblCidadeNasc = new javax.swing.JLabel();
        txtCidadeNacs = new javax.swing.JTextField();
        lblCodPerMus = new javax.swing.JLabel();
        lblNomePerMus = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblCadastroComp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblCadastroComp.setText("Cadastro de Compositor");

        panelCadComp.setBackground(new java.awt.Color(204, 204, 255));
        panelCadComp.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomeComp.setText("Nome do Compositor");

        lblPaisNasc.setText("País de Nascimento");

        lblDatNasc.setText("Data de Nasicmento (dd/mm/aaaa)");

        try {
            txtDatNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDatNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatNascActionPerformed(evt);
            }
        });

        lblDatMorte.setText("Data de Morte (dd/mm/aaaa)");

        try {
            txtDatMorte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDatMorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatMorteActionPerformed(evt);
            }
        });

        lblCodComp.setText("Codigo Compositor");
        lblCodComp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtCodComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodCompActionPerformed(evt);
            }
        });

        btnPerMus.setText("Período Musical");
        btnPerMus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerMusActionPerformed(evt);
            }
        });

        lblPeriodoMusical.setText("Código - Nome Período Musical:");

        lblCidadeNasc.setText("Cidade de Nascimento");

        lblCodPerMus.setText("--");

        lblNomePerMus.setText("--");

        javax.swing.GroupLayout panelCadCompLayout = new javax.swing.GroupLayout(panelCadComp);
        panelCadComp.setLayout(panelCadCompLayout);
        panelCadCompLayout.setHorizontalGroup(
            panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadCompLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadCompLayout.createSequentialGroup()
                        .addGroup(panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCadCompLayout.createSequentialGroup()
                                .addGroup(panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCadCompLayout.createSequentialGroup()
                                        .addComponent(lblCidadeNasc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panelCadCompLayout.createSequentialGroup()
                                        .addComponent(btnPerMus)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(208, 208, 208)
                                .addComponent(txtCodComp, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadCompLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblNomePerMus, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))
                    .addGroup(panelCadCompLayout.createSequentialGroup()
                        .addGroup(panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCadCompLayout.createSequentialGroup()
                                .addGroup(panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblPaisNasc, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeComp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(lblNomeComp, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPaisNasc, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDatNasc, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadCompLayout.createSequentialGroup()
                                        .addComponent(lblDatMorte)
                                        .addGap(27, 27, 27))
                                    .addComponent(txtDatNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(txtDatMorte)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadCompLayout.createSequentialGroup()
                                .addGroup(panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCidadeNacs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadCompLayout.createSequentialGroup()
                                        .addComponent(lblPeriodoMusical)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCodPerMus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(84, 84, 84)
                                .addComponent(lblCodComp, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addContainerGap())))
        );
        panelCadCompLayout.setVerticalGroup(
            panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadCompLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeComp)
                    .addComponent(lblDatNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomeComp, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtDatNasc))
                .addGap(14, 14, 14)
                .addGroup(panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatMorte)
                    .addComponent(lblPaisNasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPaisNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtDatMorte))
                .addGroup(panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadCompLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodComp)
                        .addGap(1, 1, 1)
                        .addComponent(txtCodComp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadCompLayout.createSequentialGroup()
                        .addComponent(lblCidadeNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidadeNacs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPerMus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeriodoMusical)
                    .addComponent(lblCodPerMus)
                    .addComponent(lblNomePerMus))
                .addContainerGap())
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(lblCadastroComp))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCadComp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastroComp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCadComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void txtCodCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodCompActionPerformed

    private void txtDatNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatNascActionPerformed

    private void txtDatMorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatMorteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatMorteActionPerformed

    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtCidadeNacs.getText().equals("") || txtCodComp.getText().equals("")  ||
                txtNomeComp.getText().equals("")  || txtPaisNasc.getText().equals("")|| 
                txtDatNasc.getText().equals("") ||
                lblCodPerMus.equals("--")){
          
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        
        }else{
              try {
                PreparedStatement ps = t.conecta.con.prepareStatement("insert into COMPOSITOR "
                        + "(CODIGO_COMPOSITOR, NOME_COMPOSITOR, END_PAIS, END_CIDADE," +
                        " DATA_NASCIMENTO, DATA_MORTE, COD_PERIODO_MUSICAL) values(?,?,?,?,?,?,?)");
                ps.setInt(1, Integer.parseInt(txtCodComp.getText()));
                ps.setString(2, txtNomeComp.getText());
                ps.setString(3, txtPaisNasc.getText());
                ps.setString(4, txtCidadeNacs.getText());
                
                
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                
                String dataNasc = txtDatNasc.getText();
                java.sql.Date dataN = new java.sql.Date(format.parse(dataNasc).getTime());
                ps.setDate(5, dataN);
                
                String dataMorte = txtDatMorte.getText();
                java.sql.Date dataM = new java.sql.Date(format.parse(dataMorte).getTime());
                ps.setDate(6, dataM);
                
                ps.setInt(7,Integer.parseInt(lblCodPerMus.getText()));
                
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Compositor cadastrado com sucesso");
                dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar Compositor\n"+ex.getMessage());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Algum dado é inválido\n"+ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    
    private void btnPerMusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerMusActionPerformed

        TelaDadosPerMusical telaDadoPerMus = new TelaDadosPerMusical(t, rootPaneCheckingEnabled);
        telaDadoPerMus.setVisible(true);
        
        int cod = Integer.parseInt(Integer.toString(telaDadoPerMus.cod));
        
        String sql = "select DESCRICAO_PERIODO from PERIODO_MUSICAL "
                + "where CODIGO_PERIODO = " + cod + "";
        
        
        lblCodPerMus.setText(Integer.toString(telaDadoPerMus.cod));        
        
        t.conecta.executaSql(sql);
        String nome;
        
        try {
            t.conecta.rs.first();
            nome = t.conecta.rs.getString("DESCRICAO_PERIODO");
            lblNomePerMus.setText(nome);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnPerMusActionPerformed

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
            java.util.logging.Logger.getLogger(FormCompositor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCompositor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCompositor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCompositor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormCompositor dialog = new FormCompositor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnPerMus;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCadastroComp;
    private javax.swing.JLabel lblCidadeNasc;
    private javax.swing.JLabel lblCodComp;
    private javax.swing.JLabel lblCodPerMus;
    private javax.swing.JLabel lblDatMorte;
    private javax.swing.JLabel lblDatNasc;
    private javax.swing.JLabel lblNomeComp;
    private javax.swing.JLabel lblNomePerMus;
    private javax.swing.JLabel lblPaisNasc;
    private javax.swing.JLabel lblPeriodoMusical;
    private javax.swing.JPanel panelCadComp;
    private javax.swing.JTextField txtCidadeNacs;
    private javax.swing.JTextField txtCodComp;
    private javax.swing.JFormattedTextField txtDatMorte;
    private javax.swing.JFormattedTextField txtDatNasc;
    private javax.swing.JTextField txtNomeComp;
    private javax.swing.JTextField txtPaisNasc;
    // End of variables declaration//GEN-END:variables
}
