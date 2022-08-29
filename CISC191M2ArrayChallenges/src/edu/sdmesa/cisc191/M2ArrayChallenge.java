package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author 
 * @author 
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 
 * 
 * Responsibilities of class:
 * 
 */
/**
 */
public class M2ArrayChallenge
{
	/**
	 * Purpose: Find the largest element in the array given
	 * 
	 * @param array to search
	 * @return largest element
	 */
	public static boolean contains(int[] array, int value)
	{
		// TODO: return the correct value
		for (int i = 0; i < array.length; ++i) {	// iterates thru array, if value is found method evaluates to true
			if (array[i] == value) {
				return true;
			}
		}
		
		return false;								// else returns false, no need to type else
	}

	
	// Use this template for the methods
	/**
	 * Purpose:
	 * 
	 * @param array
	 * @return 
	 * @return
	 */
	public static int find(int[] array, int value)
	{
		if (array.length > 0) {
			for (int i = 0; i < array.length; ++i)
				if (array[i] == value) {
					return i;
				}
		}
		
		
		return -1;
	}
}
