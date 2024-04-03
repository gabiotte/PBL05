public class Podcast extends Midia {
    private String descricao;

    public Podcast(String nome, String artista, int duracao, String descricao) {
        super(nome, artista, duracao);
        this.descricao = descricao;
    }
}