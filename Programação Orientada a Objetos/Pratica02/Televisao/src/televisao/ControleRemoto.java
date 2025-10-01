package televisao;

public class ControleRemoto {

    // atributos (sem static)
    private int volume;
    private int canal;

    // Construtor
    public ControleRemoto(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    // métodos
    void aumenta_diminui_volume(String opcao) {
        if (opcao.equals("+")) {
            this.volume++;
        } else {
            this.volume--;
        }
    }

    void aumenta_diminui_canal(String opcao) {
        if (opcao.equals("+")) {
            this.canal++;
        } else {
            this.canal--;
        }
    }

    void troca_canal(int canalDesejado) {
        if (canalDesejado > 0) {
            this.canal = canalDesejado;
        } else {
            System.out.println("Canal inválido");
        }
    }

    void imprime_dados() {
        System.out.println("O canal é " + canal);
        System.out.println("O volume é " + volume);
    }
}
