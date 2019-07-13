import java.util.ArrayList;

public class Principal {

    public static void main(String []args){
            ArrayList<Produto> produtos = new ArrayList<>();

            produtos.add(new Produto(1,"Notebook",2700.0, 25, "Lenovo"));
            produtos.add(new Produto(2,"Notebook",3500.0, 15, "Dell"));
            produtos.add(new Produto(3,"Notebook",4500.0, 5, "Apple"));
            produtos.add(new Produto(4,"Notebook",2500.0, 25, "Lenovo"));

            System.out.println("Inicio da utilização do método de filter\n");

            produtos.stream()
                    .filter(p -> p.getId() > 0  && p.getFabricante().equalsIgnoreCase("Lenovo") )
                    .forEach(p->
                        {
                            System.out.println(p.toString());
                        }                 
                    );
        
    }
}