package formCadastro;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.TelaPrincipal;

public class FormComposicao extends javax.swing.JDialog {

    TelaPrincipal t = new TelaPrincipal();
    
    public FormComposicao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadCompo = new javax.swing.JLabel();
        panelCadCompo = new javax.swing.JPanel();
        lblNomeCompo = new javax.swing.JLabel();
        txtNomeCompo = new javax.swing.JTextField();
        lblCodCompo = new javax.swing.JLabel();
        txtCodCompo = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDescricao = new javax.swing.JTextArea();
        btnSalvarCompo = new javax.swing.JButton();
        btnLimparCompo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCadCompo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblCadCompo.setText("Cadastro de Composição");

        panelCadCompo.setBackground(new java.awt.Color(204, 204, 255));
        panelCadCompo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomeCompo.setText("Nome da Composição");

        lblCodCompo.setText("Código da Composição");

        txtCodCompo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodCompoActionPerformed(evt);
            }
        });

        lblDescricao.setText("Descrição");

        areaDescricao.setColumns(20);
        areaDescricao.setRows(5);
        jScrollPane1.setViewportView(areaDescricao);

        javax.swing.GroupLayout panelCadCompoLayout = new javax.swing.GroupLayout(panelCadCompo);
        panelCadCompo.setLayout(panelCadCompoLayout);
        panelCadCompoLayout.setHorizontalGroup(
            panelCadCompoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadCompoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadCompoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadCompoLayout.createSequentialGroup()
                        .addGroup(panelCadCompoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeCompo)
                            .addComponent(txtNomeCompo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(panelCadCompoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodCompo)
                            .addGroup(panelCadCompoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtCodCompo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(panelCadCompoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(panelCadCompoLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(lblDescricao)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelCadCompoLayout.setVerticalGroup(
            panelCadCompoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadCompoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadCompoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCompo)
                    .addComponent(lblCodCompo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadCompoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomeCompo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtCodCompo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnSalvarCompo.setText("Salvar");
        btnSalvarCompo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCompoActionPerformed(evt);
            }
        });

        btnLimparCompo.setText("Limpar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCadCompo)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCadCompo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvarCompo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparCompo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadCompo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCadCompo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCompo)
                    .addComponent(btnLimparCompo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodCompoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodCompoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodCompoActionPerformed

    private void btnSalvarCompoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCompoActionPerformed
        if(txtCodCompo.getText().equals("") || txtNomeCompo.getText().equals("")){

                        JOptionPane.showMessageDialog(null, "Preencha todos os campos");

        }else{
            try {
              PreparedStatement ps = t.conecta.con.prepareStatement("insert into tipo_composicao"
                      + "(cod, nome, descricao)"+
                      " values(?,?,?)");
              ps.setInt(1, Integer.parseInt(txtCodCompo.getText()));
              ps.setString(2, txtNomeCompo.getText());
              ps.setString(3, areaDescricao.getText());
              ps.executeUpdate();
              JOptionPane.showMessageDialog(null, "Composicao cadastrada com sucesso");
              txtCodCompo.setText("");
              txtNomeCompo.setText("");
              areaDescricao.setText("");
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Falha ao cadastrar Composicao\n"+ex.getMessage());
          }
        }
    }//GEN-LAST:event_btnSalvarCompoActionPerformed

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
            java.util.logging.Logger.getLogger(FormComposicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormComposicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormComposicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormComposicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormComposicao dialog = new FormComposicao(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextArea areaDescricao;
    private javax.swing.JButton btnLimparCompo;
    private javax.swing.JButton btnSalvarCompo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadCompo;
    private javax.swing.JLabel lblCodCompo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNomeCompo;
    private javax.swing.JPanel panelCadCompo;
    private javax.swing.JTextField txtCodCompo;
    private javax.swing.JTextField txtNomeCompo;
    // End of variables declaration//GEN-END:variables
}
