
public class ListaLigada{

    static class No{
        int info;
        No prox;
        public No(int info){
            this.info = info;
        }
    }

    No cabeca = null;

    public void inserirNaCabeca(No no){
        no.prox= cabeca;
        cabeca = no;

    }
    public void inserirNaCauda(No no){
        if(cabeca == null){
            cabeca = no;
        }else{
            No tmp = cabeca;
            while(tmp.prox != null){
                tmp = tmp.prox;
            }
            tmp.prox = no;
        }
    }

    public void removerCabeca(){
        cabeca = cabeca.prox;
    }

    public void imprimir(){
        No tmp = cabeca;
        String temProx="";
        while(tmp!= null){
            temProx = tmp.prox!= null? " -> " : "";
            System.out.print(tmp.info +temProx);
            tmp = tmp.prox;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.inserirNaCabeca(new No(1));
        lista.inserirNaCabeca(new No(2));
        lista.inserirNaCabeca(new No(3));
        lista.inserirNaCabeca(new No(4));
        lista.inserirNaCabeca(new No(5));
        lista.inserirNaCabeca(new No(6));
        lista.inserirNaCabeca(new No(7));
        lista.inserirNaCauda(new No(8));

        lista.imprimir();
        lista.removerCabeca();
        lista.imprimir();
    }

}