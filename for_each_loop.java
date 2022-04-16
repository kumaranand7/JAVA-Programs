



//sum of element using for each loop
public class for_each_loop {

    public static void main(String[] args) {
        int sum=0;

        int []arr = {12,23,3,43,42,13};

     for(int element: arr){

          sum=sum+element;
     }
        System.out.println(sum);
    }
}
