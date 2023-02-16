package collection;

public class Employee {
	int id;
	String name;
	long salary;
	String city;
	int age;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, long salary, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + ", age=" + age + "]";
	}

	
}
