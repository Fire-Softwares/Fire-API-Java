package ga.firesoftwares.fireapi.utils.system;

import ga.firesoftwares.fireapi.enums.system.OS;

/**
 * Operating System utils
 * @author Renaud
 * @since 1.0
 * @version 1.1
 */
public class OperatingSystem {
	/**
	 * Detect operating system.
	 * @param os OS String
	 * @return OS The OS
	 * @throws Exception Thrown when can't recognize operating system.
	 */
	public static OS detectOS(String os) throws Exception {
		// Return the operating system based on the String who is given in parameters.
		if (os.toLowerCase().contains("win"))
			return OS.WINDOWS;
		else if (os.toLowerCase().contains("mac"))
			return OS.MACINTOSH;
		else if (os.toLowerCase().contains("sun") || os.toLowerCase().contains("sola"))
			return OS.SOLARIS;
		else if (os.toLowerCase().contains("ix") || os.toLowerCase().contains("nux") || os.toLowerCase().contains("hp-"))
			return OS.UNIX;
		else
			throw new Exception("Can't recognize operating system !");
	}
}
