package admin;

import dao.PerguntaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Pergunta;

public class perguntaManter extends javax.swing.JFrame {
    
    List<Pergunta> lista;
    Integer posicao, ultimo;
    
    public perguntaManter() {
        initComponents();
        PerguntaDAO dao = new PerguntaDAO();
        lista = dao.listar();
        posicao = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b = new javax.swing.JLabel();
        txtEnunciado = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        botaoinserir2 = new javax.swing.JButton();
        botaolimpar = new javax.swing.JButton();
        botaoexluir = new javax.swing.JButton();
        botaoconsultar = new javax.swing.JButton();
        pergunta = new javax.swing.JLabel();
        listagem = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        botaoprimeiro2 = new javax.swing.JButton();
        botaoanterior = new javax.swing.JButton();
        botaoproximo = new javax.swing.JButton();
        botaoultimo = new javax.swing.JButton();
        txtB = new javax.swing.JTextField();
        a = new javax.swing.JLabel();
        enunciado = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        d = new javax.swing.JLabel();
        txtD = new javax.swing.JTextField();
        nivel = new javax.swing.JLabel();
        resp = new javax.swing.JLabel();
        cbxResposta = new javax.swing.JComboBox();
        cbxNivel = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        b.setText("B:");

        txtEnunciado.setToolTipText("");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11))); // NOI18N

        botaoinserir2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoinserir2.setText("Inserir");
        botaoinserir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoinserir2ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(botaoinserir2)
                .addGap(18, 18, 18)
                .addComponent(botaolimpar)
                .addGap(18, 18, 18)
                .addComponent(botaoexluir)
                .addGap(18, 18, 18)
                .addComponent(botaoconsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoinserir2)
                    .addComponent(botaolimpar)
                    .addComponent(botaoexluir)
                    .addComponent(botaoconsultar))
                .addContainerGap())
        );

        pergunta.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        pergunta.setText("Pergunta");

        listagem.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        listagem.setText("Ir para a listagem");
        listagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listagemActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11))); // NOI18N

        botaoprimeiro2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botaoprimeiro2.setText("Primeiro");
        botaoprimeiro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoprimeiro2ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botaoprimeiro2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoanterior)
                .addGap(18, 18, 18)
                .addComponent(botaoproximo)
                .addGap(18, 18, 18)
                .addComponent(botaoultimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoprimeiro2)
                    .addComponent(botaoanterior)
                    .addComponent(botaoproximo)
                    .addComponent(botaoultimo))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        txtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBActionPerformed(evt);
            }
        });

        a.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        a.setText("A:");

        enunciado.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        enunciado.setText("Enunciado:");

        c.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        c.setText("C:");

        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });

        d.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        d.setText("D:");

        txtD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDActionPerformed(evt);
            }
        });

        nivel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        nivel.setText("Dificuldade:");

        resp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        resp.setText("Resposta certa:");

        cbxResposta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cbxResposta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "A", "B", "C", "D" }));

        cbxNivel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cbxNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "1", "2", "3", "4", "5" }));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("ID:");

        txtId.setEditable(false);
        txtId.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d)
                            .addComponent(c)
                            .addComponent(a)
                            .addComponent(b))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(txtB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtD)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(resp)
                                    .addComponent(nivel))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxNivel, 0, 1, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enunciado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(pergunta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listagem)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pergunta)
                    .addComponent(listagem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enunciado)
                        .addComponent(txtEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d)
                    .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resp)
                    .addComponent(cbxResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nivel)
                    .addComponent(cbxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoinserir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoinserir2ActionPerformed
        Pergunta obj = new Pergunta();
        Boolean deu = false;
        if (txtEnunciado.getText().isEmpty() || txtA.getText().isEmpty() || txtB.getText().isEmpty() 
                || txtC.getText().isEmpty() || txtD.getText().isEmpty() || cbxNivel.getSelectedIndex() == 0
                || cbxResposta.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
        } else {
            deu = true;
        }
        if(deu == true){
        
        
            obj.setEnunciado(txtEnunciado.getText());
            obj.setA(txtA.getText());
            obj.setB(txtB.getText());
            obj.setC(txtC.getText());
            obj.setD(txtD.getText());
            obj.setNivel(Integer.parseInt(cbxNivel.getSelectedItem().toString()));
            obj.setCerta(cbxResposta.getSelectedItem().toString());
            
            PerguntaDAO dao = new PerguntaDAO();
            dao.inserir(obj);
            lista = dao.listar();
   
            Limpar();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }//GEN-LAST:event_botaoinserir2ActionPerformed

    private void botaolimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaolimparActionPerformed
        Limpar();
        JOptionPane.showMessageDialog(null, "Limpeza efetuada com sucesso!");
    }//GEN-LAST:event_botaolimparActionPerformed

    private void botaoexluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoexluirActionPerformed
        if (txtEnunciado.getText().isEmpty() == false) {
            if (lista.size() >= 0) {
                PerguntaDAO dao = new PerguntaDAO();
                Boolean deucerto = dao.excluir(lista.get(posicao));
                if (deucerto == true) {
                    Limpar();
                    posicao = 0;
                    lista = dao.listar();
                    JOptionPane.showMessageDialog(null, "Excluído!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            }
        }
    }//GEN-LAST:event_botaoexluirActionPerformed

    private void botaoconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoconsultarActionPerformed
        String enunciado = JOptionPane.showInputDialog("Digite o enunciado a ser pesquisado: ");
        boolean encontrou = false;
        Integer posicaoachou = 0;
        for (Pergunta pergunta : lista) {
             if (enunciado.equals(pergunta.getEnunciado())) {
                encontrou = true;
                posicao = posicaoachou;
                txtEnunciado.setText(pergunta.getEnunciado());
                txtA.setText(pergunta.getA());
                txtB.setText(pergunta.getB());
                txtC.setText(pergunta.getC());
                txtD.setText(pergunta.getD());
                cbxNivel.setSelectedItem(pergunta.getNivel().toString());
                cbxResposta.setSelectedItem(pergunta.getCerta());
                txtId.setText(pergunta.getId().toString());
                posicao = posicaoachou;
                break;
            }
            posicaoachou++;
        }
        if (encontrou == true) {
            JOptionPane.showMessageDialog(null, "Achamos sua pergunta.");
        } else {
            JOptionPane.showMessageDialog(null, "Não achamos sua pergunta.");
            Limpar();
        }
    }//GEN-LAST:event_botaoconsultarActionPerformed

    private void listagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listagemActionPerformed
        jogadorListar lista = new jogadorListar();
        lista.setVisible(true);
        dispose();
    }//GEN-LAST:event_listagemActionPerformed

    private void botaoprimeiro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoprimeiro2ActionPerformed
        botaoprimeiro2.setEnabled(true);
        botaoanterior.setEnabled(false);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        if (lista.size() > 0) {
            posicao = 0;
            Pergunta elemento = lista.get(0);
            txtEnunciado.setText(elemento.getEnunciado());
            txtA.setText(elemento.getA());
            txtB.setText(elemento.getB());
            txtC.setText(elemento.getC());
            txtD.setText(elemento.getD());
            cbxNivel.setSelectedItem(elemento.getNivel().toString());
            cbxResposta.setSelectedItem(elemento.getCerta());
            txtId.setText(elemento.getId().toString());
        }
        if (lista.size() == 1) {
            botaoproximo.setEnabled(false);
        }
    }//GEN-LAST:event_botaoprimeiro2ActionPerformed

    private void botaoanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoanteriorActionPerformed
        botaoprimeiro2.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        if (lista.size() > 0) {
            posicao = posicao - 1;
            Pergunta elemento = lista.get(posicao);
            txtEnunciado.setText(elemento.getEnunciado());
            txtA.setText(elemento.getA());
            txtB.setText(elemento.getB());
            txtC.setText(elemento.getC());
            txtD.setText(elemento.getD());
            cbxNivel.setSelectedItem(elemento.getNivel().toString());
            cbxResposta.setSelectedItem(elemento.getCerta());
            txtId.setText(elemento.getId().toString());
        }
        if (lista.size() == 1) {
            botaoproximo.setEnabled(false);
        }
        
        if(posicao == 0){
            botaoanterior.setEnabled(false);
        }
    }//GEN-LAST:event_botaoanteriorActionPerformed

    private void botaoproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoproximoActionPerformed
        botaoprimeiro2.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(true);
        botaoultimo.setEnabled(true);
        if (posicao < lista.size() - 1) {
            posicao = posicao + 1;
            Pergunta elemento = lista.get(posicao);
            txtEnunciado.setText(elemento.getEnunciado());
            txtA.setText(elemento.getA());
            txtB.setText(elemento.getB());
            txtC.setText(elemento.getC());
            txtD.setText(elemento.getD());
            cbxNivel.setSelectedItem(elemento.getNivel().toString());
            cbxResposta.setSelectedItem(elemento.getCerta());
            txtId.setText(elemento.getId().toString());
        }
        if (lista.size() - 1 == posicao) {
            botaoproximo.setEnabled(false);
            botaoultimo.setEnabled(false);
        }
    }//GEN-LAST:event_botaoproximoActionPerformed

    private void botaoultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoultimoActionPerformed
        botaoprimeiro2.setEnabled(true);
        botaoanterior.setEnabled(true);
        botaoproximo.setEnabled(false);
        botaoultimo.setEnabled(false);
        if (lista.size() > 0) {
            posicao = lista.size() - 1;
            Pergunta elemento = lista.get(posicao);
            txtEnunciado.setText(elemento.getEnunciado());
            txtA.setText(elemento.getA());
            txtB.setText(elemento.getB());
            txtC.setText(elemento.getC());
            txtD.setText(elemento.getD());
            cbxNivel.setSelectedItem(elemento.getNivel().toString());
            cbxResposta.setSelectedItem(elemento.getCerta());
            txtId.setText(elemento.getId().toString());
        }
        if (lista.size() - 1 == posicao && lista.size() == 1) {
            botaoproximo.setEnabled(false);
            botaoultimo.setEnabled(false);
            botaoanterior.setEnabled(false);
        }
    }//GEN-LAST:event_botaoultimoActionPerformed

    private void txtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBActionPerformed

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCActionPerformed

    private void txtDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDActionPerformed

    public void Limpar() {
        txtEnunciado.setText("");
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
        txtD.setText("");
        cbxNivel.setSelectedIndex(0);
        cbxResposta.setSelectedIndex(0);
        txtId.setText(null);
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
            java.util.logging.Logger.getLogger(perguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perguntaManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JButton botaoanterior;
    private javax.swing.JButton botaoconsultar;
    private javax.swing.JButton botaoexluir;
    private javax.swing.JButton botaoinserir2;
    private javax.swing.JButton botaolimpar;
    private javax.swing.JButton botaoprimeiro2;
    private javax.swing.JButton botaoproximo;
    private javax.swing.JButton botaoultimo;
    private javax.swing.JLabel c;
    private javax.swing.JComboBox cbxNivel;
    private javax.swing.JComboBox cbxResposta;
    private javax.swing.JLabel d;
    private javax.swing.JLabel enunciado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton listagem;
    private javax.swing.JLabel nivel;
    private javax.swing.JLabel pergunta;
    private javax.swing.JLabel resp;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtEnunciado;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
