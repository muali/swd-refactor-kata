package task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game implements Iterable<Question> {
  private List<Question> questions = new ArrayList<>();

  public void addQuestion(String q, String answ1, String answ2, String answ3, String answ4, String correctAnsw) {
    questions.add(new Question(q, answ1, answ2, answ3, answ4, correctAnsw));
  }

  @Override
  public Iterator<Question> iterator() {
    return questions.iterator();
  }
}
