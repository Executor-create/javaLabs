package src.lab3;

public class TaskA {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};

    int index1 = 1;
    int index2 = 3;

    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;

    for (int num : array) {
        System.out.print(num + " ");
    }
}
}
