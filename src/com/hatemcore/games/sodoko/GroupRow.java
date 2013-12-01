package com.hatemcore.games.sodoko;

import java.util.ArrayList;

/**
 * Represent a row in the group.
 * @author Hatem Al Amri
 *
 */
public class GroupRow {

	/** Number of row corresponding to the group. **/
	private Integer rowNumber;
	
	/** Fields of the row. **/
	private ArrayList<Field> values;
	
	/**
	 * Constructor.
	 * @param rowNumber
	 */
	public GroupRow(Integer rowNumber){
		
		this.setRowNumber(rowNumber);
		
	}
	
	/**
	 * Constructor.
	 * @param rowNumber
	 * @param values
	 */
	public GroupRow(Integer rowNumber,ArrayList<Field> values){
		
		this.setRowNumber(rowNumber);
		this.values.addAll(values);
		
	}
	
	/**
	 * Get certain field in the row.
	 * @param fieldNumber
	 * @return field
	 */
	public Field getField(Integer fieldNumber){
		return values.get(fieldNumber - 1);
	}
	
	/**
	 * Search about value in group row.
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

	public Integer getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(Integer rowNumber) {
		this.rowNumber = rowNumber;
	}
}
