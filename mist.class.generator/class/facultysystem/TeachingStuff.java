package facultysystem;

public class TeachingStuff {
	protected int teachingStuffID;
	private String teachingStuffTitle;
	protected Chair chair;
	
	
	public TeachingStuff(int teachingStuffID, String teachingStuffTitle, Chair chair) {
	    this.teachingStuffID = teachingStuffID;
	    this.teachingStuffTitle = teachingStuffTitle;
	    this.chair = chair;
	};
	
	public int getTeachingStuffID() {
	    return this.teachingStuffID;
	};
	
	public void setTeachingStuffID(int teachingStuffID) {
	    this.teachingStuffID = teachingStuffID;
	};
	
	public String getTeachingStuffTitle() {
	    return this.teachingStuffTitle;
	};
	
	public void setTeachingStuffTitle(String teachingStuffTitle) {
	    this.teachingStuffTitle = teachingStuffTitle;
	};
	
	public Chair getChair(Chair chair) {
	    return this.Chair;
	};
	
	public void setChair(Chair chair) {
	    this.Chair = Chair;
	};
	
}
