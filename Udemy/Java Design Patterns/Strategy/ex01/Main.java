import controller.ScoreBoard;
import model.Ballon;
import model.Clown;
import model.SquareBallon;

public class Main {
  public static void main(String[] args) {
    ScoreBoard sb = new ScoreBoard();

    System.out.println("Ballons taps score");
    sb.algorithmBase = new Ballon();
    sb.showScore(20, 2);

    System.out.println("Clown taps score");
    sb.algorithmBase = new Clown();
    sb.showScore(20, 2);

    System.out.println("SquareBallon taps score");
    sb.algorithmBase = new SquareBallon();
    sb.showScore(20, 2);

  }
}
