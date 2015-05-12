package nate.historicalcontext.characters;

import nate.historicalcontext.story.PersonStory;
import nate.historicalcontext.story.Story;

public class GoldilocksConditions extends Story {
	
	public GoldilocksConditions() {
		
		setParentPerson(this);

		setConsoleName("Goldilocks Conditions");
		
		setStoryFinished(false);
		
		setCharacterStory(new PersonStory() {

			@Override
			public void content() throws InterruptedException {
				Thread.sleep(3000);
				printToConsole("This was a very good time for Java to proliferate. That's because");
				Thread.sleep(3000);
				printToConsole("at that tme there was C++, but people needed a programming language that could do");
				Thread.sleep(3000);
				printToConsole("what C++ couldn't. Java came at the perfect time while people were easing into the");
				Thread.sleep(3000);
				printToConsole("Internet. ");

				setStoryFinished(true);
			}
			
		});
	}

}
