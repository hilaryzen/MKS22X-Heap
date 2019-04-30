public class MyHeap {
  //size is the number of elements in the array
  //pushes element at index downward into the right position
  public static void pushDown(int[] data, int size, int index) {
    //Checks if index is within bounds and one of its children is larger
    while ((index + 1) * 2 < size && (data[index] < data[(index + 1) * 2 - 1] || data[index] < data[(index + 1) * 2])) {
      if (data[(index + 1) * 2 - 1] > data[(index + 1) * 2]) { //Left node is larger
        int value = data[index];
        int newI = (index + 1) * 2 - 1;
        //Swaps the two nodes
        data[index] = data[newI];
        data[newI] = value;
        //Index changes to new position
        index = newI;
      } else { //Right node is larger
        int value = data[index];
        int newI = (index + 1) * 2;
        //Swaps the two nodes
        data[index] = data[newI];
        data[newI] = value;
        //Index changes to new position
        index = newI;
      }
    }
  }
}
