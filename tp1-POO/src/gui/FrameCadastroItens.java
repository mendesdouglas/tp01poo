/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrameCadastro.java
 *
 * Created on 21/11/2010, 13:03:18
 */

package gui;

import java.awt.Component;

import javax.swing.JOptionPane;

import estoque.Item;
import persistencia.PersistenciaEstoque;
import gui.Principal;
/**
 *
 * @author felipe
 */
public class FrameCadastroItens extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Component principal;
    /** 
     * Creates new form FrameCadastro 
     * */
    public FrameCadastroItens(Principal principal) {
        initComponents();
		this.principal = principal;
    }
    
    public FrameCadastroItens(ConsultaItem principal) {
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
        nome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelPrecoCusto = new javax.swing.JLabel();
        precoCusto = new javax.swing.JTextField();
        quantidade = new javax.swing.JTextField();
        labelQuantidade = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        lucro = new javax.swing.JTextField();
        labelLucro = new javax.swing.JLabel();
        botaoVerificarDisponibilidade = new javax.swing.JButton();
        botaoOk = new javax.swing.JButton();
        botaoCancel = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        botaoOutroCadastro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        labelWarningCodigo = new javax.swing.JLabel();
        labelWarningQuantidade = new javax.swing.JLabel();
        labelWarningPrecoCusto = new javax.swing.JLabel();
        labelWarningLucro = new javax.swing.JLabel();
        labelWarningNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        labelNome.setText("Nome - Descrição*:");

        labelPrecoCusto.setText("Preço de Custo*: R$");

        labelQuantidade.setText("Quantidade*:");

        labelCodigo.setText("Código*:");

        labelLucro.setText("Margem de Lucro*:");

        botaoVerificarDisponibilidade.setText("Verificar Disponibilidade");
        botaoVerificarDisponibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerificarDisponibilidadeActionPerformed(evt);
            }
        });

        botaoOk.setText("Ok");
        botaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOkActionPerformed(evt);
            }
        });

        botaoCancel.setText("Cancelar");
        botaoCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar Campos");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Ubuntu", 1, 18));
        labelTitulo.setText("Cadastro de Itens:");

        botaoOutroCadastro.setText("Outro Cadastro?");
        botaoOutroCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOutroCadastroActionPerformed(evt);
            }
        });

        labelWarningCodigo.setForeground(new java.awt.Color(255, 0, 0));

        labelWarningQuantidade.setForeground(new java.awt.Color(255, 0, 0));

        labelWarningPrecoCusto.setForeground(new java.awt.Color(255, 0, 0));

        labelWarningLucro.setForeground(new java.awt.Color(255, 0, 0));

        labelWarningNome.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(labelWarningNome, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addComponent(labelWarningLucro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(111, 111, 111)
                                    .addComponent(labelWarningCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(labelNome)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(labelCodigo)
                                                .addComponent(labelQuantidade)
                                                .addComponent(labelLucro)
                                                .addComponent(labelPrecoCusto))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(precoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lucro)
                                                .addComponent(quantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                                .addComponent(codigo))
                                            .addGap(18, 18, 18)
                                            .addComponent(botaoVerificarDisponibilidade))
                                        .addComponent(labelWarningPrecoCusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(217, 217, 217)
                                    .addComponent(labelTitulo))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(116, 116, 116)
                                    .addComponent(botaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(botaoCancel)
                                    .addGap(18, 18, 18)
                                    .addComponent(botaoOutroCadastro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botaoLimpar))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelWarningQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWarningNome, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPrecoCusto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWarningPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWarningQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLucro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWarningLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVerificarDisponibilidade)
                    .addComponent(labelCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWarningCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoOk)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoCancel)
                    .addComponent(botaoOutroCadastro))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void botaoVerificarDisponibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerificarDisponibilidadeActionPerformed
		verificarCodigo();

	}//GEN-LAST:event_botaoVerificarDisponibilidadeActionPerformed
	/**
	 * ativa painel de confirmação de cadastro
     * ativa painel com a janela principal 
	 * @param evt
	 */
	private void botaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOkActionPerformed
		if(novoItem()) {
			JOptionPane.showConfirmDialog(null, "Cadastro realizado com sucesso!","Confirmação de Cadastro",JOptionPane.CLOSED_OPTION);
			this.principal.setEnabled(true);
			this.dispose();	
		}
	}//GEN-LAST:event_botaoOkActionPerformed
	/**
	 *  Botão que cancela um cadastro
	 * @param evt
	 */
	private void botaoCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelActionPerformed
		this.principal.setEnabled(true);
		this.dispose();
	}//GEN-LAST:event_botaoCancelActionPerformed
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
	 *  botão que limpa os campos preenchidos
	 * utiliza método limparCampos
	 * @param evt
	 */
	
	private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
		limparCampos();
	}//GEN-LAST:event_botaoLimparActionPerformed
	/**
	 * Botão que adiciona novo cadastro
	 * Utilizando o método limparCampos os campos são limpados para inserção de novo cadastro
	 * @param evt
	 */
	private void botaoOutroCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOutroCadastroActionPerformed
		if(novoItem()){
			JOptionPane.showConfirmDialog(null, "Cadastro realizado com sucesso!","Confirmação de Cadastro",JOptionPane.CLOSED_OPTION);
			limparCampos();
		}
	}//GEN-LAST:event_botaoOutroCadastroActionPerformed
	/**
	 * trata exceção do campo código
	 * @return
	 */
	private boolean verificarCodigo() {
		try{
			int cod = Integer.parseInt(codigo.getText());
			
			Item item = PersistenciaEstoque.getInstance().searchItem(cod);
			if(item != null){
				labelWarningCodigo.setText("Código já existente, por favor, tente novamente.");
				return false;
			}else{
				labelWarningCodigo.setText("Código válido.");
			}
		}catch (NumberFormatException e) {
			labelWarningCodigo.setText("O código digitado precisa ser numérico.");
			return false;
		}
		return true;
	}
	/** 
	 * utiliza o método limparCampos para limpar os campos que estão preenchidos
	 */
	private void limparCampos() {
		codigo.setText("");
		lucro.setText("");
		nome.setText("");
		precoCusto.setText("");
		quantidade.setText("");
		labelWarningCodigo.setText("");
		labelWarningLucro.setText("");
		labelWarningNome.setText("");
		labelWarningPrecoCusto.setText("");
		labelWarningQuantidade.setText("");
	}
	
	private boolean novoItem() {
		int cod = -1;
		float cost = -1;
		float luc = -1;
		int quant = -1;
		/**
		 *Trata exceção do campo nome 
		 */
		
		if(nome.getText().length() == 0){
			labelWarningNome.setText("A descrição do Item é um campo obrigatório.");
			return false;
		}else{
			labelWarningNome.setText("");
		}	
		

		
		/**
		 * Trata exceção do campo preço de custo
		 */
		try{
			cost = Float.parseFloat(precoCusto.getText());
			labelWarningPrecoCusto.setText("");
			if(cost < 0){
				labelWarningPrecoCusto.setText("O valor do custo precisa ser maior que 0.");
				return false;
			}
		}catch (NumberFormatException e) {
			labelWarningPrecoCusto.setText("O preço de custo precisa ser um número.");
			return false;
		}
				
		/**
		 * Trata exceção do campo quantidade
		 */
		try{
			quant = Integer.parseInt(quantidade.getText());
			labelWarningQuantidade.setText("");
			if(quant < 0){
				labelWarningQuantidade.setText("A quantidade precisa ser maior que 0.");
				return false;
			}
		}catch (NumberFormatException e) {
			labelWarningQuantidade.setText("A quantidade precisa ser um número.");
			return false;
		}
		
		/**
		 * Trata exceção do campo margem de lucro
		 */
		try{
			luc = Float.parseFloat(lucro.getText());
			labelWarningLucro.setText("");
			if(luc < 0){
				labelWarningLucro.setText("A margem de lucro precisa ser maior que 0.");
				return false;
			}
		}catch (NumberFormatException e) {
			labelWarningLucro.setText("A margem de lucro precisa ser um número.");
			return false;
		}

		/**
		 * Trata exceções no campo código
		 */
		try{
			cod = Integer.parseInt(codigo.getText());
			labelWarningCodigo.setText("");
		}catch (NumberFormatException e) {
			labelWarningCodigo.setText("O código digitado precisa ser um número.");
			return false;
		}
		
		if(!verificarCodigo()){
			return false;
		}
		
		Item item = new Item(nome.getText(),cod, cost,luc,quant);
		return PersistenciaEstoque.getInstance().cadastro(item);
	}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancel;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoOk;
    private javax.swing.JButton botaoOutroCadastro;
    private javax.swing.JButton botaoVerificarDisponibilidade;
    private javax.swing.JTextField codigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelLucro;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPrecoCusto;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelWarningCodigo;
    private javax.swing.JLabel labelWarningLucro;
    private javax.swing.JLabel labelWarningNome;
    private javax.swing.JLabel labelWarningPrecoCusto;
    private javax.swing.JLabel labelWarningQuantidade;
    private javax.swing.JTextField lucro;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField precoCusto;
    private javax.swing.JTextField quantidade;
    // End of variables declaration//GEN-END:variables

}