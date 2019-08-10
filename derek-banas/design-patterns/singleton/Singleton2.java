import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton2{
    private static Singleton2 firstInstance  = null;

    String[] scrabbleLetters = 
            {"a", "a", "a", "a", "a", "a", "a", "a", "a",
			"b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e", 
			"e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", 
			"h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l", 
			"l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o", 
			"o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", 
			"r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u", 
			"u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};  
    
    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));
    static boolean firstThread = true;

    private Singleton2(){}
    
    // public static Singleton2 getInstance(){
    //única instacia para todas as threads
    public static synchronized Singleton2 getInstance(){
        if( firstInstance == null)
            {
                if(firstThread){
                    firstThread = false;
                    Thread.currentThread();
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                // firstInstance = new Singleton2(); ou
                synchronized(Singleton2.class){
                    if(firstInstance == null)
                        {
                            firstInstance = new Singleton2();
                            Collections.shuffle(firstInstance.letterList);
                        }
                }

            }
        return firstInstance;
    }

    public LinkedList<String> getLetterList(){
        return firstInstance.letterList;
    }

    public LinkedList<String> getTiles(int howManyTiles){
        LinkedList<String>  tiles = new LinkedList<String>();
        
        for (int i = 0; i < howManyTiles; i++) {

            tiles.add(firstInstance.letterList.remove(0)); 
        }
        return tiles; 
    }

}