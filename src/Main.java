import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static final ArrayList<Aluno> alunos = new ArrayList<>();
    private static final ArrayList<Professor> professores = new ArrayList<>();
    private static final ArrayList<Curso> cursos = new ArrayList<>();

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
                    cadastrarCurso();
                    break;
                case 4:
                    matricularAluno();
                    break;
                case 5:
                    listarCursos();
                    break;
                case 6:
                    listarAlunos();
                    break;
                case 7:
                    listarProfessores();
                    break;
                case 8:
                    relatorioCursos();
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

    public static void cadastrarCurso() {

        if (professores.isEmpty()) {
            System.out.println("Para continuar com o cadastro do curso, é necessário ter um professor registrado. Acesse a opção (2) e tente novamente.");
            return;
        }

        System.out.println("Escolha o tipo de curso:");
        System.out.println("1. Curso Presencial");
        System.out.println("2. Curso Online");
        System.out.println("3. Curso Intensivo");

        int choice = input.nextInt();
        Curso novoCurso = null;

        switch (choice) {
            case 1:
                novoCurso = new CursoPresencial();
                break;
            case 2:
                novoCurso = new CursoOnline();
                break;
            case 3:
                novoCurso = new CursoIntensivo();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        input.nextLine();
        System.out.print("Qual a carga horária? ");
        novoCurso.setCargaHoraria(input.nextDouble());
        System.out.println("Escolha o professor responsável por este curso.");
        listarProfessores();
        System.out.println("---------------------------");

        System.out.print("Digite o ID: ");
        novoCurso.setProfessor(professores.get(input.nextInt() - 1));
        System.out.println("Novo Curso cadastrado com sucesso!");
        cursos.add(novoCurso);
    }

    public static void matricularAluno() {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado!");
            return;
        }
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado!");
            return;
        }

        System.out.println("Selecione o curso pelo número:");
        listarCursos();
        int cursoIndex = input.nextInt() - 1;

        if (cursoIndex < 0 || cursoIndex >= cursos.size()) {
            System.out.println("Curso inválido!");
            return;
        }

        System.out.println("Selecione o aluno pelo número:");
        listarAlunos();
        int alunoIndex = input.nextInt() - 1;

        if (alunoIndex < 0 || alunoIndex >= alunos.size()) {
            System.out.println("Aluno inválido!");
            return;
        }

        Curso cursoSelecionado = cursos.get(cursoIndex);
        Aluno alunoSelecionado = alunos.get(alunoIndex);

        cursoSelecionado.matricularAluno(alunoSelecionado);
        alunoSelecionado.setCursoMatriculado(cursoSelecionado);

        System.out.println("Aluno matriculado com sucesso!");
    }

    public static void listarCursos() {
        if(!cursos.isEmpty()) {
            System.out.println("Lista de Cursos:");
            System.out.println("---------------------------");

            for(Curso c : cursos) {
                System.out.println(c.toString());
            }
        }   else {
            System.out.println("Nenhum curso cadastrado!");
        }
    }

    public static void relatorioCursos() {
        if (!cursos.isEmpty()) {
            for (Curso c : cursos) {
                System.out.println("{ tipo='" + c.getNome() + "', certificadoFinal=" + c.calculoCertificado() + "h }");
            }
        }   else {
            System.out.println("Nenhum curso cadastrado.");
        }
    }
}