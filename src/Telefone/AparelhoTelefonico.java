package Telefone;

/**
 * AparelhoTelefonico
 */
public class AparelhoTelefonico implements Telefone{

    public void exibirPagina(){
        System.out.println("Exibindo página");
    }

    public void atender(){
        System.out.println("Atendendo telefone");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }
    
}