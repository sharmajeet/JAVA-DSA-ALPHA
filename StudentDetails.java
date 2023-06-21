import java.util.*;

public class StudentDetails {

    public static void details(int id[], String name[], int marks[]) {
        for (int i = 0; i < id.length; i++) {
            System.out.println("Student Name : " + name[i]);
            System.out.println("Student Id : " + id[i]);
            System.out.println("Student Marks : " + marks[i]);
            System.out.println("");
            

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[5];
        int id[] = new int[5];
        int marks[] = new int[5];

        for (int i = 0; i < id.length; i++) {
            System.out.print("Enter student Name :");
            name[i] = sc.nextLine();

            System.out.print("Enter student id :");
            id[i] = sc.nextInt();


            System.out.print("Enter student marks :");
            marks[i] = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
        }
        details(id, name, marks);
    }

}
