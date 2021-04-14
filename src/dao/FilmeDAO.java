
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Filme;
import java.sql.ResultSet;

public class FilmeDAO {
    
    private Conexao con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public FilmeDAO(){
       con = new Conexao(); 
    }
    
    public void insere(Filme f){
        try{
            query = "INSERT INTO filme (nome, id_locadora) VALUES (?,?)";
            ps = con.getConexao().prepareStatement(query);
            
            ps.setString(1, f.getNome());
            ps.setInt(2, f.getId_locadora());
            
            ps.executeUpdate();
            
            ps.close();
        }
        catch(SQLException ex) {}
    }
    
//    public void listar(Filme f){
      public ResultSet listar(){
        try{
//            query = "SELECT nome FROM filme f INNER JOIN locadora l ON l.id = f.id_locadora WHERE id_locadora == (?)";
            query = "SELECT * FROM filme";
            ps = con.getConexao().prepareStatement(query);
            
//            ps.setInt(1, f.getId_locadora());
            
            rs = ps.executeQuery();
            return rs;
//            ps.close();
        }
        catch(SQLException ex) {}
        return null;
    }
      
      public void editar(Filme f){
          // nesse caso teria uma view para editar, pegando o id do filme q vai ser editado
          try{
              query = "UPDATE filne SET nome =" + f.getNome() + "WHERE id = " + f.getId();
              ps = con.getConexao().prepareStatement(query);
              ps.executeUpdate();
                     
          }
          catch(SQLException ex){}
    }
      public void deletar(Filme f){
          // nesse caso teria uma view para editar, pegando o id do filme q vai ser editado
          try{
              query = "DELETE FROM filne WHERE id = " + f.getId();
              ps = con.getConexao().prepareStatement(query);
              ps.executeUpdate();
                     
          }
          catch(SQLException ex){}
    } 
}
