package nate.historicalcontext.characters;

import nate.historicalcontext.story.PersonStory;
import nate.historicalcontext.story.Story;

/**
 * Created by natemintos on 5/3/15.
 */
public class Narrator2 extends Story {

    public Narrator2() {
        setParentPerson(this);

        setConsoleName("Narrator");

        setStoryFinished(false);

        setCharacterStory(new PersonStory() {
            @Override
            public void content() throws InterruptedException {
                printToConsole("By now, the work on Oak was becoming important, but when the year 1993");
                Thread.sleep(3000);
                printToConsole("came around, people saw the death of set-top boxes, interactive TV and the PDAs.");
                Thread.sleep(3000);
                printToConsole("This meant that the inventors of Oak had to rethink their product.");
                Thread.sleep(3000);
                printToConsole("The NCSA had just unveiled their new web browser for the internet the previous year.");
                Thread.sleep(3000);
                printToConsole("The focus of the Green Team now diverted to the \"next big thing\", which back then was the Internet.");
                Thread.sleep(3000);
                setStoryFinished(true);
            }
        });
    }

}
