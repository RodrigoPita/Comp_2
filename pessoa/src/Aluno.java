public class Aluno extends Pessoa {

    private Conceito[] conceitos;
    private int conceitosDigitados;
    private final long dre;
    private float cra;


    public Aluno(String nome, int anoDeNascimeno, long dre) {
        super(nome, anoDeNascimeno);
        this.dre = dre;
        this.conceitos = new Conceito[100];
        this.conceitosDigitados = 0;
    }

    public void incluirConceito(String disciplina, float nota, int semestre) {
        Conceito novoConceito = new Conceito();
        novoConceito.disciplina = disciplina;
        novoConceito.nota = nota;
        novoConceito.ano = Utils.getAnoCorrente();
        novoConceito.semestre = semestre;

        this.conceitos[this.conceitosDigitados++] = novoConceito;
    }

    public String imprimirHistorico() {
        String historico = "Aluno: " +  this.nome;
        for (Conceito conceito : this.conceitos) {
            historico += "\n" + conceito.toString();
        }
    }

    private class Conceito {
        String disciplina;
        float nota;
        int ano;
        int semestre;

        @Override
        public String toString() {
            return String.format("disciplina: %s -- período: %d/%d -- nota: %.1f", disciplina, ano, semestre, nota);
        }
    }
}
