import java.util.*;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
        sunsetViews(buildings,"EAST").forEach(System.out::println);
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.
   Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <buildings.length ; i++) {
            while (!stack.isEmpty() && buildings[i]>=buildings[stack.peek()]){

                stack.pop();
            }
            stack.push(i);

        }
//now i have a stack with heights that can see the sunset it will return the indexes of these buildings


//we will return an array list using the stack like so
        return new ArrayList<Integer>(stack);
    }
}
