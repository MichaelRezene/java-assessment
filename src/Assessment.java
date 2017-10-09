import java.util.ArrayList;
//import java.util.List;

public class Assessment {

    public static int square(int number)
    {
       return number;
    }
    public static double sum(double number1, double number2) {

        return number1 + number2;
    }
   public  double  average(double array[]){
//        double sum = 0;
//        for (double average: array){
//            sum += average;
//
//       }
//       double total = sum/ double(array.length);

       return array[0];

   }

    public static void main(String[] args) {
        System.out.println(square(2));
        System.out.println(sum(5, 3));
       // double[] arrays= { 1,2,3,4,5};
      // System.out.println(average(arrays));

    }
    public static String capitalizeRecords(){
        ArrayList<String> user = new ArrayList<>();
                user.add("Micky");
                user.add("Geb");
        return capitalizeRecords();
    }

}
