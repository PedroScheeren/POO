/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciocio2;

/**
 *
 * @author pedrodefreitas
 */
public class Elevador {
    
    //atributos
    private int andar_atual;
    private int num_pessoas;
    private int num_total_andares;
    private int num_total_pessoas;
    
    
    
    //contrutores
    Elevador(){
        this.andar_atual = 0;
        this.num_pessoas = 0;
        this.num_total_andares = 0;
        this.num_total_pessoas = 0;
    }
    
    
    
    
    //metodos
    
    void inicializa(int num_total_pessoas, int num_total_andares){
        this.num_total_pessoas = num_total_pessoas;
        this.num_total_andares = num_total_andares;
    }
    
    void entra(){
        if(num_pessoas < num_total_pessoas){
                num_pessoas++;
                System.out.println("Subiu uma pessoa!");
        }    
        else
            System.out.println("Capacidade máxima atingida");
    }
    
    void sai(){
        if(num_pessoas > 0)
            num_pessoas--;
        else
            System.out.println("O elevador esta vazio");
    }
    void sobe(){
        if(andar_atual < num_total_andares){
           andar_atual++;
            System.out.println("Subiu o andar!");
        }
        else
            System.out.println("Elevador esta no ultimo andar");
    }
    void desce(){
        if(andar_atual > 0)
           andar_atual--;
        else
            System.out.println("Elevador esta no terreo");
    }
        
}
