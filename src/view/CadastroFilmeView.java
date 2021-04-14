
package view;

import java.util.Scanner;
import model.Filme;

public class CadastroFilmeView {
    public Filme telaDeCadastro(Filme f) {
        
        f = new Filme();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do filme: ");
        f.setNome(sc.next());
        
        System.out.println("Id da locadora: ");
        f.setId_locadora(sc.nextInt());
        
        return f;
    }
}
