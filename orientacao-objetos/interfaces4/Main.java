public class Main{
    static public final void main(String ... args) {

        iMae imae = ()->System.out.println("Interface Mãe");
        iFilha ifilha = () ->System.out.println("Interface iFilha");
        Util.funMae(imae);
        Util.funFilha(ifilha);
        Util. funMae(ifilha);
    }
}