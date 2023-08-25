package Musica;

/**
 * ReprodutorMusica
 */
public class ReprodutorMusica implements Reprodutor{

    public void tocar(){
        System.out.println("Tocando musica");
    }

    public void pausar(){
        System.out.println("MUsica pausada");
    }

    public void selecionarMusica(){
        System.out.println("Selecionando Musica");
    }
    
}