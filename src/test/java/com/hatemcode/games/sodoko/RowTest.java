package com.hatemcode.games.sodoko;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hatemcode.games.sodoko.Field;
import com.hatemcode.games.sodoko.Game;
import com.hatemcode.games.sodoko.Row;

/**
 * Test for Field class.
 * @author Hatem Al Amri
 *
 */
public class RowTest {
	
	private Row row;
	
	@Before
	public void prepareObject(){
		row = new Row();
	}

	@Test
	public void testRowNumberByFieldNumber() {
		
		Game.horFieldsNumber = 3;
		Game.verFieldsNumber = 5;
		Game.verGroupesNumber = 2;
		Game.horGroupesNumber = 4;
		
		assertEquals(1, Row.getRowNumberByFieldNumber(3).intValue());
		assertEquals(1, Row.getRowNumberByFieldNumber(12).intValue());
		assertEquals(2, Row.getRowNumberByFieldNumber(22).intValue());
		assertEquals(4, Row.getRowNumberByFieldNumber(37).intValue());
		assertEquals(4, Row.getRowNumberByFieldNumber(48).intValue());
		assertEquals(6, Row.getRowNumberByFieldNumber(62).intValue());
	}
	
	@Test
	public void testNumberOfRows() {

		Game.verFieldsNumber = 5;
		Game.verGroupesNumber = 2;
		
		assertEquals(10, Row.getNumberOfRows().intValue());
		
		Game.verFieldsNumber = 2;
		Game.verGroupesNumber = 2;
		
		assertEquals(4, Row.getNumberOfRows().intValue());

	}
	
	@Test
	public void testSearch() {
		row.clear();
		
		row.addField(new Field(4));
		row.addField(new Field(1));
		row.addField(new Field(2));
		row.addField(new Field(9));

		assertEquals(true, row.search(4));
		assertEquals(true, row.search(1));
		assertEquals(true, row.search(2));
		assertEquals(true, row.search(9));
		assertEquals(false, row.search(8));
		assertEquals(false, row.search(7));
		
	}
	
	@Test
	public void testAddField() {
		row.clear();
		
		row.addField(new Field(4));
		assertEquals(true, row.search(4));
		assertEquals(1, row.getRowSize().intValue());
		
		row.addField(new Field(1));
		assertEquals(true, row.search(1));
		assertEquals(2, row.getRowSize().intValue());
		
	}
	
	

}
