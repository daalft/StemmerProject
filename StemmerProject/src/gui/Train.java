package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;

import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import stemmer.GermanStemmer;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Train extends javax.swing.JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea input;
	private JTextPane result;
	private JLabel infotext0;
	private JLabel infotext2;
	private JLabel infotext1;
	private JLabel eingabe;
	private JLabel ausgabe;
	private JButton stemButton;
	private GermanStemmer gs;
	
	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new Train());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public Train() {
		super();
		initGUI();
		gs = new GermanStemmer();
		stemButton.requestFocus();
	}
	
	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(600, 500));
			this.setLayout(null);
			{
				input = new JTextArea();
				this.add(input);
				input.setText("Geben Sie hier den Text ein!");
				input.setBounds(17, 140, 571, 129);
				input.addFocusListener(new FocusListener() {

					@Override
					public void focusGained(FocusEvent arg0) {
						input.setText("");
						result.setText("");
					}

					@Override
					public void focusLost(FocusEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				
				});
			}
			{
				result = new JTextPane();
				this.add(result);
				result.setText("Resultat");
				result.setBounds(17, 308, 571, 130);
				result.setEditable(false);
			}
			{
				stemButton = new JButton();
				this.add(stemButton);
				stemButton.setText("Los!");
				stemButton.setBounds(17, 450, 572, 39);
				stemButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						stemInput();
					}
				});
			}
			{
				ausgabe = new JLabel();
				this.add(ausgabe);
				ausgabe.setText("Ausgabe");
				ausgabe.setBounds(17, 281, 64, 16);
				ausgabe.setEnabled(false);
			}
			{
				eingabe = new JLabel();
				this.add(eingabe);
				eingabe.setText("Eingabe");
				eingabe.setBounds(17, 112, 64, 16);
				eingabe.setEnabled(false);
			}
			{
				infotext1 = new JLabel();
				this.add(infotext1);
				infotext1.setText("Um zu verstehen, was ein Stemmer macht, können Sie hier einen beliebigen Text (ohne ");
				infotext1.setBounds(17, 50, 571, 16);
			}
			{
				infotext2 = new JLabel();
				this.add(infotext2);
				infotext2.setText("Satzzeichen) eingeben und auf den Button unten klicken, um das \"gestemmte\" Resultat zu sehen.");
				infotext2.setBounds(17, 78, 571, 16);
			}
			{
				infotext0 = new JLabel();
				this.add(infotext0);
				infotext0.setText("Was macht ein Stemmer?");
				infotext0.setBounds(17, 12, 571, 28);
				infotext0.setFont(new java.awt.Font("Segoe UI",1,16));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void stemInput () {
		String[] split = input.getText().split(" ");
		StringBuilder sb = new StringBuilder();
		for (String s : split) {
			sb.append(gs.stem(s)).append(" ");
		}
		result.setText(sb.toString());
	}

}
