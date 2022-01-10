public class Pessoa {

    protected String nome;
    private long cpf;
    private final int anoDeNascimento;

    public Pessoa(String nome, int anoDeNascimento) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
    }

    public int getIdade() {
        int anoCorrente = Utils.getAnoCorrente();
        return anoCorrente - anoDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

}
