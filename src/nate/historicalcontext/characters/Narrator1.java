package nate.historicalcontext.characters;

import nate.historicalcontext.story.PersonStory;
import nate.historicalcontext.story.Story;

/**
 * Created by natemintos on 5/3/15.
 */
public class Narrator1 extends Story {

    public Narrator1() {
        setConsoleName("Narrator");

        setParentPerson(this);

        setStoryFinished(false);

        setCharacterStory(new PersonStory() {
            @Override
            public void content() throws InterruptedException {
                printToConsole("And so, as the Green Project progressed, its purpose");
                Thread.sleep(3000);
                printToConsole("became clearer. It no longer aimed to make a superior lanuage to the ones that existed,");
                Thread.sleep(3000);
                printToConsole("it now targeted devices other than the computer.");
                Thread.sleep(3000);
                printToConsole("The Green Project was renamed the Green Team and was staffed at 13.");
                Thread.sleep(3000);
                printToConsole("They started to work in a small office on Sand Hill Road, a road now famous in Silicon Valley for its investors.");
                Thread.sleep(3000);
                printToConsole("The team started thinking about making a replacement to C++. It would be faster, better, and more responsive.");
                setStoryFinished(true);
            }
        });
    }

}
