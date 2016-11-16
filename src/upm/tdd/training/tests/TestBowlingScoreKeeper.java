package upm.tdd.training.tests;

import static org.junit.Assert.*;

import upm.tdd.training.Frame;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingGame;
import upm.tdd.training.CannotCreateAnotherFrame;

public class TestBowlingScoreKeeper {

	BowlingGame partita=new BowlingGame();
	Frame frame1;
	Frame frame2;
	Frame frame3;
	Frame frame4;
	Frame frame5;
	Frame frame6;
	Frame frame7;
	Frame frame8;
	Frame frame9;
	Frame frame10;
	
	
	@Before
	public void setUp() throws CannotCreateAnotherFrame{
		//Arrange
		partita.addFrame(frame1);
		partita.addFrame(frame2);
		partita.addFrame(frame3);
		partita.addFrame(frame4);
		partita.addFrame(frame5);
		partita.addFrame(frame6);
		partita.addFrame(frame7);
		partita.addFrame(frame8);
		partita.addFrame(frame9);
		partita.addFrame(frame10);
		
	}
	
	@Test
	public void testAddEleventhFrame() {
		Frame frame11;
		partita.addFrame(frame11);
	}

}
