import java.io.*;

public class AcceptionInput{

	public static void main (String [] args){
		BufferedReader readIn = new BufferedReader( new InputStreamReader(System.in));
		
		String str = "";
		long number = 0;
		boolean bool = false; 
		
		do{	
			System.out.println("Digite um número: ");
			try{
				str = readIn.readLine();
				System.out.println("Você digitou: "+str);
			}
			catch(IOException e)
			{
				System.out.println(e);
			}

			try{
				number = Long.parseLong(str);
				bool = true;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Não é um número!");
			}
				
			
		}while(bool == false);
		
		
	}	
}
