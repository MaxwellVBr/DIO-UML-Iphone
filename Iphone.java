public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

    public void tocar() {
        System.out.println("Reproduzindo música no iPhone.");
    }

    public void pausar() {
        System.out.println("Música pausada no iPhone.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música no iPhone: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada no iPhone.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iPhone.");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página no iPhone: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do iPhone.");
    }
    
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador do iPhone.");
    }

}