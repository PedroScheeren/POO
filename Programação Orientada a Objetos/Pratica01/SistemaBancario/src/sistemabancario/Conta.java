package sistemabancario;

public class Conta {
    
    // ATRIBUTOS 
    
   private final int numeroConta; 
   private final String nomeDono; 
   private double saldo;
   private double limite;
   private static int numeroDeContas;
   
    
   // CONSTRUTORES
   public Conta(String nomeDono, double saldo, double limite){
       this.nomeDono=nomeDono;
       this.saldo = saldo;
       this.limite = limite;
       this.numeroDeContas++;
       this.numeroConta = this.numeroDeContas;
 
   }
   
   public Conta(String nomeDono){
       this(nomeDono,0,0);
   }
    
    // MÉTODOS
    
    
    void depositaValor(double quantidade){
        saldo = saldo + quantidade;
    }
    
    boolean saca(double valor){
        
        if(saldo + limite < valor){
            return false;
        } else {
            saldo = saldo - valor;
            return true;
        }
    }
    
   
    void imprime_dono(){
        
        System.out.println("Titular: " + nomeDono + " | Conta: " + numeroConta);
    }
    

    double devolveSaldo(){
        return saldo;
    }
    

    void transferePara(Conta contaDestino, double valor){
        
        // 1. Tenta sacar da conta atual
        if (saca(valor)) {
            // 2. Deposita na conta de destino, usando o objeto
            contaDestino.depositaValor(valor); 
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
        
    void imprimeDados() {
        
        System.out.println("=== Dados da Conta ===");
        System.out.println("Número da Conta: " + numeroConta + "("+ numeroDeContas +")");
        System.out.println("Nome do Dono: " + nomeDono);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Limite: R$ " + limite);
      
    }
}