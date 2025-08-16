import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no.of students:");
    
        int n=scanner.nextInt();
        scanner.nextLine();
        
        // Array to store subject marks
        int[] marks = new int[5];
        int[] rank=new int[n];
        String[] subjects = {"Math", "Science", "English", "History", "Computer"};
        ArrayList<String> pass=new ArrayList<>();
        ArrayList<String> fail=new ArrayList<>();

        int total = 0;
        for(int j=0;j<n;j++)
    {
        // Input student name
        System.out.println();
        System.out.println("Student "+(j+1)+" marks details:");
        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        
        // Input marks for each subject
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");

            marks[i] = scanner.nextInt();
            total += marks[i];
            
        }
        rank[j]=total;
        scanner.nextLine();
        // Calculate average and percentage
        double average = total / 5.0;
        char grade;

        // Assign grade
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output results
        System.out.println("\n--- Grade Report ---");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.err.println();
        if(grade!='F')
        {
            pass.add(name);

        }
        else
        {
           fail.add(name);
    }
        total=0;
        
    }
    System.out.println();
    System.err.println("--- Final Report is ---");
    if(pass.size()!=0)
{
   if(pass.size()==1)
      System.out.println("passed Student is:");
    else
      System.out.println("passed  students are:");
    for(int k=0;k<pass.size();k++)
    {
        System.out.println(pass.get(k));

    }
}
if(fail.size()!=0)
{
    if(fail.size()==1)
      System.out.println("failed Student is:");
    else
      System.out.println("failed  students are:");
    for(int t=0;t<fail.size();t++)
    {
        System.out.println(fail.get(t));
    
    }

}}

        
    }