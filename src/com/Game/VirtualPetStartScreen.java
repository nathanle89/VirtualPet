package com.Game;

import com.Graphic.Graphic.PixmapFormat;
import com.Graphic.Pixmap;

public class VirtualPetStartScreen extends Screen{
	Pixmap awesomePic;
	double x;
	
	public VirtualPetStartScreen(Game game) {
		super(game);
		awesomePic = game.getGraphics().newPixmap("data/pic.png",
				PixmapFormat.RGB565);
	}
	@Override
	public void update(float deltaTime) {
		x += 50 * deltaTime;
		if (x > 100)
			x = 0;
	}
	
	@Override
	public void present(float deltaTime) {
		game.getGraphics().clear(0);
		game.getGraphics().drawPixmap(awesomePic, (int)x, 0, 0, 0,
				awesomePic.getWidth(), awesomePic.getHeight());
	}
	
	@Override
	public void pause() {
		// nothing to do here
	}
	
	@Override
	public void resume() {
		// nothing to do here
	}
	
	@Override
	public void dispose() {
		awesomePic.dispose();
	}

}