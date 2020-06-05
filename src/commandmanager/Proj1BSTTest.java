package commandmanager;

import static org.junit.Assert.*;

public class Proj1BSTTest {

    @SuppressWarnings("rawtypes")
    private BinarySearchTree tester;


    /**
     * Sets up tester
     */
    public void setUp() {
        tester = new Proj1BST();
    }


    /**
     * Tests insert method
     */
    public void testInsert() {
        tester.insert(new student(7, "james"));
        System.out.print(tester.toString());
    }
}
