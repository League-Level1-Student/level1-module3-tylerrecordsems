package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
	World world = new World();
	Flower f = new Flower();
	Flower f2 = new Flower();
	Random ran1 = new Random();
	Random ran2 = new Random();
	int  num =ran1.nextInt(9);
	int num2 = ran2.nextInt(9);
	Bug bug1 = new Bug();
	Bug bug2= new Bug();
	Color t = Color.red;
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {

			if (j < 4 && i < 4) {
				t=Color.blue;
			}
			else if(j % 2 == 0) {
			t = Color.white;	
			}else {   
				t=Color.red;
			}
				
			world.add(new Location(j ,i), new Flower(t));
		}
	}
	world.show();
	world.add(new Location(3,5), bug1);
	world.add(new Location(num,num2), bug2);
	bug2.setColor(Color.cyan);
	world.add(new Location (num,num2 - 1) , f);
	world.add(new Location(num ,num2 +1), f2);
	bug2.turn();
	bug2.turn();
	world.add(new Location(num ,num2 +1), f2);
	
}
}
