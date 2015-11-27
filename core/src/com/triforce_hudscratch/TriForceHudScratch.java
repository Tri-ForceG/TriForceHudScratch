package com.triforce_hudscratch;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.triforce_hudscratch.States.PlayState;

public class TriForceHudScratch extends Game {

	PlayState playState; //Instances of the other classes to call.

	public SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();

		playState = new PlayState(this);

		setScreen(playState); //Sets the initial screen to the Main Menu.
	}

	//If you include this render, it will display whatever is here, and not the render in the other classes.
	//@Override
	//public void render () {
	//Gdx.gl.glClearColor(1, 0, 0, 1);
	//Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	//}
}
