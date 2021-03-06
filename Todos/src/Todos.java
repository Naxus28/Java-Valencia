import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 * @author gabrielferraz
 */
public class Todos {
	/**
	 * class variables
	 */
	static List<String> todos = new ArrayList<String>();
	static String todosFromUserInput;
	static String menuChoice;
	static String newTodo;
	static String selectedValue;
	static final String inputTodosDirections = "Please input one or more todos. Separate each item by a comma";
	static final String inputTodoDirections = "Please input a new todo";
	static String todoProgramDirections = "This is a 'todo' program that allows you to 1.) create a list of todos,"
			+ " 2.) add/delete a todo, 3.) sort todos. A series of menus were design to help you acomplish these tasks. Let's begin!";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, todoProgramDirections, "Program Directions", JOptionPane.INFORMATION_MESSAGE);
		todosFromUserInput = getTodosFromUserInput("Please input todos", "THESE ARE YOUR TODOS: ");
		createTodosArray(todosFromUserInput);
		menuAction();
	}
	
	/**
	 * execute a "todo" action depending on user's choice
	 */
	private static void menuAction() {
		menuChoice = getUserChoiceFromMenu();
		
		if (menuChoice == "Add todo") {
			addTodo();
		} else if (menuChoice == "Delete todo") {
			deleteTodo();
		} else if (menuChoice == "Sort todos") {
			sortTodos();
		} else if (menuChoice == "Exit") {
			JOptionPane.showMessageDialog(null, "GOODBYE");
	    	System.exit(0);
		}
	}
	
	/**
	 * get a list of todos as a string from the user
	 * @param inputMsg
	 * @param todoMsg
	 * @return
	 */
	private static String getTodosFromUserInput(String inputMsg, String todoMsg) {
		String todoListFromUser;
		String instructions = todos.size() == 0 ? inputTodosDirections : inputTodoDirections;
		
		do {
			todoListFromUser = JOptionPane.showInputDialog(instructions).trim();
			
			if (todoListFromUser.length() == 0) {
				JOptionPane.showMessageDialog(null, inputMsg, "Invalid Input", JOptionPane.ERROR_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, todoMsg + todoListFromUser, todoMsg, JOptionPane.PLAIN_MESSAGE);
			}
		} while(todoListFromUser.length() == 0);
		
		return todoListFromUser;
	}
	
	/**
	 * gets user's choice
	 * @return
	 */
	private static String getUserChoiceFromMenu() {
		String[] options = { "Add todo", "Delete todo", "Sort todos", "Exit" };
		return optionMenu("Choose an action", "Actions menu", options);
	}
	
	/**
	 * utility that displays todos if there are any
	 */
	public static void showTodos() {
		String msg = todos.size() > 0 ? "THESE ARE YOUR TODOS: " + getTodosAsString() : "There are no todos on your list.";
		JOptionPane.showMessageDialog(null, msg, "Todo List", JOptionPane.PLAIN_MESSAGE);
	}
	
	/**
	 * add a todo to the list and display to user
	 */
	private static void addTodo() {
		newTodo = getTodosFromUserInput("Add a todo to the list", "THIS IS THE NEW TODO: ");
		todos.add(newTodo);
		showTodos();
		menuAction();
	}
	
	/**
	 * delete a todo from todos and display to user
	 */
	private static void deleteTodo() {
		if(todos.size() > 0) {
			String [] todosArray = todos.toArray(new String[todos.size()]);
			String deletedTodo = optionMenu("Choose a todo to delete", "DELETE TODO", todosArray);
			todos.remove(deletedTodo);
			showTodos();
		} else {
			showTodos();
		}
		
		menuAction();
	}
	
	/**
	 * sort todos and display to user
	 */
	private static void sortTodos() {
		Collections.sort(todos);
		String sortedTodos = getTodosAsString();
		JOptionPane.showMessageDialog(null, "THESE ARE YOUR SORTED TODOS: " + sortedTodos, "TODO LIST", JOptionPane.INFORMATION_MESSAGE);
		menuAction();
	}	
	
	/**
	 * convert todos from ArrayList to String to remove [] for display
	 * @return
	 */
	private static String getTodosAsString() {
		String todoList = "";
		String newline = System.getProperty("line.separator");
		
		for(String todo : todos) {
			todoList += (newline + todo); 
		}
		
		return todoList;
	}
	
	/**
	 * utility that returns user's chosen option from a menu
	 * @param title
	 * @param content
	 * @param options
	 * @return
	 */
	private static String optionMenu(String content, String title, String[] options) {
		 String selectedValue = (String) JOptionPane.showInputDialog(null, content, title,
					JOptionPane.INFORMATION_MESSAGE, null,
					options, options[0]);
		 
		 return selectedValue;
	}
	
	/**
	 * utility that splits a string into an array using comma as a delimiter
	 * @param todoListFromUser
	 */
	static private void createTodosArray(String todoListFromUser) {
		List<String> rawTodos = new ArrayList<String>(Arrays.asList(todoListFromUser.split(",")));
		
		// trim off white space--if present--from todo
		for(String rawTodo: rawTodos) {
			todos.add(rawTodo.trim());
		}
	} 
}
