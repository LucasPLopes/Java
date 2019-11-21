public class Animal{
    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;
    //in the original example is a public property
    protected Flys flyingType;

    public Animal() {
    }

    public Animal(String name, double height, int weight, String favFood, double speed, String sound) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.favFood = favFood;
        this.speed = speed;
        this.sound = sound;
    }

    public void setFlyingAbility(Flys newFlyType){		
		flyingType = newFlyType;	
	}

    public String tryToFly(){
        return flyingType.fly();
    }
    public double getWeight(){ return weight; }
	
	public void setFavFood(String newFavFood){ favFood = newFavFood; }
	public String getFavFood(){ return favFood; }
	
	public void setSpeed(double newSpeed){ speed = newSpeed; }
	public double getSpeed(){ return speed; }
	
	public void setSound(String newSound){ sound = newSound; }
    public String getSound(){ return sound; }
    
}