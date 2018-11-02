package facultysystem;

public class Student {
	private String studentName;
	protected String studentSurname;
	protected int studentID;
	protected int studentYear;
	
	
	public Student(String studentName, String studentSurname, int studentID, int studentYear) {
	    this.studentName = studentName;
	    this.studentSurname = studentSurname;
	    this.studentID = studentID;
	    this.studentYear = studentYear;
	};
	
	public String getStudentName() {
	    return this.studentName;
	};
	
	public void setStudentName(String studentName) {
	    this.studentName = studentName;
	};
	
	public String getStudentSurname() {
	    return this.studentSurname;
	};
	
	public void setStudentSurname(String studentSurname) {
	    this.studentSurname = studentSurname;
	};
	
	public int getStudentID() {
	    return this.studentID;
	};
	
	public void setStudentID(int studentID) {
	    this.studentID = studentID;
	};
	
	public int getStudentYear() {
	    return this.studentYear;
	};
	
	public void setStudentYear(int studentYear) {
	    this.studentYear = studentYear;
	};
	
}
