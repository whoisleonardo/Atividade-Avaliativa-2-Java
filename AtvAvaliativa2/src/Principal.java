public class Principal {
    public static void main(String[] args) {
        
        GerenciadorPessoas gerenciador = new GerenciadorPessoas();
        int op;
        String nome, email;
        int idade;

        do {
            System.out.println("1 - Adicionar Aluno");
            System.out.println("2 - Adicionar Professor");
            System.out.println("3 - Listar Todos");
            System.out.println("4 - Listar Alunos");
            System.out.println("5 - Listar Professores");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:");
            op = Console.lerInt();

            switch(op){
                case 1:

                    System.out.println("Digite o nome do aluno:");
                    nome = Console.lerString();
                    
                    System.out.println("Digite a idade do aluno:");
                    idade = Console.lerInt();
                    
                    System.out.println("Digite o email do aluno:");
                    email = Console.lerString();
                    
                    System.out.println("Digite a matrícula do aluno:");
                    String matricula = Console.lerString();
                    
                    System.out.println("Digite o curso do aluno:");
                    String curso = Console.lerString();

                    Aluno aluno = new Aluno(nome, idade, email, matricula, curso);
                    gerenciador.adicionarPessoa(aluno);
                    
                    break;

                case 2:
                    System.out.println("Digite o nome do professor:");
                    nome = Console.lerString();

                    System.out.println("Digite a idade do professor:");
                    idade = Console.lerInt();

                    System.out.println("Digite o email do professor:");
                    email = Console.lerString();

                    System.out.println("Digite a disciplina do professor:");
                    String disciplina = Console.lerString();

                    System.out.println("Digite a quantidade de turmas do professor:");
                    int qtdeTurmas = Console.lerInt();

                    Professor professor = new Professor(nome, idade, email, disciplina, qtdeTurmas);
                    gerenciador.adicionarPessoa(professor);
                    
                    break;

                case 3:
                    System.out.println("Listando Todos");
                    gerenciador.listarPessoas();
                    break;
                case 4:
                    System.out.println("Listando Alunos");
                    gerenciador.listarAlunos();
                    break;
                case 5:
                    System.out.println("Listando Professores");
                    gerenciador.listarProfessores();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 0);
    System.out.println("Programa encerrado.");
    }
}
