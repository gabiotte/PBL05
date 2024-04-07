public class Usuario extends Pessoa {
    public String tipoDeConta;
    public String username;

    public Usuario(String nome, String email, String senha, String foto, String tipoDeConta, String username) {
        super(nome, email, senha, foto);
        this.tipoDeConta = tipoDeConta;
        this.username = username;
    }
    public String getUsername() {
        return this.username;
    }
}