/**
 * File: ErrorNaive.java
 * Creation: 13 Jan. 2017, prost@lirmm.fr
 */
package myUtils;

/**
 * @author prost
 *
 *         A collection of static methods, to be used as a naive way to handle error cases
 *         (whether fatal or not).
 */
public class ErrorNaiveHandler {
  public static final String DEFAULT_ERROR_MSG = "Unknown error occurred.";
  public static final int DEFAULT_ERROR_STATUS = -1;
  public static final int DEFAULT_WARNING_STATUS = 0;
  public static final String DEFAULT_WARNING_MSG = "Unusual object state observed.";

  /**
   * Abort the running Java Virtual Machine with a {@code status} code and a text message
   * printed out on the standard error output (stderr).
   * 
   * @param status
   * @param msg
   */
  public static void abort(int status, String msg) {
	System.err.println("ABORT (status=" + status + "): " + msg);
	System.exit(status);
  }

  /**
   * Same as {@link #abort(int, String)}, with the default status
   * {@link #DEFAULT_ERROR_STATUS}.
   * 
   * @param msg
   */
  public static void abort(String msg) {
	abort(DEFAULT_ERROR_STATUS, msg);
  }

  /**
   * Same as {@link #abort(int, String)}, with the default status
   * {@link #DEFAULT_ERROR_STATUS} and the default message {@link #DEFAULT_ERROR_MSG}.
   */
  public static void abort() {
	abort(DEFAULT_ERROR_MSG);
  }

  /* Warnings */
  /**
   * Issues a customised status and a customised warning message on {@code stderr}
   * (non-fatal).
   * 
   * @param status
   * @param msg
   */
  public static void warning(int status, String msg) {
	System.err.println("WARNING (status=" + status + "): " + msg);
  }

  /**
   * Issues a default status and a customised warning message on {@code stderr}
   * (non-fatal).
   * 
   * @param msg
   */
  public static void warning(String msg) {
	warning(DEFAULT_WARNING_STATUS, msg);
  }

  /**
   * Issues a default warning message on {@code stderr} (non-fatal).
   * 
   */
  public static void warning() {
	warning(DEFAULT_WARNING_MSG);
  }

}

// eof