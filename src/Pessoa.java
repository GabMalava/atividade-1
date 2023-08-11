import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private int idade;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = calcularIdade();
    }

    public Pessoa(String nome, LocalDate dataNascimento, int idade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    public Pessoa(String nome, int anoNascimento, int mesNascimento, int diaNascimento) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        this.idade = calcularIdade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        this.idade = calcularIdade();
    }

    public int getIdade() {
        return idade;
    }

    private int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        return periodo.getYears();
    }


}
