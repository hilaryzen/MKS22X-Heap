import java.util.Arrays;

public class Driver {
  public static void main(String[] args) {
    int[] array = {3, 5, 2, 9, 14, 1};
    MyHeap.pushDown(array, 6, 0);
    System.out.println(Arrays.toString(array));
  }
}
