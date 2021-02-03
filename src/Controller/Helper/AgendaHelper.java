package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabrielle Rodrigues
 */
public class AgendaHelper implements IHelper {
    
    private final Agenda view;
    
    public AgendaHelper(Agenda view){
        
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
       
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();        
        tableModel.setNumRows(0);
    
        for (Agendamento agendamento : agendamentos) {
           
            tableModel.addRow(new Object[]{
            agendamento.getId(),
            agendamento.getCliente().getNome(),
            agendamento.getServico().getDescricao(),
            agendamento.getValor(),
            agendamento.getDataFormatada(),
            agendamento.getHoraFormatada(),
            agendamento.getObservacao()
            
        });
           
        }
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboBoxCliente().getModel();
    
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente); //Aqui está o truque
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboBoxServico().getModel();
    
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico); //Aqui está o truque
        }
    }

     public Cliente obterCliente() {
      return (Cliente) view.getComboBoxCliente().getSelectedItem();
    }
    
    public Servico obterServico() {
      return (Servico) view.getComboBoxServico().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getTxtValor().setText(valor+"");
    }

    @Override
    public Agendamento obterModelo() {
        
        String idString = view.getTxtId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getTxtValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getTxtData().getText();
        String hora = view.getTxtHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getTxtObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        
        return agendamento;
    }

    @Override
    public void limparTela() {
        view.getTxtId().setText("0");
        view.getTxtValor().setText("");
        view.getTxtData().setText("");
        view.getTxtHora().setText("");
        view.getTxtObservacao().setText("");
    }

    
}
