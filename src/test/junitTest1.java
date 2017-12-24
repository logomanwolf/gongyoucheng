package test;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lifearray.*;

public class junitTest1 extends TestCase {
	private static array LifeGame = new array();

	@Before
	public void start() {
		System.out.println("Code Start!");
	}

	@After
	public void end() {
		System.out.println("Code End!");
	}

	@Test
	public void testGetNeighbour() {
		int i = LifeGame.getNeighbors(10, 6);
		assertEquals(2, i);
	}

	@Test
	public void testArray() {
		char[][] world = new char[15][60];
		world[3][4] = world[3][5] = world[3][6] = '*';	
		world[10][4] = world[10][5] = world[10][6] = world[11][6] = world[12][5] = '*';
		assertArrayEquals(world, LifeGame.getWorld());
		
	}
	@Test
	public void testopenfile(){
		
	}
	// test
}
