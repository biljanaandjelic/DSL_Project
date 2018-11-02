package facultysystem;

default class Passes {
	protected Subject subject;
	protected Student student;
	private int grade;
	private java.util.Date examDate;
	
	
	public Passes(Subject subject, Student student, int grade, java.util.Date examDate) {
	    this.subject = subject;
	    this.student = student;
	    this.grade = grade;
	    this.examDate = examDate;
	};
	
	public int getGrade() {
	    return this.grade;
	};
	
	public void setGrade(int grade) {
	    this.grade = grade;
	};
	
	public java.util.Date getExamDate() {
	    return this.examDate;
	};
	
	public void setExamDate(java.util.Date examDate) {
	    this.examDate = examDate;
	};
	
	public Subject getSubject(Subject subject) {
	    return this.Subject;
	};
	
	public void setSubject(Subject subject) {
	    this.Subject = Subject;
	};
	
	public Student getStudent(Student student) {
	    return this.Student;
	};
	
	public void setStudent(Student student) {
	    this.Student = Student;
	};
	
}
