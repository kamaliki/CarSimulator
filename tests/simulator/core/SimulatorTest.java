package simulator.core;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import simulator.agents.TestAgent;
import simulator.exceptions.NotLaneException;
import simulator.exceptions.OnCrashException;
import simulator.exceptions.WrongActionException;

public class SimulatorTest {
	@Test(expected=OnCrashException.class)
	public void testRun() throws NotLaneException, WrongActionException, OnCrashException, FileNotFoundException, IOException {
		TestAgent ta = new TestAgent();
		Simulator s = new Simulator("tests/simulator.conf", ta);
		// Agent should crash onto other car in one step.
		s.run();
	}

	/*
	@Test
	public void testGetTimeStep() throws NotLaneException, WrongActionException {
		TestAgent ta = new TestAgent();
		Simulator s = new Simulator(ta);
		int oldTime = s.getTimeStep();
		try {
		s.run();
		s.run();
		} catch(OnCrashException e) {}
		int newTime = s.getTimeStep();
		
		assertEquals(2, newTime - oldTime);
	}
	*/

}
