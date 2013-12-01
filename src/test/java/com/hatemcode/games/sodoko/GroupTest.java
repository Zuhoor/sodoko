package com.hatemcode.games.sodoko;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.hatemcode.games.sodoko.Game;
import com.hatemcode.games.sodoko.Group;
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
