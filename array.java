import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        // 1st method of array decleration
        int number[]={1,2,3,4,5,6,67};
        System.out.println(number.length);

        // 2nd method of array decleration
        int marks[]=new int[10];
        System.out.println(marks.length);


        Scanner sc= new Scanner(System.in);
        // value filling by intput method in array
        int n = sc.nextInt();
        marks[0]=n;

        System.out.println(marks[0]);
        sc.close();

    }
}
