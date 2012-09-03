package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

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
public class TestUser extends javax.swing.JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel infotext0;
	private JTextArea input;
	private JTextArea analysis;
	private JLabel infotext3;
	private JButton checkInput;
	private JButton nextSentence;
	private JTextPane show;
	private JLabel infotext2;
	private JLabel infotext1;
	private String sentence, gold;
	private ArrayList<String> sentences;
	private String path = "./sentences.txt";
	private Random r;
	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		try {
			frame.getContentPane().add(new TestUser());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public TestUser() throws IOException {
		super();
		initGUI();
		sentences = new ArrayList<String>();
		readInSentences(path);
		r = new Random();
	
	}
	
	private void readInSentences (String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		String l = "";
		while ((l = br.readLine()) != null) {
			sentences.add(l);
		}
		br.close();
	}
	
	private void initGUI() {
		try {
			setPreferredSize(new Dimension(600, 500));
			this.setLayout(null);
			{
				infotext0 = new JLabel();
				this.add(infotext0);
				infotext0.setText("Kann ich \"stemmen\"?");
				infotext0.setBounds(17, 12, 540, 28);
				infotext0.setFont(new java.awt.Font("Segoe UI",1,16));
			}
			{
				infotext1 = new JLabel();
				this.add(infotext1);
				infotext1.setText("Hier haben Sie die Möglichkeit, vorzugeben, Sie seien selbst ein Stemmer, um zu testen, ");
				infotext1.setBounds(17, 60, 540, 16);
			}
			{
				infotext2 = new JLabel();
				this.add(infotext2);
				infotext2.setText("ob Sie verstanden haben, was ein Stemmer macht.");
				infotext2.setBounds(17, 88, 540, 16);
			}
			{
				show = new JTextPane();
				this.add(show);
				show.setBounds(17, 158, 566, 79);
				show.setEditable(false);
			}
			{
				input = new JTextArea();
				this.add(input);
				input.setText("");
				input.setBounds(17, 249, 566, 73);
				
			}
			{
				nextSentence = new JButton();
				this.add(nextSentence);
				nextSentence.setText("Neuer Satz");
				nextSentence.setBounds(17, 431, 265, 47);
				nextSentence.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						nextSentence();
					}		
				});
			}
			{
				checkInput = new JButton();
				this.add(checkInput);
				checkInput.setText("Fertig ?!");
				checkInput.setBounds(308, 431, 275, 47);
				checkInput.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						checkInput();
					}
				});
			}
			{
				infotext3 = new JLabel();
				this.add(infotext3);
				infotext3.setText("Drücken Sie zuerst auf \"Neuer Satz\", geben Sie Ihren Satz ein und klicken Sie auf \"Fertig ?!\"");
				infotext3.setBounds(17, 116, 540, 16);
			}
			{
				analysis = new JTextArea();
				this.add(analysis);
				analysis.setText("Analyse");
				analysis.setBounds(17, 343, 566, 67);
				analysis.setEditable(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void nextSentence () {
		String[] sp = sentences.get(r.nextInt(sentences.size())).split("#");
		sentence = sp[0];
		gold = sp[1];
		show.setText(sentence);
		analysis.setText("");
		input.setText("");
		input.requestFocus();
	}

	private void checkInput () {
		if (input.getText().trim().equals(gold)) {
			analysis.setText("Gut gemacht!");
		} else {
			analysis.setText("Leider ist das nicht korrekt\nDie erwartete Antwort war: " + gold);
		}
	}
}
