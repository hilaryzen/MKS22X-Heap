import java.util.Arrays;

public class Driver {
  public static void main(String[] args) {
    int[] array = {3, 5, 2, 9, 14, 1, 100, 200};

    /*
    System.out.println("Testing pushDown");
    MyHeap.pushDown(array, 6, 0);
    System.out.println(Arrays.toString(array));
    MyHeap.pushDown(array, 6, 0);
    System.out.println(Arrays.toString(array));

    int[] array2 = {3, 6, 2, 9, 14, 1};
    System.out.println(" ");
    System.out.println("Testing pushUp");
    MyHeap.pushUp(array2, 4);
    System.out.println(Arrays.toString(array2));
    */

    MyHeap.heapify(array);
    System.out.println(Arrays.toString(array));
  }
}
