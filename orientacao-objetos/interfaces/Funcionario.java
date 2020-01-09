// Implementacao da interface Comparable

public class Funcionario implements Comparable<Funcionario> {
    private Long id;
    private String nome;
    private String cargo;

    private static Long ID_AUTO_INCREMENT = 0L;

    public Funcionario() {
        ID_AUTO_INCREMENT += 1L;
        id = ID_AUTO_INCREMENT;
    }

    public Funcionario(String nome, String cargo) {
        this();
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public int compareTo(Funcionario outro) {
        return Long.compare(id, outro.id);
    }

    public static Funcionario geraFuncionario(String n, String c) {
        return new Funcionario(n, c);

    }
    
    @Override
    public String toString() {
        return "Funcionario [cargo=" + cargo + ", id=" + id + ", nome=" + nome + "]";
    }

    public static void main(String[] args) {
        Funcionario funA,funB;
        
        funA = geraFuncionario("Lucas", "Programador");
        funB =  geraFuncionario("Jesus", "Scrum master");

        System.out.println(funA);
        System.out.println(funB);

        if(funA.compareTo(funB) == -1)
            System.out.println("FunA foi criado primeiro  ->  "+funA.compareTo(funB));


    }

  
}