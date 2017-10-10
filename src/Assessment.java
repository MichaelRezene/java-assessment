import java.util.ArrayList;
//import java.util.List;

public class Assessment {

    public static int square(int number)
    {

        return number * number;
    }
    public static double sum(double number1, double number2) {
        return number1 + number2;
    }
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static   double  average(double array[]){
        double sum = 0;
        for (double average: array){
            sum += average;

       }
       double av = sum/ array.length;

       return sum;

   }

    public static void main(String[] args) {
        System.out.println("Square is: " + square(2));
        System.out.println("Sum is: " + sum(5, 3));
        double[] arrays = { 1,2,3,4,5};
       System.out.println("Average is: " + average(arrays));


    }
    public static String capitalizeRecords(ArrayList<User> users){
                User us = new User("Genesis","Mehert",
                        true);
                us.firstName.toUpperCase();
                us.lastName.toUpperCase();
        return " ";
    }

}
