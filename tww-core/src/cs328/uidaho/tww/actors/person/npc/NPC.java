package cs328.uidaho.tww.actors.person.npc;

import java.util.Random;

import com.badlogic.gdx.scenes.scene2d.Stage;

import cs328.uidaho.tww.actors.person.Person;

public class NPC extends Person {
	
	private Discussion discussion;
	
	public NPC(float x, float y, Stage s) {
		super(x, y, s);
		
		Random random = new Random();
		int r = random.nextInt(4);
		switch (r) {
		case 0:
			this.loadTexture("people/person_awm0.png");
			break;
		case 1:
			this.loadTexture("people/person_adm0.png");
			break;
		case 2:
			this.loadTexture("people/person_lwm0.png");
			break;
		case 3:
			this.loadTexture("people/person_ldm0.png");
			break;
		};
		
		this.discussion = new Discussion();
	}
	
	public int addPrompt(Prompt prompt) {
		return this.discussion.addPrompt(prompt);
	}
	
	public Prompt getNextPrompt() {
		return this.discussion.getPrompt();
	}
	
}
