public class MyHeap {
  //size is the number of elements in the array
  //pushes element at index downward into the right position
  public static void pushDown(int[] data, int size, int index) {
    int value;
    int newI;
    int rightNode;
    //Checks if index is within bounds and one of its children is larger
    while ((index + 1) * 2 <= size) {
      //If node only has one child
      if ((index + 1) * 2 == size) {
        //If the child is larger, swap the nodes
        if (data[index] < data[(index + 1) * 2 - 1]) {
          value = data[index];
          newI = (index + 1) * 2 - 1;
          //Swaps the two nodes
          data[index] = data[newI];
          data[newI] = value;
          //Index changes to new position
          index = newI;
        } else { //If child is smaller, break the loop
          index = size + 1;
        }
      } else {
        rightNode = (index + 1) * 2;
        if (data[index] < data[rightNode - 1] && data[rightNode - 1] >= data[rightNode]) { //Left node is larger
          value = data[index];
          newI = rightNode - 1;
          //Swaps the two nodes
          data[index] = data[newI];
          data[newI] = value;
          //Index changes to new position
          index = newI;
        } else if (data[index] < data[rightNode] && data[rightNode - 1] < data[rightNode]) { //Right node is larger
          value = data[index];
          newI = rightNode;
          //Swaps the two nodes
          data[index] = data[newI];
          data[newI] = value;
          //Index changes to new position
          index = newI;
        } else { //If neither node is larger, break the loop
          index = size + 1;
        }
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
    for (int i = (data.length - 2) / 2; i >= 0; i--) {
      pushDown(data, data.length, i);
    }
  }

  //Heapify data, then swap largest value with the last node and push that down
  public static void heapsort(int[] data) {
    int biggest;
    heapify(data);
    //Run heapify as the array gets smaller
    for (int i = 1; i < data.length; i++) {
      //Swap biggest value in the heap to the end of the array
      biggest = data[0];
      data[0] = data[data.length - i];
      data[data.length - i] = biggest;
      //System.out.println("i: " + i);
      pushDown(data, data.length - i, 0);
    }
  }
}
