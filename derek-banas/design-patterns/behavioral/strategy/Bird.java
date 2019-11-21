public class Bird extends Animal{

    public Bird() {
        super();
        setSound("tweet");
        flyingType =new  ItFlys();
    }

    public Bird(String name, double height, int weight, String favFood, double speed, String sound) {
        super(name, height, weight, favFood, speed, sound);
        flyingType = new ItFlys();
    }

    
}