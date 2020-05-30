package commandmanager;

import java.util.*;

public class BinarySearchTree {

	private BiNode root;
	
	/**
	 * BST constructor
	 * @param root: root node
	 */
	public BinarySearchTree(BiNode root) {
		this.root = root;
	}
	
	/**
	 * Inserts student into the binary search tree
	 * @param first: student first name
	 * @param last: student last name
	 */
	public void insert(String first, String last) {
		
		// insert node
		//generate id
		// default score = 0
	}
	
	/**
	 * Prints score for a given student
	 * @param num: number of the specific student
	 */
	public void score(int num) {
		// only valid when following insert or search command
	}
	
	/**
	 * Removes a student from the BST
	 * @param first: student first name
	 * @param last: student last name
	 */
	public void remove(String first, String last) {
		// remove student or print error message if student does not exist
	}
	
	/**
	 * Removes all records associated with a given section number from the tree
	 * @param secNumber: the section number
	 */
	public void removeSection(int secNumber) {
		
	}
	
	/**
	 * Return all students with a given name
	 * @param name: the name to be searched for 
	 */
	public void search(String name) {
		
	}
	
	/**
	 * Return a dump of BST associated with current section
	 */
	public void dumpsection() {
		
	}
	
	/**
	 * Checks score of each student, assigning corresponding letter grade
	 * and reporting how many students are in each grade level
	 */
	public void grade() {
		
	}
	/**
	 * Report all student pairs whose scores are within a difference given by (less than or equal to)
	 * score in the current section. If no score is given, then the default value is 0, which
	 * means that the pair should have the same score. At the end of the report, a number should
	 * be reported about how many pairs were found in this command
	 * @param score
	 */
	public void findPair(int score) {
		
	}
}
