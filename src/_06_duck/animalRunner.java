package _06_duck;



public class animalRunner {
public static void main(String[] args) {
	duck daffy = new duck("donuts",5);
	roomba daryl = new roomba("kitchen", 10);
	daffy.quack();
	daffy.waddle();
	for (int i = 0; i < 7; i++) {
		daryl.vacuum();
	}
}
}
