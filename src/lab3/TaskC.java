package src.lab3;

import java.util.LinkedList;

public class TaskC {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>(); 
  
    list.add("1"); 
    list.add("2"); 
    list.add("3"); 
    list.add("4"); 
    list.add("5"); 

    list.clear();

    System.out.println("List after cleaning elements");
  }
}
