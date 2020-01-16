public class Main{
    static public final void main(String ... args) {

        iMae imae = ()->System.out.println("Interface Mãe");
        iFilha ifilha = () ->System.out.println("Interface iFilha");
        iFilha ifilha2 = new iFilha(){
        
            @Override
            public void fun() {
                System.out.println("Java 7 Interface iFilha");
            }
        };
        Util.funMae(imae);
        Util.funFilha(ifilha);
        Util. funMae(ifilha);
        Util.funMae(ifilha2);
    }
}