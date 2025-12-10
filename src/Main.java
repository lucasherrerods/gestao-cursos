import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static final ArrayList<Aluno> alunos = new ArrayList<>();
    private static final ArrayList<Professor> professores = new ArrayList<>();

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
                    cadastrarAluno();
                    break;
                case 2:
                    cadastrarProfessor();
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
                    listarAlunos();
                    break;
                case 7:
                    listarProfessores();
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

    public static void cadastrarAluno() {
        Aluno novoAluno = new Aluno();

        input.nextLine();
        System.out.print("Digite o nome: ");
        novoAluno.setNome(input.nextLine());
        System.out.print("Digite o e-mail: ");
        novoAluno.setEmail(input.nextLine());
        System.out.println("Novo Aluno cadastrado com sucesso!");
        alunos.add(novoAluno);
    }

    public static void listarAlunos() {
        if (!alunos.isEmpty()) {
            System.out.println("Lista de alunos:");
            System.out.println("---------------------------");

            for (Aluno a : alunos) {
                System.out.println(a.toString());
            }
        }   else {
            System.out.println("Nenhum aluno cadastrado!");
        }
    }

    public static void cadastrarProfessor() {
        Professor novoProfessor = new Professor();

        input.nextLine();
        System.out.print("Digite o nome: ");
        novoProfessor.setNome(input.nextLine());
        System.out.print("Digite o e-mail: ");
        novoProfessor.setEmail(input.nextLine());
        System.out.print("Qual a especialidade? ");
        novoProfessor.setEspecialidade(input.nextLine());
        System.out.println("Novo Professor cadastrado com sucesso!");
        professores.add(novoProfessor);
    }

    public static void listarProfessores() {
        if (!professores.isEmpty()) {
            System.out.println("Lista de professores:");
            System.out.println("---------------------------");

            for(Professor p : professores) {
                System.out.println(p.toString());
            }
        }   else {
            System.out.println("Nenhum professor cadastrado!");
        }
    }
}