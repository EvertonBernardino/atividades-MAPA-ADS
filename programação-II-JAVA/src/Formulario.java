
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Everton
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enderecoCampo = new javax.swing.JTextField();
        emailCampo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        telefoneCampo = new javax.swing.JTextField();
        cidadeCampo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        estadoCampo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        masculinoCampo = new javax.swing.JRadioButton();
        femininoCampo = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        alemaoCampo = new javax.swing.JCheckBox();
        espanholCampo = new javax.swing.JCheckBox();
        francesCampo = new javax.swing.JCheckBox();
        inglesCampo = new javax.swing.JCheckBox();
        italianoCampo = new javax.swing.JCheckBox();
        japonesCampo = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        motivoCampo = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel1.setText("Nome:");

        nomeCampo.setToolTipText("");
        nomeCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCampoActionPerformed(evt);
            }
        });

        jLabel2.setText("Endereço:");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Cidade:");

        jLabel6.setText("UF:");

        estadoCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel7.setText("Sexo");

        buttonGroup1.add(masculinoCampo);
        masculinoCampo.setText("Masculino");
        masculinoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculinoCampoActionPerformed(evt);
            }
        });

        buttonGroup1.add(femininoCampo);
        femininoCampo.setText("Feminino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(enderecoCampo)
                    .addComponent(emailCampo))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(telefoneCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cidadeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(estadoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(masculinoCampo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(femininoCampo)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(telefoneCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cidadeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(estadoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(masculinoCampo)
                            .addComponent(femininoCampo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(enderecoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(emailCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Curso"));
        jPanel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel8.setText("Selecione o(s) curso(s):");

        alemaoCampo.setText("Alemão");
        alemaoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alemaoCampoActionPerformed(evt);
            }
        });

        espanholCampo.setText("Espanhol");

        francesCampo.setText("Francês");
        francesCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                francesCampoActionPerformed(evt);
            }
        });

        inglesCampo.setText("Inglês");
        inglesCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inglesCampoActionPerformed(evt);
            }
        });

        italianoCampo.setText("Italiano");
        italianoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italianoCampoActionPerformed(evt);
            }
        });

        japonesCampo.setText("Japonês");
        japonesCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                japonesCampoActionPerformed(evt);
            }
        });

        motivoCampo.setColumns(20);
        motivoCampo.setRows(5);
        jScrollPane1.setViewportView(motivoCampo);

        jLabel9.setText("Por que se interessa por esse(s) curso(s):");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(alemaoCampo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(espanholCampo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(francesCampo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inglesCampo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(italianoCampo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(japonesCampo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(japonesCampo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(italianoCampo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inglesCampo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(francesCampo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(espanholCampo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(alemaoCampo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCampoActionPerformed

    private void masculinoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masculinoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masculinoCampoActionPerformed

    private void alemaoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alemaoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alemaoCampoActionPerformed

    private void francesCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_francesCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_francesCampoActionPerformed

    private void inglesCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inglesCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inglesCampoActionPerformed

    private void italianoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italianoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_italianoCampoActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        Cadastro objCadastro = new Cadastro();
        objCadastro.setNome(nomeCampo.getText());
        objCadastro.setCidade(cidadeCampo.getText());
        objCadastro.setEmail(emailCampo.getText());
        objCadastro.setTelefone(telefoneCampo.getText());
        objCadastro.setEndereco(enderecoCampo.getText());
        objCadastro.setMotivo(motivoCampo.getText());
        
        if (alemaoCampo.isSelected()){
            objCadastro.setAlemão(true);
        }
        
        if (italianoCampo.isSelected()){
            objCadastro.setItaliano(true);
        }
        
        if (francesCampo.isSelected()){
            objCadastro.setFrances(true);
        }
        
        if (inglesCampo.isSelected()){
            objCadastro.setIngles(true);
        }
        
        if (espanholCampo.isSelected()){
            objCadastro.setEspanhol(true);
        }
        
        if (japonesCampo.isSelected()){
            objCadastro.setJapones(true);
        }
        
        if(masculinoCampo.isSelected()){
            objCadastro.setSexo("M");            
        }else{
            objCadastro.setSexo("F");            
        }
        
        objCadastro.setEstado((String)estadoCampo.getSelectedItem());
        
        limpar();
        
        JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso!");
    }//GEN-LAST:event_salvarActionPerformed

    private void japonesCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_japonesCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_japonesCampoActionPerformed

    public void limpar(){
        nomeCampo.setText("");
        enderecoCampo.setText("");
        telefoneCampo.setText("");
        emailCampo.setText("");
        cidadeCampo.setText("");
        motivoCampo.setText("");
        espanholCampo.setSelected(false);
        alemaoCampo.setSelected(false);
        inglesCampo.setSelected(false);
        italianoCampo.setSelected(false);
        francesCampo.setSelected(false);
        japonesCampo.setSelected(false);
        buttonGroup1.clearSelection();
        estadoCampo.setSelectedIndex(-1);
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alemaoCampo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cidadeCampo;
    private javax.swing.JTextField emailCampo;
    private javax.swing.JTextField enderecoCampo;
    private javax.swing.JCheckBox espanholCampo;
    private javax.swing.JComboBox<String> estadoCampo;
    private javax.swing.JRadioButton femininoCampo;
    private javax.swing.JCheckBox francesCampo;
    private javax.swing.JCheckBox inglesCampo;
    private javax.swing.JCheckBox italianoCampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox japonesCampo;
    private javax.swing.JRadioButton masculinoCampo;
    private javax.swing.JTextArea motivoCampo;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField telefoneCampo;
    // End of variables declaration//GEN-END:variables
}
