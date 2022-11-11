package model;

public class aparelhoTelefonico {
    protected static String nome;
    protected static String modelo;

    public aparelhoTelefonico(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static void Ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public static void atender() {
        System.out.println("Atendido!");
    }

    public static void iniciarCorreioVoz() {
        System.out.println("Caixa postal!");
    }

}
