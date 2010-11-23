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

import persistencia.AccessControl;
import gui.Principal;


/**
 *
 * @author luizcpo
 */
public class FrameCadastroUsuario extends javax.swing.JFrame {

	private Principal principal;
    /** Creates new form FrameCadastroFornecedores */
    public FrameCadastroUsuario(Principal principal) {
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

        permissoes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        botaoOk = new javax.swing.JButton();
        botaoLimparCampos = new javax.swing.JButton();
        botaoOutroCadastro = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        labelTitulo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        labelNomeUsuario = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JTextField();
        labelPasswd = new javax.swing.JLabel();
        passwd = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        labelPermissoes = new javax.swing.JLabel();
        permissoesAdministrador = new javax.swing.JRadioButton();
        permissoesComprador = new javax.swing.JRadioButton();
        permissoesVendedor = new javax.swing.JRadioButton();
        labelWarningNomeUsuario = new javax.swing.JLabel();
        labelWarningPasswd = new javax.swing.JLabel();
        labelWarningNome = new javax.swing.JLabel();
        labelWarningPermissoes = new javax.swing.JLabel();

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

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoOk.setText("Ok");
        botaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOkActionPerformed(evt);
            }
        });

        botaoLimparCampos.setText("Limpar Campos");
        botaoLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparCamposActionPerformed(evt);
            }
        });

        botaoOutroCadastro.setText("Outro Cadastro?");
        botaoOutroCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOutroCadastroActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Ubuntu", 1, 18));
        labelTitulo.setText("Cadastro de Usuários:");

        labelNomeUsuario.setText("Nome de Usuário*:");

        labelPasswd.setText("Senha:");

        labelPermissoes.setText("Permissões:");

        permissoes.add(permissoesAdministrador);
        permissoesAdministrador.setText("Administrador");

        permissoes.add(permissoesComprador);
        permissoesComprador.setText("Comprador");

        permissoes.add(permissoesVendedor);
        permissoesVendedor.setText("Vendedor");

        labelWarningNomeUsuario.setForeground(new java.awt.Color(255, 0, 0));

        labelWarningPasswd.setForeground(new java.awt.Color(255, 0, 0));

        labelWarningNome.setForeground(new java.awt.Color(255, 0, 0));

        labelWarningPermissoes.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(botaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCancelar)
                .addGap(18, 18, 18)
                .addComponent(botaoOutroCadastro)
                .addGap(18, 18, 18)
                .addComponent(botaoLimparCampos))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(labelTitulo))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(permissoesComprador)
                            .addComponent(permissoesAdministrador)
                            .addComponent(permissoesVendedor)))
                    .addComponent(labelPermissoes))
                .addGap(391, 391, 391))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelWarningNomeUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNomeUsuario)
                        .addGap(1, 1, 1)
                        .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelPasswd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwd, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                    .addComponent(labelWarningPasswd, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelWarningNome, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelWarningPermissoes, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeUsuario)
                    .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPasswd)
                    .addComponent(passwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWarningNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWarningPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelWarningNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPermissoes)
                .addGap(26, 26, 26)
                .addComponent(permissoesAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permissoesComprador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permissoesVendedor)
                .addGap(18, 18, 18)
                .addComponent(labelWarningPermissoes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoOk)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoOutroCadastro)
                    .addComponent(botaoLimparCampos))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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
	/**
	 * ativa painel de confirmação de cadastro
    * ativa painel com a janela principal 
	 * @param evt
	 */
	private void botaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOkActionPerformed
		if(novoUsuario()) {
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
		if(novoUsuario()){
			JOptionPane.showConfirmDialog(null, "Cadastro realizado com sucesso!","Confirmação de Cadastro",JOptionPane.CLOSED_OPTION);
			limparCampos();
		}
	}//GEN-LAST:event_botaoLimparCamposActionPerformed
/**
 * Botão que cancela um cadastro
 * @param evt
 */
	private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
		this.principal.setEnabled(true);
		this.dispose();
	}//GEN-LAST:event_botaoCancelarActionPerformed
	/**
	 * Botão que adiciona novo cadastro
	 * Utilizando o método limparCampos os campos são limpados para inserção de novo cadastro
	 * @param evt
	 */
	private void botaoOutroCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOutroCadastroActionPerformed
		if(novoUsuario()){
			JOptionPane.showConfirmDialog(null, "Cadastro realizado com sucesso!","Confirmação de Cadastro",JOptionPane.CLOSED_OPTION);
			limparCampos();
		}
	}//GEN-LAST:event_botaoOutroCadastroActionPerformed
	/**
	 * Limpa campos preenchidos
	 */
	private void limparCampos() {
		nome.setText("");
        nomeUsuario.setText("");
        passwd.setText("");
        labelWarningNome.setText("");
        labelWarningNomeUsuario.setText("");
        labelWarningPasswd.setText("");
        labelWarningPermissoes.setText("");
	}
	/**
	 * Campo de preenchimento obrigatório
	 * Limpa campo preenchido
	 * Trata exceção de permissões de usuários
	 * @return
	 */
	private boolean novoUsuario() {
		int permitionLevel=0;
		
		if(nomeUsuario.getText().length() == 0) {
			labelWarningNomeUsuario.setText("O Nome de usuário é um campo obrigatório.");
			return false;
		}else{
			labelWarningNomeUsuario.setText("");
		}
		
		if(passwd.getText().length() == 0) {
			labelWarningPasswd.setText("A senha é um campo obrigatório.");
			return false;
		}else{
			labelWarningPasswd.setText("");
		}
		
		if(nome.getText().length() == 0) {
			labelWarningNome.setText("O Nome é um campo obrigatório.");
			return false;
		}else{
			labelWarningNome.setText("");
		}
		
		if(!(permissoesAdministrador.isSelected() && permissoesComprador.isSelected() && permissoesVendedor.isSelected())){
			labelWarningPermissoes.setText("Uma das opções de permissão precisam ser selecionadas.");
			return false;
		}else{
			labelWarningPermissoes.setText("");
		}
		
		if(permissoesAdministrador.isSelected()) {
			permitionLevel=1;
		}
		
		if(permissoesComprador.isSelected()) {
			permitionLevel=2;
		}
		
		if(permissoesVendedor.isSelected()) {
			permitionLevel=3;
		}
				
		return AccessControl.cadastroUsuario(nome.getText(), nomeUsuario.getText(), passwd.getText(), permitionLevel);
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
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimparCampos;
    private javax.swing.JButton botaoOk;
    private javax.swing.JButton botaoOutroCadastro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNomeUsuario;
    private javax.swing.JLabel labelPasswd;
    private javax.swing.JLabel labelPermissoes;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelWarningNome;
    private javax.swing.JLabel labelWarningNomeUsuario;
    private javax.swing.JLabel labelWarningPasswd;
    private javax.swing.JLabel labelWarningPermissoes;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nomeUsuario;
    private javax.swing.JPasswordField passwd;
    private javax.swing.ButtonGroup permissoes;
    private javax.swing.JRadioButton permissoesAdministrador;
    private javax.swing.JRadioButton permissoesComprador;
    private javax.swing.JRadioButton permissoesVendedor;
    // End of variables declaration//GEN-END:variables

}