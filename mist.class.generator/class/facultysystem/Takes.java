package facultysystem;

default class Takes {
	protected Student student;
	protected Subject subject;
	
	
	public Takes(Student student, Subject subject) {
	    this.student = student;
	    this.subject = subject;
	};
	
	public Student getStudent(Student student) {
	    return this.Student;
	};
	
	public void setStudent(Student student) {
	    this.Student = Student;
	};
	
	public Subject getSubject(Subject subject) {
	    return this.Subject;
	};
	
	public void setSubject(Subject subject) {
	    this.Subject = Subject;
	};
	
}
