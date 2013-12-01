package com.hatemcore.games.sodoko;

/**
 * Represent a field in the group.
 * @author Hatem Al Amri
 */
public class Field {

	/** Value entered by user **/
	private Integer value;
	
	/** Correct value of field **/
	private Integer correctValue;
	
	/** Position of field on the group **/
	private FieldPosition position;
	
	/** Is looked for editing **/
	private Boolean locked = false;
	
	/**
	 * Dummy constructor.
	 */
	public Field(){
		// Empty
	}
	
	/**
	 * Field constructor.
	 * @param value
	 */
	public Field(Integer value){
		this.value = value;
		this.correctValue = value;
	}
	
	/**
	 * Field constructor.
	 * @param value
	 * @param position
	 */
	public Field(Integer value,FieldPosition position){
		this.value = value;
		this.correctValue = value;
		this.position = position;
	}
	
	/**
	 * Field constructor.
	 * @param value
	 * @param position
	 * @param locked
	 */
	public Field(Integer value,FieldPosition position,Boolean locked){
		this.value = value;
		this.correctValue = value;
		this.position = position;
		this.locked = locked;
	}
	
	/**
	 * Is the value entered by user correct?
	 * @return true if correct otherwise false
	 */
	public Boolean isCorrect(){
		if(this.value == this.correctValue) return true;
		return false;
	}
	
	/**
	 * Get number of fields in the group.
	 * @return number of fields in the group
	 */
	public static Integer getNumberofFieldsInGroup(){
		return (Game.horFieldsNumber * Game.verFieldsNumber);
	}
	
	/**
	 * Get number of fields in the row.
	 * @return number of fields in the row
	 */
	public static Integer getNumberOfFieldsInRow(){
		return (Game.horFieldsNumber * Game.horGroupesNumber);
	}
	
	/**
	 * Get number of fields in the group.
	 * @return number of fields in the group
	 */
	public static Integer getNumberOfFieldsInColumn(){
		return (Game.verFieldsNumber * Game.verGroupesNumber);
	}
	
	
	/**
	 * Get number of fields in the game.
	 * @return number of fields in the game
	 */
	public static Integer getNumberofFields(){
		return (Field.getNumberofFieldsInGroup() * Group.getTotalGroupsNumber());
	}

	//
	// Getter & Setters
	//
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public FieldPosition getPosition() {
		return position;
	}

	public void setPosition(FieldPosition position) {
		this.position = position;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public Integer getCorrectValue() {
		return correctValue;
	}

	public void setCorrectValue(Integer correctValue) {
		this.correctValue = correctValue;
	}
}
