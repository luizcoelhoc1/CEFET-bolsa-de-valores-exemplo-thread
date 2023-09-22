package bolsadevalores;

import java.util.ArrayList;


public class BolsaDeValores {
    public static void main(String[] args) {                  
        if (args.length>0){//se passou argumento
            ArrayList<Fundos> fundo   = new ArrayList<>();//cria uma lista de fundos
            ArrayList<Thread> listathread = new ArrayList<>();//uma lista de thread 
            int id=0, i=0;
            ArrayList<Double> medias  = new ArrayList<>();
            ArrayList<Double> medianas= new ArrayList<>();
            ArrayList<Double> indices = new ArrayList<>();
            int INDICE_TERMINAL = 6;
            int PEGAR_MEDIANA_TERMINAL = 5;
            int CALCULAR_MEDIA_TERMINAL = 4;
            for (final String arg : args) {//ir de todos os argumentos
                fundo.add(Leitor.lerFundo(arg));//vai adicionando na lista os arquivos
                
                listathread.add(new Thread(new GoThread(CALCULAR_MEDIA_TERMINAL, //cria a thread
                id, fundo.get(i), args[i].substring(0, (args[i].length()-4)))));
                
                id++;
                i++;
            }
            
            for(i = 0; i<listathread.size();i++){
                listathread.get(i).start(); //executa thread
            }
            listathread.clear();
            fundo.clear();
            
            for (final String arg : args) { //mesmo processo se repete para mediana e indice
                fundo.add(Leitor.lerFundo(arg));
                
                listathread.add(new Thread(new GoThread(PEGAR_MEDIANA_TERMINAL, 
                id, fundo.get(i), args[i].substring(0, (args[i].length()-4)))));
                
                id++;
                i++;
            }
            
            for(i = 0; i<listathread.size();i++){
                listathread.get(i).start();
            }
            listathread.clear();
            fundo.clear();
            for (final String arg : args) {
                fundo.add(Leitor.lerFundo(arg));
                
                listathread.add(new Thread(new GoThread(INDICE_TERMINAL, 
                id, fundo.get(i), args[i].substring(0, (args[i].length()-4)))));
                
                id++;
                i++;
            }
            
            for(i = 0; i<listathread.size();i++){
                listathread.get(i).start();
            }
            listathread.clear();
            fundo.clear();
            
            
        }else{//se não passou parametro
            Tela tela = new Tela();
            tela.setVisible(true);//vai pra telinha
        }
    }
    
}
