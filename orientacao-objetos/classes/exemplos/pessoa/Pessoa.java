package pessoa;
import java.time.LocalDate;

public class Pessoa {

    // Propriedades

    private String nome;
    private LocalDate nascimento; // classe para manipular Data no SE 8
    private String pai;
    private String mae;
    private Sexo sexo; // Enum para o sexo

    public Pessoa() {
        nome = "Fulano";
        nascimento = LocalDate.now();
        pai = "Sicrano";
        mae = "Fulana";
        sexo = Sexo.MASCULINO;
    }

    // Sobrecarga
    public Pessoa(String nome, LocalDate nascimento, String pai, String mae, Sexo sexo) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.pai = pai;
        this.mae = mae;
        this.sexo = sexo;
    }

    // Na nova API de data do SE 8, o mês começa com 1 e dia tb, antes começava com
    // 0
    public void alteraNascimento(int dia, int mes, int ano) {
        this.nascimento = LocalDate.of(ano, mes, dia);

    }

    // Sobrescrita
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();// Montagem dinâmica de Strings

        sb.append("Nome=  " + this.nome + ",");
        sb.append("Mae=  " + this.mae + ",");
        sb.append("Pai=  " + this.pai + ",");
        sb.append("Nascimento=  " + this.nascimento + "");

        return sb.toString();
    }

}