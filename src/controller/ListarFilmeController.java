
package controller;

import dao.FilmeDAO;
import model.Filme;
import view.ListarFilmeView;
import java.sql.ResultSet;

public class ListarFilmeController {
    private ListarFilmeView lfv;
    private Filme f;
    private FilmeDAO fDAO;
    private ResultSet rs;
    
    public ListarFilmeController(){
        
//        cfv = new ListarFilmeView();
//        f = cfv.telaDeCadastro(f);
        fDAO = new FilmeDAO();
//        fDAO.listar(f);
        rs = fDAO.listar();
        lfv = new ListarFilmeView();
        lfv.telaListaFilme(rs);

    }
}
