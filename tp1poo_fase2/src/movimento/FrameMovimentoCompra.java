/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Compra.java
 *
 * Created on 19/11/2010, 17:36:10
 */

package movimento;
import janelasPrincipal.*;

/**
 *
 * @author walkiria
 */
public class FrameMovimentoCompra extends javax.swing.JFrame {
	private Principal principal;

    /** Creates new form Compra */
    public FrameMovimentoCompra(Principal principal) {
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
        compraTextFieldCodigo = new javax.swing.JTextField();
        compraTextFieldQuantidade = new javax.swing.JTextField();
        compraTextFieldPreco = new javax.swing.JTextField();
        compraJlabelCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        compraLabelPreco = new javax.swing.JLabel();
        compraJlabelQtdTotal = new javax.swing.JLabel();
        compraJlabelPrecoTotal = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RealizarCompra = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        compraButtonAdicionar = new javax.swing.JButton();
        compraButtonLimpar = new javax.swing.JButton();
        compraButtonSair = new javax.swing.JButton();
        compraJlabelFornecedor = new javax.swing.JLabel();
        compraJlabelQuantidade = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        compraTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraTextFieldCodigoActionPerformed(evt);
            }
        });

        compraTextFieldQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraTextFieldQuantidadeActionPerformed(evt);
            }
        });

        compraTextFieldPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraTextFieldPrecoActionPerformed(evt);
            }
        });

        compraJlabelCodigo.setText("Código");

        compraLabelPreco.setText("Preço R$");

        compraJlabelQtdTotal.setText("Quantidade Total");

        compraJlabelPrecoTotal.setText("Preço total");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel10.setText("jLabel10");

        RealizarCompra.setText("Realizar Compra");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código Item", "Quantidade", "Preço", "Total"
            }
        ));
        jTable3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(jTable3);

        compraButtonAdicionar.setText("Adicionar");
        compraButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraButtonAdicionarActionPerformed(evt);
            }
        });

        compraButtonLimpar.setText("Limpar");
        compraButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraButtonLimparActionPerformed(evt);
            }
        });

        compraButtonSair.setText("Sair");
        compraButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraButtonSairActionPerformed(evt);
            }
        });

        compraJlabelFornecedor.setText("Fornecedor");

        compraJlabelQuantidade.setText("Quantidade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(compraButtonAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(compraButtonLimpar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compraJlabelFornecedor)
                            .addComponent(compraJlabelPrecoTotal)
                            .addComponent(compraJlabelQtdTotal))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))))
                    .addComponent(compraButtonSair))
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RealizarCompra)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(compraJlabelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compraTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compraJlabelQuantidade)
                        .addGap(18, 18, 18)
                        .addComponent(compraTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compraLabelPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compraTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(compraJlabelFornecedor)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compraJlabelPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(compraJlabelQtdTotal)
                            .addComponent(jLabel7))
                        .addGap(195, 195, 195))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RealizarCompra)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(compraTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(compraJlabelCodigo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(compraLabelPreco)
                        .addComponent(compraTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(compraJlabelQuantidade)
                        .addComponent(compraTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compraButtonAdicionar)
                    .addComponent(compraButtonLimpar)
                    .addComponent(compraButtonSair))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void compraButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraButtonAdicionarActionPerformed
		this.principal.setEnabled(true);
		this.dispose();
		
	}//GEN-LAST:event_compraButtonAdicionarActionPerformed

	private void compraButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraButtonLimparActionPerformed
		//this.principal.setEnabled(true);
		//this.dispose();
		compraTextFieldPreco.setText("");
		compraTextFieldQuantidade.setText("");
		compraTextFieldCodigo.setText(" ");
	}//GEN-LAST:event_compraButtonLimparActionPerformed

	private void compraButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraButtonSairActionPerformed
	    this.principal.setEnabled(true);
		this.dispose();
	}//GEN-LAST:event_compraButtonSairActionPerformed

	private void compraTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraTextFieldCodigoActionPerformed
		compraTextFieldCodigo.setText(" ");
	}//GEN-LAST:event_compraTextFieldCodigoActionPerformed

	private void compraTextFieldQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraTextFieldQuantidadeActionPerformed
		compraTextFieldQuantidade.setText("");
	}//GEN-LAST:event_compraTextFieldQuantidadeActionPerformed

	private void compraTextFieldPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraTextFieldPrecoActionPerformed
		compraTextFieldPreco.setText("");// TODO add your handling code here:
	}//GEN-LAST:event_compraTextFieldPrecoActionPerformed

	private void jTable3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable3AncestorAdded
		// TODO add your handling code here:
}//GEN-LAST:event_jTable3AncestorAdded
	
    /**
    * @param args the command line arguments
    */
 //   public static void main(String args[]) {
 //       java.awt.EventQueue.invokeLater(new Runnable() {
 //         public void run() {
 //             new Compra().setVisible(true);
 //           }
 //       });
 //   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RealizarCompra;
    private javax.swing.JButton compraButtonAdicionar;
    private javax.swing.JButton compraButtonLimpar;
    private javax.swing.JButton compraButtonSair;
    private javax.swing.JLabel compraJlabelCodigo;
    private javax.swing.JLabel compraJlabelFornecedor;
    private javax.swing.JLabel compraJlabelPrecoTotal;
    private javax.swing.JLabel compraJlabelQtdTotal;
    private javax.swing.JLabel compraJlabelQuantidade;
    private javax.swing.JLabel compraLabelPreco;
    private javax.swing.JTextField compraTextFieldCodigo;
    private javax.swing.JTextField compraTextFieldPreco;
    private javax.swing.JTextField compraTextFieldQuantidade;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

}