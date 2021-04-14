
package controller;

import dao.LocadoraDAO;
import model.Locadora;
import view.CadastroLocadoraView;

public class CadastroLocadoraController {
    
    private CadastroLocadoraView clv;
    private Locadora l;
    private LocadoraDAO lDAO;
    
    public CadastroLocadoraController(){
        
        clv = new CadastroLocadoraView();
        l = clv.telaDeCadastro(l);
        lDAO = new LocadoraDAO();
        lDAO.insere(l);
    }
    
}
