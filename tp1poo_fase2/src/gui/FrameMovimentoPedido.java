package gui;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrameMovimentoPedido.java
 *
 * Created on 12/11/2010, 01:14:38
 */

/**
 *
 * @author amanda
 */
public class FrameMovimentoPedido extends javax.swing.JFrame {
private Principal principal;
    /** Creates new form FrameMovimentoPedido */
    public FrameMovimentoPedido(Principal principal) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        FrameMovimentoPedidoLabelCodigo = new javax.swing.JLabel();
        FrameMovimentoPedidoLabelCliente = new javax.swing.JLabel();
        FrameMovimentoPedidoButtonAdicionar = new javax.swing.JButton();
        FrameMovimentoPedidoLabelQuantidadeTotal = new javax.swing.JLabel();
        FrameMovimentoPedidoLabelPrecoTotal = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        FrameMovimentoPedidoLabelPreco = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        FrameMovimentoPedidoLabelQuantidade = new javax.swing.JLabel();
        FrameMovimentoPedidoButtonLimpar = new javax.swing.JButton();
        FrameMovimentoPedidoButtonSair = new javax.swing.JButton();
        FrameMovimentoPedidoTextFieldCodigo = new javax.swing.JTextField();
        FrameMovimentoPedidoTextFieldPreco = new javax.swing.JTextField();
        FrameMovimentoPedidoTextFieldQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        FrameMovimentoPedidoLabelCodigo.setText("Código:");

        FrameMovimentoPedidoLabelCliente.setText("Preço: R$");

        FrameMovimentoPedidoButtonAdicionar.setText("Sair");
        FrameMovimentoPedidoButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrameMovimentoPedidoButtonAdicionarActionPerformed(evt);
            }
        });

        FrameMovimentoPedidoLabelQuantidadeTotal.setText("Adicionar um novo item");

        FrameMovimentoPedidoLabelPrecoTotal.setText("Quantidade:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        FrameMovimentoPedidoLabelPreco.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel4.setText("jLabel4");

        jLabel8.setText("Cliente:");

        jLabel9.setText("Quantidade total:");

        FrameMovimentoPedidoLabelQuantidade.setText("Preço total: R$");

        FrameMovimentoPedidoButtonLimpar.setText("Limpar");
        FrameMovimentoPedidoButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrameMovimentoPedidoButtonLimparActionPerformed(evt);
            }
        });

        FrameMovimentoPedidoButtonSair.setText("Adicionar");
        FrameMovimentoPedidoButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrameMovimentoPedidoButtonSairActionPerformed(evt);
            }
        });

        FrameMovimentoPedidoTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrameMovimentoPedidoTextFieldCodigoActionPerformed(evt);
            }
        });

        FrameMovimentoPedidoTextFieldPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrameMovimentoPedidoTextFieldPrecoActionPerformed(evt);
            }
        });

        FrameMovimentoPedidoTextFieldQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrameMovimentoPedidoTextFieldQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(FrameMovimentoPedidoLabelQuantidade))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FrameMovimentoPedidoLabelPreco)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FrameMovimentoPedidoLabelQuantidadeTotal)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FrameMovimentoPedidoLabelCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FrameMovimentoPedidoTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FrameMovimentoPedidoButtonSair)
                                        .addGap(18, 18, 18)
                                        .addComponent(FrameMovimentoPedidoButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(FrameMovimentoPedidoButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FrameMovimentoPedidoLabelCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FrameMovimentoPedidoTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(FrameMovimentoPedidoLabelPrecoTotal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FrameMovimentoPedidoTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(FrameMovimentoPedidoLabelQuantidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FrameMovimentoPedidoLabelPreco)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FrameMovimentoPedidoLabelQuantidadeTotal)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FrameMovimentoPedidoLabelCliente)
                    .addComponent(FrameMovimentoPedidoLabelCodigo)
                    .addComponent(FrameMovimentoPedidoTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FrameMovimentoPedidoTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FrameMovimentoPedidoLabelPrecoTotal)
                    .addComponent(FrameMovimentoPedidoTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FrameMovimentoPedidoButtonAdicionar)
                    .addComponent(FrameMovimentoPedidoButtonLimpar)
                    .addComponent(FrameMovimentoPedidoButtonSair))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FrameMovimentoPedidoButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrameMovimentoPedidoButtonAdicionarActionPerformed
		this.principal.setEnabled(true);
		this.dispose();
    }//GEN-LAST:event_FrameMovimentoPedidoButtonAdicionarActionPerformed

    private void FrameMovimentoPedidoButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrameMovimentoPedidoButtonSairActionPerformed
this.principal.setEnabled(true);
this.dispose();
    }//GEN-LAST:event_FrameMovimentoPedidoButtonSairActionPerformed

	private void FrameMovimentoPedidoButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrameMovimentoPedidoButtonLimparActionPerformed
	FrameMovimentoPedidoTextFieldPreco.setText("");
	FrameMovimentoPedidoTextFieldQuantidade.setText("");
	FrameMovimentoPedidoTextFieldCodigo.setText("");
	}//GEN-LAST:event_FrameMovimentoPedidoButtonLimparActionPerformed

	private void FrameMovimentoPedidoTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrameMovimentoPedidoTextFieldCodigoActionPerformed
	FrameMovimentoPedidoTextFieldCodigo.setText("");
	
	
	}//GEN-LAST:event_FrameMovimentoPedidoTextFieldCodigoActionPerformed

	private void FrameMovimentoPedidoTextFieldPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrameMovimentoPedidoTextFieldPrecoActionPerformed
	FrameMovimentoPedidoTextFieldPreco.setText("");
	}//GEN-LAST:event_FrameMovimentoPedidoTextFieldPrecoActionPerformed

	private void FrameMovimentoPedidoTextFieldQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrameMovimentoPedidoTextFieldQuantidadeActionPerformed
	FrameMovimentoPedidoTextFieldQuantidade.setText("");
	}//GEN-LAST:event_FrameMovimentoPedidoTextFieldQuantidadeActionPerformed

    /**
    * @param args the command line arguments
    */
   // public static void main(String args[]) {
     //   java.awt.EventQueue.invokeLater(new Runnable() {
       //     public void run() {
         //       new FrameMovimentoPedido().setVisible(true);
           // }
       // });
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FrameMovimentoPedidoButtonAdicionar;
    private javax.swing.JButton FrameMovimentoPedidoButtonLimpar;
    private javax.swing.JButton FrameMovimentoPedidoButtonSair;
    private javax.swing.JLabel FrameMovimentoPedidoLabelCliente;
    private javax.swing.JLabel FrameMovimentoPedidoLabelCodigo;
    private javax.swing.JLabel FrameMovimentoPedidoLabelPreco;
    private javax.swing.JLabel FrameMovimentoPedidoLabelPrecoTotal;
    private javax.swing.JLabel FrameMovimentoPedidoLabelQuantidade;
    private javax.swing.JLabel FrameMovimentoPedidoLabelQuantidadeTotal;
    private javax.swing.JTextField FrameMovimentoPedidoTextFieldCodigo;
    private javax.swing.JTextField FrameMovimentoPedidoTextFieldPreco;
    private javax.swing.JTextField FrameMovimentoPedidoTextFieldQuantidade;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
