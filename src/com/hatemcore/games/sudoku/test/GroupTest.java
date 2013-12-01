package com.hatemcore.games.sudoku.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.hatemcore.games.sudoku.Game;
import com.hatemcore.games.sudoku.Group;
/**
 * Test for Group.
 * @author Hatem Al Amri
 *
 */
public class GroupTest {
	
	@Before
	public void prepareObject(){
		
		Game.horGroupesNumber = 3;
		Game.verGroupesNumber = 3;
		
	}
	
	@Test
	public void testGetTotalGroupsNumber(){
		
		Integer total = Group.getTotalGroupsNumber();
		assertEquals(9, total.intValue());
		
	}
}
