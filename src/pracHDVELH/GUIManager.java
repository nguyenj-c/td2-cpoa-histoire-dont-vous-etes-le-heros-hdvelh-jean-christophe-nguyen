/**
 * File: GUIManager.java
 * Creation: 19 Jan. 2017, prost@lirmm.fr
 */
package pracHDVELH;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author prost
 *
 */
public class GUIManager {
  private PrintStream out, err;
  private InputStream in;
  private Scanner inputReader;

  /**
   * @param s
   */
  public void outputln(String s) {
	out.println(s);
  }

  /**
   * Concatenates all the given strings and prints them out without any
   * end-of-line character ('\n').
   * 
   * @param args
   */
  public void output(String... args) {
	StringBuilder s = new StringBuilder();
	for (String i : args) {
	  if (s != null) {
		s.append(i);
	  }
	}
	out.println(s);
  }

  /**
   * @return
   */
  public Scanner getInputReader() {
	return inputReader;
  }

  /**
   * Constructor. Sets the GUI to the default system IOs.
   */
  public GUIManager() {
	this(System.in, System.out, System.err);
  }

  /**
   * @param in
   * @param out
   * @param err
   */
  public GUIManager(InputStream in, PrintStream out, PrintStream err) {
	this.in = in;
	this.out = out;
	this.err = err;
	inputReader = new Scanner(this.in);
  }
}

// eof