import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BSTreeTest<T> {

	BSTree tree;
	
	@BeforeEach
	void setUp() throws Exception {
		tree = new BSTree();
	}

	@Test
	void test() {
		//test isEmpty()
		assertTrue(tree.isEmpty());
		assertEquals(0, tree.getSize()); //test size when empty
		
		tree.insert(10);
		assertFalse(tree.isEmpty());
		
		
		//test insert() and //test retrieve() 
		assertEquals(10, tree.retrieve(10));
		assertNull(tree.retrieve(100)); //check the num should not in the tree
		
		
		
		//test retrieveDepth()
			//root -> 10
		assertEquals(0, tree.retrieveDepth(10));
		assertEquals(1, tree.retrieveDepth(100));
		
		//test getsize()?
		assertEquals(1, tree.getSize());
		
		
		
		//test largest()
		tree.insert(11);
		tree.insert(9);
		assertEquals(11, tree.largest());
			//large tree
		BSTree largeTree = new BSTree();
		for (int i = 1; i <= 100; i++) {largeTree.insert(i);}
		assertEquals(100, largeTree.largest());
		
			//test just one node:
		BSTree treewith1n= new BSTree();
		treewith1n.insert(6);
		assertEquals(6, treewith1n.largest());
		
			//test empty:
		BSTree empTree = new BSTree();
		assertNull(empTree.largest());
		
		
		
		//test toList()
		List<Integer> list = List.of(9, 10, 11);
		assertEquals(list, tree.toList());
		
		//test sum()
		assertEquals(30, tree.sum());
		assertEquals(5050, largeTree.sum());
		
		
		//test myEquals
			//test empty tree：
		BSTree empTree1 = new BSTree();
		BSTree empTree2 = new BSTree();
		assertTrue(empTree1.myEquals(empTree2));
		
			//test itself:
		assertTrue(tree.myEquals(tree));
		
			//same structure and same value:
		BSTree tree2 = new BSTree();
		tree2.insert(10);
		tree2.insert(11);
		tree2.insert(9);
		assertTrue(tree.myEquals(tree2));
		
			//different values:
		BSTree tree3 = new BSTree();
        tree3.insert(10);
        tree3.insert(11);
        tree3.insert(8);
        assertFalse(tree.myEquals(tree3));
		
        	//different structure:
        BSTree tree4 = new BSTree();
        tree4.insert(10);
        tree4.insert(8);
        tree4.insert(11);
        assertFalse(tree.myEquals(tree4));	
        
        	//less value:
        BSTree tree5 = new BSTree();
        tree5.insert(10);
        tree5.insert(11);
        //tree5.insert(9);
        assertFalse(tree.myEquals(tree5));
        
        	//more value:
        BSTree tree6 = new BSTree();
        tree6.insert(10);
        tree6.insert(11);
        tree6.insert(9);
        tree6.insert(8);
        assertFalse(tree.myEquals(tree6));
        	
        	//less value2:
        BSTree tree7 = new BSTree();
        tree7.insert(10);
        //tree7.insert(11);
        tree7.insert(9);
        assertFalse(tree.myEquals(tree7));
        
        	//more value2:
        BSTree tree8 = new BSTree();
        tree8.insert(10);
        tree8.insert(11);
        tree8.insert(9);
        tree8.insert(8);
        assertFalse(tree.myEquals(tree8));
        
	}

}
