/*

Pattern problem

*****
****
***
**
*

*/



public class pattern {


    public static void main(String[] args) {
        int i,j;
            for (i = 5; i >= 1; i--)
        {
            for (j = i; j >= 1; j--)
            {
                System.out.printf("*");
            }
            System.out.println("\n");
        }

    }
}