import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.SpringLayout;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTable;


public class BusyBox {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusyBox window = new BusyBox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BusyBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Desktop.background"));
		frame.setBounds(100, 100, 450, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Busy Box");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 371, SpringLayout.WEST, frame.getContentPane());
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		// tabbed pane
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		springLayout.putConstraint(SpringLayout.NORTH, tabbedPane, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, tabbedPane, 90, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, tabbedPane, 70, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, tabbedPane, 277, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(tabbedPane);
		
		JTextField textField = new JTextField("Field one");
		JTextField textFieldTwo = new JTextField("Field two");
		
		tabbedPane.addTab("Field one", textField);
		tabbedPane.addTab("Field two", textFieldTwo);
		
		
		// list
		String [] animals = {"dog", "cat", "bird", "fish"};
//		frame.getContentPane().add(new JScrollPane());
		JList<Object> list = new JList<>(animals);
		springLayout.putConstraint(SpringLayout.NORTH, list, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, list, -30, SpringLayout.WEST, tabbedPane);
		frame.getContentPane().add(list);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JButton btnClickMe = new JButton("Click me");
		springLayout.putConstraint(SpringLayout.NORTH, btnClickMe, 22, SpringLayout.SOUTH, list);
		springLayout.putConstraint(SpringLayout.WEST, btnClickMe, 26, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnClickMe);
		
		JCheckBox chckbxCheckMe = new JCheckBox("Check me");
		springLayout.putConstraint(SpringLayout.NORTH, chckbxCheckMe, 176, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, chckbxCheckMe, 0, SpringLayout.EAST, btnClickMe);
		frame.getContentPane().add(chckbxCheckMe);
		
		JRadioButton rdbtnIAmA = new JRadioButton("I am a radio button");
		springLayout.putConstraint(SpringLayout.WEST, rdbtnIAmA, 0, SpringLayout.WEST, list);
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnIAmA, -6, SpringLayout.NORTH, chckbxCheckMe);
		frame.getContentPane().add(rdbtnIAmA);
		
		// combo box
		String [] fruits = {"apple", "pear", "banana"};
		JComboBox<Object> comboBox = new JComboBox<>(fruits);
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 0, SpringLayout.NORTH, btnClickMe);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, -135, SpringLayout.EAST, frame.getContentPane());

		frame.getContentPane().add(comboBox);
		
		// table
		String [] columns = {"Name", "Age", "Profession"};
		String [][] people = {
			{"Joe", "30", "Dentist"},
			{"Martha", "33", "Lawyer"},
			{"Marcus", "23", "Engineer"}
		};
		
		table = new JTable(people, columns);
		springLayout.putConstraint(SpringLayout.WEST, table, 174, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 100, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, table, 0, SpringLayout.SOUTH, frame.getContentPane());
		
//		frame.getContentPane().add(new JScrollPane(table));


	}
}
