/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.tplp332110.view;

import com.mycompany.tplp332110.controller.AlunoController;
import com.mycompany.tplp332110.view.tablemodel.AlunoTableModel;
import com.mycompany.tplp332110.controller.AlunoDTO;
import com.mycompany.tplp332110.controller.AlunoResponseDTO;
import java.awt.Component;
import java.awt.Font;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.PatternSyntaxException;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author renato
 */
public class CadastroAluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroAluno
     */
    public CadastroAluno() {
        initComponents();
        alunoModel = new AlunoTableModel();
        initialFocus();
    }
    
    private void initialFocus() {
        this.toFront();
        try {
            this.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CadastroAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingUtilities.invokeLater(() -> {
            txtBusca.requestFocusInWindow();
        });
    }

    public void abriCadastroAluno(JDesktopPane desktopPane) {
        tblAlunos.setModel(alunoModel);
        propriedadesTabela();
        filtro();
        setBotoes(true, false, false, false);
        txtBusca.requestFocus();
        this.desktopPane = desktopPane;

    }

    private void propriedadesTabela() {
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus,
                    int row, int column) {
                // Chama o método original para obter o componente padrão (um JLabel)
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // --- Define a fonte como negrito ---
                Font font = label.getFont();
                label.setFont(font.deriveFont(Font.BOLD)); // Cria uma nova fonte com o estilo BOLD

                // Opcional: Centralizar o texto do cabeçalho
                label.setHorizontalAlignment(SwingConstants.CENTER);

                return label;
            }
        };
        for (int i = 0; i < tblAlunos.getColumnModel().getColumnCount(); i++) {
            tblAlunos.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        DefaultTableCellRenderer centerColumn = new DefaultTableCellRenderer();
        centerColumn.setHorizontalAlignment(SwingConstants.CENTER);
        tblAlunos.getColumnModel().getColumn(0).setCellRenderer(centerColumn);
        tblAlunos.getColumnModel().getColumn(0).setMaxWidth(60);
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
        pnTitulo = new javax.swing.JPanel();
        pnTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();
        txtBusca = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        pnCampos = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbId = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        pnBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setResizable(true);
        setTitle("Cadastro de Alunos");
        setMaximumSize(new java.awt.Dimension(900, 1280));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setPreferredSize(new java.awt.Dimension(900, 900));
        setVisible(true);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(900, 1280));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 800));
        jPanel1.setLayout(new java.awt.BorderLayout());

        tblAlunos.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblAlunos.setShowGrid(true);
        tblAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlunos);

        txtBusca.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnTabelaLayout = new javax.swing.GroupLayout(pnTabela);
        pnTabela.setLayout(pnTabelaLayout);
        pnTabelaLayout.setHorizontalGroup(
            pnTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTabelaLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(pnTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                    .addComponent(txtBusca))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        pnTabelaLayout.setVerticalGroup(
            pnTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTabelaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTituloLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTituloLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(pnTitulo, java.awt.BorderLayout.PAGE_END);

        lbNome.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbNome.setText("Nome:");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtId.setFocusable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lbEmail.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbEmail.setText("e-mail:");

        txtNome.setEditable(false);
        txtNome.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtNome.setFocusable(false);

        lbId.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbId.setText("ID:");

        txtEmail.setEditable(false);
        txtEmail.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtEmail.setFocusable(false);

        pnBotoes.setLayout(new java.awt.GridLayout(1, 0));

        btnNovo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnNovo.setMnemonic('n');
        btnNovo.setText("Novo");
        btnNovo.setToolTipText("Para incluir um novo aluno");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        pnBotoes.add(btnNovo);

        btnEditar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnEditar.setMnemonic('e');
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Edita os dados do aluno selecionado");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnBotoes.add(btnEditar);

        btnExcluir.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnExcluir.setMnemonic('x');
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Apaga os registros do aluno aluno selecionado");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnBotoes.add(btnExcluir);

        btnLimpar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnLimpar.setMnemonic('l');
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Limpa os campos de dados/busca");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        pnBotoes.add(btnLimpar);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cadastro de Alunos");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnCamposLayout = new javax.swing.GroupLayout(pnCampos);
        pnCampos.setLayout(pnCamposLayout);
        pnCamposLayout.setHorizontalGroup(
            pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNome)
                    .addComponent(lbId)
                    .addComponent(lbEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome)
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                    .addComponent(txtEmail))
                .addContainerGap(124, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnCamposLayout.setVerticalGroup(
            pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel1.add(pnCampos, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void filtro() {
        sorter = new TableRowSorter<>(alunoModel);
        tblAlunos.setRowSorter(sorter);
        txtBusca.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtrarTabela();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtrarTabela();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Não é relevante para JTextFields simples
                filtrarTabela();
            }
        });
    }

    private void filtrarTabela() {
        String textoFiltro = txtBusca.getText();
        if (textoFiltro.trim().length() == 0) {
            sorter.setRowFilter(null); // Remove qualquer filtro
            tblAlunos.clearSelection(); // Limpa a seleção
        } else {
            try {
                // Cria o filtro case-insensitive para a coluna "Nome" (índice 1)
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoFiltro));

                // --- NOVO: Lógica para selecionar e rolar para o topo ---
                if (tblAlunos.getRowCount() > 0) { // Verifica se há linhas visíveis após o filtro
                    // Seleciona a primeira linha visível (índice 0 na visão da tabela)
                    tblAlunos.setRowSelectionInterval(0, 0);

                    // Rola a tabela para que a linha selecionada fique visível no topo
                    // O 'true' em getCellRect faz com que a célula seja visível
                    tblAlunos.scrollRectToVisible(tblAlunos.getCellRect(0, 0, true));
                } else {
                    tblAlunos.clearSelection(); // Limpa a seleção se não houver resultados
                }

            } catch (PatternSyntaxException e) {
                System.err.println("Erro de sintaxe de filtro: " + e.getMessage());
                sorter.setRowFilter(null);
                tblAlunos.clearSelection();
            }
        }
    }

    private void setBotoes(boolean novo, boolean editar, boolean excluir, boolean limpar) {
        btnNovo.setEnabled(novo);
        btnEditar.setEnabled(editar);
        btnExcluir.setEnabled(excluir);
        btnLimpar.setEnabled(limpar);
    }

    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        txtBusca.setText("");
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String options[] = {"Continuar", "Cancelar"};
        int val = JOptionPane.showOptionDialog(pnBotoes,
                "A exclusão será definitiva.\nConfirme a exclusão do Aluno:\n"
                + txtId.getText() + "\nNome: " + txtNome.getText(),
                "Confirme a Exclusão do Aluno",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                options,
                options[0]);
        if (val == 0) {
            AlunoController controller = new AlunoController();
            AlunoDTO dto = new AlunoDTO();
            dto.setId(Long.valueOf(lbId.getText()));
//            AlunoResponseDTO response = controller.remove(dto); // tem que fazer o método
//            String msg = response.getMensagem();
//            JOptionPane.showMessageDialog(pnCampos, msg,
//                    "Resultado da Operação", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        setBotoes(true, false, false, false);
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tblAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlunosMouseClicked
        if (tblAlunos.getSelectedRow() != -1) {
            txtId.setText(String.valueOf(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 0)));
            txtNome.setText((String) tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 1));
            txtEmail.setText((String) tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 2));
            setBotoes(true, true, true, true);
        }
    }//GEN-LAST:event_tblAlunosMouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
                                   


    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        SalvarEditarAluno salvarAluno = new SalvarEditarAluno("Editar Aluno");
        this.desktopPane.add(salvarAluno);
        salvarAluno.setVisible(true);
        salvarAluno.toFront();
        salvarAluno.requestFocus();
        for (Component component : this.desktopPane.getComponents()) {
            System.out.println(component.getClass().getName());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private JDesktopPane desktopPane;
    private TableRowSorter<AlunoTableModel> sorter;
    private final AlunoTableModel alunoModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNome;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnCampos;
    private javax.swing.JPanel pnTabela;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
