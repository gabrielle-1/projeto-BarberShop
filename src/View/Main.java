package View;

import Model.Servico;
import Model.Cliente;
import Model.Usuario;

/**
 * 
 * @author Gabrielle Rodrigues
 */
public class Main {
    
     /**
     * Classe de testes 
     * @author Gabrirelle Rodrigues
     */
    public static void main(String[] args){
        
    Servico s1 = new Servico(1, "Barba", 30);
    Cliente c1 = new Cliente(1, "José", "Rua da Acácia, 83", "5087955");
    Usuario u1 = new Usuario(1, "Barbeiro", "senha");
    
        System.out.println("Cliente: " + c1.getNome());
        System.out.println("Serviço: " + s1.getDescricao());
        System.out.println("Através do: " + u1.getNome());
}
}
