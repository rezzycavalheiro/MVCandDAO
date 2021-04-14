
package view;

import java.util.Scanner;

public class MenuView {

    public int telaDeMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("(1) Cadastrar locadora");
        System.out.println("(2) Cadastrar filme");
        System.out.println("(3) Listar filme");
        System.out.println("(4) Editar filme");
        System.out.println("(5) Excluir filme");
        System.out.println("(9) Sair");
        System.out.println("   Opção:");
        
        return sc.nextInt();
    }
    
    public void telaOpcaoInvalida(){
        System.out.println("Opção inválida!");
    }
}
