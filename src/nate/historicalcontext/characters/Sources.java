package nate.historicalcontext.characters;

import nate.historicalcontext.story.PersonStory;
import nate.historicalcontext.story.Story;

public class Sources extends Story {

    public Sources() {

        setStoryFinished(false);

        setCharacterStory(new PersonStory() {
            @Override
            public void content() throws InterruptedException {
                printToConsole("Source #1: \"History of the Java™ Programming Language.\" - Wikibooks, Open Books for an Open World. N.p., n.d. Web. 02 May 2015.");
                setStoryFinished(true);
            }
        });

        setConsoleName("Sources");
    }

}
