package facultysystem;

public class Subject {
	protected int subjectID;
	private String subjectName;
	
	
	public Subject(int subjectID, String subjectName) {
	    this.subjectID = subjectID;
	    this.subjectName = subjectName;
	};
	
	public int getSubjectID() {
	    return this.subjectID;
	};
	
	public void setSubjectID(int subjectID) {
	    this.subjectID = subjectID;
	};
	
	public String getSubjectName() {
	    return this.subjectName;
	};
	
	public void setSubjectName(String subjectName) {
	    this.subjectName = subjectName;
	};
	
}
