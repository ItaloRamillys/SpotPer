package telasAcessoDados;

import formCadastro.FormCompositor;
import connect.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import utilitario.ModeloTabela;

public class TelaDadosPerMusical extends javax.swing.JDialog {

    Conexao conex = new Conexao();
    
    PreparedStatement ps = null;
    
    ResultSet rs = null;
    
    public TelaDadosPerMusical(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conex.conectar();
        preencherTabela("select CODIGO_PERIODO, DESCRICAO_PERIODO from PERIODO_MUSICAL order by CODIGO_PERIODO");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPerMusical = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEscolher = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPerMusical.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPerMusical.setText("Períodos Musicais Cadastrados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome Período"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnEscolher.setText("Escolher");
        btnEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(lblPerMusical)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btnEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPerMusical)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public int cod;

    private void btnEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscolherActionPerformed

        this.cod = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        this.dispose();

    }//GEN-LAST:event_btnEscolherActionPerformed

    
    public void preencherTabela(String sql){
        
       ArrayList dados = new ArrayList();
        
        String[] colunas = new String[]{"Código", "Nome do Período"};
        conex.executaSql(sql);
            
        try {
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("CODIGO_PERIODO"),
                    conex.rs.getString("DESCRICAO_PERIODO")});
            }while(conex.rs.next());
        }
        catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela\n" + ex.getMessage());
        }
        
            
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTable1.setModel(modelo);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(385);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
         
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        FormCompositor form = new FormCompositor(null, rootPaneCheckingEnabled);
        
        
    }  
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaDadosPerMusical dialog = new TelaDadosPerMusical(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEscolher;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblPerMusical;
    // End of variables declaration//GEN-END:variables
}
