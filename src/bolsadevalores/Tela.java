package bolsadevalores;


import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Tela extends javax.swing.JFrame {

    public Tela() {
        this.id = 0;
        initComponents();
        medianas    = new ArrayList<>();
        medias      = new ArrayList<>();
        listafundos = new ArrayList<>();
        listathread = new ArrayList<>();
        nomes       = new ArrayList<>();
        this.isclicavel=false;
        arquivo = new File("Fundos_saida.txt");  
    }
    //mesma logica do sem GUI
    public static int VER_MELHOR_FUNDO = 3;
    public static int PEGAR_MEDIANA = 2;
    public static int CALCULAR_MEDIA = 1;
    private ArrayList<Fundos>   listafundos;
    private ArrayList<String>   nomes;
    private ArrayList<Thread>   listathread;
    private ArrayList<Double>   medias;
    private ArrayList<Double>   medianas;
    private boolean isclicavel;
    private int tamanho;
    int id;
    private File arquivo;  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textareamedia = new java.awt.TextArea();
        textareamediana = new java.awt.TextArea();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        melhor_fundo_num = new javax.swing.JLabel();
        melhor_fundo = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Ler Arquivos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Calcular Média");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jButton4.setText("Pegar Mediana");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("ver melhor fundo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        melhor_fundo_num.setText("Número");

        melhor_fundo.setText("Nome: ");

        jButton5.setText("Salvar isso!");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(textareamedia, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textareamediana, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(melhor_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(melhor_fundo_num, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textareamedia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textareamediana, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(melhor_fundo)
                    .addComponent(melhor_fundo_num))
                .addGap(58, 58, 58)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String extencao[]; 
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Text", "txt");//filtrando pra pegar so txt
            javax.swing.JFileChooser selecionador = new javax.swing.JFileChooser();//crio variavel pra ler
            selecionador.setFileFilter(filtro);//ativo o filtro
            selecionador.setMultiSelectionEnabled(true);//permito multiplas leituras
            selecionador.showOpenDialog(selecionador);//abre o painel pra selecionar os arquivos
            File[] files = selecionador.getSelectedFiles();//crio um array para pegar todos os arquivos
            for (int i = 0;i<selecionador.getSelectedFiles().length;i++) {//vou de 0 a quantidade de arquivos selecionados
                if (files[i].getName().endsWith(".txt")){//se terminar com ".txt"
                    this.listafundos.add(Leitor.lerFundo(files[i].getPath())); //adiciono da lista um ponteiro para o fundo i
                    this.isclicavel = true;//é possível agora clicar nos botões de calculos
                    this.nomes.add(files[i].getName());//criei um vetor pra guardar os nomes, mas ainda n usei isso
                    tamanho++;
                } else{//caso não for ".txt" dá mensagem de erro
                    JOptionPane.showMessageDialog(
                            rootPane, 
                            "O "+i+"º arquivo não é um arquivo texto",
                            "Arquivo não lido",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        } catch(Exception e){//tratando exceções
            JOptionPane.showMessageDialog(
                    rootPane, 
                    "Erro: 001",
                    "ERROR file",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (isclicavel == true){//se o botão for clicável
            int i;
            this.listathread.clear();
            try{
                for(i = 0; i < listafundos.size(); i++){//mesma lógica do sem GUI
                    medianas.add(0.0);    
                    this.listathread.add(new Thread(new GoThread(PEGAR_MEDIANA, id,
                    listafundos.get(i), textareamediana, 
                    nomes.get(i).substring(0, (nomes.get(i).length()-4)))));
                    id++;
                }
                for(i = 0; i<listathread.size();i++){
                    listathread.get(i).start();
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(
                        rootPane, 
                        "Erro: 002",
                        "ERROR file",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed

    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (isclicavel == true){//se o botão for clicável
            int i;
            this.listathread.clear();
            try{//mesma lógica do sem GUI

                for(i = 0; i < listafundos.size(); i++){
                    medias.add(0.0);
                    this.listathread.add(new Thread(new GoThread(CALCULAR_MEDIA, id,
                        listafundos.get(i), textareamedia,
                        nomes.get(i).substring(0, (nomes.get(i).length()-4)))));
                    id++;
                }
                for(i = 0; i<listathread.size();i++){
                    listathread.get(i).start();
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro: 002",
                    "ERROR file",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   if (isclicavel == true){//se o botão for clicável
            int i;
            this.listathread.clear();
            try{//mesma lógica do sem GUI
                for(i = 0; i < listafundos.size(); i++){
                    medias.add(0.0);
                    this.listathread.add(new Thread(new GoThread(VER_MELHOR_FUNDO, id,
                        listafundos.get(i), melhor_fundo,melhor_fundo_num,
                        nomes.get(i).substring(0, (nomes.get(i).length()-4)))));
                    id++;
                }
                for(i = 0; i<listathread.size();i++){
                    listathread.get(i).start();
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro: 002",
                    "ERROR file",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //escrevendo em um arquivo
        FileWriter inserindo = null;  
        try {
            inserindo = new FileWriter(arquivo, true);
            inserindo.write("Médias:\n");
            inserindo.write(textareamedia.getText());
            inserindo.write("Medianas:\n");
            inserindo.write(textareamediana.getText());
            inserindo.write("melhor indice: " + String.valueOf(melhor_fundo_num.getText()));
            inserindo.close(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                rootPane,
                "Erro: 003",
                "ERROR file",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel melhor_fundo;
    private javax.swing.JLabel melhor_fundo_num;
    private java.awt.TextArea textareamedia;
    private java.awt.TextArea textareamediana;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the label
     */
}
