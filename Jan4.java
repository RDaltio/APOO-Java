//Rafael Duarte Daltio - 2266539
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Jan4 extends javax.swing.JFrame {
    private GerSala gerSal = new GerSala();
    private Sala sal = new Sala();
    
    private static Jan4 jan4Unico;
    
    private Jan4() {
        initComponents();
    }
    
    public static Jan4 getJan4(){
        if(jan4Unico == null){
            jan4Unico = new Jan4();
        }
        return jan4Unico;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tabCadSala = new javax.swing.JTable();
        RTCapacidade = new javax.swing.JLabel();
        BTFecJan3 = new javax.swing.JButton();
        txtCapacidade = new javax.swing.JTextField();
        BTLimpar = new javax.swing.JButton();
        BTCadastrar = new javax.swing.JButton();
        RTSnome = new javax.swing.JLabel();
        RTPresenca = new javax.swing.JLabel();
        txtSnome = new javax.swing.JTextField();
        BTConsultar = new javax.swing.JButton();
        txtPresenca = new javax.swing.JTextField();
        BTCadProf = new javax.swing.JLabel();
        RTEndereço = new javax.swing.JLabel();
        txtEndereço = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabCadSala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código da sala", "Capacidade", "Tipo de presença", "Endereço"
            }
        ));
        jScrollPane3.setViewportView(tabCadSala);

        RTCapacidade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RTCapacidade.setText("Capacidade:");

        BTFecJan3.setText("Fechar");
        BTFecJan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTFecJan3ActionPerformed(evt);
            }
        });

        txtCapacidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadeActionPerformed(evt);
            }
        });

        BTLimpar.setText("Limpar");
        BTLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTLimparActionPerformed(evt);
            }
        });

        BTCadastrar.setText("Cadastrar sala");
        BTCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCadastrarActionPerformed(evt);
            }
        });

        RTSnome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RTSnome.setText("Código:");

        RTPresenca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RTPresenca.setText("Tipo de presença:");

        BTConsultar.setText("Consultar sala");
        BTConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTConsultarActionPerformed(evt);
            }
        });

        txtPresenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPresencaActionPerformed(evt);
            }
        });

        BTCadProf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BTCadProf.setText("Cadastro de salas");

        RTEndereço.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RTEndereço.setText("Endereço:");

        txtEndereço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndereçoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTFecJan3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RTPresenca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RTCapacidade)
                                    .addComponent(RTSnome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSnome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RTEndereço)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTCadProf)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(BTCadProf)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RTSnome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RTCapacidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RTPresenca)
                            .addComponent(txtPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RTEndereço)
                            .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTLimpar)
                    .addComponent(BTCadastrar)
                    .addComponent(BTConsultar))
                .addGap(18, 18, 18)
                .addComponent(BTFecJan3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTFecJan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTFecJan3ActionPerformed
        dispose();
    }//GEN-LAST:event_BTFecJan3ActionPerformed

    private void BTLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTLimparActionPerformed
        limpar();
    }//GEN-LAST:event_BTLimparActionPerformed

    private void BTCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCadastrarActionPerformed
        cadastrar();
        listarTabela();
        limpar();
    }//GEN-LAST:event_BTCadastrarActionPerformed

    private void BTConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_BTConsultarActionPerformed

    private void txtPresencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPresencaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPresencaActionPerformed

    private void txtCapacidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadeActionPerformed

    private void txtEndereçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndereçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndereçoActionPerformed

    public void listarTabela(){
        
        DefaultTableModel modelo = (DefaultTableModel)tabCadSala.getModel();
        modelo.setRowCount(0);
        int posLin = 0;
        
        for(Sala sal1 :gerSal.getBdSal()){
            modelo.insertRow(posLin, new Object[]{sal1.getSnome(),sal1.getCapacidade(),sal1.getPresenca(),sal1.getEndereco()});
            posLin++;
        }
    }
    
    public void limpar(){
        txtSnome.setText("");
        txtCapacidade.setText("");
        txtPresenca.setText("");
        txtEndereço.setText("");
        txtSnome.requestFocus();
    }
    
    public void cadastrar(){
        setSal(new Sala());
        
        getSal().setSnome(Integer.parseInt(txtSnome.getText()));
        getSal().setCapacidade(Integer.parseInt(txtCapacidade.getText()));
        getSal().setPresenca(txtPresenca.getText());
        getSal().setEndereco(txtEndereço.getText());


        
        setSal(gerSal.cadSal(getSal()));
        
        if(getSal() == null){
            JOptionPane.showMessageDialog(null, "Já existe uma sala cadastrada com esse código", "Erro de cadastro", 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Sala cadastrada com sucesso", "Cadastramento de sala", 0);
        }
    }
    
    public void consultar(){
        setSal(new Sala());
        
        getSal().setSnome(Integer.parseInt(txtSnome.getText()));
        
        setSal(gerSal.consSalSnome(getSal()));
        
        if(getSal() == null){
            JOptionPane.showMessageDialog(null, "Não existe uma sala cadastrada com esse código: "+txtSnome.getText(), "Erro de consulta", 0);
            limpar();
        }
        else{
            txtSnome.setText(Integer.toString(getSal().getSnome()));
            txtCapacidade.setText(Integer.toString(getSal().getCapacidade()));
            txtPresenca.setText(getSal().getPresenca());
            txtEndereço.setText(getSal().getEndereco());
        }
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
            java.util.logging.Logger.getLogger(Jan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jan4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BTCadProf;
    private javax.swing.JButton BTCadastrar;
    private javax.swing.JButton BTConsultar;
    private javax.swing.JButton BTFecJan3;
    private javax.swing.JButton BTLimpar;
    private javax.swing.JLabel RTCapacidade;
    private javax.swing.JLabel RTEndereço;
    private javax.swing.JLabel RTPresenca;
    private javax.swing.JLabel RTSnome;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabCadSala;
    private javax.swing.JTextField txtCapacidade;
    private javax.swing.JTextField txtEndereço;
    private javax.swing.JTextField txtPresenca;
    private javax.swing.JTextField txtSnome;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the sal
     */
    public Sala getSal() {
        return sal;
    }

    /**
     * @param sal the sal to set
     */
    public void setSal(Sala sal) {
        this.sal = sal;
    }
}