import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CadastroFesta {
    // Lista para armazenar as festas cadastradas
    private static List<Festa> festasCadastradas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir informações da festa
        System.out.println("Informe o nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe o sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Informe o telefone:");
        String telefone = scanner.nextLine();

        System.out.println("Informe o email:");
        String email = scanner.nextLine();

        // Verificar se já foi cadastrado
        if (jaCadastrado(email)) {
            System.out.println("Esta festa já foi cadastrada anteriormente.");
        } else {
            // Se não foi cadastrado, cadastrar
            Festa festa = new Festa(nome, sobrenome, telefone, email);
            festasCadastradas.add(festa);
            System.out.println("Festa cadastrada com sucesso!");
        }

        scanner.close();
    }

    // Método para verificar se o email já foi cadastrado
    private static boolean jaCadastrado(String email) {
        for (Festa festa : festasCadastradas) {
            if (festa.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
}

// Classe Festa
class Festa {
    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;

    public Festa(String nome, String sobrenome, String telefone, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}