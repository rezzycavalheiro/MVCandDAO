
package controller;

import view.MenuView;

public class MenuController {
    
    private MenuView menuView;
    private CadastroLocadoraController clc;
    private CadastroFilmeController cfc;
    private ListarFilmeController lfc;
    
    public MenuController(){
        menuView = new MenuView();
        int opcao = 0;
        
        while(opcao != 9){
           opcao =  menuView.telaDeMenu();
           switch(opcao){
               case 1:
                   // Controller cadastro locadora
                   clc = new CadastroLocadoraController();
                   break;
               case 2:
                   // Controller cadastro filme
                   cfc = new CadastroFilmeController();
                   break;
               case 3:
                   // Controller listar filme
                   lfc = new ListarFilmeController();
                   break;
               case 4:
                   break;
               case 5:
                   break;
               case 9:
                   // Sair
                   System.exit(0);
                   break;
               
               default:
                   menuView.telaOpcaoInvalida();
           }
        }
    }
}
