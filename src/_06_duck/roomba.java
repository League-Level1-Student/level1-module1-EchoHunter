package _06_duck;

public class roomba {
		int vacuumSpeed;
		String favoriteRoom;
		boolean dust = true;
		int timeVaccumed = 0;
		roomba(String favoriteRoom,int vacuumSpeed) {
			this.favoriteRoom = favoriteRoom;
			this.vacuumSpeed = vacuumSpeed;
			
			}
		void vacuum() {
		if(dust==true) {
			System.out.println("the roomba vaccums the dust");
		dust = false;
		timeVaccumed += 1;
		}
		else if(dust==false) {
			System.out.println("there is no more dust");
		move();
		}
		}
		void move() {
		if (timeVaccumed <10) {
			System.out.println("the roomba moves");
		dust=true;
		}
		else if(timeVaccumed > 9)
			System.out.println("the roomba has finished this room");
		}
		
	
	}

