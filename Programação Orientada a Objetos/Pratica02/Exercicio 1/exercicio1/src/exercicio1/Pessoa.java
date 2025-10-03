/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author pedrodefreitas
 */
public class Pessoa {
    
    //Atributos
    private String nome;
    private int dia, mes, ano;
    private int altura;
    
    //Contrutor
    Pessoa(String nome, int dia, int mes, int ano, int altura){
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
    }
    
    Pessoa(String nome){
        this(nome,0,0,0000,0);
        
    }
    
    
    //Metodos
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setNascimento(int dia, int mes, int ano){
    if(dia > 31 || mes > 12 || ano > 2025){
        System.out.println("Data invalida");
    }
    else{
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}
    void setAltura(int altura){
        this.altura = altura;
    }
    
    void getNome(){
        System.out.println("O nome:" + nome);
    }
    

    void getNascimento(){
        System.out.println("Data de nascimento:" + dia +"/" + mes + "/" + ano);
    }

    void getAltura(){
        System.out.println("Altura:"+altura);
    }
    
    int calculaIdade(){
        return (2025 - ano);
    }
    
    void geraDados(){
        System.out.println("===============");
        getNome();
        getNascimento();
        getAltura();
        System.out.println("Idade:" + calculaIdade());
    }
}