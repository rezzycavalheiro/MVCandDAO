
package view;

import java.util.Scanner;
import model.Locadora;

public class CadastroLocadoraView {
    
    public Locadora telaDeCadastro(Locadora l) {
        l = new Locadora();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome da locadora: ");
        l.setNome(sc.next());
        
        System.out.println("Endereço da locadora: ");
        l.setEndereco(sc.next());
        
        return l;
    }
}
