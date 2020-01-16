
public class Main{
    public static void main(String[] args) {
        
        Pessoa lucas = new Pessoa();
        lucas.setNome("Lucas Lopes");

        Util.usaInterfaceFun(lucas);
        Fun interfaceFuncional = ()-> {System.out.println("Interface usando lambda");};
        Fun interfaceFuncional2 = ()-> System.out.println("Interface2 usando lambda");

        Util.usaInterfaceFun(interfaceFuncional);
        Util.usaInterfaceFun(interfaceFuncional2);
        Util.usaInterfaceFun(()->{
            System.out.println(" usando lambda na interface "+Fun.FUN);

        });
        

    }
}