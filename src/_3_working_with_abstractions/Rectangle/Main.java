package _3_working_with_abstractions.Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr =  toIntegerArray(sc.nextLine());

        Point buttomLeftPoint = new Point(arr[0], arr[1]);
        Point topRightPoint = new Point(arr[2], arr[3]);
        Rectangle rectangle = new Rectangle(buttomLeftPoint, topRightPoint);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            int [] input = toIntegerArray(sc.nextLine());
            Point newPoint = new Point(input[0], input[1]);

            isItContains(newPoint, rectangle);

        }
    }



    private static void isItContains(Point newPoint, Rectangle rectangle) {
        if(rectangle.contains(newPoint)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    private static int[] toIntegerArray(String nextLine) {
        int[] arr = Arrays.stream(nextLine
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        return  arr;
    }
}
