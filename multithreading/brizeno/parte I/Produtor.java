public class Produtor extends Thread{
    private int id;
    private Buffer pilha;
    private int producao;

    public Produtor(int id, Buffer p, int producao){
        this.id = id;
        pilha = p;
        this.producao = producao;
    }

    public void run(){
        for (int i = 0; i < producao; i++) {
            pilha.set(producao, i);
        }
        System.out.println("Produtor #"+id+", concluido.");
    }
}