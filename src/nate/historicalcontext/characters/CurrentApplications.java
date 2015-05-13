package nate.historicalcontext.characters;

import nate.historicalcontext.story.PersonStory;
import nate.historicalcontext.story.Story;

public class CurrentApplications extends Story {

    public CurrentApplications() {
        setParentPerson(this);

        setStoryFinished(false);

        setConsoleName("Java's Current Applications");

        setCharacterStory(new PersonStory() {
            @Override
            public void content() throws InterruptedException {
                Thread.sleep(3000);
                printToConsole("An article written by Jim McManus in 1998 describes how Java was created");
                Thread.sleep(3000);
                printToConsole("originally as a home-control system that could regulate the ");

                setStoryFinished(true);
            }
        });

    }

}
