package iphone;

public class ReprodutorMusical {

    public void tocar(String musica) {
        System.out.println("Tocando a música: " + musica);
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        reprodutor.selecionarMusica("Música A");
        reprodutor.tocar("Música A");
        reprodutor.pausar();
        reprodutor.selecionarMusica("Música B");
        reprodutor.tocar("Música B");
    }
}





