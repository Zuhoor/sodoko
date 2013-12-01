package com.hatemcore.games.sodoko.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hatemcore.games.sodoko.Field;
import com.hatemcore.games.sodoko.Game;

/**
 * Test for Field class.
 * @author Hatem Al Amri
 *
 */
public class FieldTest {
	
	private Field field;
	
	@Before
	public void prepareObject(){
		field = new Field();
	}

	@Test
	public void testNumberOfFields() {
		
		Game.horFieldsNumber = 3;
		Game.verFieldsNumber = 3;
		Game.verGroupesNumber = 2;
		Game.horGroupesNumber = 4;
		
		assertEquals(72, Field.getNumberofFields().intValue());
	}
	
	@Test
	public void testNumberOfFieldsInColumn() {
		
		Game.verFieldsNumber = 3;
		Game.verGroupesNumber = 2;
	
		assertEquals(6, Field.getNumberOfFieldsInColumn().intValue());
	}
	
	@Test
	public void testNumberOfFieldsInRow() {
		
		Game.horFieldsNumber = 3;
		Game.horGroupesNumber = 4;
	
		assertEquals(12, Field.getNumberOfFieldsInRow().intValue());
	}
	
	@Test
	public void testNumberOfFieldsInGroup() {
		
		Game.horFieldsNumber = 5;
		Game.verFieldsNumber = 6;
	
		assertEquals(30, Field.getNumberofFieldsInGroup().intValue());
	}
	
	@Test
	public void testIsCorrect() {
		
		field.setValue(4);
		field.setCorrectValue(4);
	
		assertEquals(true, field.isCorrect());
		
		field.setValue(5);
		field.setCorrectValue(4);
	
		assertEquals(false, field.isCorrect());
	}

}
