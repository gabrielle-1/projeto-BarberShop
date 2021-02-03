package Servico;

/**
 * @author Denner Dias
 */
public class EmailTeste {

    /**
     * Classe para testes de envio de Email
     * @author Denner Dias
     */
    public static void main(String[] args) {
        
        Email email = new Email("Assunto da Barbearia", 
                                "Mensagem padrão do Sistema da Barbearia\n", 
                                "gabrielle-123@gmail.com");
        
        email.enviar();
    }
    
}
