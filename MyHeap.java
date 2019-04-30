public class MyHeap {
  //size is the number of elements in the array
  //pushes element at index downward into the right position
  private static void pushDown(int[] data, int size, int index) {
    //Checks if index is within bounds and one of its children is larger
    while (index > size && (data[index] < data[index * 2] || data[index] < data[index * 2 + 1]) {
      if (data[index * 2] > data[index * 2 + 1]) { //Left node is larger
        int value = data[index];
        int newI = index * 2;
        //Swaps the two nodes
        data[index] = data[newI];
        data[newI] = value;
        //Index changes to new position
        index = newI;
      } else { //Right node is larger
        int value = data[index];
        int newI = index * 2 + 1;
        //Swaps the two nodes
        data[index] = data[newI];
        data[newI] = value;
        //Index changes to new position
        index = newI;
      }
    }
  }
}
