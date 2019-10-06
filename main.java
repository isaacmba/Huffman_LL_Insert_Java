import java.io.*;
import java.util.*;

public class main{

	public static void main(String[] args) {

		if(args.length<2){
			System.out.println("\nPlease pass arguments \n");
			return;
		}
		
		// ******************************************
		// IV. Main(argv)
		// ******************************************

		listNode listHead = new listNode("dummy", 0);// Step 1: listHead <- get a newNode as the dummy listNode with (“dummy” ,0), listHead to point to.
		linkedList ll = new linkedList(listHead);

		Scanner inFile = null;
		BufferedWriter outFile = null;
		try {
			inFile = new Scanner(new FileReader(args[0]));
			outFile = new BufferedWriter(new FileWriter(args[1]));// outFIle <- open output file using argv

			String chr;
			int prob;
			listNode newNode;

			while(inFile.hasNext()){
				chr = inFile.next(); // Step 3: chr <- get from inFile
				prob = inFile.nextInt();// Prob <- get from inFile
				newNode = new listNode(chr,prob);// newNode <- get a new listNode // newNode.chStr <- chr // newNode.prob <- Prob //newNode.next <- null
				ll.insertNewNode(listHead, newNode);//insertNewNode(listHead, newNode);// Step 4: insertNewNode (listHead, newNode) // use algorithm steps given in class
				try{
					outFile.write(ll.printList(listHead));// Step 5: printList (listHead) // Out put the list to outFile, use the format given in the above.

				}catch(IOException e){
					e.printStackTrace();
				}
			}// Step 6: repeat step 3 – step 5 until the end of inFile .
		}catch (IOException e) {
	    	e.printStackTrace();
		}
		try {
				inFile.close();
				outFile.close();				

		} catch (IOException e) {
				e.printStackTrace();
		}
	}
}