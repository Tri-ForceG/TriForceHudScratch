package com.triforce_hudscratch.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.triforce_hudscratch.HUD;
import com.triforce_hudscratch.TriForceHudScratch;

/**
 * Created by Matthew on 11/10/2015.
 */
public class PlayState extends TriForceHudScratch implements Screen, InputProcessor {

    TriForceHudScratch triForceHudScratch;
    private HUD hud;

    public PlayState(TriForceHudScratch triForceHudScratch){ //References the main class.
        this.triForceHudScratch=triForceHudScratch;
        hud = new HUD(triForceHudScratch.batch);
    }

    public void create(){
        Gdx.input.setInputProcessor(this); //Have to change the Input Processor when changing screens, or else you can still use the buttons from the Main Menu on the Play Screen.
    }

    @Override
    public void show() { //This is called when you set the screen to this class.
        create();

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 1, 1); //Blue background.
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        hud.stage.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() { //This is called when the other screen is displayed.

    }

    @Override
    public void dispose() {

    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
