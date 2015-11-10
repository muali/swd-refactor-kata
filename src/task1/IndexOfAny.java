package task1;

public class IndexOfAny {
  /**
   * Write covering tests + refactor code.
   * In this task signature should stay the same
   */
  public static int indexOfAny(String str, char[] searchChars) {
    final int csLen = str.length();
    for (int i = 0; i < csLen; i++) {
      char currentChar = str.charAt(i);
      for (char searchChar : searchChars) {
        if (currentChar == searchChar)
          return i;
      }
    }
    return -1;
  }
}
