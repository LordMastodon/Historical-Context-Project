package nate.historicalcontext.gui;

import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class ConsoleJTextArea extends JTextArea {
	
	public void printToConsole(String message) {
		this.append("\n"+ message);
	}

}
