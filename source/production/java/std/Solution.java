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
      //count all going left for the next pass
      if (ch == '<') {
        goLeft++;
      }
    }

    for (int i = 0; i < s.length(); ++i) {
      ch = s.charAt(i);

      //first subtract any lone employees going left toward end of hall
      if (ch == '<') {
        goLeft--;
      //all the lefts after the first right will be saluting this one
      } else if (ch == '>') {
        salutes += goLeft;
      }
    }
    //each employee salutes
    return salutes * 2;
  }

  public static void main(String []args) {
    System.out.println(Solution.solution("<<>><"));
    System.out.println(Solution.solution(">----<"));
    System.out.println(Solution.solution("<-><->-<<"));
    System.out.println(Solution.solution(">---->-->-->-><-><-<<->-<<>>><<<-->-->-->-><><-><-<<->-<<>>><"));
  }
}
