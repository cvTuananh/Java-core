package vu.com;

public class Employee {
	private int maNv; 
	private String name;
	private Double salary;
	
	public Employee(int maNv, String name, Double salary) {
		super();
		this.maNv = maNv;
		this.name = name;
		this.salary = salary;
	}
	
	public int getMaNv() {
		return maNv;
	}
	public void setMaNv(int maNv) {
		this.maNv = maNv;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double calculator() {
		return this.salary - (this.salary *0.15);
	}
	
	@Override
	public String toString() {
		return "Employee [maNv=" + maNv + ", name=" + name + ", salary=" + salary + calculator() +"]";
	}
	
	
	
	
}
