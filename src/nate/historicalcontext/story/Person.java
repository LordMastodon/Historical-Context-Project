package nate.historicalcontext.story;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import nate.historicalcontext.HistoricalContextProject;

public class Person {
	
	static String consoleName;
	
	static DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	static Date date = new Date();

    public static String latestInput;

    public static boolean hasRequestedInput = false;
	
	static boolean disableCharacterName = false;
	
	public static void setDisableCharacterName(boolean disable) {
		disableCharacterName = disable;
	}
	
	public boolean getDisableCharacterName() {
		return disableCharacterName;
	}
	
	public static void setConsoleName(String name) {
		consoleName = name;
	}
	
	public String getConsoleName() {
		return consoleName;
	}
	
	public static void printToConsole(String message) {
		if(disableCharacterName) {
			HistoricalContextProject.console.printToConsole(message);
		} else {
			HistoricalContextProject.console.printToConsole("[" + consoleName + "] " + message);
		}
	}

    public static void recieveInput(String input) {
        latestInput = input;
    }

    public void requestInput(String message) {
        hasRequestedInput = true;
        printToConsole(message);
    }

}
