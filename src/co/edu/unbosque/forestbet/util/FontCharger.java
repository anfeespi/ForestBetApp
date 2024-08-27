package co.edu.unbosque.forestbet.util;

import java.awt.Font;
import java.io.InputStream;

/**
 * Class to charge the font, this is used to be static but the getClass() method don't allow static classes
 * @author anfeespi
 */
public class FontCharger {

	/**
	 * Constructor
	 */
	public FontCharger() {

	}

	/**
	 * Method to charge the font
	 * @param the name of the font file (ttf)
	 * @param the style of the font (plain, bold, italic)
	 * @param the size of the font
	 * @return the result of charge the font
	 */
	public Font chargeFont(String fontName, int style, float size) {
		Font f;
		try {
			InputStream is = getClass().getResourceAsStream("/fonts/" + fontName);
			f = Font.createFont(Font.TRUETYPE_FONT, is);
		} catch (Exception e) {
			f = new Font("Arial", Font.PLAIN, 14);
		}
		Font tfont = f.deriveFont(style, size);
		return tfont;
	}
}
