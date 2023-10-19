package iphone;

public class NavegarNaInternet {

    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web: " + url);
    }

    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com a página da web: " + url);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página da web.");
    }

    public static void main(String[] args) {
        NavegarNaInternet navegador = new NavegarNaInternet();

        navegador.exibirPagina("https://www.google.com");
        navegador.adicionarNovaAba("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        navegador.atualizarPagina();
    }
}
