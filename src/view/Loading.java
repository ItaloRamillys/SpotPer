/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connect.Conexao;
import java.awt.event.ActionEvent;
import javafx.stage.StageStyle;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.ActionListener;

/**
 *
 * @author Dell
 */
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
public class Loading extends javax.swing.JFrame {

    
    private Timer timer;
    private ActionListener a1;
    private Conexao con = new Conexao();
    
    public Loading() {
        initComponents();
        
        lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
        
        setLocationRelativeTo(null);
        
        a1 = new ActionListener(){
    
        int verif = 0;
        
        public void actionPerformed(ActionEvent evt){
            if(jProgressBar1.getValue() < 100){
                if(jProgressBar1.getValue() < 5){
                    lblTexto.setText("Conectando ao banco");
                }
                jProgressBar1.setValue(jProgressBar1.getValue()+1);
                if(jProgressBar1.getValue()> 5 && jProgressBar1.getValue()< 20){
                    if(jProgressBar1.getValue() == 6){
                        if(con.conectar() == 1){
                           lblTexto.setText("Banco conectado com sucesso");
                        }else{
                            verif = 1;
                            JOptionPane.showMessageDialog(null, "Falha ao conectar-se ao banco\nO programa será fechado automaticamente");
                        }
                    }
                }
                else if(jProgressBar1.getValue()> 20 &&  jProgressBar1.getValue()< 46){
                    lblTexto.setText("Preparando conexão do aplicativo com o banco");
                    if(jProgressBar1.getValue() == 45){
                        if(con.desconectar() == 1){
                            lblTexto.setText("Aplicativo conectado ao banco com sucesso");
                        }else{
                            verif = 1;
                            JOptionPane.showMessageDialog(null, "Falha ao conectar-se o banco com o aplicativo\nO programa será fechado automaticamente");
                        }
                    }
                
                }
                else if(jProgressBar1.getValue()> 75){
                    con.desconectar();                
                    lblTexto.setText("Quase pronto");
                
                }
            }else{
                timer.stop();
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                dispose();
            }
        }
        
        };
    
        timer = new Timer(10, a1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        lblTexto = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(60, 410, 600, 50);

        lblTexto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto.setText("Aplicando Atualizações");
        getContentPane().add(lblTexto);
        lblTexto.setBounds(0, 300, 720, 110);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 720, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timer.start();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblTexto;
    // End of variables declaration//GEN-END:variables

    
}
