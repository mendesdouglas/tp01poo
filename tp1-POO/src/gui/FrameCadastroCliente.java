/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrameCadastroFornecedores.java
 *
 * Created on 19/11/2010, 15:16:12
 */

package gui;

import javax.swing.JOptionPane;

import pessoas.Cliente;
import persistencia.PersistenciaCliente;
import gui.Principal;


/**
 *
 * @author luizcpo
 */
public class FrameCadastroCliente extends javax.swing.JFrame {

	private Principal principal;
    /** Creates new form FrameCadastroFornecedores */
    public FrameCadastroCliente(Principal principal) {
        initComponents();
		this.principal = principal;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        labelEnderecoRua = new javax.swing.JLabel();
        labelEnderecoBeirro = new javax.swing.JLabel();
        labelEnderecoNumero = new javax.swing.JLabel();
        labelEnderecoTelefone = new javax.swing.JLabel();
        enderecoRua = new javax.swing.JTextField();
        enderecoNumero = new javax.swing.JTextField();
        enderecoTelefone = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        enderecoBairro = new javax.swing.JTextField();
        BotaoCancelar = new javax.swing.JButton();
        BotaoOk = new javax.swing.JButton();
        BotaoLimparCampos = new javax.swing.JButton();
        BotaoOutroCadastro = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        labelTitulo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        labelWarningNome = new javax.swing.JLabel();
        labelWarningCpf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);

        jPanel1.setMaximumSize(new java.awt.Dimension(580, 580));
        jPanel1.setMinimumSize(new java.awt.Dimension(580, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 580));

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        labelNome.setText("Nome*:");

        labelCpf.setText("CPF*:");

        labelEndereco.setText("Endereço:");

        labelEnderecoRua.setText("Rua:");

        labelEnderecoBeirro.setText("Bairro:");

        labelEnderecoNumero.setText("Número:");

        labelEnderecoTelefone.setText("Telefone:");

        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        BotaoOk.setText("Ok");
        BotaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoOkActionPerformed(evt);
            }
        });

        BotaoLimparCampos.setText("Limpar Campos");
        BotaoLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparCamposActionPerformed(evt);
            }
        });

        BotaoOutroCadastro.setText("Outro Cadastro?");
        BotaoOutroCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoOutroCadastroActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Ubuntu", 1, 18));
        labelTitulo.setText("Cadastro de Clientes:");

        labelWarningNome.setForeground(new java.awt.Color(255, 0, 0));

        labelWarningCpf.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelWarningCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelWarningNome, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelEndereco)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelEnderecoBeirro)
                                                    .addComponent(enderecoRua, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                                    .addComponent(enderecoBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(labelEnderecoTelefone)
                                                            .addComponent(labelEnderecoNumero)
                                                            .addComponent(enderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE))
                                                    .addComponent(enderecoTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelNome)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(labelEnderecoRua))
                                .addGap(28, 28, 28))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(labelTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(BotaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoOutroCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoLimparCampos))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNome)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(labelWarningNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpf)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWarningCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelEnderecoRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEnderecoNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(labelEnderecoBeirro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enderecoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enderecoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelEnderecoTelefone)))
                .addGap(54, 54, 54)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoOk)
                    .addComponent(BotaoCancelar)
                    .addComponent(BotaoOutroCadastro)
                    .addComponent(BotaoLimparCampos))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_nomeActionPerformed

	private void BotaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoOkActionPerformed

		if(novoCliente()){
			JOptionPane.showConfirmDialog(null, "Cadastro realizado com sucesso!","Confirmação de Cadastro",JOptionPane.CLOSED_OPTION);
			this.principal.setEnabled(true);
			this.dispose();			
		}

	}//GEN-LAST:event_BotaoOkActionPerformed

	private void BotaoLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparCamposActionPerformed
		limparCampos();
	}//GEN-LAST:event_BotaoLimparCamposActionPerformed

	private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
		this.principal.setEnabled(true);
		this.dispose();
	}//GEN-LAST:event_BotaoCancelarActionPerformed

	private void BotaoOutroCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoOutroCadastroActionPerformed
		if(novoCliente()){
			JOptionPane.showConfirmDialog(null, "Cadastro realizado com sucesso!","Confirmação de Cadastro",JOptionPane.CLOSED_OPTION);
			limparCampos();
		}
	}//GEN-LAST:event_BotaoOutroCadastroActionPerformed

	private boolean novoCliente() {
		if(nome.getText().length() == 0){
			labelWarningNome.setText("O Nome é um campo obrigatório.");
			return false;
		}else{
			labelWarningNome.setText("");
		}
		
		if(cpf.getText().length() == 0){
			labelWarningCpf.setText("O CPF é um campo obrigatório.");
			return false;
		}else{
			labelWarningCpf.setText("");
		}
		

		Cliente cliente = new Cliente(cpf.getText(),
									  nome.getText(),
									  enderecoRua.getText()+", "+enderecoNumero.getText()+", "+enderecoBairro.getText(),
									  enderecoTelefone.getText());
		return PersistenciaCliente.getInstance().cadastro(cliente);
	}

	private void limparCampos() {
		nome.setText("");
		cpf.setText("");
		enderecoBairro.setText("");
		enderecoNumero.setText("");
		enderecoRua.setText("");
		enderecoTelefone.setText("");
		labelWarningNome.setText("");
		labelWarningCpf.setText("");
	}

    /**
    * @param args the command line arguments
    */
  //  public static void main(String args[]) {
   //     java.awt.EventQueue.invokeLater(new Runnable() {
  //          public void run() {
   //             new FrameCadastroFornecedores().setVisible(true);
   //         }
   //     });
   // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoLimparCampos;
    private javax.swing.JButton BotaoOk;
    private javax.swing.JButton BotaoOutroCadastro;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField enderecoBairro;
    private javax.swing.JTextField enderecoNumero;
    private javax.swing.JTextField enderecoRua;
    private javax.swing.JTextField enderecoTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEnderecoBeirro;
    private javax.swing.JLabel labelEnderecoNumero;
    private javax.swing.JLabel labelEnderecoRua;
    private javax.swing.JLabel labelEnderecoTelefone;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelWarningCpf;
    private javax.swing.JLabel labelWarningNome;
    private javax.swing.JTextField nome;
    // End of variables declaration//GEN-END:variables
}