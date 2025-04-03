package U10T1D3;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numList = new ArrayList<Integer>();
    numList.add(5);
    numList.add(7);
    numList.add(8);
    numList.add(5);
    numList.add(6);
    numList.add(5);
    numList.add(4);
    numList.add(1);

    int value = mystery(numList, 5);
    System.out.println(value);
    System.out.println(numList);
  }

  public static int mystery(ArrayList<Integer> list, int num) {
    if (list.size() == 0) {
      return 0;
    }
    int current = list.remove(0); // be careful here!
    if (current == num) {
      return 1 + mystery(list, num);
    } else {
      return mystery(list, num);
    }
  }
}
