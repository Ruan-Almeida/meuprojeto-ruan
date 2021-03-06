/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import dao.PessoaDAO;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Pessoa;

/**
 *
 * @author Aluno
 */
public class PessoaJFrame extends javax.swing.JFrame {

    List<Pessoa> lista;
    Integer posicao, ultimo;

    /**
     * Creates new form CadastroJFrame
     */
    public PessoaJFrame() {
        initComponents();
        PessoaDAO dao = new PessoaDAO();
        lista = dao.listar();
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

        pessoa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
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
        cbxSexo = new javax.swing.JComboBox();
        listagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pessoa");

        pessoa.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        pessoa.setText("Pessoa");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setText("Sexo:");

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCodigo.setEnabled(false);

        txtNome.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12))); // NOI18N

        botaoinserir.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoinserir.setText("Inserir");
        botaoinserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoinserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoinserirActionPerformed(evt);
            }
        });

        botaolimpar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaolimpar.setText("Limpar");
        botaolimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaolimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaolimparActionPerformed(evt);
            }
        });

        botaoexluir.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoexluir.setText("Exluir");
        botaoexluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoexluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoexluirActionPerformed(evt);
            }
        });

        botaoconsultar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoconsultar.setText("Consultar");
        botaoconsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        botaoprimeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoprimeiroActionPerformed(evt);
            }
        });

        botaoanterior.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoanterior.setText("Anterior");
        botaoanterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoanteriorActionPerformed(evt);
            }
        });

        botaoproximo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoproximo.setText("Próximo");
        botaoproximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoproximoActionPerformed(evt);
            }
        });

        botaoultimo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoultimo.setText("Último");
        botaoultimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        cbxSexo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Masculino", "Feminino" }));
        cbxSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexoActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(txtNome)
                                    .addComponent(cbxSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(pessoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(listagem))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pessoa)
                    .addComponent(listagem))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoprimeiroActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(false);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        if (lista.size() > 0) {
            posicao = 0;
            Pessoa elemento = lista.get(0);
            txtCodigo.setText(elemento.getCodigo().toString());
            txtNome.setText(elemento.getNome());
            if (elemento.getSexo().equals("Masculino")) {
                cbxSexo.setSelectedIndex(1);
            } else if (elemento.getSexo().equals("Feminino")) {
                cbxSexo.setSelectedIndex(2);
            }
        }
        if (lista.size() == 1) {
            botaoproximo.setEnabled(false);
        }
    }//GEN-LAST:event_botaoprimeiroActionPerformed

    private void botaoultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoultimoActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(false);
        botaoultimo.setEnabled(false);
        if (lista.size() > 0) {
            posicao = lista.size() - 1;
            Pessoa elemento = lista.get(posicao);
            txtCodigo.setText(elemento.getCodigo().toString());
            txtNome.setText(elemento.getNome());
            if (elemento.getSexo().equals("Masculino")) {
                cbxSexo.setSelectedIndex(1);
            } else if (elemento.getSexo().equals("Feminino")) {
                cbxSexo.setSelectedIndex(2);
            }
        }
        if (lista.size() - 1 == posicao && lista.size() == 1) {
            botaoproximo.setEnabled(false);
            botaoultimo.setEnabled(false);
            botaoanterior.setEnabled(false);
        }
    }//GEN-LAST:event_botaoultimoActionPerformed

    private void botaoanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoanteriorActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        if (lista.size() > 0) {
            posicao = posicao - 1;
            Pessoa elemento = lista.get(posicao);
            txtCodigo.setText(elemento.getCodigo().toString());
            txtNome.setText(elemento.getNome());
            if (elemento.getSexo().equals("Masculino")) {
                cbxSexo.setSelectedIndex(1);
            } else if (elemento.getSexo().equals("Feminino")) {
                cbxSexo.setSelectedIndex(2);
            }
        }
        if (lista.size() == 1) {
            botaoproximo.setEnabled(false);
        }

        if (posicao == 0) {
            botaoanterior.setEnabled(false);
        }
    }//GEN-LAST:event_botaoanteriorActionPerformed

    private void botaoproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoproximoActionPerformed
        botaoprimeiro.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        if (posicao < lista.size() - 1) {
            posicao = posicao + 1;
            Pessoa elemento = lista.get(posicao);
            txtCodigo.setText(elemento.getCodigo().toString());
            txtNome.setText(elemento.getNome());
            if (elemento.getSexo().equals("Masculino")) {
                cbxSexo.setSelectedIndex(1);
            } else if (elemento.getSexo().equals("Feminino")) {
                cbxSexo.setSelectedIndex(2);
            }
        }
        if (lista.size() - 1 == posicao) {
            botaoproximo.setEnabled(false);
            botaoultimo.setEnabled(false);
        }
    }//GEN-LAST:event_botaoproximoActionPerformed

    private void botaoinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoinserirActionPerformed
        Pessoa obj = new Pessoa();
        Boolean deu = false;
        if (txtNome.getText().isEmpty() || cbxSexo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
            deu = false;
        } else {
            deu = true;
        }

        if (deu == true) {
            obj.setNome(txtNome.getText());
            if (cbxSexo.getSelectedItem().equals("Masculino")) {
                obj.setSexo("Masculino");
            } else {
                obj.setSexo("Feminino");
            }

            PessoaDAO dao = new PessoaDAO();
            dao.inserir(obj);
            lista = dao.listar();
            Limpar();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
        }
    }//GEN-LAST:event_botaoinserirActionPerformed

    private void botaolimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaolimparActionPerformed
        Limpar();
        JOptionPane.showMessageDialog(null, "Limpeza efetuada com sucesso!");
    }//GEN-LAST:event_botaolimparActionPerformed

    private void botaoexluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoexluirActionPerformed
        if (txtCodigo.getText().isEmpty() == false) {
            if (lista.size() >= 0) {
                PessoaDAO dao = new PessoaDAO();
                Boolean deucerto = dao.excluir(lista.get(posicao));
                if (deucerto == true) {
                    Limpar();
                    posicao = 0;
                    lista = dao.listar();
                    JOptionPane.showMessageDialog(null, "Excluído!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
        }
    }//GEN-LAST:event_botaoexluirActionPerformed

    private void botaoconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoconsultarActionPerformed
        Integer codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código a ser pesquisado: "));
        boolean encontrou = false;
        Integer posicaoachou = 0;
        for (Pessoa pessoa : lista) {
            if (codigo == (pessoa.getCodigo())) {
                encontrou = true;
                posicao = posicaoachou;
                txtCodigo.setText(pessoa.getCodigo().toString());
                txtNome.setText(pessoa.getNome());
                if (pessoa.getSexo().equals("Masculino")) {
                    cbxSexo.setSelectedIndex(1);
                } else if (pessoa.getSexo().equals("Feminino")) {
                    cbxSexo.setSelectedIndex(2);
                }
                break;
            }
            posicaoachou++;
        }
        if (encontrou == true) {
            JOptionPane.showMessageDialog(null, "Achamos a pessoa.");
        } else {
            JOptionPane.showMessageDialog(null, "Não achamos a pessoa.");
            Limpar();
        }
    }//GEN-LAST:event_botaoconsultarActionPerformed

    private void cbxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexoActionPerformed

    private void listagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listagemActionPerformed
        PessoaListar lista = new PessoaListar();
        lista.setVisible(true);
        dispose();
    }//GEN-LAST:event_listagemActionPerformed

    public void Limpar() {
        txtCodigo.setText(null);
        txtNome.setText(null);
        cbxSexo.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(PessoaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoaJFrame().setVisible(true);
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
    private javax.swing.JComboBox cbxSexo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton listagem;
    private javax.swing.JLabel pessoa;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
