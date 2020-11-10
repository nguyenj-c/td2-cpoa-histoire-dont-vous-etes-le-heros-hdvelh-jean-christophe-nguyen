/**
 * File: MyArrays.java
 * Creation: 17 Jan. 2017, prost@lirmm.fr
 */
package myUtils;

/**
 * @author prost
 *
 */
public final class MyArrays {
  public static int DEFAULT_MAX_VALUE = 0;

  /**
   * Finds the max value in the given array of {@code int}.
   * 
   * @param array
   * @return the max value found.
   */
  public static int max(int[] array) {
	/* empty input array: issue a warning and return 0 */
	if (array == null) {
	  ErrorNaiveHandler.warning("null parameter array in " + MyArrays.class + ".max()");
	  return DEFAULT_MAX_VALUE;
	}
	int i = 0, max = array[0];
	while (i < array.length) {
	  if (array[i] > max) {
		max = array[i];
	  }
	  i++;
	}
	return max;
  }

  /**
   * 
   */
  public MyArrays() {
	// TODO Auto-generated constructor stub
  }

}

// eof