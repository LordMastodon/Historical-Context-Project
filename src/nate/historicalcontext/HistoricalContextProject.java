package nate.historicalcontext;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultCaret;

import nate.historicalcontext.characters.*;
import nate.historicalcontext.gui.ConsoleJTextArea;
import nate.historicalcontext.story.*;

@SuppressWarnings("serial")
public class HistoricalContextProject extends JFrame {
	public static ConsoleJTextArea console = new ConsoleJTextArea();
	public static JTextField inputField = new JTextField();
	
	public static Story currentStory;

    public static boolean gameFailed = false;
	
	public static Font font = new Font("Avenir-Light", Font.PLAIN, 12);
	
	private void addComponentsToPane() {
		JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(panel);
        setLayout(new BorderLayout());

		Border border = BorderFactory.createLineBorder(Color.BLACK);
		
		console.setEditable(false);

        JScrollPane consoleScrollPane = new JScrollPane(console);

        console.setBackground(new Color(230, 230, 250));
        console.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		console.setFont(font);

        DefaultCaret caret = (DefaultCaret) console.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		
		inputField.setFont(font);

        inputField.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "enterKeyPressed");
        inputField.getActionMap().put("enterKeyPressed", new AbstractAction() {
            @SuppressWarnings("static-access")
			@Override
            public void actionPerformed(ActionEvent e) {
                if(gameFailed) {
                    System.exit(1);
                } else {
                    console.printToConsole("[Patrick Naughton] " + inputField.getText());

                    if(currentStory != null) {
                        if (currentStory.getParentPerson().hasRequestedInput) {
                            sendInputToCharacter(inputField.getText(), currentStory.getParentPerson());
                            currentStory.hasRequestedInput = false;
                            inputField.setText("");
                        } else {
                            inputField.setText("");
                        }
                    }else {
                        inputField.setText("");
                    }
                }
            }
        });

		getContentPane().add(inputField, BorderLayout.SOUTH);
		getContentPane().add(consoleScrollPane);
    }
	
	private static void createAndShowGUI() {
		HistoricalContextProject frame = new HistoricalContextProject("Historical Context Project");
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		frame.addComponentsToPane();

		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		frame.setVisible(true);
		
		inputField.requestFocusInWindow();
	}
	
	public HistoricalContextProject(String name) {
		super(name);
	}
	
	public static void main(String[] args) throws InterruptedException {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			console.printToConsole("UnsupportedLookAndFeelException caught: \n" + ex.getStackTrace().toString() + "\n");
		} catch (IllegalAccessException ex) {
			console.printToConsole("IllegalAccessException caught: \n" + ex.getStackTrace().toString() + "\n");
		} catch (InstantiationException ex) {
			console.printToConsole("InstantiationException caught: \n" + ex.getStackTrace().toString() + "\n");
		} catch (ClassNotFoundException ex) {
			console.printToConsole("ClassNotFoundException caught: \n" + ex.getStackTrace().toString() + "\n");
		}
		
		UIManager.put("swing.boldMetal", Boolean.FALSE);
		
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
		
		console.append("Hello! This is a text-based game about the creation of Java.");
		console.printToConsole("Your name is Patrick Naughton.");
		console.printToConsole("Here is a bit of backstory:");
		
		currentStory = new Backstory();
        currentStory.executeStory();

        while(!currentStory.getStoryFinished()) {
            Thread.sleep(10);
        }

        currentStory = null;

        console.printToConsole("The time is December 1990.");

        Thread.sleep(3000);
        console.printToConsole("[Patrick Naughton] Dang! Sun Microsystems' C and C++ APIs are horrible!");
        Thread.sleep(3000);
        console.printToConsole("[Patrick Naughton] Maybe I should move to NeXT...");
        Thread.sleep(3000);

        currentStory = new SunMicrosystems();
        currentStory.executeStory();

        while(!currentStory.getStoryFinished()) {
            Thread.sleep(10);
        }

        currentStory = null;

        Thread.sleep(3000);
        console.printToConsole("[James Gosling] Well hello there! I'm part of this now!");
        Thread.sleep(3000);
        console.printToConsole("[Mike Sheridan] So am I!");
        Thread.sleep(3000);
        console.printToConsole("[Sun Microsystems] OK, we're naming this the Green Project now.");
        Thread.sleep(3000);

        currentStory = new Narrator1();
        currentStory.executeStory();

        while(!currentStory.getStoryFinished()) {
            Thread.sleep(10);
        }

        currentStory = null;

        Thread.sleep(3000);
        console.printToConsole("[Bill Joy] I envision a language that combines the power of Mesa and C.");
        Thread.sleep(3000);

        currentStory = new JamesGosling();
        currentStory.executeStory();

        while(!currentStory.getStoryFinished()) {
            Thread.sleep(10);
        }

        currentStory = null;

        Thread.sleep(3000);

        currentStory = new Narrator2();
        currentStory.executeStory();

        while(!currentStory.getStoryFinished()) {
            Thread.sleep(10);
        }

        currentStory = null;

        Thread.sleep(3000);

        currentStory = new TheGreenTeam();
        currentStory.executeStory();

        while(!currentStory.getStoryFinished()) {
            Thread.sleep(10);
        }

        currentStory = null;
        Thread.sleep(3000);
        console.printToConsole("[Narrator] Java was finally unveiled at the SunWorld conference.");
        Thread.sleep(3000);
        console.printToConsole("[Narrator] It quickly received a lot of attention and recognition, and expectations quickly grew that it");
        Thread.sleep(3000);
        console.printToConsole("[Narrator] would become the most widely used language for the Internet.");
        Thread.sleep(3000);

        currentStory = new GoldilocksConditions();
        currentStory.executeStory();

        while(!currentStory.getStoryFinished()) {
            Thread.sleep(10);
        }

        currentStory = null;

        console.setFont(font.deriveFont(Font.BOLD, 20));
        console.printToConsole("GAME END");
        console.setFont(font);

        Thread.sleep(3000);

        currentStory = new Sources();
        currentStory.executeStory();

        while(!currentStory.getStoryFinished()) {
            Thread.sleep(10);
        }

        currentStory = null;
    }
	
	public static void failGame() {
        gameFailed = true;
		console.printToConsole("You failed the game. This application will close once you click the \"Enter\"/\"Return\" key.");
	}

    void sendInputToCharacter(String input, Person person) {
        Person.recieveInput(input);
    }
	
}