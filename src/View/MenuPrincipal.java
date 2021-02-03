package View;

import Controller.MenuPrincipalController;

/**
 *
 * @author Gabrielle Rodrigues
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;
    
    public MenuPrincipal() {
        
        initComponents();
        this.controller = new MenuPrincipalController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFundo = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuOperacao = new javax.swing.JMenu();
        menuAgenda = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuTrabalho = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        menuServico = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/fundo-MenuPrincipal.jpg"))); // NOI18N

        menuOperacao.setText("Operação");
        menuOperacao.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N

        menuAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/agenda32-icon.png"))); // NOI18N
        menuAgenda.setText("Agenda");
        menuAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgendaActionPerformed(evt);
            }
        });
        menuOperacao.add(menuAgenda);

        barraMenu.add(menuOperacao);

        menuRelatorio.setText("Relatório");
        menuRelatorio.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N

        menuTrabalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/relatorioTrabalho32-icon.png"))); // NOI18N
        menuTrabalho.setText("Trabalho");
        menuTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrabalhoActionPerformed(evt);
            }
        });
        menuRelatorio.add(menuTrabalho);

        barraMenu.add(menuRelatorio);

        menuCadastro.setText("Cadastro");
        menuCadastro.setToolTipText("");
        menuCadastro.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N

        menuServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/tesoura32-icon.png"))); // NOI18N
        menuServico.setText("Serviço");
        menuServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuServicoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuServico);

        menuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/usuario32-icon.png"))); // NOI18N
        menuUsuario.setText("Usuário");
        menuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuUsuario);

        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/cliente32-icon.png"))); // NOI18N
        menuCliente.setText("Cliente");
        menuCadastro.add(menuCliente);

        barraMenu.add(menuCadastro);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFundo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFundo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuServicoActionPerformed

    private void menuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuUsuarioActionPerformed

    private void menuTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrabalhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTrabalhoActionPerformed

    private void menuAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgendaActionPerformed
        this.controller.navegaParaAgenda();
    }//GEN-LAST:event_menuAgendaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JMenuItem menuAgenda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenu menuOperacao;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenuItem menuServico;
    private javax.swing.JMenuItem menuTrabalho;
    private javax.swing.JMenuItem menuUsuario;
    // End of variables declaration//GEN-END:variables
}
