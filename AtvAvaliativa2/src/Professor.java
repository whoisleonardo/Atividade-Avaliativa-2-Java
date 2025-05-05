public class Professor extends Pessoa {

    private String disciplina;
    int qtdeTurmas;
    
    public Professor(String nome, int idade, String email, String disciplina, int qtdeTurmas) {
        super(nome, idade, email);
        this.disciplina = disciplina;
        this.qtdeTurmas = qtdeTurmas;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getQtdeTurmas() {
        return qtdeTurmas;
    }

    public void setQtdeTurmas(int qtdeTurmas) {
        this.qtdeTurmas = qtdeTurmas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Disciplina: " + disciplina + ", Quantidade de Turmas: " + qtdeTurmas;
    }
}
