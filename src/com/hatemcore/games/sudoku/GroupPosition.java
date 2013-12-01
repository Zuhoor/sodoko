package com.hatemcore.games.sudoku;

/**
 * Represent group position.
 * @author Hatem Al Amri
 *
 */
public class GroupPosition {
	
	/** Position from the left. **/
	private Integer left;
	
	/** Position from the top. **/
	private Integer top;
	
	/**
	 * Dummy Constructor.
	 */
	public GroupPosition(){
		// Empty
	}
	
	/**
	 * Constructor.
	 * @param left
	 * @param top
	 */
	public GroupPosition(Integer left,Integer top){
		
		this.left = left;
		this.top = top;
	}
	
	/**
	 * Get next group position for a certain position.
	 * @param position
	 * @return next group position
	 */
	public static GroupPosition nextPosition(GroupPosition position){
		GroupPosition nextPosition = new GroupPosition();
		
		/*
		 * If the next group is in the same row of groups, shift it one
		 * step to the right.
		 */
		if(position.getLeft() < Game.horGroupesNumber){
			
			nextPosition.setLeft(position.getLeft() + 1);
			nextPosition.setTop(position.getTop());
		
		/*
		 * If the next group is in the next row of groups, shift it one
		 * step to the right and one step to the bottom.
		 */
		}else if(position.getLeft() == Game.horGroupesNumber && position.getTop() < Game.verGroupesNumber){
			
			nextPosition.setLeft(1);
			nextPosition.setTop(position.getTop() + 1);
		
		/*
		 * If there is no group after this position.Then return null value.
		 */
		}else{
			
			return null;
		}
		
		return nextPosition;
		
	}

	public Integer getLeft() {
		return left;
	}

	public void setLeft(Integer left) {
		this.left = left;
	}

	public Integer getTop() {
		return top;
	}

	public void setTop(Integer top) {
		this.top = top;
	}
	

	

}
