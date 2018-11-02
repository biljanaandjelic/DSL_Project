package facultysystem;

public class NonTeachingStuff {
	protected int nonTeachingStuffID;
	private String nonTeachingStuffPosition;
	
	
	public NonTeachingStuff(int nonTeachingStuffID, String nonTeachingStuffPosition) {
	    this.nonTeachingStuffID = nonTeachingStuffID;
	    this.nonTeachingStuffPosition = nonTeachingStuffPosition;
	};
	
	public int getNonTeachingStuffID() {
	    return this.nonTeachingStuffID;
	};
	
	public void setNonTeachingStuffID(int nonTeachingStuffID) {
	    this.nonTeachingStuffID = nonTeachingStuffID;
	};
	
	public String getNonTeachingStuffPosition() {
	    return this.nonTeachingStuffPosition;
	};
	
	public void setNonTeachingStuffPosition(String nonTeachingStuffPosition) {
	    this.nonTeachingStuffPosition = nonTeachingStuffPosition;
	};
	
}
