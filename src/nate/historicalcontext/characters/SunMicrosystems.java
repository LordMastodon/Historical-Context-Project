package nate.historicalcontext.characters;

import nate.historicalcontext.HistoricalContextProject;
import nate.historicalcontext.story.PersonStory;
import nate.historicalcontext.story.Story;

public class SunMicrosystems extends Story {

    public SunMicrosystems() {
        setParentPerson(this);

        setConsoleName("Sun Microsystems");

        setStoryFinished(false);

        setCharacterStory(new PersonStory() {
            @Override
            public void content() throws InterruptedException {
                Thread.sleep(3000);
                printToConsole("Well hey there Patrick!");
                Thread.sleep(3000);
                printToConsole("We've got this new project called the Stealth Project,");
                Thread.sleep(3000);
                requestInput("Would you like to work on it?");
                while(hasRequestedInput) {
                    Thread.sleep(10);
                }

                if(latestInput.equals("yes") || latestInput.equals("Yes")) {
                    printToConsole("Don't tell anyone...");
                    setStoryFinished(true);
                } else {
                	HistoricalContextProject.failGame();
                }
            }
        });
    }

}
