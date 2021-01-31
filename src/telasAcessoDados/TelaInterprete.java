/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telasAcessoDados;

import connect.Conexao;
import formCadastro.FormCompositor;
import formCadastro.FormInterprete;
import formCadastro.FormPerMusical;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import utilitario.ModeloTabela;
import view.TelaPrincipal;

public class TelaInterprete extends javax.swing.JDialog {

    Conexao conex = new Conexao();
    
    public TelaInterprete(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conex.conectar();
        preencherTabela("select CODIGO_INTERPRETE, NOME, TIPO from interprete order by CODIGO_INTERPRETE");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        tabelDados = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnDel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(910, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        lblPesquisar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        lblPesquisar.setText("Pesquisar");
        getContentPane().add(lblPesquisar);
        lblPesquisar.setBounds(430, 20, 98, 25);

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesquisar);
        txtPesquisar.setBounds(160, 50, 610, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setMinimumSize(new java.awt.Dimension(300, 64));
        tabelDados.setViewportView(jTable1);

        getContentPane().add(tabelDados);
        tabelDados.setBounds(130, 90, 660, 120);

        btnDel.setBackground(new java.awt.Color(255, 255, 255));
        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icondel.png"))); // NOI18N
        btnDel.setText("Excluir Selecionado");
        btnDel.setToolTipText("Excluir Período Musical");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        getContentPane().add(btnDel);
        btnDel.setBounds(590, 240, 190, 60);

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconadd.png"))); // NOI18N
        btnAdd.setText("Adicionar");
        btnAdd.setToolTipText("Cadastrar Período Musical");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(160, 240, 130, 60);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main.jpg"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(-150, -330, 1070, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        try{
            String nome = "";
            nome += txtPesquisar.getText();
            preencherTabela("select CODIGO_INTERPRETE, NOME, TIPO from INTERPRETE"
                    + " where NOME like '%" + nome + "%' order by CODIGO_INTERPRETE");

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Preencha o campo com \ndados válidos ao pesquisar", "ERRO", 2);
        }
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed

            try {
                int cod = (int) (jTable1.getValueAt(jTable1.getSelectedRow(), 0));

                PreparedStatement ps = conex.con.prepareStatement("delete from INTERPRETE "
                        + "where CODIGO_INTERPRETE = " + cod + "");
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Deletado com sucesso");
                preencherTabela("select CODIGO_INTERPRETE, NOME, TIPO from interprete order by CODIGO_INTERPRETE");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao deletar periodo musical\n"+ex.getMessage());
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Selecione uma linha por favor");
            }
        

    }//GEN-LAST:event_btnDelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        TelaPrincipal telaP = new TelaPrincipal();
        FormInterprete cadInterprete = new FormInterprete(telaP, rootPaneCheckingEnabled);
        cadInterprete.setVisible(true);
        preencherTabela("select CODIGO_INTERPRETE, NOME, TIPO from interprete order by CODIGO_INTERPRETE");
    }//GEN-LAST:event_btnAddActionPerformed

    public void preencherTabela(String sql){
        
        ArrayList dados = new ArrayList();
        
        String[] colunas = new String[]{"Código", "Nome do Interprete", "Tipo"};
        conex.executaSql(sql);
            
        try {
            while(conex.rs.next()){
                dados.add(new Object[]{conex.rs.getInt("CODIGO_INTERPRETE"),
                    conex.rs.getString("NOME"), conex.rs.getString("TIPO")});
            }
        }
        catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela\n" + ex.getMessage());
        }
        
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTable1.setModel(modelo);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(381);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(183);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
         
        jTable1.getColumnModel().getColumn(0).setHeaderValue(colunas[0]);
        
        jTable1.getColumnModel().getColumn(1).setHeaderValue(colunas[1]);
        
        jTable1.getColumnModel().getColumn(2).setHeaderValue(colunas[2]);
        
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }   
    
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
            java.util.logging.Logger.getLogger(TelaInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaInterprete dialog = new TelaInterprete(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JScrollPane tabelDados;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
