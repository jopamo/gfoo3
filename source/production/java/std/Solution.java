/*
En Route Salute
===============
*/

package std;

public class Solution {
  public static int solution(String s) {
    char ch;
    int goLeft = 0;
    int salutes = 0;

    for (int i = 0; i < s.length(); ++i) {
      ch = s.charAt(i);
      if (ch == '<') {
        goLeft++;
      }
    }

    for (int i = 0; i < s.length(); ++i) {
      ch = s.charAt(i);
      if (ch == '<') {
        goLeft--;
      } else if (ch == '>') {
        salutes += goLeft;
      }
    }
    return salutes * 2;
  }

  public static void main(String []args) {
    System.out.println(Solution.solution("<<>><"));
    System.out.println(Solution.solution(">----<"));
    System.out.println(Solution.solution("><--->-><-><-->-><"));
    System.out.println(Solution.solution(">---->-->-->-><-><-<<->-<<>>><<<-->-->-->-><><-><-<<->-<<>>><"));
  }
}
