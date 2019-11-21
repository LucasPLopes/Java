//SIMPLES SINGLETON PATTERN
public class Singleton{
    private static Singleton firstInstance  = null;
    
    private Singleton(){}
    
    public Singleton getInstance(){
        if( firstInstance == null)
            firstInstance = new Singleton();
        return firstInstance;
    }

}