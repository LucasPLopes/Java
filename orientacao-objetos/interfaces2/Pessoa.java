public class Pessoa implements Fun {
    private String nome;

    @Override
    public void fun() {
        System.out.println(String.format("%s tendo diversão", nome));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    


}