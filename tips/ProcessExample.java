import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProcessExample{
    public static void main(String[] args) {
        
        ProcessBuilder pb = new ProcessBuilder();

        String command = "echo  'Olá, mundo !'";
        String prompt = "bash";
        String op = "-c";

        pb.command(prompt,op,command);
     
        processoSO(pb);


    }

    private static void processoSO(ProcessBuilder pb) {
        try{
            Process process = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
            
            
            int exitCode = process.waitFor();
            System.out.println("\nExited with error : "+ exitCode);
        }catch(IOException e){
        }catch( InterruptedException e){
        }
    }

}
