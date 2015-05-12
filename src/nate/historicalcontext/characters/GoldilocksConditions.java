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
				
				
				setStoryFinished(true);
			}
			
		});
	}

}
