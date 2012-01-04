package com.Game;

import com.Audio.Audio;
import com.FileIO.FileIO;
import com.Graphic.Graphic;
import com.KeyEvent.Input;

public interface Game {
	public Input getInput();
	public FileIO getFileIO();
	public Graphic getGraphics();
	public Audio getAudio();
	public void setScreen(Screen screen);
	public Screen getCurrentScreen();
	public Screen getStartScreen();
}
