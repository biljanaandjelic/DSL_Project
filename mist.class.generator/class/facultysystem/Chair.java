package facultysystem;

public class Chair {
	protected String chairName;
	protected Faculty faculty;
	
	
	public Chair(String chairName, Faculty faculty) {
	    this.chairName = chairName;
	    this.faculty = faculty;
	};
	
	public String getChairName() {
	    return this.chairName;
	};
	
	public void setChairName(String chairName) {
	    this.chairName = chairName;
	};
	
	public Faculty getFaculty(Faculty faculty) {
	    return this.Faculty;
	};
	
	public void setFaculty(Faculty faculty) {
	    this.Faculty = Faculty;
	};
	
}
