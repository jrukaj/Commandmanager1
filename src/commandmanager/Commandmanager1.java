package commandmanager;
import java.io.*;
import java.util.*;

/**
 * Parses commands, storing them in an array to be used for further evaluation.
 * @author Jonathan Rukaj (jrukaj)
 * @author Dilan Prasad
 *
 */
public class Commandmanager1<E> {
	
	private class Command{
		private String cmd;
		private String param1 = null;
		private String param2 = null;
		
		public Command() {
			// nothing to initialize
		}
		
		/**
		 * Gets the command string
		 * @return string representing the command
		 */
		public String getCmd() {
			return cmd;
		}
		
		/**
		 * Gets the first parameter
		 * @return string representing the first parameter passed
		 */
		public String getParam1() {
			return param1;
		}
		
		/**
		 * Gets the second parameter, if there is one
		 * @return string representing the second parameter
		 */
		public String getParam2() {
			return param2;
		}
		
		/**
		 * Sets command field
		 * @param command
		 */
		public void setCmd(String command) {
			cmd = command;
		}
		
		/**
		 * Sets the first parameter argument
		 * @param string
		 */
		public void setParam1(String string) {
			param1 = string;
		}
		
		/**
		 * Sets the second parameter argument
		 * @param string
		 */
		public void setParam2(String string) {
			param2 = string;
		}
	}

	private File file;
	private ArrayList<Command> cmd;
	private Scanner scan;
	/**
	 * CmdProcessor constructor
	 */
	public Commandmanager1() {
		// nothing to initialize
	}
	
	/**
	 * CmdProcessor 
	 * @param filename: name of the file
	 */
	public Commandmanager1(String filename) {
		try {
			file = new File(filename);
			scan = new Scanner(file);
		}
		catch (FileNotFoundException e) {
			System.out.println("The file you are trying to open does not exist bröther.\n");
			e.printStackTrace();
			System.exit(0);
		}
		cmd = new ArrayList<Command>();
	}
	
	/**
	 * Scans through the input file, adding commands to an ArrayList
	 * @return list with commands
	 */
	public ArrayList<Command> parseCmd(){
		while (scan.hasNextLine()) {
			// Create command object and scanner to read through individual words 
			// of each line
			Command temp = new Command();
			Scanner getCmd = new Scanner(scan.nextLine());
			// Set Command object fields
			temp.setCmd(getCmd.next());
			getCmd.next();
			temp.setParam1(getCmd.next());
			if (getCmd.hasNext()) {
				getCmd.next();
				temp.setParam2(getCmd.next());
			}
			
			cmd.add(temp);
			getCmd.close();
			scan.nextLine();
		}
		scan.close();
		return cmd;
	} 
	
	/**
	 * Process the commands, writing correct output
	 * @param list
	 */
	public void processCmd(ArrayList<Command> list) {
		for (Command command: list) {
			int secNum = 1;
			if (command.getCmd() == "section") {
				secNum = Integer.parseInt(command.getParam1());
				// do something
				continue;
			}
			
			switch (command.getCmd()) {
			case "insert":
				// set section number, insert student
			case "remove":
				// access tree, remove student 
			case "score":
				// calculate score 
			case "dumpsection":
				
			case "findpair":
				
			case "search":
				String first, last;
				if (command.getParam2() == null) {
					// search by first name only
					first = command.getParam1();
				}
				else {
					first = command.getParam1();
					last = command.getParam2();
					// search by first and last name
				}
			case "removesection":
				
			case "grade":
			}
		}
	}
	
}
