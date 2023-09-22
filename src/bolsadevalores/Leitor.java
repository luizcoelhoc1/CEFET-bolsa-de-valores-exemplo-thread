package bolsadevalores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Leitor {

    /**
     * lê um fundo
     * @param diretorio_arquivo
     * @return referencia a um novo fundo
     */
    public static Fundos lerFundo(String diretorio_arquivo){
        Fundos fundolido = new Fundos();
        try {
            BufferedReader br  = new java.io.BufferedReader(new FileReader(diretorio_arquivo));
            String leitor;
            while ((leitor = br.readLine()) != null) {//enquanto a linha lida for diferente de nulo
                fundolido.addvariacao(Double.valueOf(leitor.replace(",", ".")));//adiciona em uma lista, trocando , por . e convertendo para Double
                
            }
            br.close();//fecha o Buffered Reader 
            return fundolido;//retorna um ponteiro para a lista cujo essa é do arquivo passado que foi passado como parâmetro 
        } catch (FileNotFoundException ex) { //tratando exceções 
            System.err.println("Arquivo não achado");
        } catch (IOException ex) {
            System.err.println("Não lido");
        } catch(NumberFormatException ex){
            System.err.println("O arquivo lido possui um erro de formatação, favor inserir números ");
        }
          
        return null;
    }
    
    
}
