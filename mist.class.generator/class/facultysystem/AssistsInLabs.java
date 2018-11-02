package facultysystem;

default class AssistsInLabs {
	protected Asistant asistant;
	protected Subject subject;
	
	
	public AssistsInLabs(Asistant asistant, Subject subject) {
	    this.asistant = asistant;
	    this.subject = subject;
	};
	
	public Asistant getAsistant(Asistant asistant) {
	    return this.Asistant;
	};
	
	public void setAsistant(Asistant asistant) {
	    this.Asistant = Asistant;
	};
	
	public Subject getSubject(Subject subject) {
	    return this.Subject;
	};
	
	public void setSubject(Subject subject) {
	    this.Subject = Subject;
	};
	
}
