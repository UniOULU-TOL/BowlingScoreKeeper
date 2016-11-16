package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>(10);
	private Frame bonus;
	
	public BowlingGame(){
		for(int i=0;i<10;i++){
			frames.add(new Frame());
		}
	}
	
	public void addFrame(Frame frame) throws BowlingException{
		if(frames.size()==10)throw new BowlingException();
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		
		int score = 0;
		for(int i=0;i<10;i++){
			if(frames.get(i).isSpare()){
				
			}
		}
		
		return score;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
