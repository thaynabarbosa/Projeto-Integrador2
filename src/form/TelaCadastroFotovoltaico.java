package form;

import data.Clientes;
import data.Fotovoltaico;
import data.FotovoltaicoDAO;
import javax.swing.JOptionPane;

public class TelaCadastroFotovoltaico extends javax.swing.JFrame {

    private String permissao;

    public TelaCadastroFotovoltaico() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbCadastrarFotovoltaico = new javax.swing.JLabel();
        lbFabricante = new javax.swing.JLabel();
        lbQtdPlacas = new javax.swing.JLabel();
        lbPotGerador = new javax.swing.JLabel();
        lbPotInversor = new javax.swing.JLabel();
        lbTelhado = new javax.swing.JLabel();
        lbConcessionaria = new javax.swing.JLabel();
        lbPotPlacas = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JTextField();
        txtQtdPlacas = new javax.swing.JTextField();
        txtPotPlacas = new javax.swing.JTextField();
        txtPotGerador = new javax.swing.JTextField();
        txtPotInversor = new javax.swing.JTextField();
        cbConcessionaria = new javax.swing.JComboBox<>();
        cbTipoTelhado = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnListaFotovoltaico = new javax.swing.JButton();
        lbID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        lbClienteID = new javax.swing.JLabel();
        txtClienteID = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Cadastro Fotovoltaico");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbCadastrarFotovoltaico.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbCadastrarFotovoltaico.setForeground(new java.awt.Color(20, 105, 205));
        lbCadastrarFotovoltaico.setText("Cadastrar Fotovoltaico");

        lbFabricante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbFabricante.setText("Fabricante:");

        lbQtdPlacas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbQtdPlacas.setText("Quantidade de placas:");

        lbPotGerador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPotGerador.setText("Potência do gerador:");

        lbPotInversor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPotInversor.setText("Potência do Inversor:");

        lbTelhado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTelhado.setText("Tipo de Telhado:");

        lbConcessionaria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbConcessionaria.setText("Concessionária de energia:");

        lbPotPlacas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPotPlacas.setText("Potência das Placas:");

        txtFabricante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFabricante.setToolTipText("Fabricante");

        txtQtdPlacas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQtdPlacas.setToolTipText("Quantidade de Placas");
        txtQtdPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdPlacasActionPerformed(evt);
            }
        });

        txtPotPlacas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPotPlacas.setToolTipText("Wp");
        txtPotPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPotPlacasActionPerformed(evt);
            }
        });

        txtPotGerador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPotGerador.setToolTipText("kWp");

        txtPotInversor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPotInversor.setToolTipText("kW");
        txtPotInversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPotInversorActionPerformed(evt);
            }
        });

        cbConcessionaria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbConcessionaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "CEEE EQUATORIAL", "RGE SUL", "CERTEL", "COOPERNORTE" }));

        cbTipoTelhado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbTipoTelhado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "LAJE", "TELHA ONDULADA", "TELHA COLONIAL GANCHO", "SOLO" }));

        btnCadastrar.setBackground(new java.awt.Color(186, 216, 251));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(20, 105, 205));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(251, 209, 186));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(20, 105, 205));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(186, 216, 251));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(20, 105, 205));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnListaFotovoltaico.setBackground(new java.awt.Color(186, 216, 251));
        btnListaFotovoltaico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnListaFotovoltaico.setForeground(new java.awt.Color(20, 105, 205));
        btnListaFotovoltaico.setText("Lista Fotovoltaico");
        btnListaFotovoltaico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaFotovoltaicoActionPerformed(evt);
            }
        });

        lbID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbID.setText("ID:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(251, 209, 186));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(204, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lbClienteID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbClienteID.setText("Cliente ID:");

        txtClienteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteIDActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnListaFotovoltaico)
                        .addGap(42, 42, 42)
                        .addComponent(btnExcluir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbTelhado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbTipoTelhado, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbPotInversor)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPotInversor))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbPotGerador)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPotGerador, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbQtdPlacas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtQtdPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbPotPlacas)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPotPlacas))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbID)
                                        .addComponent(lbFabricante))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnPesquisar))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(36, 36, 36)
                                                    .addComponent(lbCadastrarFotovoltaico)))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbConcessionaria)
                                .addGap(18, 18, 18)
                                .addComponent(cbConcessionaria, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(95, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lbClienteID)
                .addGap(18, 18, 18)
                .addComponent(txtClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbID)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbCadastrarFotovoltaico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btnPesquisar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFabricante)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQtdPlacas)
                    .addComponent(lbPotPlacas)
                    .addComponent(txtQtdPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPotPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPotGerador)
                    .addComponent(txtPotGerador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPotInversor)
                    .addComponent(txtPotInversor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelhado)
                    .addComponent(cbTipoTelhado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbConcessionaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbConcessionaria))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbClienteID)
                            .addComponent(txtClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListaFotovoltaico, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQtdPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdPlacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdPlacasActionPerformed

    private void txtPotPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPotPlacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPotPlacasActionPerformed

    private void txtPotInversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPotInversorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPotInversorActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (!emptyFields()) {

            String fabricante = txtFabricante.getText();
            int qtdPlacas = Integer.parseInt(txtQtdPlacas.getText());
            Double potPlacas = Double.parseDouble(txtPotPlacas.getText());
            Double potGerador = Double.parseDouble(txtPotGerador.getText());
            Double potInversor = Double.parseDouble(txtPotInversor.getText());
            String tipoTelhado = cbTipoTelhado.getSelectedItem().toString();
            String concessionaria = cbConcessionaria.getSelectedItem().toString();
            int IDcliente = Integer.parseInt(txtClienteID.getText());

            Fotovoltaico fv = new Fotovoltaico();

            fv.setFabricante(fabricante);
            fv.setQtdPlacas(qtdPlacas);
            fv.setPotPlacas(potPlacas);
            fv.setPotGerador(potGerador);
            fv.setPotInversor(potInversor);
            fv.setTipoTelhado(tipoTelhado);
            fv.setConcessionariaEnergia(concessionaria);

            Clientes cliente = new Clientes();
            FotovoltaicoDAO fotovoltaicoDao = new FotovoltaicoDAO();
            cliente = fotovoltaicoDao.VerificacaoCliente(IDcliente);

            if (cliente == null) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado no banco de dado");
            } else {

                cliente.setId(IDcliente);
                fv.setCliente_id(cliente);

                fotovoltaicoDao.inserirFV(fv);

                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                LimparCampos();
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (!emptyFields()) {
            int id = Integer.parseInt(txtID.getText());
            String fabricante = txtFabricante.getText();
            int qtdPlacas = Integer.parseInt(txtQtdPlacas.getText());
            Double potPlacas = Double.parseDouble(txtPotPlacas.getText());
            Double potGerador = Double.parseDouble(txtPotGerador.getText());
            Double potInversor = Double.parseDouble(txtPotInversor.getText());
            String tipoTelhado = cbTipoTelhado.getSelectedItem().toString();
            String concessionaria = cbConcessionaria.getSelectedItem().toString();
            int IDcliente = Integer.parseInt(txtClienteID.getText());

            Fotovoltaico fv = new Fotovoltaico();

            fv.setId(id);
            fv.setFabricante(fabricante);
            fv.setQtdPlacas(qtdPlacas);
            fv.setPotPlacas(potPlacas);
            fv.setPotGerador(potGerador);
            fv.setPotInversor(potInversor);
            fv.setTipoTelhado(tipoTelhado);
            fv.setConcessionariaEnergia(concessionaria);

            Clientes cliente = new Clientes();
            cliente.setId(IDcliente);
            fv.setCliente_id(cliente);

            FotovoltaicoDAO fotovoltaicoDao = new FotovoltaicoDAO();
            fotovoltaicoDao.editar(fv);

            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!");
            LimparCampos();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnListaFotovoltaicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaFotovoltaicoActionPerformed
        ListaFotovoltaico listafv = new ListaFotovoltaico();
        listafv.validaPermissao(permissao);
        dispose();
        listafv.setVisible(true);
    }//GEN-LAST:event_btnListaFotovoltaicoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int id = Integer.parseInt(txtID.getText());

        FotovoltaicoDAO fotovoltaicoDao = new FotovoltaicoDAO();
        fotovoltaicoDao.Excluir(id);

        LimparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtClienteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteIDActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um ID");
        } else {
            int idPesquisa = Integer.parseInt(txtID.getText());
            FotovoltaicoDAO fotovoltaicoDao = new FotovoltaicoDAO();
            Fotovoltaico fotovoltaico = fotovoltaicoDao.getFotovoltaico(idPesquisa);

            if (fotovoltaico == null) {
                JOptionPane.showMessageDialog(this, "Cadastro FV não encontrado!");
            } else {
                txtID.setText(String.valueOf(fotovoltaico.getId()));
                txtFabricante.setText(fotovoltaico.getFabricante());
                txtQtdPlacas.setText(String.valueOf(fotovoltaico.getQtdPlacas()));
                txtPotPlacas.setText(String.valueOf(fotovoltaico.getPotPlacas()));
                txtPotGerador.setText(String.valueOf(fotovoltaico.getPotGerador()));
                txtPotInversor.setText(String.valueOf(fotovoltaico.getPotInversor()));
                cbTipoTelhado.setSelectedItem(fotovoltaico.getTipoTelhado());
                cbConcessionaria.setSelectedItem(fotovoltaico.getConcessionariaEnergia());
                txtClienteID.setText(String.valueOf(fotovoltaico.getCliente_id().getId()));
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroFotovoltaico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFotovoltaico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFotovoltaico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFotovoltaico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFotovoltaico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListaFotovoltaico;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbConcessionaria;
    private javax.swing.JComboBox<String> cbTipoTelhado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCadastrarFotovoltaico;
    private javax.swing.JLabel lbClienteID;
    private javax.swing.JLabel lbConcessionaria;
    private javax.swing.JLabel lbFabricante;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbPotGerador;
    private javax.swing.JLabel lbPotInversor;
    private javax.swing.JLabel lbPotPlacas;
    private javax.swing.JLabel lbQtdPlacas;
    private javax.swing.JLabel lbTelhado;
    private javax.swing.JTextField txtClienteID;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPotGerador;
    private javax.swing.JTextField txtPotInversor;
    private javax.swing.JTextField txtPotPlacas;
    private javax.swing.JTextField txtQtdPlacas;
    // End of variables declaration//GEN-END:variables

    private boolean emptyFields() {

        boolean empty = true;

        if (txtFabricante.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Fabricante não pode ser vazio.");
        } else if (txtQtdPlacas.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Quantidade de Placas não pode ser vazio.");
        } else if (txtPotPlacas.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Potência das Placas não pode ser vazio.");
        } else if (txtPotGerador.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Potência do Gerador não pode ser vazio.");
        } else if (txtPotInversor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Potência do Inversor não pode ser vazio.");
        } else if (cbTipoTelhado.getSelectedItem().toString().equals("Selecione")) {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Selecione um Tipo de telhado.");
        } else if (cbConcessionaria.getSelectedItem().toString().equals("Selecione")) {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Selecione uma Concessionária.");
        } else {
            empty = false;
        }
        return empty;
    }

    public void PegaIDcliente(Fotovoltaico user) {

        txtID.setText(String.valueOf(user.getId()));

    }

    public void LimparCampos() {
        txtID.setText("");
        txtFabricante.setText("");
        txtQtdPlacas.setText("");
        txtPotPlacas.setText("");
        txtPotGerador.setText("");
        txtPotInversor.setText("");
        cbTipoTelhado.setSelectedItem("Selecione");
        cbConcessionaria.setSelectedItem("Selecione");
        txtClienteID.setText("");

        txtFabricante.requestFocus();

    }

    public void PegaIDcliente(int idCliente) {
        // Preencha os campos da tela de cadastro com o ID do cliente
        txtID.setText(String.valueOf(idCliente));

    }

    public void PegaIDclienteFK(int idClienteFV) {
        // Preencha os campos da tela de cadastro com o ID do cliente
        txtClienteID.setText(String.valueOf(idClienteFV));

    }

    public void validaPermissao(String permissao) {
        this.permissao = permissao;
        if (permissao.equals("Projetista")) {
            btnCadastrar.setEnabled(false);
            btnAtualizar.setEnabled(false);
            btnExcluir.setEnabled(false);
        } else if (permissao.equals("Vendedor")) {
            btnAtualizar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }
}