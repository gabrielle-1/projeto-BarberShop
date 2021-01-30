/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Gabi
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        lblAgendamento = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        comboBoxServico = new javax.swing.JComboBox<>();
        comboBoxCliente = new javax.swing.JComboBox<>();
        lblServico = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        btnAgendar = new javax.swing.JToggleButton();
        scrollTabela = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        lblFundoPainel = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtObservacao.setColumns(20);
        txtObservacao.setRows(5);
        jScrollPane1.setViewportView(txtObservacao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 370, 270));

        lblAgendamento.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendamento.setText("Agendamento");
        getContentPane().add(lblAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 270, 70));

        lblCliente.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setText("Cliente");
        getContentPane().add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        txtId.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtId.setText("0");
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 270, 40));

        lblId.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("Id");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        txtValor.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtValor.setText("0");
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 270, 40));

        txtData.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 270, 40));

        txtHora.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 270, 40));

        comboBoxServico.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        comboBoxServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barba", "Corte", "Corte + Barba" }));
        getContentPane().add(comboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 270, 40));

        comboBoxCliente.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        comboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gabrielle", "Lucas", "João", " " }));
        getContentPane().add(comboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 270, 40));

        lblServico.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lblServico.setForeground(new java.awt.Color(255, 255, 255));
        lblServico.setText("Serviço");
        getContentPane().add(lblServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        lblValor.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lblValor.setForeground(new java.awt.Color(255, 255, 255));
        lblValor.setText("Valor R$");
        getContentPane().add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        lblData.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data");
        getContentPane().add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, 20));

        lblHora.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Hora");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, 20));

        btnAgendar.setBackground(new java.awt.Color(0, 0, 0));
        btnAgendar.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        btnAgendar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 280, -1));

        tabela1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Alan", "Corte", "10", "21/01/2021", "08:00"},
                {"2", "Gabrielle", "Corte", "10", "21/01/2021", "09:00"},
                {"3", "Pedro", "Corte+ Barba", "30", "22/01/2021", "08:30"},
                {"4", "Abigail", "Corte", "10", "22/01/2021", "09:30"}
            },
            new String [] {
                "Id", "Cliente", "Serviço", "Valor", "Data", "Hora"
            }
        ));
        scrollTabela.setViewportView(tabela1);

        getContentPane().add(scrollTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 650, 900, 280));

        lblFundoPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(lblFundoPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, -1));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/AgendaFundo.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 1290, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAgendar;
    private javax.swing.JComboBox<String> comboBoxCliente;
    private javax.swing.JComboBox<String> comboBoxServico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgendamento;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblFundoPainel;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblServico;
    private javax.swing.JLabel lblValor;
    private javax.swing.JScrollPane scrollTabela;
    private javax.swing.JTable tabela1;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextArea txtObservacao;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
