package _06_duck;

public class duck {
int numberOfFriends;
String favoriteFood;
void quack() {
System.out.println("quack");
}
void waddle() {
System.out.println("the duck waddle waddle waddles away");;
}
duck(String favoriteFood, int numberOfFriends) {
    this.favoriteFood = favoriteFood;
    this.numberOfFriends = numberOfFriends;
}
}

