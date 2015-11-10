package task3;

public class Question {
  public final String q, answ1, answ2, answ3, answ4, correct;

  public Question(String q, String answ4, String answ3, String answ2, String answ1, String correct) {
    this.q = q;
    this.answ4 = answ4;
    this.answ3 = answ3;
    this.answ2 = answ2;
    this.answ1 = answ1;
    this.correct = correct;
  }

  public boolean checkAnswer(String answer) {
    return correct.equals(answer);
  }
}
