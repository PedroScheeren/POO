package sistemabancario;

public class SistemaBancario {

    public static void main(String[] args) {
        
    
        Conta conta1 = new Conta("Pedro",1000, 500);
        Conta conta2 = new Conta("Marina", 1000,500); 
     
        
        // Exemplo: depositando valores
        conta1.depositaValor(1000.0);
        conta2.depositaValor(50.0);
        
   
        System.out.println("Saldo da conta 1: R$ " + conta1.devolveSaldo());
        
        conta1.transferePara(conta2, 250.0); 
        conta2.transferePara(conta1, 200);
        
        System.out.println("Novo saldo conta 1: R$ " + conta1.devolveSaldo());
        System.out.println("Novo saldo conta 2: R$ " + conta2.devolveSaldo());
        conta1.imprimeDados();
        conta2.imprimeDados();
        
    }
}