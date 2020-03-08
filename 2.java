import java.util.*;

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
/*
	public Student(int in_studentID, String in_firstName, String in_lastName, int in_age, int in_creditHours, String in_degreeSeeking, String in_typeNonDegree, String in_typeCertificate)
	{
		in_studentID = studentID;
		in_firstName = firstName;
		in_lastName = lastName;
		in_age = age; 
		in_creditHours = creditHours; 
		in_degreeSeeking = degreeSeeking; 
		in_typeNonDegree = typeNonDegree;
		in_typeCertficate = typeCertificate; 
	}

	public Student(int in_studentID, String in_firstName, String in_lastName, int in_age, int in_creditHours, String in_degreeSeeking, String in_typeNonDegree)
	{
		in_studentID = studentID;
		in_firstName = firstName;
		in_lastName = lastName;
		in_age = age; 
		in_creditHours = creditHours; 
		in_degreeSeeking = degreeSeeking; 
		in_typeNonDegree = typeNonDegree;
	}

	public int printData() { 
		
	}
*/	
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
/*
	public String getTypeNonDegree() { 
		return typeNonDegree;
	}

	public String getTypeCertificate() { 
		return typeCertificate;
	}
*/
	public static void main() { 
		
		//initialize an array that holds n objects of type Student
//		Student[100] students = new Student[n];
		System.out.println("Compiles");
		
	}

}
