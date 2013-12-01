package com.hatemcore.games.sodoko;

import java.util.ArrayList;
import java.util.Random;

/**
 * Game generator of objects.
 * @author Hatem Al Amri
 *
 */
public class Generator {

	static ArrayList<Row> rows = new ArrayList<Row>();
	static ArrayList<Column> columns = new ArrayList<Column>();
	static ArrayList<Group> groups = new ArrayList<Group>();
	
	/**
	 * Generate rows of game.
	 */
	public static void generateRows(){
		
		for(int rowNo=1;rowNo <= Row.getNumberOfRows(); rowNo++){
			Row row = new Row(rowNo);
			
			rows.add(row);
		}
		
	}
	
	public static void generateFields(){
		

		for(int fieldNo=1;fieldNo <= Field.getNumberofFields();fieldNo++){
			
			Integer rowNo = Row.getRowNumberByFieldNumber(fieldNo);
			Integer columnNo = Column.getColumnNumberByFieldNumber(fieldNo);
			Integer groupTop = (int) Math.ceil(rowNo / Game.verFieldsNumber);
			Integer groupLeft = (int) Math.ceil(rowNo / Game.verFieldsNumber);
			
			Integer fieldValue = generateValue();
			Field field = new Field();
			rows.get(rowNo -1).addField(field);
			columns.get(columnNo-1).addField(field);
			
			Integer rowOfGroups = (int) Math.ceil(rowNo / Game.verFieldsNumber);
			
			
			while(rows.get(rowNo -1).search(fieldValue) || columns.get(columnNo -1).search(fieldValue)){
				
				fieldValue = generateValue();
			}
			
			field.setValue(fieldValue);
			field.setCorrectValue(fieldValue);


			
		}
	}
	
	/**
	 * Generate columns of game.
	 */
	public static void generateColumns(){
		
		for(int columnNo=1;columnNo <= Column.getNumberOfColumns();columnNo++){
			Column column = new Column(columnNo);
			columns.add(column);
		}
	}
	
	/**
	 * Generate groups of game.
	 */
	public static void generateGroups(){
		
		GroupPosition groupPosition = new GroupPosition(1,1);
		for(int groupNo=1;groupNo <= Group.getTotalGroupsNumber();groupNo++){
			
			Group group = new Group(groupPosition);
			groups.add(group);
			generateGroupRows(groupNo);
			generateGroupColumns(groupNo);
			groupPosition = GroupPosition.nextPosition(groupPosition);
		}
	}
	
	/**
	 * Generate rows of the group.
	 * @param groupId
	 */
	public static void generateGroupRows(Integer groupId){
		
		for(int rowNo=1;rowNo <= Game.verFieldsNumber;rowNo++){
			GroupRow row = new GroupRow(rowNo);
			groups.get(groupId-1).addGroupRow(row);
		}
		
	}
	
	/**
	 * Generate columns of the group.
	 * @param groupId
	 */
	public static void generateGroupColumns(Integer groupId){
		
		for(int columnNo=1;columnNo <= Game.horFieldsNumber;columnNo++){
			GroupColumn column = new GroupColumn(columnNo);
			groups.get(groupId-1).addGroupColumn(column);
		}
		
	}
	

	/**
	 * Generate a integer value 1-9
	 * @return Integer
	 */
	private static Integer generateValue(){
		Random random = new Random();
		return random.nextInt(9-1+1) + 1;
	}
}
