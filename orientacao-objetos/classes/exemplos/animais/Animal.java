package animais;

import animais.Raca;

public class Animal {
    private String nome;
    private Integer idade;
    private Raca raca;

    public Animal(String nome, Integer idade, Raca raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Animal [idade=" + idade + ", nome=" + nome + ", raca=" + raca + "]";
    }
   
    public String getNome(){
        return this.nome;
    }
    public String getRaca(){
        return this.raca.getRaca();
    }
    
}