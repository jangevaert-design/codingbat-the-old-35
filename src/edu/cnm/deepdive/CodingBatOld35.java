package edu.cnm.deepdive;

/*

Return true if the given non-negative number is a multiple of 3 or 5, but not both.

old35(3) → true
old35(10) → true
old35(15) → false
 */

public class CodingBatOld35 {

  public static void main(String[] args) {
    System.out.printf("for the number %d, the outcome is " + old35(3) + "\n", 3);
    System.out.printf("for the number %d, the outcome is " + old35(10) + "\n", 10);
    System.out.printf("for the number %d, the outcome is " + old35(15) + "\n", 15);
  }

  public static boolean old35(int n) {
    if (n % 3 == 0 && n % 5 == 0) {
      return false;
    }
    if (n % 3 == 0) {
      return true;

    }
    if (n % 5 == 0) {
      return true;
    }
    return false;
  }

}
