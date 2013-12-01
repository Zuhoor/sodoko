package com.hatemcore.games.sudoku.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hatemcore.games.sudoku.Game;
import com.hatemcore.games.sudoku.GroupPosition;

public class GroupPositionTest {
	
	private GroupPosition groupPosition;
	
	@Before
	public void prepareObject(){
		
		Game.horGroupesNumber = 3;
		Game.verGroupesNumber = 3;
		
		this.groupPosition = new GroupPosition();
	}
	@Test
	public void testNextPosition_newPositionSameRow() {
		
		// If next position on the same row
		groupPosition.setLeft(1);
		groupPosition.setTop(1);
		
		groupPosition = GroupPosition.nextPosition(groupPosition);
		
		assertEquals(2,groupPosition.getLeft().intValue());
		assertEquals(groupPosition.getTop().intValue(),1);

	}
	
	@Test
	public void testNextPosition_newPositionNextRow() {
		
		// If next position is in next row
		groupPosition.setLeft(3);
		groupPosition.setTop(2);
		
		groupPosition = GroupPosition.nextPosition(groupPosition);
		
		assertEquals(1,groupPosition.getLeft().intValue());
		assertEquals(groupPosition.getTop().intValue(),3);
	}
	
	@Test
	public void testNextPosition_noNewPosition() {
		
		// If no next position
		groupPosition.setLeft(3);
		groupPosition.setTop(3);
		
		groupPosition = GroupPosition.nextPosition(groupPosition);
		
		assertEquals(null,groupPosition);
	}

}
