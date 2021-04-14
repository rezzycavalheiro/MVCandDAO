
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    
    private final String con_banco;
    private final String usuario_mysql;
    private final String senha_mysql;
    private Connection conn;
    private String banco = con_banco = "jdbc:mysql://127.0.0.1:3306/sistema_locadora?useSSL=false";
    
    public Conexao(){
        
        usuario_mysql = "root";
        senha_mysql = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(banco, usuario_mysql, senha_mysql);
        }
        catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        catch(Exception ex) {}

    }
    
    public Connection getConexao(){
        return this.conn;
    }
}
