/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrameMovimentoPreCompra.java
 *
 * Created on 21/11/2010, 21:03:59
 */

package gui;

import gui.ConsultaCliente;

/**
 *
 * @author isac
 */
public class FrameMovimentoPrePedido extends javax.swing.JFrame {
	private Principal principal;

    /** Creates new form FrameMovimentoPreCompra */
    public FrameMovimentoPrePedido(Principal principal) {
        initComponents();
		this.principal=principal;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prePedidoCampoCpf = new javax.swing.JTextField();
        prePedidoLabelCabecalho = new javax.swing.JLabel();
        PrePedidoLabelCpf = new javax.swing.JLabel();
        prePedidoBotaoPesquisar = new javax.swing.JButton();
        PrePedidoBotaoOK = new javax.swing.JButton();
        prePedidoBotaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        prePedidoLabelCabecalho.setText("Insira o Cpf do Cliente que irá realizar o pedido:");

        PrePedidoLabelCpf.setText("Cpf:");

        prePedidoBotaoPesquisar.setText("Pesquisar");
        prePedidoBotaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prePedidoBotaoPesquisarActionPerformed(evt);
            }
        });

        PrePedidoBotaoOK.setText("Ok");
        PrePedidoBotaoOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrePedidoBotaoOKActionPerformed(evt);
            }
        });

        prePedidoBotaoCancelar.setText("Cancelar");
        prePedidoBotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prePedidoBotaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PrePedidoLabelCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prePedidoCampoCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(PrePedidoBotaoOK, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prePedidoBotaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prePedidoBotaoPesquisar)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(prePedidoLabelCabecalho)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(prePedidoLabelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrePedidoLabelCpf)
                    .addComponent(prePedidoCampoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prePedidoBotaoPesquisar)
                    .addComponent(PrePedidoBotaoOK)
                    .addComponent(prePedidoBotaoCancelar))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void prePedidoBotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prePedidoBotaoCancelarActionPerformed
		principal.setEnabled(true);
		this.dispose();
	}//GEN-LAST:event_prePedidoBotaoCancelarActionPerformed

	private void PrePedidoBotaoOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrePedidoBotaoOKActionPerformed
		FrameMovimentoPedido pedido = new FrameMovimentoPedido(principal);
		pedido.setVisible(true);
		this.dispose();
	}//GEN-LAST:event_PrePedidoBotaoOKActionPerformed

	private void prePedidoBotaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prePedidoBotaoPesquisarActionPerformed
		ConsultaCliente consultacliente = new ConsultaCliente(this);
		consultacliente.setVisible(true);
		this.setEnabled(false);
	}//GEN-LAST:event_prePedidoBotaoPesquisarActionPerformed

    /**
    * @param args the command line arguments
    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrameMovimentoPrePedido().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PrePedidoBotaoOK;
    private javax.swing.JLabel PrePedidoLabelCpf;
    private javax.swing.JButton prePedidoBotaoCancelar;
    private javax.swing.JButton prePedidoBotaoPesquisar;
    private javax.swing.JTextField prePedidoCampoCpf;
    private javax.swing.JLabel prePedidoLabelCabecalho;
    // End of variables declaration//GEN-END:variables

}
