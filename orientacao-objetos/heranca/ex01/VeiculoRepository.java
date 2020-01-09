import java.util.List;
import java.util.ArrayList;

public class VeiculoRepository{
    
    public static List<Veiculo> repositorio = new ArrayList<>();


    public static void add(Veiculo v){
        repositorio.add(v);
    }
    public static  Veiculo get(int i){
        return repositorio.get(i);
    }

    public static Veiculo remove(int i ){
        return repositorio.remove(i);
    }

    public static boolean atualiza(Veiculo v){
        repositorio.remove(v);
        return repositorio.add(v);
    } 

}