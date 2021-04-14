
package view;

import java.util.Scanner;
import model.Filme;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListarFilmeView {
    // seria usada caso fosse chamar o id da locadora
    public Filme telaDeCadastro(Filme f) {
        
        f = new Filme();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Id da locadora: ");
        f.setId_locadora(sc.nextInt());
        
        return f;
    }

    public void telaListaFilme(ResultSet rs) {
        System.out.println("Id | Nome | Id locadora");
        try {
            while(rs.next()){
                 System.out.print(" " + rs.getInt("id") + " | ");
                 System.out.print(rs.getString("nome") + " | ");
                 System.out.println(rs.getInt("id_locadora"));
            }
            System.out.print("\n");
        } catch (SQLException ex) {
            Logger.getLogger(ListarFilmeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
