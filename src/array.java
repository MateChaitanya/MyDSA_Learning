import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //int marks[] = new int[50];

        //int numbers[] = { 1,2,3};

        //User Input
        int marks[] = new int [100];
        Scanner sc = new Scanner(System.in);
        //int phy;
        //phy = sc.nextInt();

        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//chem
        marks[2]=sc.nextInt();//maths

        System.out.println("phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("maths: " + marks[2]);

        //update the maths marks
        marks[2]=100;
        System.out.println("maths: " + marks[2]);


    }
}