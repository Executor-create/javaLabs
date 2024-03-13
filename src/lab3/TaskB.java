package src.lab3;

import java.util.TreeSet;

public class TaskB {
  public static void main(String[] args) {
    TreeSet<Integer> treeSet = new TreeSet<>();

    treeSet.add(5);
    treeSet.add(3);
    treeSet.add(8);
    treeSet.add(1);
    treeSet.add(7);

    System.out.println("Elements of a set of trees:");
    for (Integer element : treeSet) {
      System.out.println(element);
    }
  }
}
