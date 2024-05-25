import java.util.Scanner;

public class Student_result
{
    public static void main(String[] args) {
    
        Student_result  stu = new Student_result();
        stu.get_data(); 
        stu.check_marks();

       
        
    }

    String name;
    float total_marks;
    int subject;
    int subject1;
    int subject2;
    int roll_no;
    float perc;
    int sum;
    int marks;


    public void get_data()
    {
        System.out.println("Enter the student data");
        Scanner s = new Scanner(System.in);
        System.out.println("Enyer the student roll no. ");
        roll_no = s.nextInt();
        System.out.println("Enter the student name");
        name = s.next();
        System.out.println("Enter the exam total marks ");
        total_marks = s.nextFloat();
        System.out.println("Enter the student 3 sub marks ");


        subject = s.nextInt();
        subject1 = s.nextInt();
        subject2 = s.nextInt();

        sum = subject + subject1 + subject2; 
    }

    public void find_percentage()
    {
        perc = (sum*100)/total_marks;
        System.out.println("The percentage is " + perc); 
    }

    public void final_result()
    {
        if (perc >= 90) {
            System.out.println("Your result is A+ grade ");
            
        }else if (perc > 80 && perc <=90) {
            System.out.println("Your result is A grade ");
        }
        else if (perc > 70 && perc <=80) {
            System.out.println("Your result is B grade ");
        }
        else if (perc > 60 && perc <=70) {
            System.out.println("Your result is grade ");
        }
        else if (perc > 50 && perc <=60) {
            System.out.println("Your result is D grade ");
        }
        else if (perc > 35 && perc <=50) {
            System.out.println("Your result is E grade ");
        }
        else {
            System.out.println("Your result is fail  ");
        }
    }

    public void check_marks()
    {
        
        if(!(subject < 0 || subject > 100)) 
        {
            System.out.println("Incorrect input. ");
            return;

        }
    
        if(!(subject1 < 0 || subject1 > 100)) 
        {
            System.out.println("Incorrect input. ");
            return;
        }
        
        if(!(subject2 < 0 || subject2 > 100)) 
        {
            System.out.println("Incorrect input. ");
            return;
        }
    }


}

