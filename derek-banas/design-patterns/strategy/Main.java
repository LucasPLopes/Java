public class Main{
    public static void main(String[] args) {
        Animal  dog = new Dog();
        Bird picaPau = new Bird();
        Animal chicken = new Bird();

        Dog dog2 = (Dog) dog;
        dog2.digHole();

        chicken.setFlyingAbility(new CantFly());
        picaPau.setSound("peck peck");
        
        System.out.println("Chiken: "+ chicken.tryToFly());
        System.out.println("Dog: "+dog.tryToFly());
        System.out.println("Pica-pau (Wood-Pecker): "+picaPau.tryToFly());
    }
}