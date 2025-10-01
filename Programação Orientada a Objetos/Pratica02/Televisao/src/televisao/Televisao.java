package televisao;

import java.util.Scanner;

public class Televisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criar controle remoto inicial
        ControleRemoto controle = new ControleRemoto(10, 5);

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Aumentar Volume");
            System.out.println("2 - Diminuir Volume");
            System.out.println("3 - Aumentar Canal");
            System.out.println("4 - Diminuir Canal");
            System.out.println("5 - Trocar Canal");
            System.out.println("6 - Mostrar Dados");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> controle.aumenta_diminui_volume("+");
                case 2 -> controle.aumenta_diminui_volume("-");
                case 3 -> controle.aumenta_diminui_canal("+");
                case 4 -> controle.aumenta_diminui_canal("-");
                case 5 -> {
                    System.out.print("Digite o canal desejado: ");
                    int canalNovo = sc.nextInt();
                    controle.troca_canal(canalNovo);
                }
                case 6 -> controle.imprime_dados();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}