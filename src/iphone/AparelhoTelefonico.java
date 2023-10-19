package iphone;

public class AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    public static void main(String[] args) {
        AparelhoTelefonico telefone = new AparelhoTelefonico();

        telefone.ligar("123-456-7890");
        telefone.atender();
        telefone.iniciarCorreioVoz();
    }
}
