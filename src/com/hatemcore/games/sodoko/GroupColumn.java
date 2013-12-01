package com.hatemcore.games.sodoko;

import java.util.ArrayList;

/**
 * Represent a column in the group.
 * @author Hatem Al Amri
 *
 */
public class GroupColumn {
	
	/** Column number corresponding to the group. **/
	private Integer columnNumber;
	
	/** Values of the column. **/
	private ArrayList<Field> values;

	/**
	 * Constructor.
	 * @param columnNumber
	 */
	public GroupColumn(Integer columnNumber){
		
		this.columnNumber = columnNumber;
		
	}
	/**
	 * Constructor.
	 * @param columnNumber
	 * @param fields
	 */
	public GroupColumn(Integer columnNumber, ArrayList<Field> fields){
		
		this.columnNumber = columnNumber;
		this.values.addAll(fields);
		
	}
	
	/**
	 * Get certain field in the column.
	 * @param fieldNumber
	 * @return field
	 */
	public Field getField(Integer fieldNumber){
		return values.get(fieldNumber - 1);
	}
	
	/**
	 * Serach about value in group column.
	 * @param value
	 * @return true if found
	 */
	public Boolean search(Integer value){
		
		for(int i=1;i<=values.size();i++){
			if(values.get(i).getValue() == value){
				return true;
			}
		}
		
		return false;
	}

	//
	// Getters & Setters
	//
	public Integer getColumnNumber() {
		return columnNumber;
	}

	public void setColumnNumber(Integer columnNumber) {
		this.columnNumber = columnNumber;
	}

}
