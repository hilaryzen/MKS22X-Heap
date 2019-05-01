public class MyHeap {
  //size is the number of elements in the array
  //pushes element at index downward into the right position
  public static void pushDown(int[] data, int size, int index) {
    //Checks if index is within bounds and one of its children is larger
    while ((index + 1) * 2 <= size && (data[index] < data[(index + 1) * 2 - 1] || data[index] < data[(index + 1) * 2])) {
      //If node only has one child
      if ((index + 1) * 2 == size) {
        //If the child is larger, swap the nodes
        if (data[index] < data[(index + 1) * 2 - 1]) {
          int value = data[index];
          int newI = (index + 1) * 2 - 1;
          //Swaps the two nodes
          data[index] = data[newI];
          data[newI] = value;
          //Index changes to new position
          index = newI;
        }
      } else if (data[(index + 1) * 2 - 1] > data[(index + 1) * 2]) { //Left node is larger
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

  public static void pushUp(int[] data, int index) {
    //If index has a parent smaller than it
    while ((index - 1) / 2 >= 0 && (data[(index - 1) / 2] < data[index])) {
      int value = data[index];
      int newI = (index - 1) / 2;
      //Swaps the two nodes
      data[index] = data[newI];
      data[newI] = value;
      //Index changes to new position
      index = newI;
    }
  }

  //Turns an array into a valid heap by working backwards through the nodes and pushing them down
  public static void heapify(int[] data) {
    for (int i = data.length - 1; i >= 0; i--) {
      pushDown(data, data.length, i);
    }
  }

  public static void heapsort(int[] data) {
    
  }
}
