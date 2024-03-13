package src.lab3;

import java.util.Map;
import java.util.TreeMap;

public class TaskD {
  public static void main(String[] args) {
    TreeMap<Integer, String> originalTreeMap = new TreeMap<>();
    originalTreeMap.put(1, "One");
    originalTreeMap.put(2, "Two");
    originalTreeMap.put(3, "Three");

    TreeMap<Integer, String> copiedTreeMap = new TreeMap<>(originalTreeMap);

    for (Map.Entry<Integer, String> entry : copiedTreeMap.entrySet()) {
      System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
  }
}
