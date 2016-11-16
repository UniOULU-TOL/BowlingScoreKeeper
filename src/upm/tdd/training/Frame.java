package upm.tdd.training;

public class Frame {
	private static int frameCounter=0;
	private int frameNumber;
	private int firstThrow;
	private int secondThrow;
	

	public Frame(int firstThrow, int secondThrow) {
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		frameNumber=frameCounter++;
	}

	// the score of a single frame
	public int score() {
		return this.firstThrow+this.secondThrow;
	}

	// returns whether the frame is a strike or not
	public boolean isStrike() {
		if (this.firstThrow == 10) {
			return true;
		}
		return false;
	}

	// return whether a frame is a spare or not
	public boolean isSpare() {
		if (this.firstThrow + this.secondThrow == 10) {
			return true;
		}
		return false;
	}

	// return whether this is the last frame of the match
	public boolean isLastFrame() {
		if(frameNumber==10){
			return true;
		}
		return false;
	}

	// bonus throws
	public int bonus() {
		
		return 0;
	}

}
