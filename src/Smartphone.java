import Musica.Reprodutor;
import Navegador.Navegador;
import Telefone.Telefone;

public class Smartphone implements Reprodutor, Navegador, Telefone {
    

    @Override
    public void tocar() {
        System.out.println("Tocando musica via Smartphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica via Smartphone");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method st
        System.out.println("Selecioando musica via Smartphone");
    
    }

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method 
        System.out.println("Exibindo página via Smartphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicioando nova aba via Smartphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando nova página via Smartphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo via Smartphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz via Smartphone");
    }

   
}
