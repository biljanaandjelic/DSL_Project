package facultysystem;

public class Faculty {
	protected int facultyID;
	private String facultyName;
	
	
	public Faculty(int facultyID, String facultyName) {
	    this.facultyID = facultyID;
	    this.facultyName = facultyName;
	};
	
	public int getFacultyID() {
	    return this.facultyID;
	};
	
	public void setFacultyID(int facultyID) {
	    this.facultyID = facultyID;
	};
	
	public String getFacultyName() {
	    return this.facultyName;
	};
	
	public void setFacultyName(String facultyName) {
	    this.facultyName = facultyName;
	};
	
}
