import java.util.Scanner;

class University 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
 {
        University c = new University();
	c.details();
        c.courseType();
        sc.close();
	c.details();
	c.availableCourses();
        c.specificCourse();
	c.chooseBTechStream();

    }
void details() 
{
        String collegeName = "Mythri University";
        String collegeLocation = "Bangalore";
        String collegeCode = "12345";
        System.out.println("College Name: " + collegeName);
        System.out.println("College Location: " + collegeLocation);
        System.out.println("College Code: " + collegeCode);
    }
    void courseType() 
	{
        System.out.println("\nWe are offering the following courses:");
        System.out.println("UG Courses: BTech, BSc, BCom, BBA");
        System.out.println("PG Courses: MTech, MCA, MBA, MCom");
        System.out.print("\nWhich type of course do you want to choose (UG/PG)? ");
        String courseType = sc.nextLine();
            }
    void availableCourses(String courseType) 
{
        if (courseType.equals("UG")) 
	{
            System.out.println("Available UG courses: BTech, BSc, BCom, BBA");
        }
	 else if (courseType.equals("PG")) 
	{
            System.out.println("Available PG courses: MTech, MCA, MBA, MCom");
        }
	 else 
	{
            System.out.println("Invalid choice. Please choose either UG or PG.");
        }
    }
    void specificCourse(String courseType) 
	{
        System.out.print("\nEnter the course you want to choose: ");
        String chosenCourse = sc.nextLine();
        if (courseType.equals("UG") && chosenCourse.equals("BTech")) 
	{
            chooseBTechStream();
        } 
	else 
	{
            System.out.println("You have chosen " + chosenCourse + ".");
        }
    }
    void chooseBTechStream() 
	{
        System.out.println("Available BTech Streams: CSE, ECE, IT");
        System.out.print("Enter your preferred stream: ");
        String stream = sc.nextLine();
        System.out.println("You have chosen BTech in " + stream + ".");
        System.out.println("Would you like to continue? (yes/no)");
        String dec = sc.next();
        if (dec.equals("no")) 
	{
            System.out.println("Thank you!");    
        }
    }
}


    