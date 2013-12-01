package com.hatemcore.games.sodoko;

/**
 * Field Position corresponding to the group.
 * @author Hatem Al Amri
 *
 */
public class FieldPosition {
	/** Row number in the group. **/
	private Integer row;
	
	/** Column number in the group. **/
	private Integer column;
	
	/**
	 * Constructor.
	 * @param row
	 * @param column
	 */
	public FieldPosition(Integer row,Integer column){
		
		this.row = row;
		this.column = column;
	}
	
	//
	// Getters & Setters
	//
	
	public Integer getColumn() {
		return column;
	}
	public void setColumn(Integer column) {
		this.column = column;
	}
	public Integer getRow() {
		return row;
	}
	public void setRow(Integer row) {
		this.row = row;
	}
	

}
