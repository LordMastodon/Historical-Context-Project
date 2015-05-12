package nate.historicalcontext.characters;

import nate.historicalcontext.story.PersonStory;
import nate.historicalcontext.story.Story;

/**
 * Created by natemintos on 5/2/15.
 */
public class JamesGosling extends Story {

    public JamesGosling() {
        setParentPerson(this);

        setConsoleName("James Gosling");

        setStoryFinished(false);

        setCharacterStory(new PersonStory() {
            @Override
            public void content() throws InterruptedException {
                printToConsole("I'm going to enhance C++! I'll name it C++ ++ --! No one will have any clue what that means.");
                Thread.sleep(3000);
                printToConsole("I'll tell you what it means. ++ means putting in and -- means taking out. Everyone will be laughing so hard");
                Thread.sleep(3000);
                printToConsole("because this is the best pun in creation! ;( I have no life...");
                Thread.sleep(3000);
                printToConsole("Ehhh... This is a horrible name. Oh man! Look at that oak tree outside my office- I know what I'll call it!");
                Thread.sleep(3000);
                printToConsole("Oak!");
                setStoryFinished(true);
            }
        });
    }

}
