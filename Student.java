import java.util.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Arrays;

public class Student 
{ 
	int studentID; 
	String firstName; 
	String lastName; 
	int age;
	int creditHours; 
	String degreeSeeking;
	String major;
	String academicStanding;
	String financialAssistance;
    int finances;
	String typeNonDegree;
	String typeCertificate;

	public Student(int studentID, String firstName, String lastName, int age, int creditHours, String degreeSeeking, String major, String academicStanding, String financialAssistance)
	{
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age; 
		this.creditHours = creditHours; 
		this.degreeSeeking = degreeSeeking; 
		this.major = major; 
		this.academicStanding = academicStanding; 
		this.financialAssistance = financialAssistance;
	}

    public Student(int studentID, String firstName, String lastName, int age, int creditHours, String degreeSeeking, String major, String academicStanding, String financialAssistance, int finances)
    {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.creditHours = creditHours;
        this.degreeSeeking = degreeSeeking;
        this.major = major;
        this.academicStanding = academicStanding;
        this.financialAssistance = financialAssistance;
        this.finances = finances;
    }

	public Student(int studentID, String firstName, String lastName, int age, int creditHours, String degreeSeeking, String typeNonDegree, String typeCertificate)
	{
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age; 
		this.creditHours = creditHours; 
		this.degreeSeeking = degreeSeeking; 
		this.typeNonDegree = typeNonDegree;
		this.typeCertificate = typeCertificate; 
	}

	public Student(int studentID, String firstName, String lastName, int age, int creditHours, String degreeSeeking, String typeNonDegree)
	{
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age; 
		this.creditHours = creditHours; 
		this.degreeSeeking = degreeSeeking; 
		this.typeNonDegree = typeNonDegree;
	}

	public int computeFees() { 
		
		int fees;

		//Degree-seeking student
		if (degreeSeeking == "Y") {
			
			if (creditHours <= 12) { 
				fees = 100 + 50 + 275 * creditHours;
			}

			else { 
				fees = 3450;
			}

			//if degree-seeking student has financial aid, subtract from fees
			if (financialAssistance == "Y") {

				fees = fees - finances;
				
				//if fee assessment drops below zero, then no fees are assessed
				if (fees < 0) {
					fees = 0;
				}
			}
		}

		//Non-degree seeking student 
		else { 

			if (typeNonDegree == "S" && creditHours <= 6) {
				fees = 100;
			}

			if (typeNonDegree == "S" && creditHours > 6) {
				fees = 100 + (creditHours - 6) * 50;
			}

			else {
				fees = 700 + 300 * creditHours;
			}
		}

		return fees;
	}

	public int getStudentID() { 
		return studentID;
	}

	public String getFirstName() { 
		return firstName; 
	}

	public String getLastName() { 
		return lastName; 
	}
	
	public int getAge() { 
		return age;
	}

	public int getCreditHours() { 
		return creditHours;
	}

	public String getDegreeSeeking() {
		return degreeSeeking; 
	}

	public String getMajor() {
		return major; 
	}

	public String getAcademicStanding() {
		return academicStanding;
	}

	public String getFinancialAssistance() {
		return financialAssistance; 
	}

	public String getTypeNonDegree() {
		return typeNonDegree;
	}

	public String getTypeCertificate() {
		return typeCertificate;
	}

    public int getFinances() {
        return finances;
    }

    public static void main(String[] args) throws Exception {
        
        int degreeWithoutFinancial = 0;
        int degreeWithFinancial = 0;
        int certificateStudents = 0;
        int seniorCitizens = 0;
        int totalFees = 0;
        String line = null;
        
        String path = args[0];
        
        //pass the path to the file as a parameter
        File file = new File(path);
        Scanner sc = new Scanner(file);
        
        Student[] students = new Student[100];
        int i = 0;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String[] studentData = line.split(";");
            //System.out.println(Arrays.toString(studentData));
            int size = studentData.length;
            
            if (size == 9) {
                //student object 1
                int id = Integer.parseInt(studentData[0]);
                String first = studentData[1];
                String last = studentData[2];
                int agee = Integer.parseInt(studentData[3]);
                int credits = Integer.parseInt(studentData[4]);
                String degree = studentData[5];
                String maj = studentData[6];
                String academicStan = studentData[7];
                String financialA = studentData[8];

                students[i] = new Student(id, first, last, agee, credits, degree, maj, academicStan, financialA);
                System.out.println(students[i].getFirstName() + " " + students[i].getLastName() + " $" + students[i].computeFees());
                
                degreeWithoutFinancial = degreeWithoutFinancial + students[i].computeFees();
                
            }
            
            else if (size == 10) {
                //student object 2
                int id = Integer.parseInt(studentData[0]);
                String first = studentData[1];
                String last = studentData[2];
                int agee = Integer.parseInt(studentData[3]);
                int credits = Integer.parseInt(studentData[4]);
                String degree = studentData[5];
                String maj = studentData[6];
                String academicStan = studentData[7];
                String financialA = studentData[8];
                int fin = (int)Double.parseDouble(studentData[9]);
                
                students[i] = new Student(id, first, last, agee, credits, degree, maj, academicStan, financialA, fin);
                System.out.println(students[i].getFirstName() + " " + students[i].getLastName() + " $" + students[i].computeFees());
                
                degreeWithFinancial = degreeWithFinancial + students[i].computeFees();

            }
            
            else if (size == 8) {
                //student object 3
                int id = Integer.parseInt(studentData[0]);
                String first = studentData[1];
                String last = studentData[2];
                int agee = Integer.parseInt(studentData[3]);
                int credits = Integer.parseInt(studentData[4]);
                String degree = studentData[5];
                String typeNon = studentData[6];
                String typeCert = studentData[7];
                
                students[i] = new Student(id, first, last, agee, credits, degree, typeNon, typeCert);
                System.out.println(students[i].getFirstName() + " " + students[i].getLastName() + " $" + students[i].computeFees());
                
                certificateStudents = certificateStudents + students[i].computeFees();
                
            }
            
            else if (size == 7) {
                //student object 4
                int id = Integer.parseInt(studentData[0]);
                String first = studentData[1];
                String last = studentData[2];
                int agee = Integer.parseInt(studentData[3]);
                int credits = Integer.parseInt(studentData[4]);
                String degree = studentData[5];
                String typeNon = studentData[6];
                
                students[i] = new Student(id, first, last, agee, credits, degree, typeNon);
                System.out.println(students[i].getFirstName() + " " + students[i].getLastName() + " $" + students[i].computeFees());
                
                seniorCitizens = seniorCitizens + students[i].computeFees();
                
            }
            
            i++;
        }
        
        System.out.println("\nSummary of student fees assessed: \n");
        System.out.println("Degree-seeking students without financial assistance: $" + degreeWithoutFinancial);
        System.out.println("Degree-seeking students with financial assistance: $" + degreeWithFinancial);
        System.out.println("Certificate students: $" + certificateStudents);
        System.out.println("Senior citizens: $" + seniorCitizens);

        totalFees = degreeWithoutFinancial + degreeWithFinancial + certificateStudents + seniorCitizens;
        
        System.out.println("\nTotal fees assessed: $" + totalFees);
    }
}
