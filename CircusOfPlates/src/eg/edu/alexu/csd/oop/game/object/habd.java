package eg.edu.alexu.csd.oop.game.object;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.World;

import eg.edu.alexu.csd.oop.game.object.clown;

public class habd implements World {
	private static int MAX_TIME = 1 * 60 * 1000;	// 1 minute
	private int score = 0;
	private long endTime, startTime = System.currentTimeMillis();
	private final int width;
	private final int height;
	private final List<GameObject> constant = new LinkedList<GameObject>();
	private final List<GameObject> moving = new LinkedList<GameObject>();
	private final List<GameObject> control = new LinkedList<GameObject>();
	public habd(int screenWidth, int screenHeight) {
		width = screenWidth;
		height = screenHeight;
		control.add(new clown(screenWidth/3, (int)(screenHeight*0.8), "/Clown.png"));
	}

	@Override
	public List<GameObject> getConstantObjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameObject> getMovableObjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameObject> getControlableObjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean refresh() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getControlSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

}
