public class KthLargest {
    public static void main(String[] args) {

    }
    public static int getKthLargest(int[] array, int k){
        //create a heap
        MyHeap heap = new MyHeap(array.length);
        for (int i = 0; i <array.length ; i++) {
            heap.insert(array[i]);
        }
        for (int i = 0; i <k-1 ; i++) {
            heap.remove();
        }
        return heap.peek();
    }
}
