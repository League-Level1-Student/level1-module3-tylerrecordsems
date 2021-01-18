package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		new Backpack().packAndCheck();
	Backpack blue = new Backpack();
	blue.putInBackpack(new Pencil());
	blue.putInBackpack(new Ruler());
	blue.putInBackpack(new Textbook());
	blue.goToSchool();
	}
}
