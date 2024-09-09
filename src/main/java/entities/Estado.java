package entities;

public class Estado {
    private int ddd;
    private String nome;
    private String caminhoImagem;

    public Estado(int ddd, String nome, String caminhoImagem) {
        this.ddd = ddd;
        this.nome = nome;
        this.caminhoImagem = caminhoImagem;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }
}
