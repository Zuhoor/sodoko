package com.hatemcore.games.sodoko.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hatemcore.games.sodoko.Column;
import com.hatemcore.games.sodoko.Field;
import com.hatemcore.games.sodoko.Game;

/**
 * Test for Field class.
 * @author Hatem Al Amri
 *
 */
public class ColumnTest {
	
	private Column column;
	
	@Before
	public void prepareObject(){
		column = new Column();
	}

	@Test
	public void testColumnNumberByFieldNumber() {
		
		Game.horFieldsNumber = 2;
		Game.verFieldsNumber = 3;
		Game.verGroupesNumber = 2;
		Game.horGroupesNumber = 3;
		
		assertEquals(3, Column.getColumnNumberByFieldNumber(3).intValue());
		assertEquals(6, Column.getColumnNumberByFieldNumber(6).intValue());
		assertEquals(5, Column.getColumnNumberByFieldNumber(11).intValue());
		assertEquals(1, Column.getColumnNumberByFieldNumber(19).intValue());

	}
	
	@Test
	public void testNumberOfColumn() {

		Game.horFieldsNumber = 5;
		Game.horGroupesNumber = 2;
		
		assertEquals(10, Column.getNumberOfColumns().intValue());
		
		Game.horFieldsNumber = 2;
		Game.horGroupesNumber = 2;
		
		assertEquals(4, Column.getNumberOfColumns().intValue());

	}
	
	@Test
	public void testSearch() {
		column.clear();
		
		column.addField(new Field(4));
		column.addField(new Field(1));
		column.addField(new Field(2));
		column.addField(new Field(9));

		assertEquals(true, column.search(4));
		assertEquals(true, column.search(1));
		assertEquals(true, column.search(2));
		assertEquals(true, column.search(9));
		assertEquals(false, column.search(8));
		assertEquals(false, column.search(7));
		
	}
	
	@Test
	public void testAddField() {
		column.clear();
		
		column.addField(new Field(4));
		assertEquals(true, column.search(4));
		assertEquals(1, column.getColumnSize().intValue());
		
		column.addField(new Field(1));
		assertEquals(true, column.search(1));
		assertEquals(2, column.getColumnSize().intValue());
		
	}
	
	

}
