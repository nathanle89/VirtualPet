package com.Graphic;

import com.Graphic.Graphic.PixmapFormat;

public interface Pixmap {
	public int getWidth();
	public int getHeight();
	public PixmapFormat getFormat();
	public void dispose();
}