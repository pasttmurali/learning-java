public class Person{
	private String name;
	private String address;
	
	public Person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String toString()
	{
		return "Name is "+getName() +"\nAddress is"+getAddress();
	}
}
class Student extends Person{
	private int numCourse=0;
	private String[] courses[]=new String[30];
	private int gardes[]=new grades[30];
	
	public Student(String name,String address){
		super(name,address);
	}
	
	public int getNumcourse()
	{
		return this.numCourse;
	}
	
	public String toString()
	{
		return super.toString()+"numCourse "+getNumcourse();
	}
	
	public void addCourseGrades(String course,int grade)
	{
		if(numCourse<30)
		{
			courses[numCourse]=course;
			grades[numCourse]=grade;
			numCourse++;
		}else {
            System.out.println("Maximum number of courses reached");
        }
	}
	
	public void printGrades()
	{
		for(int i=0;i<numCourse;i++)
		{
			System.out.println(course[i]+" "+grades[i]);
		}
	}
	
	public double getAverageGrade()
	{
		if(numCourse==0) return 0.0;
		int sum=0;
		for(int i=0;i<numCourse;i++)
		{
			sum+=gardes[i];
		}
		return (double)sum/numCourse;
	}
}
