/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sist.tela;

/**
 *
 * @author LUDRIANO
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); // Cria tela maximizada.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        menuCad = new javax.swing.JMenu();
        jmFuncionario = new javax.swing.JMenuItem();
        jmVeiculo = new javax.swing.JMenuItem();
        jmParada = new javax.swing.JMenuItem();
        jmLinha = new javax.swing.JMenuItem();
        jmItiner = new javax.swing.JMenuItem();
        jmAbre = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        jmEditFunc = new javax.swing.JMenuItem();
        jmEditVeic = new javax.swing.JMenuItem();
        jmEditParada = new javax.swing.JMenuItem();
        jmEditLinha = new javax.swing.JMenuItem();
        jmEditItiner = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmNaveg = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        jmConteudo = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SINTER");

        fileMenu.setMnemonic('n');
        fileMenu.setText("Novo");

        menuCad.setMnemonic('c');
        menuCad.setText("Cadastrar...");
        menuCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadActionPerformed(evt);
            }
        });

        jmFuncionario.setMnemonic('f');
        jmFuncionario.setText("Funcionario");
        menuCad.add(jmFuncionario);

        jmVeiculo.setMnemonic('v');
        jmVeiculo.setText("Veículo");
        jmVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmVeiculoActionPerformed(evt);
            }
        });
        menuCad.add(jmVeiculo);

        jmParada.setText("Parada");
        menuCad.add(jmParada);

        jmLinha.setText("Linha");
        menuCad.add(jmLinha);

        jmItiner.setText("Itinerario");
        menuCad.add(jmItiner);

        fileMenu.add(menuCad);

        jmAbre.setMnemonic('o');
        jmAbre.setText("Abrir...");
        fileMenu.add(jmAbre);

        jmSair.setMnemonic('x');
        jmSair.setText("Sair");
        jmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSairActionPerformed(evt);
            }
        });
        fileMenu.add(jmSair);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Editar");

        jmEditFunc.setMnemonic('f');
        jmEditFunc.setText("Funcionario");
        editMenu.add(jmEditFunc);

        jmEditVeic.setMnemonic('v');
        jmEditVeic.setText("Veículo");
        editMenu.add(jmEditVeic);

        jmEditParada.setText("Parada");
        editMenu.add(jmEditParada);

        jmEditLinha.setText("Linha");
        editMenu.add(jmEditLinha);

        jmEditItiner.setText("Itinerario");
        editMenu.add(jmEditItiner);

        menuBar.add(editMenu);

        jMenu2.setMnemonic('f');
        jMenu2.setText("Ferramenta");

        jmNaveg.setText("Navegador");
        jMenu2.add(jmNaveg);

        menuBar.add(jMenu2);

        helpMenu.setMnemonic('a');
        helpMenu.setText("Ajuda");

        jmConteudo.setMnemonic('c');
        jmConteudo.setText("Conteúdo");
        helpMenu.add(jmConteudo);

        jmSobre.setMnemonic('s');
        jmSobre.setText("Sobre...");
        helpMenu.add(jmSobre);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSairActionPerformed

    private void menuCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadActionPerformed

    }//GEN-LAST:event_menuCadActionPerformed

    private void jmVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmVeiculoActionPerformed

    }//GEN-LAST:event_jmVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem jmAbre;
    private javax.swing.JMenuItem jmConteudo;
    private javax.swing.JMenuItem jmEditFunc;
    private javax.swing.JMenuItem jmEditItiner;
    private javax.swing.JMenuItem jmEditLinha;
    private javax.swing.JMenuItem jmEditParada;
    private javax.swing.JMenuItem jmEditVeic;
    private javax.swing.JMenuItem jmFuncionario;
    private javax.swing.JMenuItem jmItiner;
    private javax.swing.JMenuItem jmLinha;
    private javax.swing.JMenuItem jmNaveg;
    private javax.swing.JMenuItem jmParada;
    private javax.swing.JMenuItem jmSair;
    private javax.swing.JMenuItem jmSobre;
    private javax.swing.JMenuItem jmVeiculo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCad;
    // End of variables declaration//GEN-END:variables

}
