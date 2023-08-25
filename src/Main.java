import Musica.Reprodutor;
import Navegador.Navegador;
import Telefone.Telefone;

public class Main {
    public static void main(String[] args) {
     
        Smartphone smartphone = new Smartphone();
        Navegador navegador = smartphone;
        Reprodutor reprodutor = smartphone;
        Telefone telefone = smartphone;

        navegador.adicionarNovaAba();
        reprodutor.selecionarMusica();
        telefone.atender();


    }
}
