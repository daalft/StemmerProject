package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String WELCOME = "Welcome!";
	private final static String TRAINING = "Train!";
	private final static String TESTING = "Test!";
	private JPanel cards;

	private void addCompToPane(Container p) throws IOException {
		//create top and bottom panel
		JPanel titlePane = new JPanel();
		JLabel titleLabel = new JLabel();
		titleLabel.setText("Stemmer Learning Program");
		titleLabel.setFont(new java.awt.Font("Segoe UI",1,20));
		titlePane.add(titleLabel);
		JPanel nextPane = new JPanel();
		JButton next = new JButton("Weiter");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				advance();
			}
		});
		nextPane.add(next);

		//create cards
		JPanel card1 = new JPanel();
		card1.add(new StartPanel());
		JPanel card2 = new JPanel();
		card2.add(new Train());
		JPanel card3 = new JPanel();
		card3.add(new TestUser());
		/*
		 * JPanel card4 = new JPanel();
		 * card4.add(new Thankyou());
		 */

		//add cards to container
		cards = new JPanel(new CardLayout());
		cards.add(card1, WELCOME);
		cards.add(card2, TRAINING);
		cards.add(card3, TESTING);

		//add panels to pane
		p.add(titlePane, BorderLayout.NORTH);
		p.add(cards, BorderLayout.CENTER);
		p.add(nextPane, BorderLayout.SOUTH);
	}

	private static void createAndShowGUI() throws IOException {
		//Create and set up the window.
		JFrame frame = new JFrame("Interactive Stemmer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Create and set up the content pane.
		MainFrame mainF = new MainFrame();
		mainF.addCompToPane(frame.getContentPane());

		//Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	private void advance () {
		CardLayout cl = (CardLayout)(cards.getLayout());
		cl.next(cards);
	}
	
	public static void main(String[] args) {

		//Schedule a job for the event dispatch thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					createAndShowGUI();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

	}
}
