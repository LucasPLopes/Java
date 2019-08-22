public class Main{
    public static void main(String[] args) {
        Buffer  bufferCompartilhado = new Buffer();
        Produtor prod1 = new Produtor(1,bufferCompartilhado,5);
        Produtor prod2 = new Produtor(2,bufferCompartilhado,5);
        Consumidor cons1 = new Consumidor(1, bufferCompartilhado, 2);
        Consumidor cons2 = new Consumidor(2, bufferCompartilhado, 8);


        prod1.start();
        cons1.start();
        prod2.start();
        cons2.start();
    }
}
