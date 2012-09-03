package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
public class StartPanel extends javax.swing.JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel text0;
	private JLabel text7;
	private JLabel text6;
	private JLabel text5;
	private JLabel text4;
	private JLabel text3;
	private JLabel text2;
	private JLabel text1;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new StartPanel());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public StartPanel() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setPreferredSize(new Dimension(600, 500));
			this.setLayout(null);
			{
				text0 = new JLabel();
				this.add(text0, new GridBagConstraints(0, 0, 4, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				text0.setText("Willkommen zu dem Interaktiven Lernprogramm \"Was ist ein Stemmer\"");
				text0.setFont(new java.awt.Font("Segoe UI",1,16));
				text0.setBounds(25, 35, 549, 22);
			}
			{
				text1 = new JLabel();
				this.add(text1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				text1.setText("In diesem Programm werden Sie erst die Möglichkeit haben, aufgrund einer Eingabe");
				text1.setBounds(25, 115, 549, 16);
			}
			{
				text2 = new JLabel();
				this.add(text2, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				text2.setText("zu sehen, wie die Ausgabe aussieht, nachdem der Stemmer darüber gelaufen ist.");
				text2.setBounds(25, 160, 549, 16);
			}
			{
				text3 = new JLabel();
				this.add(text3);
				text3.setText("Danach können Sie sich selbst als \"Stemmer\" versuchen, indem Sie versuchen,");
				text3.setBounds(25, 227, 549, 16);
			}
			{
				text4 = new JLabel();
				this.add(text4);
				text4.setText("vorgegebene Texte zu \"stemmen\". Wenn Sie verstanden haben, was ein Stemmer macht,");
				text4.setBounds(25, 272, 549, 16);
			}
			{
				text5 = new JLabel();
				this.add(text5);
				text5.setText("wird Ihnen das sicherlich nicht schwer fallen.");
				text5.setBounds(25, 316, 549, 16);
			}
			{
				text6 = new JLabel();
				this.add(text6);
				text6.setText("Um durch das Programm zu nagivieren, benutzen Sie bitte den Button \"Weiter\".");
				text6.setBounds(25, 386, 549, 16);
			}
			{
				text7 = new JLabel();
				this.add(text7);
				text7.setText("Viel Spass wünscht die Computerlinguistik Trier!");
				text7.setBounds(25, 453, 549, 16);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
