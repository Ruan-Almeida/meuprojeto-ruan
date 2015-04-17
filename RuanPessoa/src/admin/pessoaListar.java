/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package admin;

import dao.PessoaDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Pessoa;

/**
 *
 * @author Aluno
 */
public class PessoaListar extends javax.swing.JFrame {
        
    
    public PessoaListar() {
        initComponents();
        PessoaDAO dao = new PessoaDAO();
        List<Pessoa> lista = dao.listar();
        
        /*
        Pessoa objpessoa = new Pessoa();
        objpessoa.setCodigo(1);
        objpessoa.setNome("João");
        objpessoa.setSexo("M");
        lista.add(objpessoa);
        
        objpessoa = new Pessoa();
        objpessoa.setCodigo(2);
        objpessoa.setNome("Maria");
        objpessoa.setSexo("F");
        lista.add(objpessoa);
        
        objpessoa = new Pessoa();
        objpessoa.setCodigo(3);
        objpessoa.setNome("Ruan");
        objpessoa.setSexo("M");
        lista.add(objpessoa);
        
        objpessoa = new Pessoa();
        objpessoa.setCodigo(4);
        objpessoa.setNome("Hiasmin");
        objpessoa.setSexo("F");
        lista.add(objpessoa);
       */
        
        DefaultTableModel modelo = (DefaultTableModel)Lista.getModel();

        Object[] linha = new Object[modelo.getColumnCount()];

        for (Pessoa item : lista) {
            linha[0] = item.getCodigo();
            linha[1] = item.getNome();
            linha[2] = item.getSexo();

            modelo.addRow(linha);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel = new javax.swing.JPanel();
        ListaPainel = new javax.swing.JScrollPane();
        Lista = new javax.swing.JTable();
        Gerencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listagem");

        JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12))); // NOI18N
        JPanel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        Lista.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ListaPainel.setViewportView(Lista);

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ListaPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ListaPainel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );

        Gerencia.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Gerencia.setText("Gerencia Pessoas");
        Gerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(Gerencia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Gerencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciaActionPerformed
        PessoaJFrame cadastro = new PessoaJFrame();
        cadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_GerenciaActionPerformed

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
            java.util.logging.Logger.getLogger(PessoaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoaListar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gerencia;
    private javax.swing.JPanel JPanel;
    private javax.swing.JTable Lista;
    private javax.swing.JScrollPane ListaPainel;
    // End of variables declaration//GEN-END:variables
}
