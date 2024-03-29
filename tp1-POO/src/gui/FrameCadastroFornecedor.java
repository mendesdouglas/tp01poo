/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Component;

import javax.swing.JOptionPane;

import persistencia.PersistenciaFornecedor;
import pessoas.Fornecedor;
import gui.Principal;
/**
 *
 * @author luizcpo
 */
public class FrameCadastroFornecedor extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Component principal;
    /** Creates new form CadastroCLientesFrame */
    public FrameCadastroFornecedor(Principal principal) {
        initComponents();
		this.principal = principal;
    }

    public FrameCadastroFornecedor(ConsultaFornecedor principal) {
        initComponents();
		this.principal = principal;
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        razaoSocial = new javax.swing.JTextField();
        labelRazaoSocial = new javax.swing.JLabel();
        labelCnpj = new javax.swing.JLabel();
        cnpj = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        labelEnderecoRua = new javax.swing.JLabel();
        labelEnderecoBairro = new javax.swing.JLabel();
        labelEnderecoNumero = new javax.swing.JLabel();
        labelEnderecoTelefone = new javax.swing.JLabel();
        enderecoRua = new javax.swing.JTextField();
        enderecoNumero = new javax.swing.JTextField();
        enderecoTelefone = new javax.swing.JTextField();
        enderecoBairro = new javax.swing.JTextField();
        botaoOk = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoLimparCampos = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        botaoOutroCadastro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        labelWarningRazaoSocial = new javax.swing.JLabel();
        labelWarningCnpj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        setTitle("Cadastro Clientes");
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);

        labelRazaoSocial.setText("Razão Social*:");

        labelCnpj.setText("CNPJ*:");

        labelEndereco.setText("Endereço:");

        labelEnderecoRua.setText("Rua:");

        labelEnderecoBairro.setText("Bairro:");

        labelEnderecoNumero.setText("Número:");

        labelEnderecoTelefone.setText("Telefone:");

        botaoOk.setText("Ok");
        botaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOkActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoLimparCampos.setText("Limpar Campos");
        botaoLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparCamposActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Ubuntu", 1, 18));
        labelTitulo.setText("Cadastro de Fornecedores:");

        botaoOutroCadastro.setText("Outro Cadastro?");
        botaoOutroCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOutroCadastroActionPerformed(evt);
            }
        });

        labelWarningRazaoSocial.setForeground(new java.awt.Color(255, 0, 0));

        labelWarningCnpj.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(labelTitulo)
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEndereco)
                        .addGap(333, 333, 333))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEnderecoBairro)
                            .addComponent(enderecoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEnderecoRua)
                            .addComponent(enderecoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEnderecoNumero)
                            .addComponent(enderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEnderecoTelefone)
                            .addComponent(enderecoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(botaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCancelar)
                .addGap(18, 18, 18)
                .addComponent(botaoOutroCadastro)
                .addGap(18, 18, 18)
                .addComponent(botaoLimparCampos)
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelWarningCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addComponent(labelWarningRazaoSocial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelCnpj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelRazaoSocial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(razaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRazaoSocial)
                    .addComponent(razaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWarningRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCnpj))
                .addGap(7, 7, 7)
                .addComponent(labelWarningCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEndereco)
                        .addGap(18, 18, 18)
                        .addComponent(labelEnderecoRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEnderecoNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEnderecoBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEnderecoTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoOk)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoOutroCadastro)
                    .addComponent(botaoLimparCampos))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     *ativa painel de confirmação de cadastro
    * ativa painel com a janela principal 
     */
    
	private void botaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOkActionPerformed
		if(novoFornecedor()){
			JOptionPane.showConfirmDialog(null, "Cadastro realizado com sucesso!","Confirmação de Cadastro",JOptionPane.CLOSED_OPTION);
			this.principal.setEnabled(true);
			this.dispose();
		}
	}//GEN-LAST:event_botaoOkActionPerformed
/**
 * botão que limpa os campos preenchidos
	 * utiliza método limparCampos
 * @param evt
 */
	private void botaoLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparCamposActionPerformed
		limparCampos();
	}//GEN-LAST:event_botaoLimparCamposActionPerformed

	/**
	 * Botão que adiciona novo cadastro
	 * Utilizando o método limparCampos os campos são limpados para inserção de novo cadastro
	 * @param evt
	 */
	private void botaoOutroCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOutroCadastroActionPerformed
		if(novoFornecedor()){
			JOptionPane.showConfirmDialog(null, "Cadastro realizado com sucesso!","Confirmação de Cadastro",JOptionPane.CLOSED_OPTION);
			limparCampos();
		}
	}//GEN-LAST:event_botaoOutroCadastroActionPerformed
	/**
	 * 
	 * @param evt
	 */
	        private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
	            this.principal.setEnabled(true);
	        }//GEN-LAST:event_formWindowClosed

	        private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
	            this.principal.setEnabled(true);
	        }//GEN-LAST:event_formWindowClosing
	/**
	 * Botão que cancela um cadastro
	 * @param evt
	 */
	private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
		this.principal.setEnabled(true);
		this.dispose();
	}//GEN-LAST:event_botaoCancelarActionPerformed
	
	private boolean novoFornecedor() {		
		if(razaoSocial.getText().length() == 0){
			labelWarningRazaoSocial.setText("A Razão Social é um campo obrigatório.");
			return false;
		}else{
			labelWarningRazaoSocial.setText("");
		}
		
		if(cnpj.getText().length() == 0){
			labelWarningCnpj.setText("O CNPJ é um campo obrigatório.");
			return false;
		}else{
			labelWarningCnpj.setText("");
		}

		Fornecedor fornecedor = new Fornecedor(cnpj.getText(),
				   							   razaoSocial.getText(),
				   							   enderecoRua.getText()+", "+enderecoNumero.getText()+", "+enderecoBairro.getText(),
				   							   enderecoTelefone.getText());
		return PersistenciaFornecedor.getInstance().cadastro(fornecedor);
	}

	private void limparCampos() {
		razaoSocial.setText("");
		cnpj.setText("");
		enderecoRua.setText("");
		enderecoNumero.setText("");
		enderecoBairro.setText("");
		enderecoTelefone.setText("");
		labelWarningCnpj.setText("");
		labelWarningRazaoSocial.setText("");
	}

    /**
    * @param args the command line arguments
    */
  //  public static void main(String args[]) {
    //    java.awt.EventQueue.invokeLater(new Runnable() {
      //      public void run() {
        //        new FrameCadastroCLientes().setVisible(true);
          //  }
       // });
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimparCampos;
    private javax.swing.JButton botaoOk;
    private javax.swing.JButton botaoOutroCadastro;
    private javax.swing.JTextField cnpj;
    private javax.swing.JTextField enderecoBairro;
    private javax.swing.JTextField enderecoNumero;
    private javax.swing.JTextField enderecoRua;
    private javax.swing.JTextField enderecoTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelCnpj;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEnderecoBairro;
    private javax.swing.JLabel labelEnderecoNumero;
    private javax.swing.JLabel labelEnderecoRua;
    private javax.swing.JLabel labelEnderecoTelefone;
    private javax.swing.JLabel labelRazaoSocial;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelWarningCnpj;
    private javax.swing.JLabel labelWarningRazaoSocial;
    private javax.swing.JTextField razaoSocial;
    // End of variables declaration//GEN-END:variables
}