package com.anthonyostrich.spookyeditor.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.anthonyostrich.spookyeditor.SpookyEditor;
import com.badlogic.gdx.backends.lwjgl.LwjglCanvas;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Spooky Editor";
		new LwjglApplication(new SpookyEditor(), config);

	}
}
