package commandmanager;

public class Student {

	private String firstName;
	private String lastName;
	private int score = 0;
	private int section;
	
	public Student(String first, String last) {
		firstName = first;
		lastName = last;
	}
	
	/**
	 * Gets the section number
	 * @return int representing section number (1, 2 or 3)
	 */
	public int getSection() {
		return section;
	}
	
	/**
	 * Sets the section number, if it is to be changed
	 * @param secNum: the section number to be inserted
	 */
	public void setSection(int secNum) {
		section = secNum;
	}
	
	/**
	 * Gets the student's first name
	 * @return string representing the students first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the student's first name
	 * @param name: the first name of the student
	 */
	public void setFirstName(String name) {
		firstName = name;
	}
	
	/**
	 * Gets the last name of the student
	 * @return string representing the students last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the students last name
	 * @param name: the last name of the student
	 */
	public void setLastName(String name) {
		lastName = name;
	}
	
	/**
	 * Gets the students score
	 * @return int representing the score for a given student
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * Sets score for the student
	 * @param score: value to be inserted
	 */
	public void setScore(int score) {
		this.score = score;
	}
}
