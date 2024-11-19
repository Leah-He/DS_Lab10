import java.lang.Comparable;
import java.util.function.Consumer;


/**
   This is a smart Node that utilizes generics.
   Note how we ensured that the type T will always be comparable...

 */
public class BSTNode<T extends Comparable<T>>
{

   private T val;
   private BSTNode<T> left;
   private BSTNode<T> right;



   public BSTNode(T val)
   {
      this(val,null,null);
   }
    

   public BSTNode(T val, BSTNode<T> l,BSTNode<T> r)
   {
	   this.val = val;
	   this.left = l;
	   this.right = r;
   }
   

   /*
     Uses recursion to insert the target into the tree
    */
   public void insert(T target)
   {
	   if (target.compareTo(val) < 0)
	   { 
		   if (left == null)
		   {left = new BSTNode<>(target);} 
		   else 
		   {left.insert(val);}
	   }
   }


   /*
     Uses recursion to retrieved the value target from the tree.  
     Returns null if it can't find the value.
    */
   public T retrieve(T target)
   {
	   if (target.compareTo(val) == 0) {return val;}
	   else if (target.compareTo(val) < 0) {return null;}
	   else if (target.compareTo(val) > 0) {return null;}
	return target;
   }


    /**
       If it is present, what level is the node?
       If it is not present, what level would it be placed.
     */
   public int retrieveDepth(T target)
   {
	   if (target.compareTo(val) == 0) {return 0;}
	   else if (target.compareTo(val) > 0) {return 1+ retrieveDepth(val);}
	   else if (target.compareTo(val) < 0) {return 1+ retrieveDepth(val);}
	return 0;
   }

   /**
      Uses recursion to return the largest value in the tree
    */
   public T getLargest()
   {//通常情况下都是找最右边的，因为最右边的是最大的
	   if (left == null) {return val;}
	   else {return right.getlargest();}
	return null;
   }


   /**
      Uses recursion to do an inorder traversals.
      consume is part of a strategy pattern, to determine what the
      "Visit" should be.

    */
   public void inOrderTraversal(Consumer<T> consume)
   {  
	   if (left != null) {left.inOrderTraversal(consume);}
	   consume.accept(val);
	   if (right != null) {right.inOrderTraversal(consume);}
   }


   /**
      returns true if this tree is equal to that tree.
      false otherwise.

      Note: While I must always be non-null.  
            Nothing prevents "that" from being null.
	    
	    This one is long!
    */
   public boolean myEquals(BSTNode<T> that)
   {
	   if (that == null) {return false;}
	   if (!val.equals(that.val)) {return false;}
	   if ()
	   }
	return false;
   

   }

}