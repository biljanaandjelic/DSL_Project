package facultysystem;

public class Employee {
	protected int employeeID;
	private String employeeName;
	private String employeeSurname;
	protected NonTeachingStuff nonteachingstuff;
	protected TeachingStuff teachingstuff;
	
	
	public Employee(int employeeID, String employeeName, String employeeSurname, NonTeachingStuff nonteachingstuff, TeachingStuff teachingstuff) {
	    this.employeeID = employeeID;
	    this.employeeName = employeeName;
	    this.employeeSurname = employeeSurname;
	    this.nonteachingstuff = nonteachingstuff;
	    this.teachingstuff = teachingstuff;
	};
	
	public int getEmployeeID() {
	    return this.employeeID;
	};
	
	public void setEmployeeID(int employeeID) {
	    this.employeeID = employeeID;
	};
	
	public String getEmployeeName() {
	    return this.employeeName;
	};
	
	public void setEmployeeName(String employeeName) {
	    this.employeeName = employeeName;
	};
	
	public String getEmployeeSurname() {
	    return this.employeeSurname;
	};
	
	public void setEmployeeSurname(String employeeSurname) {
	    this.employeeSurname = employeeSurname;
	};
	
	public NonTeachingStuff getNonTeachingStuff(NonTeachingStuff nonteachingstuff) {
	    return this.NonTeachingStuff;
	};
	
	public void setNonTeachingStuff(NonTeachingStuff nonteachingstuff) {
	    this.NonTeachingStuff = NonTeachingStuff;
	};
	
	public TeachingStuff getTeachingStuff(TeachingStuff teachingstuff) {
	    return this.TeachingStuff;
	};
	
	public void setTeachingStuff(TeachingStuff teachingstuff) {
	    this.TeachingStuff = TeachingStuff;
	};
	
}
