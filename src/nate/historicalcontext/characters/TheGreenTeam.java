package nate.historicalcontext.characters;

import nate.historicalcontext.story.PersonStory;
import nate.historicalcontext.story.Story;

/**
 * Created by natemintos on 5/3/15.
 */
public class TheGreenTeam extends Story {

    public TheGreenTeam() {
        setStoryFinished(false);

        setConsoleName("The Green Team");

        setParentPerson(this);

        setCharacterStory(new PersonStory() {
            @Override
            public void content() throws InterruptedException {
                printToConsole("Our project should be simple and gather tested and useful features from the languages before it,");
                Thread.sleep(3000);
                printToConsole("have embedded APIs with basic and advanced features that come with the language,");
                Thread.sleep(3000);
                printToConsole("get rid of features that required direct control or manipulation of the computer itself to make the language safe,");
                Thread.sleep(3000);
                printToConsole("be independent of platform or OS, so it may be written once and run everywhere,");
                Thread.sleep(3000);
                printToConsole("be able to do network programming out-of-the-box, be embeddable in web browsers,");
                Thread.sleep(3000);
                printToConsole("and have the capability that one program can do multiple things at once.");
                Thread.sleep(3000);
                printToConsole("You know, we need a sort of identification. What should we name this product?");
                Thread.sleep(3000);
                printToConsole("I don't know. I'm tired. Let's go drink some coffee.");
                Thread.sleep(3000);
                printToConsole("What type of coffee?");
                Thread.sleep(3000);
                printToConsole("Good question. We'll decide when we get to the coffee shop.");
                Thread.sleep(3000);
                printToConsole("How about Java coffee?");
                Thread.sleep(3000);
                printToConsole("Yeah, that's OK.................. Folks, we have a name!");
                Thread.sleep(3000);
                printToConsole("What is it?");
                Thread.sleep(3000);
                printToConsole("I have no clue. Let's look at random objects and decide.");
                Thread.sleep(3000);
                printToConsole("How about Lamp?");
                Thread.sleep(3000);
                printToConsole("What about Window Shade?");
                Thread.sleep(3000);
                printToConsole("Computers as far as the eye can see?");
                Thread.sleep(3000);
                printToConsole("Java?");
                Thread.sleep(3000);
                printToConsole("YES! That's a great name!");
                Thread.sleep(3000);
                printToConsole("Computers as far as the eye can see? I mean, you did say to look at random objects and decide...");
                Thread.sleep(3000);
                printToConsole("No! Java's a great name!");
                Thread.sleep(3000);
                printToConsole(";(");
                Thread.sleep(3000);
                printToConsole("Let's also make a mascot because we can!");
                Thread.sleep(3000);
                printToConsole("What should we call it?");
                Thread.sleep(3000);
                printToConsole("Duke, after my pet tarantula.");
                setStoryFinished(true);
            }
        });
    }

}
