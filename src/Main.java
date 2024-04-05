import java.util.Scanner;

public class Main   {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Gabi", "gabi@email", "gabi1234", "foto","premium","gabis");
        Artista artista1 = new Artista("Flavio", "favio@email", "flavio1234","foto","gabi",10000000);
        Podcast podcast1 = new Podcast("Ep 1", "Flavio", 2,"oiiiii");
        Musica musica1 = new Musica("Gabi", "Flavio",3,"Gabi");
        //blabla

        while (true) {
            System.out.println("---- Menu ----");
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Cadastrar artista");
            System.out.println("3. Publicar música");
            System.out.println("4. Pesquisar músicas por artista");
            System.out.println("0. Sair");
            System.out.println("O que você deseja fazer? ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("---- Criando usuário ----");

                String nome = scanner.nextLine();
                System.out.println("Nome: ");
                String email = scanner.nextLine();
                System.out.println("Email: ");
                String senha = scanner.nextLine();
                System.out.println("Senha: ");
                String foto = scanner.nextLine();
                System.out.println("Foto: ");
                String tipoDeConta = scanner.nextLine();
                System.out.println("Tipo de conta (premium ou free): ");
                String username = scanner.nextLine();
                System.out.println("Username: ");

                Usuario usuario = new Usuario(nome, email, senha, foto, tipoDeConta, username);
                System.out.println("Usuário " + usuario.getNome() + " criado");
            }
            else if (option == 2) {
                System.out.println("Cadastrando artista");

                String nome = scanner.nextLine();
                System.out.println("Nome: ");
                String email = scanner.nextLine();
                System.out.println("Email: ");
                String senha = scanner.nextLine();
                System.out.println("Senha: ");
                String foto = scanner.nextLine();
                System.out.println("Foto: ");

                Artista artista = new Artista(nome, email, senha, foto,null, 0);
            }
            else if (option == 3) {
                System.out.println("Publicar música");
            }
            else if (option == 4) {
                System.out.println("Alterar senha");
            }
            else if (option == 0) {
                System.out.println("sair");
            }
            else {
                System.out.println("Erro");
            }

        }
    }
}