import java.io.*;
import java.util.*;

public class main {
   public static void main(String[] args) {
	   CharDoubleEndedQueueImpl A = new CharDoubleEndedQueueImpl();
	   
	   boolean x=A.isEmpty();
	   System.out.println(x);
	   
	  
	   A.addFirst('A');
	   A.addFirst('B');
	   A.addLast('C');
	   A.addLast('D');
	   A.addFirst('P');
	   A.addLast('V');
	   
	   
	   x=A.isEmpty();
	   System.out.println(x);
	   
	   A.printQueue(System.out);
	   A.removeFirst();
	   System.out.println(A.removeFirst());
	   System.out.println(A.removeLast());
	   A.printQueue(System.out);
	   System.out.println(A.size());
	   System.out.println(A.start.getchar());
	   
   }
}