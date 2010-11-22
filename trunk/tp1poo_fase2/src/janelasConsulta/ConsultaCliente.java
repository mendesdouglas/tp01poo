/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Cliente.java
 *
 * Created on 19/11/2010, 15:12:21
 */

package janelasConsulta;

import janelasMovimento.FrameMovimentoPrePedido;
import janelasPrincipal.Principal;
import java.awt.Component;

/**
 *
 * @author felipe
 */
public class ConsultaCliente extends javax.swing.JFrame {
    private Component principal;
    /** Creates new form Cliente */
    public ConsultaCliente(Principal principal) {
        initComponents();
		this.principal = principal;
		ConsultaClientePanelCpf.setVisible(false);
		ConsultaClientePanelNome.setVisible(false);
    }

	public ConsultaCliente(FrameMovimentoPrePedido principal) {
		initComponents();
		this.principal = principal;
		ConsultaClientePanelCpf.setVisible(false);
		ConsultaClientePanelNome.setVisible(false);
	}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ConsultaClienteTextPesquisa = new javax.swing.JFormattedTextField();
        ConsultaClienteBotaoBusca = new javax.swing.JButton();
        ConsultaClienteOpcaoNome = new javax.swing.JRadioButton();
        ConsultaClienteOpcaoCpf = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        ConsultaClientePanelCpf = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLCPF = new javax.swing.JLabel();
        ConsultaClienteTextEndereco = new javax.swing.JFormattedTextField();
        ConsultaClienteTextNome = new javax.swing.JFormattedTextField();
        ConsultaClienteTextTelefone = new javax.swing.JFormattedTextField();
        ConsultaClienteCpfBotaoOk = new javax.swing.JButton();
        ConsultaClienteCpfBotaoListar = new javax.swing.JButton();
        ConsultaClientePanelNome = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLCPF1 = new javax.swing.JLabel();
        jFNEndereco = new javax.swing.JFormattedTextField();
        jFCPF = new javax.swing.JFormattedTextField();
        jFNTelefone = new javax.swing.JFormattedTextField();
        ConsultaClienteNomeBotaoOk = new javax.swing.JButton();
        ConsultaClienteNomeBotaoListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(514, 401));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        ConsultaClienteTextPesquisa.setText("Pesquisa");
        ConsultaClienteTextPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ConsultaClienteTextPesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ConsultaClienteTextPesquisaFocusLost(evt);
            }
        });

        ConsultaClienteBotaoBusca.setText("Buscar");
        ConsultaClienteBotaoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteBotaoBuscaActionPerformed(evt);
            }
        });

        buttonGroup1.add(ConsultaClienteOpcaoNome);
        ConsultaClienteOpcaoNome.setText("Nome");
        ConsultaClienteOpcaoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteOpcaoNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(ConsultaClienteOpcaoCpf);
        ConsultaClienteOpcaoCpf.setText("CPF");
        ConsultaClienteOpcaoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteOpcaoCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(ConsultaClienteOpcaoCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsultaClienteOpcaoNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultaClienteTextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsultaClienteBotaoBusca)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaClienteTextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultaClienteBotaoBusca)
                    .addComponent(ConsultaClienteOpcaoNome)
                    .addComponent(ConsultaClienteOpcaoCpf))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConsultaClientePanelCpf.setBorder(javax.swing.BorderFactory.createTitledBorder("Cpf"));

        jLabel3.setText("Endereço");

        jLabel4.setText("Tefelone");

        jLCPF.setText("Nome");

        ConsultaClienteTextTelefone.setForeground(new java.awt.Color(58, 57, 59));

        ConsultaClienteCpfBotaoOk.setText("OK");
        ConsultaClienteCpfBotaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteCpfBotaoOkActionPerformed(evt);
            }
        });

        ConsultaClienteCpfBotaoListar.setText("Litar Todos");
        ConsultaClienteCpfBotaoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteCpfBotaoListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsultaClientePanelCpfLayout = new javax.swing.GroupLayout(ConsultaClientePanelCpf);
        ConsultaClientePanelCpf.setLayout(ConsultaClientePanelCpfLayout);
        ConsultaClientePanelCpfLayout.setHorizontalGroup(
            ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaClientePanelCpfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultaClientePanelCpfLayout.createSequentialGroup()
                        .addGroup(ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ConsultaClienteTextNome, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                            .addComponent(ConsultaClienteTextEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaClientePanelCpfLayout.createSequentialGroup()
                        .addComponent(ConsultaClienteCpfBotaoListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                        .addComponent(ConsultaClienteCpfBotaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ConsultaClientePanelCpfLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(ConsultaClienteTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ConsultaClientePanelCpfLayout.setVerticalGroup(
            ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaClientePanelCpfLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaClienteTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCPF))
                .addGap(33, 33, 33)
                .addGroup(ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ConsultaClienteTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ConsultaClienteTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaClienteCpfBotaoOk)
                    .addComponent(ConsultaClienteCpfBotaoListar))
                .addContainerGap())
        );

        ConsultaClientePanelNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        jLabel6.setText("Endereço");

        jLabel7.setText("Tefelone");

        jLCPF1.setText("CPF");

        jFNTelefone.setForeground(new java.awt.Color(58, 57, 59));

        ConsultaClienteNomeBotaoOk.setText("OK");
        ConsultaClienteNomeBotaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteNomeBotaoOkActionPerformed(evt);
            }
        });

        ConsultaClienteNomeBotaoListar.setText("Listar Todos");
        ConsultaClienteNomeBotaoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteNomeBotaoListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsultaClientePanelNomeLayout = new javax.swing.GroupLayout(ConsultaClientePanelNome);
        ConsultaClientePanelNome.setLayout(ConsultaClientePanelNomeLayout);
        ConsultaClientePanelNomeLayout.setHorizontalGroup(
            ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaClientePanelNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultaClientePanelNomeLayout.createSequentialGroup()
                        .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLCPF1)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFNTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFNEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(ConsultaClientePanelNomeLayout.createSequentialGroup()
                        .addComponent(ConsultaClienteNomeBotaoListar)
                        .addContainerGap(401, Short.MAX_VALUE))))
            .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaClientePanelNomeLayout.createSequentialGroup()
                    .addContainerGap(426, Short.MAX_VALUE)
                    .addComponent(ConsultaClienteNomeBotaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        ConsultaClientePanelNomeLayout.setVerticalGroup(
            ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaClientePanelNomeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCPF1)
                    .addComponent(jFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFNEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFNTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(ConsultaClienteNomeBotaoListar)
                .addContainerGap())
            .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaClientePanelNomeLayout.createSequentialGroup()
                    .addContainerGap(223, Short.MAX_VALUE)
                    .addComponent(ConsultaClienteNomeBotaoOk)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ConsultaClientePanelCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ConsultaClientePanelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(112, Short.MAX_VALUE)
                    .addComponent(ConsultaClientePanelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(110, Short.MAX_VALUE)
                    .addComponent(ConsultaClientePanelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultaClienteTextPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConsultaClienteTextPesquisaFocusGained
        ConsultaClienteTextPesquisa.setText("");
}//GEN-LAST:event_ConsultaClienteTextPesquisaFocusGained

    private void ConsultaClienteTextPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConsultaClienteTextPesquisaFocusLost
        ConsultaClienteTextPesquisa.setText("Pesquisa");
}//GEN-LAST:event_ConsultaClienteTextPesquisaFocusLost

    private void ConsultaClienteBotaoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteBotaoBuscaActionPerformed
//        String busca = jFPesquisa.getText();
//        if(busca == null || busca.length() == 0){
//            JOptionPane.showMessageDialog(null, "Pesquisa Inválida");
//        } else{
//            Cliente cliente = new Cliente();
//            cliente = PersistenciaCliente.getInstance().seach();
//            if(jRCPF.isSelected() == true){
//                jFNome.setText(cliente.getNome());
//                jFEndereco.setText(cliente.getEndereco());
//                jFCodigo.setText(cliente.getCodigo());
//                jFTelefone.setText(cliente.getTelefone());
//            } else{
//                if(jRNome.isSelected() == true){
//                    jFCPF.setText(cliente.getCnpj());
//                    jFNEndereco.setText(cliente.getEndereco());
//                    jFNCodigo.setText(cliente.getCodigo());
//                    jFNTelefone.setText(cliente.getTelefone());
//                }
//            }
//        }
}//GEN-LAST:event_ConsultaClienteBotaoBuscaActionPerformed

	private void ConsultaClienteOpcaoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteOpcaoCpfActionPerformed
		ConsultaClientePanelNome.setVisible(false);
		ConsultaClientePanelCpf.setVisible(true);
	}//GEN-LAST:event_ConsultaClienteOpcaoCpfActionPerformed

	private void ConsultaClienteOpcaoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteOpcaoNomeActionPerformed
		ConsultaClientePanelCpf.setVisible(false);
		ConsultaClientePanelNome.setVisible(true);
	}//GEN-LAST:event_ConsultaClienteOpcaoNomeActionPerformed

	private void ConsultaClienteNomeBotaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteNomeBotaoOkActionPerformed
		principal.setEnabled(true);
		this.dispose();
}//GEN-LAST:event_ConsultaClienteNomeBotaoOkActionPerformed

	private void ConsultaClienteCpfBotaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteCpfBotaoOkActionPerformed
		principal.setEnabled(true);
		this.dispose();
}//GEN-LAST:event_ConsultaClienteCpfBotaoOkActionPerformed

	private void ConsultaClienteCpfBotaoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteCpfBotaoListarActionPerformed
		ConsultaListar listar = new ConsultaListar(this);
		listar.setVisible(true);
		this.setEnabled(false);
	}//GEN-LAST:event_ConsultaClienteCpfBotaoListarActionPerformed

	private void ConsultaClienteNomeBotaoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteNomeBotaoListarActionPerformed
		ConsultaListar listar = new ConsultaListar(this);
		listar.setVisible(true);
		this.setEnabled(false);
	}//GEN-LAST:event_ConsultaClienteNomeBotaoListarActionPerformed

    /**
    * @param args the command line arguments
    */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultaClienteBotaoBusca;
    private javax.swing.JButton ConsultaClienteCpfBotaoListar;
    private javax.swing.JButton ConsultaClienteCpfBotaoOk;
    private javax.swing.JButton ConsultaClienteNomeBotaoListar;
    private javax.swing.JButton ConsultaClienteNomeBotaoOk;
    private javax.swing.JRadioButton ConsultaClienteOpcaoCpf;
    private javax.swing.JRadioButton ConsultaClienteOpcaoNome;
    private javax.swing.JPanel ConsultaClientePanelCpf;
    private javax.swing.JPanel ConsultaClientePanelNome;
    private javax.swing.JFormattedTextField ConsultaClienteTextEndereco;
    private javax.swing.JFormattedTextField ConsultaClienteTextNome;
    private javax.swing.JFormattedTextField ConsultaClienteTextPesquisa;
    private javax.swing.JFormattedTextField ConsultaClienteTextTelefone;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField jFCPF;
    private javax.swing.JFormattedTextField jFNEndereco;
    private javax.swing.JFormattedTextField jFNTelefone;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCPF1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
