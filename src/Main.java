import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main   {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Gabi", "gabi@email", "gabi1234", "foto","premium","gabis");
        Artista artista1 = new Artista("Flavio", "favio@email", "flavio1234","foto","gabi",10000000);
        Podcast podcast1 = new Podcast("Ep 1", "Flavio", 2,"oiiiii");
        Musica musica1 = new Musica("Gabi", "Flavio",3,"Gabi");
        //blabla

        List<Pessoa> lista_pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---- Menu ----");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Cadastrar artista");
            System.out.println("3. Publicar música");
            System.out.println("4. Alterar senha do usuário1");
            System.out.println("0. Sair");
            System.out.println("O que você deseja fazer? ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("---- Criando usuário ----");

                // Não está lendo o nome:
                System.out.println("Nome: ");
                String nome = scanner.nextLine();

                System.out.println("Email: ");
                String email = scanner.nextLine();
                System.out.println("Senha: ");
                String senha = scanner.nextLine();
                System.out.println("Foto: ");
                String foto = scanner.nextLine();
                System.out.println("Tipo de conta (premium ou free): ");
                String tipoDeConta = scanner.nextLine();
                System.out.println("Username: ");
                String username = scanner.nextLine();

                Usuario usuario = new Usuario(nome, email, senha, foto, tipoDeConta, username);
                lista_pessoas.add(usuario);
                System.out.println("Usuário " + usuario.getUsername() + " criado");

            } else if (option == 2) {
                System.out.println("Cadastrando artista");

                String nome = scanner.nextLine();
                System.out.println("Nome: ");
                String email = scanner.nextLine();
                System.out.println("Email: ");
                String senha = scanner.nextLine();
                System.out.println("Senha: ");
                String foto = scanner.nextLine();
                System.out.println("Foto: ");

                Artista artista = new Artista(nome, email, senha, foto, null, 0);

            } else if (option == 3) {
                String nome = scanner.nextLine();
                System.out.println("Nome: ");
                String artista = scanner.nextLine();
                System.out.println("Artista: ");
                int duracao = scanner.nextInt();
                System.out.println("Duração: ");
                String album = scanner.nextLine();
                System.out.println("Álbum: ");

                Musica musica = new Musica(nome, artista, duracao, album);

                System.out.println("Publicando música...");

            } else if (option == 4) {
                System.out.println("Faça login");

                // Não está lendo o email
                System.out.println("Email: ");
                String email = scanner.nextLine();

                for (Pessoa pessoa : lista_pessoas) {
                    if (pessoa.getEmail() == email) {
                        while (true) {
                            String senha_antiga = scanner.nextLine();
                            System.out.println("Senha: ");
                            if (senha_antiga == pessoa.getSenha()) {
                                String senha_nova = scanner.nextLine();
                                System.out.println("Nova senha: ");
                                usuario1.setSenha(senha_nova);
                                System.out.println("Senha alterada com sucesso");
                                break;
                            }

                            System.out.println("Senha incorreta");
                            int option_senha = 0;
                            while (true) {
                                System.out.println("1. Tentar novamente");
                                System.out.println("2. Voltar");
                                option_senha = scanner.nextInt();
                                System.out.println("Opção: ");
                                if (option_senha == 1 || option_senha == 2) {
                                    break;
                                }
                                System.out.println("Opção inválida");
                            }

                            if (option_senha == 1) {
                                continue;
                            }
                            break;
                        }
                        break;
                    }
                }

            } else if (option == 0) {
                    System.out.println("Saindo...");
                    System.exit(0);
                }
            else {
                    System.out.println("Opção inválida");
                }

        }
    }
}