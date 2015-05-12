package nate.historicalcontext.characters;

import nate.historicalcontext.HistoricalContextProject;
import nate.historicalcontext.story.PersonStory;
import nate.historicalcontext.story.Story;

public class Backstory extends Story {

	public Backstory() {

        setParentPerson(this);

        setConsoleName("Backstory");

        setCharacterStory(new PersonStory() {

            @Override
            public void content() throws InterruptedException {
                Thread.sleep(3000);
                printToConsole("Before Java was released, C++ was the most popular programming language.");
                Thread.sleep(3000);
                printToConsole("C++ was, in essence, a version of C that offered Object-Oriented Programming.");
                Thread.sleep(3000);
                printToConsole("However, there were many tedious tasks involved with C++, such as confusing syntax.");
                Thread.sleep(3000);
                printToConsole("The main goal of the developers of Java was to create a language that did most of what");
                Thread.sleep(3000);
                printToConsole("C++ did, without all the tedious tasks that came with it.");
                Thread.sleep(3000);
                printToConsole("The C language developed by Dennis Ritchie had taken a decade to really become popular.");
                Thread.sleep(3000);
                printToConsole("With time though, developers found that C became tedious. Although people tried to solve this problem,");
                Thread.sleep(3000);
                printToConsole("a new development philosophy was introduced later, called Object-Oriented Programming.");
                Thread.sleep(3000);
                printToConsole("This allowed people to create bits of code inside things called \"objects\" which meant that");
                Thread.sleep(3000);
                printToConsole("if they needed the code again they could simply call the object and they'd have access to that");
                Thread.sleep(3000);
                printToConsole("code, meaning that they didn't need to write the same thing over and over again.");
                Thread.sleep(3000);
                printToConsole("C++ was created as an enhancement to C that provided the developer with OOP.");
                Thread.sleep(3000);
                requestInput("Are you ready?");
                while (hasRequestedInput) {
                    Thread.sleep(10);
                }
                if (latestInput.equals("yes") || latestInput.equals("Yes")) {
                    printToConsole("Alright!");
                    setStoryFinished(true);
                } else {
                	HistoricalContextProject.failGame();
                }
            }
		
		});
	}

}
