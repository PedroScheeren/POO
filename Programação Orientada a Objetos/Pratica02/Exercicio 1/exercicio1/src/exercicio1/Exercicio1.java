/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

/**
 *
 * @author pedrodefreitas
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Pedro", 11, 12, 2005, 183);
        Pessoa p2 = new Pessoa("Marina");
        
        
        p2.setNascimento(02,12,2005);
        p2.setAltura(170);
        p1.getNome();
        p1.setNome("Pedro de Freitas");
        
        
        
        p1.geraDados();
        p2.geraDados();
        
    d}
    
}
