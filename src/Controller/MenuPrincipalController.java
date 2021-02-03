package Controller;

import View.Agenda;
import View.MenuPrincipal;

/**
 *
 * @author Gabrielle Rodrigues
 */
public class MenuPrincipalController {

    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        
        this.view = view;
    }
    
    public void navegaParaAgenda(){
   
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
}
