package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Conexao {
    
    public Connection con;
 
    public ResultSet rs;
    
    public Statement stm;
    
    public void executaSql(String sql){
        try{
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao executar a SQL\n" + ex.getMessage());
        }
    }
    
    public int conectar(){
     
        try {
            String userName = "sa";
            String password = "lplp0697";            
            String url = "jdbc:jtds:sqlserver://localhost:1433/SpotPer";
            
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, password);
            
            return 1;
        } catch (SQLException e) {
            return 0;
        }catch(Exception ex){
            return 0;
        }
    
    }
    
    public int desconectar(){
        try {
            con.close();
            return 1;
        } catch (SQLException e) {
            return 0;
        }
    }
    
}
