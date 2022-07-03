public class Patient
{
	private String name;
	private int age;
	private double height;
	private int weight;
	private String gender;
	private String phoneNumber;
	private boolean status;
	
	private double bmi;
	private double bloodPressure;
	
	public Patient()
	{
		name = "John Doe";
		age = 0;
		height = 0;
		weight = 0;
		gender = "Male";
		phoneNumber = "None";
		this.status = false;
		//add bmi and bloodPress
	}
	
	public Patient(String name, int age, double height, int weight, String gender, String phoneNumber,
			boolean status) throws IllegalArgumentException
	{
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.status = status;
		//add bmi and bloodPress
	}
	
	public void updateAge(int age)
	{
		this.age = age;
	}
	
	public void updateHeight(double height)
	{
		this.height = height;
	}
	
	public void updateWeight(int weight)
	{
		this.weight = weight;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public int getWeight()
	{
		return this.weight;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
	
	public boolean getStatus()
	{
		return this.status;
	}
}