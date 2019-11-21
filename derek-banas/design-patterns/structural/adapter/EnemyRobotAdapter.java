public class EnemyRobotAdapter implements EnemyAttacker{
    EnemyRobot enemyRobot ;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void fireWeapon() {
        enemyRobot.smashWithHands();        
    }

    @Override
    public void driveForward() {
            enemyRobot.walkForward();

    }

    @Override
    public void assignDrive(String name) {
        enemyRobot.reactToHuman(name);

    }
    

    
}