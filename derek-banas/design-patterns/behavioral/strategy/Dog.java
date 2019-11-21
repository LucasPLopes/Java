public class Dog extends Animal{
    public Dog() {
        super();
        setSound("Au-au");
        flyingType = new CantFly();
    }

    public Dog(String name, double height, int weight, String favFood, double speed, String sound) {
        super(name, height, weight, favFood, speed, sound);
        flyingType = new CantFly();
    }


    public void digHole() {
        System.out.println("Dug a hole");
    }

    
}