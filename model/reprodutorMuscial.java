package model;

public class reprodutorMuscial extends aparelhoTelefonico {
    protected String nomeMusica;

    public reprodutorMuscial(String nomeMusica) {
        super(nome, modelo);
        this.nomeMusica = nomeMusica;
    }

    public String getNomeMusica() {
        return this.nomeMusica;
    }

    public String setNomeMusica(String nomeMusica) {
        return this.nomeMusica = nomeMusica;
    }

    public String selecionarMusica(String nomeM) {

        System.out.println("Musica selecionada " + this.setNomeMusica(nomeM));
        return nomeM;
    }

    public void tocar() {
        System.out.println("Tocando " + this.getNomeMusica());
    }

    public void pausar() {
        System.out.println("Pausado " + this.getNomeMusica());
    }

}
