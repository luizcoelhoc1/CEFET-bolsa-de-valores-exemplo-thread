package bolsadevalores;

import java.util.ArrayList;
import java.util.Arrays;
public class Fundos {
    private ArrayList<Double> lvariacoes;

    public Fundos() {
        lvariacoes=new ArrayList<>();
    }
    
    /**
     * Adiciona uma variação na lista
     * @param variacao
     */
    public void addvariacao(double variacao){
        this.lvariacoes.add(variacao);//coloca na ultima posição da lista uma nova variação
    }
    
    /**
     *Lista a lista de variações
     */
    public void listar(){
        for(final double i : this.lvariacoes){
            System.out.println(i);//imprime na tela
        }
    }
    
    /**
     * Soma todos as variações da lista
     * @return soma
     */
    public double getSoma(){
        double soma =0.0;
        for(final double i : this.lvariacoes){
            soma+=i;//soma todos os itens da lista
        }
        return soma;
    }
    
    /**
     * Pega a média de todas as variações da lista
     * @return média
     */
    public double getMedia(){
        return getSoma()/this.lvariacoes.size();// soma/tamanho...
    }
    
    /**
     * Retorna a mediana da lista
     * @return Mediana
     */
    public double getMediana(){
        int i = 0;
        double[] arraytmpmediana = new double[this.lvariacoes.size()]; //array temporario do tamanho da lista
        for(final double d : lvariacoes){
            arraytmpmediana[i] = d;//coloco a lista no array
            i++;
        }
        Arrays.sort(arraytmpmediana);//ordeno o array
        i=this.lvariacoes.size()/2;//pego a posição da mediana
        double mediana = arraytmpmediana[i];
        return mediana;
    }
    
    public double getDesvioPadra(){
    double desviopadrao = 0;
    int tamanho = this.lvariacoes.size();
    for (final double d : lvariacoes){
        desviopadrao+= Math.pow((d-getMedia()), 2); //k = [(a1−X)² + (a2−X )² + (a3−X )²+...+ (an−X )²]
    }
    desviopadrao = Math.sqrt(desviopadrao/(this.lvariacoes.size()-1));//sqrt(1/n-1*k)
    return desviopadrao;
    }
    
    public double getIndiceDeSharpe(){
        return getMedia()/getDesvioPadra(); //media/desvio_padrão
        
    }
    
}