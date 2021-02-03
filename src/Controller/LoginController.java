package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author Gabrielle Rodrigues
 */
public class LoginController {
    
    private final Login view;
    private LoginHelper helper;

    
    public LoginController(Login view) {
        
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        
      //Pegar um usuario da view
      Usuario usuario = helper.obterModelo();

      //Pesquisar o usuário no banco
      UsuarioDAO usuarioDAO = new UsuarioDAO();
      Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
      
      //Se o usuário da view tiver o mesmo usuário e senha do usuário do banco de dados, direciona para o menu principal
         if(usuarioAutenticado != null){
            //navegar para menu principal 
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
            
      //Se não mostrar usuário ou senha inválidos
         } else{
             view.exibeMensagem("Usuário ou Senha inválidos");
         }    
    }
    
}
