public class Welcome {
    private static final String MENSAGEM = "Seja bem-vindo ao  %s";

    public static void welcomeHome(Bank bank) {
        System.out.println(String.format(MENSAGEM, bank.getName()));
    }
}