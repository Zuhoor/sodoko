package com.hatemcore.games.sodoko;

import java.util.ArrayList;

/**
 * Represent a full row in the game.
 * @author Hatem Al Amri
 */
public class Row {
	/** Row number from the top. **/
	private Integer rowNumber;
	
	/** Array of fields in the row. **/
	private ArrayList<Field> fields = new ArrayList<Field>();

	/**
	 * Dummy constructor.
	 */
	public Row(){
		
		// Empty
	}
	
	/**
	 * Constructor.
	 * @param rowNumber
	 */
	public Row(Integer rowNumber){
		
		this.setRowNumber(rowNumber);
		
	}
	
	/**
	 * Add field at the end of the row.
	 * @param field
	 */
	public void addField(Field field){
		fields.add(field);
	}
	
	public void clear(){
		fields.clear();
	}
	
	public Integer getRowSize(){
		return fields.size();
	}
	
	/**
	 * Search about value in the row.
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
	 * Get number of rows in the game.
	 * @return number of rows
	 */
	public static Integer getNumberOfRows(){
		return (Game.verFieldsNumber * Game.verGroupesNumber);
	}
	
	/**
	 * Get row number using field number.
	 * @param fieldNo
	 * @return row number
	 */
	public static Integer getRowNumberByFieldNumber(Integer fieldNo){
		return (int) Math.ceil((double)fieldNo/Field.getNumberOfFieldsInRow());
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

	public Integer getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(Integer rowNumber) {
		this.rowNumber = rowNumber;
	}

}
