
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CaptureKeyEvents {

	private JFrame frame;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaptureKeyEvents window = new CaptureKeyEvents();
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
	public CaptureKeyEvents() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// create frame and bounds and default close operation
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create label and set horizontal alignment
		label = new JLabel("Key Events");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		// adds label to the "North" of the layout
		frame.getContentPane().add(label, BorderLayout.NORTH);
		
		// pass KeyEventsHandler to frame's mouse listener
		frame.addKeyListener(new KeyEventsHandler());
	}
	
	
	/**
	 * 
	 * @author gabrielferraz
	 * class that handles key events
	 */
	private class KeyEventsHandler implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			label.setText("key typed");
		}

		@Override
		public void keyPressed(KeyEvent e) {
			label.setText("key pressed");
		}

		@Override
		public void keyReleased(KeyEvent e) {
			label.setText("key released");
		}
		
	}

}
