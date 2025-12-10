import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("---------------------------");
            System.out.println("Sistema de Gestão de Cursos");
            System.out.println("---------------------------");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Cadastrar professor");
            System.out.println("3. Cadastrar curso");
            System.out.println("4. Matricular aluno em curso");
            System.out.println("5. Listar cursos");
            System.out.println("6. Listar alunos");
            System.out.println("7. Listar professores");
            System.out.println("8. Relatório de cursos (certificado final)");
            System.out.println("0. Sair");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Cadastrando aluno");
                    break;
                case 2:
                    System.out.println("Cadastrando professor");
                    break;
                case 3:
                    System.out.println("Cadastrando curso");
                    break;
                case 4:
                    System.out.println("Matriculando aluno");
                    break;
                case 5:
                    System.out.println("Listando cursos");
                    break;
                case 6:
                    System.out.println("Listando alunos");
                    break;
                case 7:
                    System.out.println("Listando professores");
                    break;
                case 8:
                    System.out.println("Relatório dos cursos");
                    break;
                case 0:
                    System.out.println("Logout efetuado.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}