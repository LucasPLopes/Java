public class Principal {
    public static void main(String[] args) {

        EnemyTank rx7tank = new EnemyTank();
        EnemyRobot fredTheRobot = new EnemyRobot();
        EnemyAttacker robotAdpater = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The robot");

        fredTheRobot.reactToHuman("James");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();
        line();

        System.out.println("The enemy tank");

        rx7tank.assignDrive("Frank, the human");
        rx7tank.driveForward();
        rx7tank.fireWeapon();
        line();

        System.out.println("The robot with adapter");
        robotAdpater.assignDrive("Neo");
        robotAdpater.driveForward();
        robotAdpater.fireWeapon();
        line();





    }

    private static void line() {
        System.out.println("--------------------");
    }
}