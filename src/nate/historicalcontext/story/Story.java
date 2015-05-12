package nate.historicalcontext.story;

public class Story extends Person {

	PersonStory story;
    Person parentPerson;
    boolean storyFinished = false;
	
	public PersonStory getStory() {
		return story;
	}
	
	public void setCharacterStory(PersonStory newPersonStory) {
		story = newPersonStory;
	}
	
	public void executeStory() throws InterruptedException {
        story.content();
    }

    public void setParentPerson(Person parentPerson1) {
        parentPerson = parentPerson1;
    }

    public Person getParentPerson() {
        return parentPerson;
    }

    public void setStoryFinished(boolean newBoolean) {
        storyFinished = newBoolean;
    }

    public boolean getStoryFinished() {
        return storyFinished;
    }
	
}
