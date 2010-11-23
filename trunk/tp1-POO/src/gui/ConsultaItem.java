/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Item.java
 *
 * Created on 19/11/2010, 15:16:46
 */

package gui;

import java.awt.Component;

import javax.swing.JOptionPane;

import estoque.Item;

import persistencia.PersistenciaEstoque;

import gui.Principal2;

/**
 *
 * @author felipe
 */
public class ConsultaItem extends javax.swing.JFrame {

	private Component principal;
    
    /** Creates new form Item */
    public ConsultaItem(Principal2 principal) {
        initComponents();
		this.principal = principal;
		ConsultaItemOpcaoCodigo.setSelected(true);
		ConsultaItemPanelNome.setVisible(false);
		ConsultaItemPanelCodigo.setVisible(true);
		ConsultaItemTextPesquisa.setText("");
		ConsultaItemCodigoTextMargemLucro.setEditable(false);
		ConsultaItemCodigoTextNome.setEditable(false);
		ConsultaItemCodigoTextPrecoCusto.setEditable(false);
		ConsultaItemCodigoTextQuantidade.setEditable(false);
		ConsultaItemNomeTextCodigo.setEditable(false);
		ConsultaItemNomeTextMargemLucro.setEditable(false);
		ConsultaItemNomeTextPrecoCusto.setEditable(false);
		ConsultaItemNomeTextQuantidade.setEditable(false);	
		ConsultaItemBotaoBusca.setEnabled(true);
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
        jPanel3 = new javax.swing.JPanel();
        ConsultaItemTextPesquisa = new javax.swing.JFormattedTextField();
        ConsultaItemBotaoBusca = new javax.swing.JButton();
        ConsultaItemOpcaoNome = new javax.swing.JRadioButton();
        ConsultaItemOpcaoCodigo = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        ConsultaItemPanelCodigo = new javax.swing.JPanel();
        jLPrecoCusto = new javax.swing.JLabel();
        jLMargemLucro = new javax.swing.JLabel();
        jLQuantidade = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        ConsultaItemCodigoTextMargemLucro = new javax.swing.JFormattedTextField();
        ConsultaItemCodigoTextPrecoCusto = new javax.swing.JFormattedTextField();
        ConsultaItemCodigoTextNome = new javax.swing.JFormattedTextField();
        ConsultaItemCodigoTextQuantidade = new javax.swing.JFormattedTextField();
        ConsultaItemCodigoBotaoOk = new javax.swing.JButton();
        ConsultaItemCodigoBotaoListar = new javax.swing.JButton();
        ConsultaItemCodigoBotaoCadastro = new javax.swing.JButton();
        ConsultaItemPanelNome = new javax.swing.JPanel();
        jLNPrecoCusto = new javax.swing.JLabel();
        jLNMargemLucro = new javax.swing.JLabel();
        jLNQuantidade = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        ConsultaItemNomeTextMargemLucro = new javax.swing.JFormattedTextField();
        ConsultaItemNomeTextPrecoCusto = new javax.swing.JFormattedTextField();
        ConsultaItemNomeTextCodigo = new javax.swing.JFormattedTextField();
        ConsultaItemNomeTextQuantidade = new javax.swing.JFormattedTextField();
        ConsultaItemNomeBotaoOk = new javax.swing.JButton();
        ConsultaItemNomeBotaoListar = new javax.swing.JButton();
        ConsultaItemNomeBotaoCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setPreferredSize(new java.awt.Dimension(514, 401));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Item"));

        ConsultaItemTextPesquisa.setText("Pesquisa");
        ConsultaItemTextPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFPesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
//                jFPesquisaFocusLost(evt);
            }
        });

        ConsultaItemBotaoBusca.setText("Buscar");
        ConsultaItemBotaoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCBuscaActionPerformed(evt);
            }
        });

        buttonGroup1.add(ConsultaItemOpcaoNome);
        ConsultaItemOpcaoNome.setText("Nome");
        ConsultaItemOpcaoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(ConsultaItemOpcaoCodigo);
        ConsultaItemOpcaoCodigo.setText("Código");
        ConsultaItemOpcaoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(ConsultaItemOpcaoCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsultaItemOpcaoNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultaItemTextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsultaItemBotaoBusca)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaItemTextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultaItemBotaoBusca)
                    .addComponent(ConsultaItemOpcaoNome)
                    .addComponent(ConsultaItemOpcaoCodigo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConsultaItemPanelCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));

        jLPrecoCusto.setText("Preço de Custo");

        jLMargemLucro.setText("Margem de Lucro");

        jLQuantidade.setText("Quantidade");

        jLNome.setText("Nome");

        ConsultaItemCodigoTextQuantidade.setForeground(new java.awt.Color(58, 57, 59));

        ConsultaItemCodigoBotaoOk.setText("OK");
        ConsultaItemCodigoBotaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaItemCodigoBotaoOkActionPerformed(evt);
            }
        });

        ConsultaItemCodigoBotaoListar.setText("Listar Todos");
        ConsultaItemCodigoBotaoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaItemCodigoBotaoListarActionPerformed(evt);
            }
        });

        ConsultaItemCodigoBotaoCadastro.setText("Cadastro");
        ConsultaItemCodigoBotaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaItemCodigoBotaoCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCodigoLayout = new javax.swing.GroupLayout(ConsultaItemPanelCodigo);
        ConsultaItemPanelCodigo.setLayout(jPCodigoLayout);
        jPCodigoLayout.setHorizontalGroup(
            jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCodigoLayout.createSequentialGroup()
                        .addGroup(jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPrecoCusto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jLNome)
                            .addComponent(jLMargemLucro)
                            .addComponent(jLQuantidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConsultaItemCodigoTextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsultaItemCodigoTextNome, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addGroup(jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ConsultaItemCodigoTextMargemLucro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ConsultaItemCodigoTextPrecoCusto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                        .addGap(37, 37, 37))
                    .addGroup(jPCodigoLayout.createSequentialGroup()
                        .addComponent(ConsultaItemCodigoBotaoListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                        .addComponent(ConsultaItemCodigoBotaoCadastro)
                        .addGap(90, 90, 90))))
            .addGroup(jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCodigoLayout.createSequentialGroup()
                    .addContainerGap(434, Short.MAX_VALUE)
                    .addComponent(ConsultaItemCodigoBotaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPCodigoLayout.setVerticalGroup(
            jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCodigoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(ConsultaItemCodigoTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaItemCodigoTextPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPrecoCusto))
                .addGap(8, 8, 8)
                .addGroup(jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaItemCodigoTextMargemLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLMargemLucro))
                .addGap(18, 18, 18)
                .addGroup(jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaItemCodigoTextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaItemCodigoBotaoListar)
                    .addComponent(ConsultaItemCodigoBotaoCadastro))
                .addContainerGap())
            .addGroup(jPCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCodigoLayout.createSequentialGroup()
                    .addContainerGap(209, Short.MAX_VALUE)
                    .addComponent(ConsultaItemCodigoBotaoOk)
                    .addContainerGap()))
        );

        ConsultaItemPanelNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        jLNPrecoCusto.setText("Preço de Custo");

        jLNMargemLucro.setText("Margem de Lucro");

        jLNQuantidade.setText("Quantidade");

        jLCodigo.setText("Código");

        ConsultaItemNomeTextQuantidade.setForeground(new java.awt.Color(58, 57, 59));

        ConsultaItemNomeBotaoOk.setText("OK");
        ConsultaItemNomeBotaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaItemNomeBotaoOkActionPerformed(evt);
            }
        });

        ConsultaItemNomeBotaoListar.setText("Listar Todos ");
        ConsultaItemNomeBotaoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaItemNomeBotaoListarActionPerformed(evt);
            }
        });

        ConsultaItemNomeBotaoCadastro.setText("Cadastro");
        ConsultaItemNomeBotaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaItemNomeBotaoCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCNomeLayout = new javax.swing.GroupLayout(ConsultaItemPanelNome);
        ConsultaItemPanelNome.setLayout(jPCNomeLayout);
        jPCNomeLayout.setHorizontalGroup(
            jPCNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCNomeLayout.createSequentialGroup()
                        .addGroup(jPCNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNPrecoCusto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jLCodigo)
                            .addComponent(jLNMargemLucro)
                            .addComponent(jLNQuantidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ConsultaItemNomeTextQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(ConsultaItemNomeTextCodigo)
                            .addComponent(ConsultaItemNomeTextPrecoCusto, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(ConsultaItemNomeTextMargemLucro))
                        .addContainerGap(206, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCNomeLayout.createSequentialGroup()
                        .addComponent(ConsultaItemNomeBotaoListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                        .addComponent(ConsultaItemNomeBotaoCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ConsultaItemNomeBotaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPCNomeLayout.setVerticalGroup(
            jPCNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCNomeLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPCNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(ConsultaItemNomeTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaItemNomeTextPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNPrecoCusto))
                .addGap(8, 8, 8)
                .addGroup(jPCNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaItemNomeTextMargemLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNMargemLucro))
                .addGap(18, 18, 18)
                .addGroup(jPCNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaItemNomeTextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPCNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaItemNomeBotaoOk)
                    .addComponent(ConsultaItemNomeBotaoListar)
                    .addComponent(ConsultaItemNomeBotaoCadastro))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ConsultaItemPanelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ConsultaItemPanelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(127, Short.MAX_VALUE)
                    .addComponent(ConsultaItemPanelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(123, Short.MAX_VALUE)
                    .addComponent(ConsultaItemPanelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFPesquisaFocusGained
        ConsultaItemTextPesquisa.setText("");
}//GEN-LAST:event_jFPesquisaFocusGained

/*    private void jFPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFPesquisaFocusLost
        ConsultaItemTextPesquisa.setText("");
}*///GEN-LAST:event_jFPesquisaFocusLost

    /**
     * Busca um item pelo codigo ou pelo nome
     * Não aceita campos vazios
     */
    private void jBCBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCBuscaActionPerformed
    	String busca = null;
        busca = ConsultaItemTextPesquisa.getText();
        if(busca == null || busca.length() == 0){
            JOptionPane.showMessageDialog(null, "Pesquisa Inválida");
        } 
        else{            
	            if(ConsultaItemOpcaoCodigo.isSelected() == true){
	            	Item item = PersistenciaEstoque.getInstance().searchItem(Integer.parseInt(busca));
	            	if(item == null){
	                    JOptionPane.showMessageDialog(null, "Nao encontrado!!!!!");
	            	}
	            	else{
		            	ConsultaItemCodigoTextNome.setText(item.getNome());
		                ConsultaItemCodigoTextMargemLucro.setText(((Float)item.getMargemLucro()).toString());
		                ConsultaItemCodigoTextPrecoCusto.setText(((Float)item.getPrecoCusto()).toString());
		                ConsultaItemCodigoTextQuantidade.setText(String.valueOf(item.getQuant()));
	            	}	
	            } else{
	                if(ConsultaItemOpcaoNome.isSelected() == true){
	                	Item item = PersistenciaEstoque.getInstance().searchItem(busca);
	                	if(item == null){
	                        JOptionPane.showMessageDialog(null, "Nao encontrado!!!!!");
	                	}
	                	else {
		                    ConsultaItemNomeTextCodigo.setText(String.valueOf(item.getCodigo()));
		                    ConsultaItemNomeTextMargemLucro.setText(((Float)item.getMargemLucro()).toString());
		                    ConsultaItemNomeTextPrecoCusto.setText(((Float)item.getMargemLucro()).toString());
		                    ConsultaItemNomeTextQuantidade.setText(String.valueOf(item.getQuant()));
	                	}    
	                }
	            }
        }
}//GEN-LAST:event_jBCBuscaActionPerformed

    /**
     * 
     * Habilita a consulta pelo nome do item
     * @param evt
     */
	private void ConsultaItemNomeBotaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaItemNomeBotaoOkActionPerformed
		principal.setEnabled(true);
		this.dispose();
	}//GEN-LAST:event_ConsultaItemNomeBotaoOkActionPerformed

	/**
	 * Habilita a consulta pelo codigo do item
	 * @param evt
	 */
	private void ConsultaItemCodigoBotaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaItemCodigoBotaoOkActionPerformed
		principal.setEnabled(true);
		this.dispose();
	}//GEN-LAST:event_ConsultaItemCodigoBotaoOkActionPerformed

	/**
	 * Campos para a busca através do código
	 * desabilita a busca pelo nome
	 * @param evt
	 */
	private void jRCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRCodigoActionPerformed
		ConsultaItemPanelNome.setVisible(false);
		ConsultaItemPanelCodigo.setVisible(true);
		ConsultaItemCodigoTextNome.setText("");
		ConsultaItemCodigoTextMargemLucro.setText("");
		ConsultaItemCodigoTextPrecoCusto.setText("");
		ConsultaItemCodigoTextQuantidade.setText("");
		ConsultaItemBotaoBusca.setEnabled(true);
	}//GEN-LAST:event_jRCodigoActionPerformed
/**
 * campos para a busca através do nome
 * desabilita a busca pelo código
 * @param evt
 */
	private void jRNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNomeActionPerformed
		ConsultaItemPanelCodigo.setVisible(false);
		ConsultaItemPanelNome.setVisible(true);
		ConsultaItemNomeTextCodigo.setText("");
		ConsultaItemNomeTextMargemLucro.setText("");
		ConsultaItemNomeTextPrecoCusto.setText("");
		ConsultaItemNomeTextQuantidade.setText("");
		ConsultaItemBotaoBusca.setEnabled(true);
	}//GEN-LAST:event_jRNomeActionPerformed

	/**
	 * Botão que lista os itens através do código desabilita a janela anterior
	 * @param evt
	 */
	private void ConsultaItemCodigoBotaoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaItemCodigoBotaoListarActionPerformed
		ConsultaListar listar = new ConsultaListar(this);
		listar.setVisible(true);
		this.setEnabled(false);
	}//GEN-LAST:event_ConsultaItemCodigoBotaoListarActionPerformed

	/**
	 * BOtão para a listagem dos itens através do nome
	 * desabilita a janela anterior
	 * @param evt
	 */
	private void ConsultaItemNomeBotaoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaItemNomeBotaoListarActionPerformed
		ConsultaListar listar = new ConsultaListar(this);
		listar.setVisible(true);
		this.setEnabled(false);
	}//GEN-LAST:event_ConsultaItemNomeBotaoListarActionPerformed

        private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
            this.principal.setEnabled(true);
        }//GEN-LAST:event_formWindowClosed

        private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
            this.principal.setEnabled(true);
        }//GEN-LAST:event_formWindowClosing

        private void ConsultaItemCodigoBotaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaItemCodigoBotaoCadastroActionPerformed
            FrameCadastroItens itens = new FrameCadastroItens(this);
            itens.setVisible(true);
        	this.dispose();
        }//GEN-LAST:event_ConsultaItemCodigoBotaoCadastroActionPerformed

        private void ConsultaItemNomeBotaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaItemNomeBotaoCadastroActionPerformed
            FrameCadastroItens itens = new FrameCadastroItens(this);
            itens.setVisible(true);
            this.dispose();
        }//GEN-LAST:event_ConsultaItemNomeBotaoCadastroActionPerformed

    /**
    * @param args the command line arguments
    */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultaItemCodigoBotaoCadastro;
    private javax.swing.JButton ConsultaItemCodigoBotaoListar;
    private javax.swing.JButton ConsultaItemCodigoBotaoOk;
    private javax.swing.JButton ConsultaItemNomeBotaoCadastro;
    private javax.swing.JButton ConsultaItemNomeBotaoListar;
    private javax.swing.JButton ConsultaItemNomeBotaoOk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton ConsultaItemBotaoBusca;
    private javax.swing.JFormattedTextField ConsultaItemNomeTextCodigo;
    private javax.swing.JFormattedTextField ConsultaItemCodigoTextMargemLucro;
    private javax.swing.JFormattedTextField ConsultaItemNomeTextMargemLucro;
    private javax.swing.JFormattedTextField ConsultaItemNomeTextPrecoCusto;
    private javax.swing.JFormattedTextField ConsultaItemNomeTextQuantidade;
    private javax.swing.JFormattedTextField ConsultaItemCodigoTextNome;
    private javax.swing.JFormattedTextField ConsultaItemTextPesquisa;
    private javax.swing.JFormattedTextField ConsultaItemCodigoTextPrecoCusto;
    private javax.swing.JFormattedTextField ConsultaItemCodigoTextQuantidade;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLMargemLucro;
    private javax.swing.JLabel jLNMargemLucro;
    private javax.swing.JLabel jLNPrecoCusto;
    private javax.swing.JLabel jLNQuantidade;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLPrecoCusto;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JPanel ConsultaItemPanelNome;
    private javax.swing.JPanel ConsultaItemPanelCodigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton ConsultaItemOpcaoCodigo;
    private javax.swing.JRadioButton ConsultaItemOpcaoNome;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}