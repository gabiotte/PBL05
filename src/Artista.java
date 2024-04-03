public class Artista extends Pessoa {
    private String album;
    private int ouvintesMensais;


    public Artista(String nome, String email, String senha, String foto, String album, int ouvintesMensais) {
        super(nome, email, senha, foto);
        this.album = album;
        this.ouvintesMensais = ouvintesMensais;
    }
}