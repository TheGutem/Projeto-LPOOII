import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        cadastrarProfessor(entrada);
        cadastrarEstudante();
        cadastrarTurma();
    }

    public static void cadastrarProfessor(Scanner entrada) {
        System.out.println("Informe o nome do professor: \n");
        String nome = entrada.nextLine();
    }

    public static void cadastrarEstudante() {
        System.out.println("Cadastrar estudante...");
    }

    public static void cadastrarTurma() {
        System.out.println("Cadastrar turma...");
    }
}
