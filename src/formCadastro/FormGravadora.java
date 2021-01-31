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
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import utilitario.ModeloTabela;
import view.TelaPrincipal;

/**
 *
 * @author Dell
 */
public class FormGravadora extends javax.swing.JDialog {

    //Siglas estados
    //static String siglasEstados[]={"--", "AC","AL","AP","AM","BA","CE","DF","ES","GO","MA",
    //    "MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"};
    //DefaultComboBoxModel model = new DefaultComboBoxModel(siglasEstados);
    //    comboUF.setModel(model);
    
    TelaPrincipal t = new TelaPrincipal();
    Conexao conex = new Conexao();
    
    public FormGravadora(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadGrav = new javax.swing.JLabel();
        panelCadGrav = new javax.swing.JPanel();
        lblNomeGrav = new javax.swing.JLabel();
        txtNomeGrav = new javax.swing.JTextField();
        lblCodGrav = new javax.swing.JLabel();
        txtCodGrav = new javax.swing.JTextField();
        lblHomePage = new javax.swing.JLabel();
        txtHP = new javax.swing.JTextField();
        btnAddTel = new javax.swing.JButton();
        panelEnd = new javax.swing.JPanel();
        lblEnd = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        comboUF = new javax.swing.JComboBox<>();
        lblN = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        panelTel = new javax.swing.JPanel();
        lblSeuTel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtListTel = new javax.swing.JTextArea();
        txtNumTelGrav = new javax.swing.JTextField();
        btnSalvarGrav = new javax.swing.JButton();
        btnLimparGrav = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblCadGrav.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblCadGrav.setText("Cadastro de Gravadora");

        panelCadGrav.setBackground(new java.awt.Color(204, 204, 255));
        panelCadGrav.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomeGrav.setText("Nome da Gravadora");

        txtNomeGrav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeGravActionPerformed(evt);
            }
        });

        lblCodGrav.setText("Código da Gravadora");

        lblHomePage.setText("Home Page");

        txtHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHPActionPerformed(evt);
            }
        });

        btnAddTel.setText("Adicionar Telefone");
        btnAddTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTelActionPerformed(evt);
            }
        });

        panelEnd.setBackground(new java.awt.Color(204, 204, 204));
        panelEnd.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblEnd.setText("Endereço");

        lblRua.setText("Rua");

        lblCidade.setText("Cidade");

        comboUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblN.setText("N°");

        lblPais.setText("País");

        javax.swing.GroupLayout panelEndLayout = new javax.swing.GroupLayout(panelEnd);
        panelEnd.setLayout(panelEndLayout);
        panelEndLayout.setHorizontalGroup(
            panelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEndLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboUF, 0, 1, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelEndLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEndLayout.createSequentialGroup()
                        .addComponent(lblPais)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelEndLayout.createSequentialGroup()
                        .addGroup(panelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEndLayout.createSequentialGroup()
                                .addComponent(lblRua)
                                .addGap(182, 182, 182))
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelEndLayout.createSequentialGroup()
                                .addGroup(panelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelEndLayout.createSequentialGroup()
                                        .addComponent(lblN)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblCidade)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelEndLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lblEnd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEndLayout.setVerticalGroup(
            panelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEndLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(lblRua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(panelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblN)
                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelTel.setBackground(new java.awt.Color(204, 204, 204));
        panelTel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSeuTel.setText("Seu(s) telefone(s)");

        txtListTel.setColumns(20);
        txtListTel.setLineWrap(true);
        txtListTel.setRows(5);
        txtListTel.setWrapStyleWord(true);
        txtListTel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtListTel.setEnabled(false);
        txtListTel.setPreferredSize(new java.awt.Dimension(164, 100));
        jScrollPane1.setViewportView(txtListTel);

        javax.swing.GroupLayout panelTelLayout = new javax.swing.GroupLayout(panelTel);
        panelTel.setLayout(panelTelLayout);
        panelTelLayout.setHorizontalGroup(
            panelTelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSeuTel)
                .addGap(40, 40, 40))
            .addGroup(panelTelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelTelLayout.setVerticalGroup(
            panelTelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSeuTel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        txtNumTelGrav.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumTelGrav.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumTelGravKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelCadGravLayout = new javax.swing.GroupLayout(panelCadGrav);
        panelCadGrav.setLayout(panelCadGravLayout);
        panelCadGravLayout.setHorizontalGroup(
            panelCadGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadGravLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadGravLayout.createSequentialGroup()
                        .addGroup(panelCadGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCadGravLayout.createSequentialGroup()
                                .addComponent(txtNomeGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(txtHP))
                            .addGroup(panelCadGravLayout.createSequentialGroup()
                                .addComponent(panelEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(panelCadGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNumTelGrav))))
                        .addGap(297, 297, 297))
                    .addGroup(panelCadGravLayout.createSequentialGroup()
                        .addGroup(panelCadGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadGravLayout.createSequentialGroup()
                                .addComponent(lblNomeGrav)
                                .addGap(191, 191, 191)
                                .addComponent(lblHomePage))
                            .addGroup(panelCadGravLayout.createSequentialGroup()
                                .addGroup(panelCadGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodGrav)
                                    .addComponent(txtCodGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(183, 183, 183)
                                .addComponent(btnAddTel)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelCadGravLayout.setVerticalGroup(
            panelCadGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadGravLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeGrav)
                    .addComponent(lblHomePage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCodGrav)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddTel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadGravLayout.createSequentialGroup()
                        .addComponent(txtNumTelGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnSalvarGrav.setText("Salvar");
        btnSalvarGrav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarGravActionPerformed(evt);
            }
        });

        btnLimparGrav.setText("Limpar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblCadGrav))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelCadGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvarGrav)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimparGrav)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadGrav)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCadGrav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeGravActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeGravActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeGravActionPerformed

    private void txtHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHPActionPerformed

    
    public void preencherTabela(String num){
        
        String novoNum = txtListTel.getText() + "\n" + num;
        txtListTel.setText(novoNum);
        txtNumTelGrav.setText("");
        
    }   
    private void btnAddTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTelActionPerformed
        
    }//GEN-LAST:event_btnAddTelActionPerformed

    private void btnSalvarGravActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarGravActionPerformed
        if(txtCodGrav.getText().equals("") || txtNomeGrav.getText().equals("")
                || txtCidade.getText().equals("")
                || txtN.getText().equals("") || txtRua.getText().equals("")
                || txtHP.getText().equals("")){

                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");

                }else{
                    try {
                      PreparedStatement ps = t.conecta.con.prepareStatement("insert into GRAVADORA"
                              + "(CODIGO_GRAVADORA, NOME, PAIS, CIDADE, RUA, NUM_RUA, HOME_PAGE)"+
                              " values(?,?,?,?,?,?,?)");
                      ps.setInt(1, Integer.parseInt(txtCodGrav.getText()));
                      ps.setString(2, txtNomeGrav.getText());
                      ps.setString(3, txtPais.getText());
                      ps.setString(4, txtCidade.getText());
                      ps.setString(5, txtRua.getText());
                      ps.setString(6, txtN.getText());
                      ps.setString(7, txtHP.getText());
                      ps.executeUpdate();
                      JOptionPane.showMessageDialog(null, "Gravadora cadastrada com sucesso");
                      } catch (SQLException ex) {
                      JOptionPane.showMessageDialog(null, "Falha ao cadastrar Gravadora\n"+ex.getMessage());
                  }
        }
    }//GEN-LAST:event_btnSalvarGravActionPerformed

    private void txtNumTelGravKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumTelGravKeyPressed
        
    }//GEN-LAST:event_txtNumTelGravKeyPressed

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
            java.util.logging.Logger.getLogger(FormGravadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGravadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGravadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGravadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormGravadora dialog = new FormGravadora(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAddTel;
    private javax.swing.JButton btnLimparGrav;
    private javax.swing.JButton btnSalvarGrav;
    private javax.swing.JComboBox<String> comboUF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadGrav;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodGrav;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblHomePage;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblNomeGrav;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSeuTel;
    private javax.swing.JPanel panelCadGrav;
    private javax.swing.JPanel panelEnd;
    private javax.swing.JPanel panelTel;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodGrav;
    private javax.swing.JTextField txtHP;
    private javax.swing.JTextArea txtListTel;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtNomeGrav;
    private javax.swing.JTextField txtNumTelGrav;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
