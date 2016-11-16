package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame)throws BowlingException{
		int size = this.frames.size();
		
		if(size == 10){
			throw new BowlingException();
		}
		
		this.frames.add(frame);
	}
	
	public int sizeFrames(){
		return this.frames.size();
	}
	
	public void setBonus(int firstThrow, int secondThrow) throws BowlingException {
		bonus = new Frame(firstThrow, secondThrow);
		
	}
	
	public int score(){
		//to be implemented
		return 0;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
