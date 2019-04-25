package Collections;

public class Employee {
	
	public Employee(String Name, String Department, int EmpID) {
		this.Name = Name;
		this.Department = Department;
		this.EmpID = EmpID;
	}
	
	public Employee() {
		
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}

	String Name;
	String Department;
	int EmpID;

}
