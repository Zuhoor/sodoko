package com.hatemcode.games.sodoko;

import java.util.ArrayList;

/**
 * Represent the group.
 * @author Hatem Al Amri
 *
 */
public class Group {
	
	/** Rows of the group **/
	private ArrayList<GroupRow> rows = new ArrayList<GroupRow>();
	
	/** Columns of the group. **/
	private ArrayList<GroupColumn> columns = new ArrayList<GroupColumn>();

	/** Group position. **/
	private GroupPosition position;

	/**
	 * Constructor.
	 * @param position
	 */
	public Group(GroupPosition position){
		this.setPosition(position);
	}
	
	/**
	 * Get certain row in the group.
	 * @param rowNumber
	 * @return row
	 */
	public GroupRow getRow(Integer rowNumber){
		return this.rows.get(rowNumber - 1);
	}
	
	/**
	 * Get certain column in the group.
	 * @param columnNumber
	 * @return column
	 */
	public GroupColumn getColumn(Integer columnNumber){
		return this.columns.get(columnNumber - 1);
	}
	
	/**
	 * Get certain field in the group.
	 * @param position
	 * @return field
	 */
	public Field getField(FieldPosition position){
		return (this.getRow(position.getRow())).getField(position.getColumn());
	}
	
	/**
	 * Get supposed number of groups in the game.
	 * @return total number of groups
	 */
	public static Integer getTotalGroupsNumber(){
		return (Game.horGroupesNumber * Game.verGroupesNumber);
	}

	/**
	 * Search about value in the group.
	 * @param value
	 * @return true if found
	 */
	public Boolean serach(Integer value){
		for(int i=1;i<=rows.size();i++){
			
			if(rows.get(i).search(value)){
				return true;
			}
		}
		return false;
	}
	
	
	
	/**
	 * Add new row to the group.
	 * @param row
	 */
	public void addGroupRow(GroupRow row){
		rows.add(row);
	}
	
	/**
	 * Add new column to the group.
	 * @param column
	 */
	public void addGroupColumn(GroupColumn column){
		columns.add(column);
	}

	//
	// Getters & Setters
	//
	public ArrayList<GroupRow> getRows() {
		return rows;
	}


	public void setRows(ArrayList<GroupRow> rows) {
		this.rows = rows;
	}


	public ArrayList<GroupColumn> getColumns() {
		return columns;
	}


	public void setColumns(ArrayList<GroupColumn> columns) {
		this.columns = columns;
	}

	public GroupPosition getPosition() {
		return position;
	}

	public void setPosition(GroupPosition position) {
		this.position = position;
	}


}
