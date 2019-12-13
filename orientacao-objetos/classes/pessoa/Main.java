import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa p = null, pLucas;
        LocalDate meuNascimento = LocalDate.of(1995, 12, 7); // ano/mes/dia
        Sexo meuSexo = Sexo.MASCULINO;
        p = new Pessoa();

        System.out.println("Construtor da default de Pessoa");
        System.out.println(p);
        System.out.println();
        System.out.println("Construtor com Sobrecarga de parâmetros de Pessoa");
        pLucas = new Pessoa("Lucas", meuNascimento, "Reinaldo", "Edite", meuSexo);

        System.out.println(pLucas);

    }
}