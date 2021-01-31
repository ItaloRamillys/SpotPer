package telasAcessoDados;

import connect.Conexao;
import formCadastro.FormGravadora;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import utilitario.ModeloTabela;
import view.TelaPrincipal;

public class TelaGravadora extends javax.swing.JDialog {

    Conexao conex = new Conexao();
    
    public TelaGravadora(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conex.conectar();
        preencherTabela("select CODIGO_GRAVADORA, NOME, CIDADE, HOME_PAGE "
                + "from GRAVADORA order by CODIGO_GRAVADORA");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnDel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        tabelDados = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(988, 360));
        setPreferredSize(new java.awt.Dimension(988, 360));
        setResizable(false);
        getContentPane().setLayout(null);

        lblPesquisar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        lblPesquisar.setText("Pesquisar");
        getContentPane().add(lblPesquisar);
        lblPesquisar.setBounds(410, 20, 98, 25);

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
        txtPesquisar.setBounds(140, 50, 610, 30);

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
        btnDel.setBounds(160, 239, 190, 60);

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
        btnAdd.setBounds(10, 239, 130, 60);

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
        tabelDados.setViewportView(jTable1);

        getContentPane().add(tabelDados);
        tabelDados.setBounds(0, 90, 980, 120);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main.jpg"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 980, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void preencherTabela(String sql){
        
       ArrayList dados = new ArrayList();
        
        String[] colunas = new String[]{"Código", "Nome da Gravadora", 
                                "Cidade", "Homepage"};
        conex.executaSql(sql);
            
        try {
            while(conex.rs.next()){
                dados.add(new Object[]{conex.rs.getInt("CODIGO_GRAVADORA"),
                    conex.rs.getString("NOME"), conex.rs.getString("CIDADE"),
                    conex.rs.getString("HOME_PAGE"),
                });
            }
        }
        catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela\n" + ex.getMessage());
        }
        
            
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTable1.setModel(modelo);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(400);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(242);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(242);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
         
        jTable1.getColumnModel().getColumn(0).setHeaderValue(colunas[0]);
        
        jTable1.getColumnModel().getColumn(1).setHeaderValue(colunas[1]);
        
        jTable1.getColumnModel().getColumn(2).setHeaderValue(colunas[2]);
        
        jTable1.getColumnModel().getColumn(3).setHeaderValue(colunas[3]);
        
        
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }   
    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        try{
            String nome = "";
            nome += txtPesquisar.getText();
            preencherTabela("select CODIGO_GRAVADORA, NOME, CIDADE, HOME_PAGE "
                + "from GRAVADORA where NOME like '%" + nome + "%' order by CODIGO_GRAVADORA");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Preencha o campo com \ndados válidos ao pesquisar\n" + ex.getMessage(), "ERRO", 2);
        }
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed

        try {
            int cod = (int) (jTable1.getValueAt(jTable1.getSelectedRow(), 0));

            PreparedStatement ps = conex.con.prepareStatement("delete from GRAVADORA "
                    + "where CODIGO_GRAVADORA = " + cod + "");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deletada com sucesso");
            preencherTabela("select CODIGO_GRAVADORA, NOME, CIDADE, HOME_PAGE "
                + "from GRAVADORA order by CODIGO_GRAVADORA");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao deletar Gravadora\n"+ex.getMessage());
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Selecione uma linha por favor");
        }

    }//GEN-LAST:event_btnDelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        TelaPrincipal telaP = new TelaPrincipal();
        FormGravadora cadGravadora = new FormGravadora(telaP, true);
        cadGravadora.setVisible(true);
        preencherTabela("select CODIGO_GRAVADORA, NOME, CIDADE, HOME_PAGE "
                + "from GRAVADORA order by CODIGO_GRAVADORA");
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGravadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGravadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGravadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGravadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaGravadora dialog = new TelaGravadora(new javax.swing.JFrame(), true);
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
