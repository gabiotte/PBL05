public class Musica extends Midia {

    private String album;

    public Musica(String nome, String artista, int duracao, String album) {
        super(nome, artista, duracao);
        this.album = album;
    }
}