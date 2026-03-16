/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica1completa;
import java.util.Calendar;
import pratica1completa.Data;
/**
 *
 * @author 1512857
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;
    private Data dataNascimento;
    
    public Pessoa(){
        dataNascimento = new Data();
    }
    
    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso, double imc){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = calcularIdade(dataNascimento);
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
    }
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(double imc) {
        this.imc = imc;
    }
    
    public Data getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(Data dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public void calcularImc(){
        imc = peso / (Math.pow(altura, 2));
    }
    
    public String informarObs(){
        if(imc < 18.5){
            return "Abaixo do peso";
        }else if(imc >= 18.5 && imc <= 24.9){
            return "Peso normal";
        }else if(imc >= 25.0 && imc <= 29.9){
            return "Peso normal";
        }else if(imc >= 30.0 && imc <= 34.9){
            return "Peso normal";
        }else if(imc >= 35.0 && imc <= 39.9){
            return "Peso normal";
        }else{
            return "Obesidade grau 3";
        }
    }
    
    public int calcularIdade(Data dataNascimento){
        Calendar date = Calendar.getInstance();
        
        int diaAgora = date.get(Calendar.DAY_OF_MONTH);
        int mesAgora = date.get(Calendar.MONTH) + 1;
        int anoAgora = date.get(Calendar.YEAR);
        
        int idadeFinal = anoAgora - dataNascimento.getAno();
        
        if(mesAgora < dataNascimento.getMes() || (mesAgora == dataNascimento.getMes() && diaAgora < dataNascimento.getDia())){
            idadeFinal--;
        }
        
        return idadeFinal;
    }
        public String nomeCompleto(){
            return nome + " " + sobrenome;
        }
        
        public String nomeRef(){
            return sobrenome + ", " + nome.toUpperCase();
        }
    
    
}
