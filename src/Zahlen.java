import com.sun.security.jgss.GSSUtil;

/**
 * @author jstrat2s
 **/

public class Zahlen {

  /**
   *
   * @param a int
   * @param b int
   * @return int
   */

  public static int addLoop(int a, int b) {

    /*
    Normalfälle:                    Sonderfälle:
      1 + 2   -2 + 3                  3 + -2    -3 + -2
     */
    if (b < 0) {
      if (a > 0) {
        return subLoop(a,b);
      } else {
        return addLoop(Math.abs(a),Math.abs(b))*-1;
      }
    } else {
      while (b > 0) {
        b--;
        a++;
      }
    }
    return a;

    /*
    Testfälle:
      0 + 1
      1 + 0
      -1 + 0
      0 + -1
      -2 + 1
      1 + -2
      -2 + -1
      1 + 2
     */
    
  }

  public static int subLoop(int a, int b) {
    while (b>0) {
      b--;
      a--;
    }
    return a;
  }

  public static int mulLoop(int a, int b) {
    int counter = a;
    while (b>1) {
      a = addLoop(a,counter);
      b--;
    }
    return a;
  }

  public static int divLoop(int a, int b) {
    int counter = 0;
    while (a>=b) {
      a = subLoop(a,b);
      counter++;
    }
    return counter;
  }

  public static int modLoop(int a, int b) {
    return subLoop(a,mulLoop(b,divLoop(a,b)));
  }

  public static int powLoop(int a, int b) {
    int counter = a;
    if (a == 0) {
      return 0;
    } else if (b == 0) {
      return 1;
    } else if (a == 1) {
      return 1;
    } else {
      while (b > 1) {
        a = mulLoop(a,counter);
      }
      return a;
    }
  }

  public static void main(String[] args) {
    System.out.println(modLoop(7,4));
  }

}
