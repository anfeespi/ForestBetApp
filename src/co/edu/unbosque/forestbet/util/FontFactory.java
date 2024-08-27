package co.edu.unbosque.forestbet.util;

import java.awt.Font;

/**
 * This is a static class that creates fonts
 * @author anfeespi
 */
public class FontFactory {
	/**
	 * Method to create the font
	 * @param the name of the font file (ttf)
	 * @param the style of the font (plain, bold, italic)
	 * @param the size of the font
	 * @return the result of charge the font
	 */
	public static Font newFont(String fontName, int style, float size) {
		FontCharger fontCharger = new FontCharger();
		return fontCharger.chargeFont(fontName, style, size);
	}
}
