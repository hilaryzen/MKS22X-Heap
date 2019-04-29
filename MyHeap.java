public class MyHeap {
  //size is the number of elements in the array
  //pushes element at index downward into the right position
  private static void pushDown(int[] data, int size, int index) {
    int i = data[index];
    while (i < data[index * 2] || i < data[index * 2 + 1]) {
      if (data[index * 2] > data[index * 2 + 1]) {
        data[index] = data[index * 2];
        data[index * 2] = i;
      } else {
        data[index] = data[index * 2 + 1];
        data[index * 2 + 1] = i;
      }
    }
  }
}
