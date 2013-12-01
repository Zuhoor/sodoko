package com.hatemcore.games.sudoku;

import java.util.ArrayList;

/**
 * Represent a full column in the game.
 * @author Hatem Al Amri
 *
 */
public class Column {
	
	/** Column number from the left. **/
	private Integer columnNumber;
	
	/** Array of fields on the column. **/
	private ArrayList<Field> fields = new ArrayList<Field>();

	public Column(){
		
	}
	
	/**
	 * Constructor.
	 * @param columnNumber
	 */
	public Column(Integer columnNumber){
		
		this.setColumnNumber(columnNumber);
		
	}
	
	/**
	 * Add field at the end of the column.
	 * @param field
	 */
	public void addField(Field field){
		fields.add(field);
	}
	
	public void clear(){
		fields.clear();
	}
	
	public Integer getColumnSize(){
		return fields.size();
	}
	
	/**
	 * Search about value in the column.
	 * @param value
	 * @return true if found
	 */
	public Boolean search(Integer value){
		
		for(int i=1;i<=fields.size();i++){
			if(fields.get(i-1).getValue() == value){
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Get number of columns in the game.
	 * @return number of columns
	 */
	public static Integer getNumberOfColumns(){
		return (Game.horFieldsNumber * Game.horGroupesNumber);
	}
	
	public static Integer getColumnNumberByFieldNumber(Integer fieldNo){
		Integer columnNo;
		
		if(fieldNo <= Column.getNumberOfColumns())return fieldNo;
		
		{
			columnNo = fieldNo - Column.getNumberOfColumns();
			
		}while(columnNo > Column.getNumberOfColumns());
		
		return columnNo;
	}
	
	//
	// Getters & Setters
	//
	public ArrayList<Field> getFields() {
		return fields;
	}

	public void setFields(ArrayList<Field> fields) {
		this.fields = fields;
	}

	public Integer getColumnNumber() {
		return columnNumber;
	}

	public void setColumnNumber(Integer columnNumber) {
		this.columnNumber = columnNumber;
	}



}
