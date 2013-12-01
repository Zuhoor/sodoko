package com.hatemcore.games.sodoko;

import java.util.ArrayList;

/**
 * Represent a game session.
 * @author Hatem Al Amri
 *
 */
public class Game {

	/** Number of horizontal groups. **/
	public static Integer horGroupesNumber = 3;
	
	/** Number of vertical groups. **/
	public static Integer verGroupesNumber = 3;
	
	/** Number of horizontal fields in the group. **/
	public static Integer horFieldsNumber = 3;
	
	/** Number of vertical fields in the group. **/
	public static Integer verFieldsNumber = 3;
	
	/** Array of groups **/
	public static ArrayList<Group> groups = new ArrayList<Group>();
	
	/**
	 * Main Program
	 * @param args
	 */
	public static void main(String[] args) {
		Generator.generateColumns();
		Generator.generateRows();
		Generator.generateGroups();
		Generator.generateFields();
		
		
		System.out.print("End..");
	}
	


	
}
