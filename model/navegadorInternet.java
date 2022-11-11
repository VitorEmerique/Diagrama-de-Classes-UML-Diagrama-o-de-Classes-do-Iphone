package model;

public class navegadorInternet extends aparelhoTelefonico {
    protected String nomeNav;

    public navegadorInternet(String nome, String modelo, String nomeNav) {
        super(nome, modelo);
        this.nomeNav = nomeNav;
    }

    public String getNomeNav() {
        return this.nomeNav;
    }

    public void setNomeNav(String nomeNav) {
        this.nomeNav = nomeNav;
    }

    public void exibirPagina() {

        System.out.println("Exibindo pagina!");

    }

    public void adicionaNovaAba() {

        System.out.println("Nova Aba!");

    }

    public void atualizarPagina() {

        System.out.println("Pagina Atualizada");

    }

}

/*
 * + exibirPagina()
 * 
 * + adicionarNovaAba()
 * 
 * + atualizarPagina()
 */