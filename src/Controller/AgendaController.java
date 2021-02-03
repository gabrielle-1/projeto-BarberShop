package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import Servico.Correio;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author Gabrielle Rodrigues
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;
    
    public AgendaController(Agenda view){
    this.view = view;
    this.helper = new AgendaHelper(view);
}
   public void atualizaTabela(){
       
       //Buscar lista com agendamentos do banco de dados
       AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
       ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
       
       //Exibir a lista na view
       helper.preencherTabela(agendamentos);
   }
   
   public void atualizaCliente(){
       
       //Buscar clientes do banco de dados 
       ClienteDAO clienteDAO = new ClienteDAO();
       ArrayList<Cliente> clientes = clienteDAO.selectAll();
       
       //Exibir clientes no comboBoxCliente
       helper.preencherClientes(clientes);
       
   }
   public void atualizaServico(){
       
       //Buscar o serviço do banco de dados
       ServicoDAO servicoDAO = new ServicoDAO();
       ArrayList<Servico> servicos = servicoDAO.selectAll();
       
       //Exibir serviços no comboBoxServico
       helper.preencherServicos(servicos);
   }
    
   public void atualizaValor(){
       
      Servico servico = helper.obterServico();
      helper.setarValor(servico.getValor());
   }

    public void agendar(){
        
      //Buscar Objeto Agendamento da tela
      Agendamento agendamento = helper.obterModelo();
      //Salvar Objeto no banco de dados
      new AgendamentoDAO().insert(agendamento);
      //Envia o email do agendamento
      Correio correio = new Correio();
      correio.notificarPorEmail(agendamento);
            
      //Inserir elemento na tabela
      atualizaTabela();
      helper.limparTela();      
      
    }
   
   
}
