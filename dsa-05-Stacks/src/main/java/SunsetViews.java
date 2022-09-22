import java.util.*;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
        sunsetViews(buildings,"west").forEach(System.out::println);
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.
   Stack<Integer> stack = new Stack<>();
//this is for the east by default
   int i= 0 ;
   int step= 1;
   //this is for the west
   if (direction.equalsIgnoreCase("west")){
       i= buildings.length-1;
       step=-1;
   }
   while (i>=0 && i< buildings.length){

            while (!stack.isEmpty() && buildings[i]>=buildings[stack.peek()]){

                stack.pop();
            }
            stack.push(i);
i+=step;
        }
//now i have a stack with heights that can see the sunset it will return the indexes of these buildings
if (direction.equalsIgnoreCase("west")){
    Collections.reverse(stack);
}

//we will return an array list using the stack like so
        return new ArrayList<Integer>(stack);
    }
}
