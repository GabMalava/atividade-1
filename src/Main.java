import java.time.LocalDate;

public class Main { public static void main(String[] args) {
    LocalDate dataNascimento = LocalDate.of(1990, 5, 15);
    Pessoa pessoa1 = new Pessoa("João", dataNascimento);
    Pessoa pessoa2 = new Pessoa("Maria", dataNascimento, 30);
    Pessoa pessoa3 = new Pessoa("Carlos", 1985, 8, 10);

    System.out.println("Nome: " + pessoa1.getNome());
    System.out.println("Data de Nascimento: " + pessoa1.getDataNascimento());
    System.out.println("Idade: " + pessoa1.getIdade() + " anos");

    System.out.println("Nome: " + pessoa2.getNome());
    System.out.println("Data de Nascimento: " + pessoa2.getDataNascimento());
    System.out.println("Idade: " + pessoa2.getIdade() + " anos");

    System.out.println("Nome: " + pessoa3.getNome());
    System.out.println("Data de Nascimento: " + pessoa3.getDataNascimento());
    System.out.println("Idade: " + pessoa3.getIdade() + " anos");
}
}
