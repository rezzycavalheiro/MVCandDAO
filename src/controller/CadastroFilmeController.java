
package controller;

import dao.FilmeDAO;
import model.Filme;
import view.CadastroFilmeView;


public class CadastroFilmeController {
    private CadastroFilmeView cfv;
    private Filme f;
    private FilmeDAO fDAO;
    
    public CadastroFilmeController(){
        
        cfv = new CadastroFilmeView();
        f = cfv.telaDeCadastro(f);
        fDAO = new FilmeDAO();
        fDAO.insere(f);
    }
}
