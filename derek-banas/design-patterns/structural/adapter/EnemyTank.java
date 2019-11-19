import java.util.Random;

public class EnemyTank implements EnemyAttacker {

    private int power = 10;
    private int speed = 5;

    Random generator = new Random();

    @Override
    public void assignDrive(String name) {
        System.out.println(name + " is driving the tank");
    }

    @Override
    public void driveForward() {
        int movement;
        movement = generator.nextInt(speed) + 1;
        System.out.println("Enemy Tank moves "+ movement+ " spaces");

    }

    @Override
    public void fireWeapon() {
        int fire = 0;
        fire = generator.nextInt(power) + 1;
        System.out.println("Enemy Tank does " + fire + " damage");
    }

}