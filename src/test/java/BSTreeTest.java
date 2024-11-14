import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BSTreeTest<T> {

	BSTNode<Interger> tree;
	
	@BeforeEach
	void setUp() throws Exception {
		tree = new BSTNode<Interger>();
	}

	@Test
	void test() {
		//test isEmpty()
		/**
	       returns true if the tree is empty
	     */
		assertTrue(tree.isEmpty);
		
		tree.insert(10);
		assertFalse(tree.isEmpty);
		
		
		
		//test insert() 
		/**
	       inserts target into the tree
	     */
		assertequals()
		
		
		//test retrieve() 
		/**
	       returns the Integer if it is present in the tree
	       returns null if target is not in the tree.
	     */
		
		
		//test retrieveDepth()
		/**
	       This is not a normal method for a tree
	       It will return the height of the node that contains the target
	       (note that root is 0)

	       However, if the node is not present, return the height that 
	       the node would be if you add it.
	     */
		
		//test getsize()?
		
		//test largest()
		/**
	       Returns the largest value in the tree.

	       Your solution should have average time of Theta( log N)

	       return null, if the tree is empty
	    */
		
		//test toList()
		/**
	       Returns a list of all the values in the tree.

	       Instead of using an inner class, this time use an anonymous class
	       Most of the code has been set up for you.
	    */
		
		//test sum()
		
		//test myEquals
		/**
	       Returns true if this tree is equal to that tree, false otherwise.

	       A tree is equal if they have not only the same stored valued
	       but also the same structure.  For example, a tree with inserted
	       values {5,1,10} would not be equal to a BST with inserted
	       values {1,5,10}.

	       Note: we didn't use equals because it is slightly more complex to get right.
	     */
		
	}

}
