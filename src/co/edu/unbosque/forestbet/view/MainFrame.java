package co.edu.unbosque.forestbet.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import co.edu.unbosque.forestbet.util.FontFactory;

/**
 * This is the main frame of the application
 * @author anfeespi
 */
public class MainFrame extends JFrame{

	/**
	 * The serial version ID for this class --is autogenerated
	 */
	private static final long serialVersionUID = -5351482145221322487L;
	
	/**
	 * The Panel of the selector items, this is used commonly in html like a navbar
	 */
	private JPanel selector;
	/**
	 * The button of login
	 */
	private JButton loginButton;
	/**
	 * The button of the wiki
	 */
	private JButton wikiButton;
	/**
	 * The button of bets
	 */
	private JButton betButton;
	/**
	 * The button of race
	 */
	private JButton raceButton;
	/**
	 * The font of the buttons, this is a constant variable
	 */
	private static Font BUTTON_FONT = FontFactory.newFont("Lexend-Regular.ttf", 0, 16);
	
	/**
	 * Constructor
	 */
	public MainFrame() {
		setSize(800, 500);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		Image icon = new ImageIcon(getClass().getResource("/img/logoforest.png")).getImage();
		setIconImage(icon);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initComponents();
	}
	
	/**
	 * Method to init the components
	 */
	public void initComponents() {
		loginButton = new JButton("Login:");
		loginButton.setFont(BUTTON_FONT);
		loginButton.setForeground(Color.white);
		loginButton.setBounds(0, 0, 200, 60);
		loginButton.setBackground(new Color(Integer.parseInt("38383F", 16)));
		loginButton.setVisible(true);
		
		wikiButton = new JButton("Wiki:");
		wikiButton.setFont(BUTTON_FONT);
		wikiButton.setForeground(Color.white);
		wikiButton.setBounds(200, 0, 200, 60);
		wikiButton.setBackground(new Color(Integer.parseInt("38383F", 16)));
		wikiButton.setVisible(true);
		
		betButton = new JButton("Bet:");
		betButton.setFont(BUTTON_FONT);
		betButton.setForeground(Color.white);
		betButton.setBounds(400, 0, 200, 60);
		betButton.setBackground(new Color(Integer.parseInt("38383F", 16)));
		betButton.setVisible(true);
		
		raceButton = new JButton("Race:");
		raceButton.setFont(BUTTON_FONT);
		raceButton.setForeground(Color.white);
		raceButton.setBounds(600, 0, 200, 60);
		raceButton.setBackground(new Color(Integer.parseInt("38383F", 16)));
		raceButton.setVisible(true);
		
		fillSelector();
	}
	
	/**
	 * Method to fill the navbar
	 */
	public void fillSelector() {
		selector = new JPanel();
		selector.setLayout(null);
		selector.setBounds(0, 0, 800, 60);
		selector.setBackground(new Color(Integer.parseInt("38383F", 16)));
		
		selector.add(loginButton);
		selector.add(wikiButton);
		selector.add(betButton);
		selector.add(raceButton);

		selector.setVisible(true);
		
		add(selector);
	}	

}
