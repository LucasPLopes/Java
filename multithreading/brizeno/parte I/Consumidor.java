
public class Consumidor extends Thread{
    private int id;
    private Buffer pilha;
    private int total;
    
    public Consumidor(int id, Buffer buffer, int total){
        this.id = id;
        this.pilha = buffer;
        this.total = total;
    }

    public void run(){
        for (int i = 0; i < total; i++) {
            pilha.get(id);
        System.out.println("Consumidor #"+ id+ ", concluido.");
        }
    }
}

