/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import javax.swing.JOptionPane;
import modelo.Cidade;
import java.util.List;
import java.util.ArrayList;
import modelo.Pessoa;

/**
 *
 * @author Aluno
 */
public class CidadeJFrame extends javax.swing.JFrame {

    List<Cidade> lista;
    Integer posicao, ultimo;

    /**
     * Creates new form CidadeJFrame
     */
    public CidadeJFrame() {
        initComponents();
        lista = new ArrayList<Cidade>();
        posicao = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoCidade = new javax.swing.JTextField();
        txtNomeCidade = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        botaoinserir = new javax.swing.JButton();
        botaolimpar = new javax.swing.JButton();
        botaoexluir = new javax.swing.JButton();
        botaoconsultar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botaoprimeiro = new javax.swing.JButton();
        botaoanterior = new javax.swing.JButton();
        botaoproximo = new javax.swing.JButton();
        botaoultimo = new javax.swing.JButton();
        listagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Cidade");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Código:");

        txtCodigoCidade.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        txtNomeCidade.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12))); // NOI18N

        botaoinserir.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoinserir.setText("Inserir");
        botaoinserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoinserirActionPerformed(evt);
            }
        });

        botaolimpar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaolimpar.setText("Limpar");
        botaolimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaolimparActionPerformed(evt);
            }
        });

        botaoexluir.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoexluir.setText("Exluir");
        botaoexluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoexluirActionPerformed(evt);
            }
        });

        botaoconsultar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoconsultar.setText("Consultar");
        botaoconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoconsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(botaoinserir)
                .addGap(18, 18, 18)
                .addComponent(botaolimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(botaoexluir)
                .addGap(18, 18, 18)
                .addComponent(botaoconsultar)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoinserir)
                    .addComponent(botaolimpar)
                    .addComponent(botaoexluir)
                    .addComponent(botaoconsultar))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12))); // NOI18N

        botaoprimeiro.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoprimeiro.setText("Primeiro");
        botaoprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoprimeiroActionPerformed(evt);
            }
        });

        botaoanterior.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoanterior.setText("Anterior");
        botaoanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoanteriorActionPerformed(evt);
            }
        });

        botaoproximo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoproximo.setText("Próximo");
        botaoproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoproximoActionPerformed(evt);
            }
        });

        botaoultimo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoultimo.setText("Último");
        botaoultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoultimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botaoprimeiro)
                .addGap(18, 18, 18)
                .addComponent(botaoanterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoproximo)
                .addGap(18, 18, 18)
                .addComponent(botaoultimo)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoprimeiro)
                    .addComponent(botaoanterior)
                    .addComponent(botaoproximo)
                    .addComponent(botaoultimo))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        listagem.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        listagem.setText("Ir para a listagem");
        listagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigoCidade)
                    .addComponent(txtNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listagem)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(listagem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoinserirActionPerformed
        Cidade obj = new Cidade();
        Boolean deu = false;
        if (txtNomeCidade.getText().isEmpty() || txtCodigoCidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
        } else {
            try {
                obj.setCodigocidade(Integer.parseInt(txtCodigoCidade.getText()));
                deu = true;
            } catch (Exception ex) {
                deu = false;
                JOptionPane.showMessageDialog(null, "O código só pode ser preenchido com números.");
            }
        }
        if (deu == true) {
            obj.setNomecidade(txtNomeCidade.getText());
            lista.add(obj);
            Limpar();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
        }
    }//GEN-LAST:event_botaoinserirActionPerformed

    private void botaolimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaolimparActionPerformed
        Limpar();
        JOptionPane.showMessageDialog(null, "Limpeza efetuada com sucesso!");
    }//GEN-LAST:event_botaolimparActionPerformed

    private void botaoexluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoexluirActionPerformed
        if (lista.size() >= 0) {
            lista.remove(lista.get(posicao));
            Limpar();
        }
    }//GEN-LAST:event_botaoexluirActionPerformed

    private void botaoconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoconsultarActionPerformed
        String nome = JOptionPane.showInputDialog("Digite o nome da cidade a ser pesquisado: ");
        boolean encontrou = false;
        Integer posicaoachou = 0;
        for (Cidade pessoa : lista) {
            if (nome.equals(pessoa.getNomecidade())) {
                encontrou = true;
                posicao = posicaoachou;
                txtCodigoCidade.setText(pessoa.getCodigocidade().toString());
                txtNomeCidade.setText(pessoa.getNomecidade());
                break;
            }
            posicaoachou++;
        }
        if (encontrou == true) {
            JOptionPane.showMessageDialog(null, "Achamos a cidade.");
        } else {
            JOptionPane.showMessageDialog(null, "Não achamos a cidade.");
            Limpar();
        }
    }//GEN-LAST:event_botaoconsultarActionPerformed

    private void botaoprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoprimeiroActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(false);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        posicao = 0;
        Cidade elemento = lista.get(0);
        txtCodigoCidade.setText(elemento.getCodigocidade().toString());
        txtNomeCidade.setText(elemento.getNomecidade());
        if (lista.size() == 1) {
            botaoproximo.setEnabled(false);
        }
    }//GEN-LAST:event_botaoprimeiroActionPerformed

    private void botaoanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoanteriorActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        posicao = posicao - 1;
        Cidade elemento = lista.get(posicao);
        txtCodigoCidade.setText(elemento.getCodigocidade().toString());
        txtNomeCidade.setText(elemento.getNomecidade());
        if (lista.size() == 1) {
            botaoproximo.setEnabled(false);
        }
    }//GEN-LAST:event_botaoanteriorActionPerformed

    private void botaoproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoproximoActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        posicao = posicao + 1;
        Cidade elemento = lista.get(posicao);
        txtCodigoCidade.setText(elemento.getCodigocidade().toString());
        txtNomeCidade.setText(elemento.getNomecidade());
        if (lista.size() - 1 == posicao) {
            botaoproximo.setEnabled(false);
            botaoultimo.setEnabled(false);
        }
    }//GEN-LAST:event_botaoproximoActionPerformed

    private void botaoultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoultimoActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(false);
        botaoultimo.setEnabled(false);
        posicao = lista.size() - 1;
        Cidade elemento = lista.get(posicao);
        txtCodigoCidade.setText(elemento.getCodigocidade().toString());
        txtNomeCidade.setText(elemento.getNomecidade());
        if (lista.size() - 1 == posicao && lista.size() == 1) {
            botaoproximo.setEnabled(false);
            botaoultimo.setEnabled(false);
            botaoanterior.setEnabled(false);
        }
    }//GEN-LAST:event_botaoultimoActionPerformed

    private void listagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listagemActionPerformed
        cidadeListar lista = new cidadeListar();
        lista.setVisible(true);
        dispose();
    }//GEN-LAST:event_listagemActionPerformed

    public void Limpar() {
        txtCodigoCidade.setText(null);
        txtNomeCidade.setText(null);
    }

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
            java.util.logging.Logger.getLogger(CidadeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CidadeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CidadeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CidadeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CidadeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoanterior;
    private javax.swing.JButton botaoconsultar;
    private javax.swing.JButton botaoexluir;
    private javax.swing.JButton botaoinserir;
    private javax.swing.JButton botaolimpar;
    private javax.swing.JButton botaoprimeiro;
    private javax.swing.JButton botaoproximo;
    private javax.swing.JButton botaoultimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton listagem;
    private javax.swing.JTextField txtCodigoCidade;
    private javax.swing.JTextField txtNomeCidade;
    // End of variables declaration//GEN-END:variables
}
