
package bolsadevalores;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class GoThread implements Runnable {
    private volatile int type;
    private volatile int id;
    private Fundos fundo_da_lista;
    private Formatter formatar = new java.util.Formatter();
    java.awt.TextArea area_de_texto_x;
    private javax.swing.JLabel melhor_fundo;
    private javax.swing.JLabel melhor_fundo_num;
    private String nomearquivo;
    private Component rootPane;
    public GoThread(int type, int id, Fundos fundo_da_lista,
    java.awt.TextArea a, String nomearquivo){
        this.type = type;
        this.id = id;
        this.fundo_da_lista = fundo_da_lista;  
        this.area_de_texto_x=a;
        this.nomearquivo= nomearquivo;
        System.out.println("a thread "+id+" foi disparada para o arquivo ");
    } //construtor da mediana e da media
    
    public GoThread(int type, int id, Fundos fundo_da_lista,
    javax.swing.JLabel melhor_fundo, javax.swing.JLabel melhor_fundo_num, String nomearquivo){
        this.type = type;
        this.id = id;
        this.fundo_da_lista = fundo_da_lista;  
        this.melhor_fundo = melhor_fundo;
        this.melhor_fundo_num = melhor_fundo_num;
        this.nomearquivo = nomearquivo;
        System.out.println("a thread "+id+" foi disparada para o arquivo "+nomearquivo);
    }//construtor indice
    
    public GoThread(int type, int id, Fundos fundo_da_lista, String nomearquivo){
        this.type = type;
        this.id = id;
        this.fundo_da_lista = fundo_da_lista;
        this.nomearquivo= nomearquivo;
        System.out.println("a thread "+id+" foi disparada para o arquivo ");
    }//construtor de não GUI
    
    @Override
    public void run() {
        long inicio = System.currentTimeMillis();
            if(this.type == Tela.CALCULAR_MEDIA){
                area_de_texto_x.append(nomearquivo+": "+formatar.format("%.10f", fundo_da_lista.getMedia())+"\n");//se for media calcula a média e bota no textarea 
            }else if(this.type == Tela.PEGAR_MEDIANA){
                area_de_texto_x.append(nomearquivo+": "+formatar.format("%.10f", fundo_da_lista.getMediana())+"\n");//senaõ se for mediana...
            }else if(this.type == Tela.VER_MELHOR_FUNDO){
                if("Número".equals(melhor_fundo_num.getText())){//se Label.getTEXT == Número(quer dizer que não escreveu nada)
                    melhor_fundo.setText(nomearquivo+": ");//presume que o primeiro é o indice
                    melhor_fundo_num.setText(fundo_da_lista.getIndiceDeSharpe()+"\n");
                }else if(Double.valueOf(melhor_fundo_num.getText())<fundo_da_lista.getIndiceDeSharpe()) {//senão se fundo for maior do que tá no label então troca 
                    melhor_fundo.setText(nomearquivo+": ");
                    melhor_fundo_num.setText( fundo_da_lista.getIndiceDeSharpe()+"\n");
                }
            }else if(this.type == 4){
                System.out.println( fundo_da_lista.getMedia() );
            }else if(this.type == 5 ){
                System.out.println( fundo_da_lista.getMediana() );
            }else if (this.type ==6 ){
                System.out.println( fundo_da_lista.getIndiceDeSharpe() );
            }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo consumido: " + (fim - inicio) + " ms");
  
    }
    
}
    

