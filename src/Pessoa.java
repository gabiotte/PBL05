public class Pessoa {
    protected String nome;
    protected String email;
    protected String senha;
    protected String foto;

    protected Pessoa(String nome, String email, String senha, String foto) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.foto = foto;
    }

    public String getNome() {
        return this.nome;
    }
    public String getSenha() {
        return this.senha;
    }
    public void setSenha(String nova_senha) {
        this.senha = nova_senha;
    }
    public String getEmail() {
        return this.email;
    }
}


