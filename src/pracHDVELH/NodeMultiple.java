/**
 * File: NodeMultiple.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */
public class NodeMultiple {
	public static final int ERROR_STATUS_INDEX_OUT_OF_RANGE = -1;
	public static final String ERROR_MSG_INDEX_OUT_OF_RANGE = "Index out of range";
	public static int NODE_MAX_ARITY = 10;

	/* Overridden methods */
	@Override
	public String toString() {
		/* TO BE COMPLETED */
	}

	/* Getters/Setters */
	/**
	 * Gets the {@code i}th daughter node.
	 * 
	 * Aborts if the given index {@code i} is out of range.
	 * 
	 * @param i the index of the daughter node.
	 * @return the {@code i}th daughter node, or {@code null} if it does not exist.
	 */
	public NodeMultiple getDaughter(int i) {
		/* TO BE COMPLETED */
	}

	/**
	 * Sets the {@code i}th daughter node to the input parameter {@code daughter}.
	 * Should be used cautiously, since {@code i} may not be the first index
	 * available (i.e. there may be lower indexes which do not refer to any
	 * daughter).
	 * 
	 * If a daughter node is already referred to at this index then it is erased
	 * with {@code daughter}.
	 * 
	 * Aborts if the index {@code i} is out of range.
	 * 
	 * @param daughter the node to be linked as a daughter of {@code this} node.
	 * @param i        the daughter node's index
	 */
	public void setDaughter(NodeMultiple daughter, int i) {
		/* TO BE COMPLETED */
	}

	/**
	 * @return all the daughters
	 */
	public NodeMultiple[] getDaughters() {
		/* TO BE COMPLETED */
	}

	/**
	 * @param daughters the daughters to set
	 */
	public void setDaughters(NodeMultiple[] daughters) {
		/* TO BE COMPLETED */
	}

	/**
	 * Adds the given {@code daughter} node at the first available index.
	 * 
	 * If the max number of daughters ({@link #NODE_MAX_ARITY}) is already reached
	 * nothing happens (no abort).
	 * 
	 * @param daughter
	 */
	public void addDaughter(NodeMultiple daughter) {
		/* TO BE COMPLETED */
	}

	/**
	 * @return the content data
	 */
	public Object getData() {
		/* TO BE COMPLETED */
	}

	/**
	 * @param data
	 */
	public void setData(Object data) {
		/* TO BE COMPLETED */
	}

	/**
	 * @return {@code true} if and only if this node has at least one non-null
	 *         daughter node.
	 */
	public boolean hasDaughters() {
		/* TO BE COMPLETED */
	}

	/* Constructors */
	/**
	 * Default constructor.
	 */
	public NodeMultiple() {
		/* TO BE COMPLETED */
	}

	/**
	 * Constructor. Sets the content data to {@code data} and creates an empty set
	 * of daughters.
	 * 
	 * @param data
	 */
	public NodeMultiple(Object data) {
		/* TO BE COMPLETED */
}

// eof