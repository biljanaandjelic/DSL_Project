package facultysystem;

default class TeachesClasses {
	protected Teacher teacher;
	protected Subject subject;
	private java.util.Date classDate;
	private java.util.Date classTime;
	protected Subject subject;
	
	
	public TeachesClasses(Teacher teacher, Subject subject, java.util.Date classDate, java.util.Date classTime, Subject subject) {
	    this.teacher = teacher;
	    this.subject = subject;
	    this.classDate = classDate;
	    this.classTime = classTime;
	    this.subject = subject;
	};
	
	public java.util.Date getClassDate() {
	    return this.classDate;
	};
	
	public void setClassDate(java.util.Date classDate) {
	    this.classDate = classDate;
	};
	
	public java.util.Date getClassTime() {
	    return this.classTime;
	};
	
	public void setClassTime(java.util.Date classTime) {
	    this.classTime = classTime;
	};
	
	public Teacher getTeacher(Teacher teacher) {
	    return this.Teacher;
	};
	
	public void setTeacher(Teacher teacher) {
	    this.Teacher = Teacher;
	};
	
	public Subject getSubject(Subject subject) {
	    return this.Subject;
	};
	
	public void setSubject(Subject subject) {
	    this.Subject = Subject;
	};
	
	public Subject getSubject(Subject subject) {
	    return this.Subject;
	};
	
	public void setSubject(Subject subject) {
	    this.Subject = Subject;
	};
	
}
