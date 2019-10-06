public class linkedList{
	
	listNode listHead;

	public linkedList(listNode lh){

		listHead = lh;
	}

	public void insertNewNode(listNode lh, listNode newNode){
		// insertNewNode(NewNode) Alg:
		listNode spot = findSpot(lh, newNode);// step 1: spot <--- findSpot(LHead, NewNode)
		// step 2: insert new node at spot
		newNode.next = spot.next;// 	NewNode.next <-- spot.next
		spot.next = newNode;// 	spot.next <-- NewNode.next

	}

	public listNode findSpot(listNode lh, listNode newNode){
		// findSpot(LHead, NewNode) Alg steps:
		listNode spot = lh;// 1: spot <-- LHead
		while(spot.next !=null && spot.next.prob<newNode.prob){// 2: if(spot.next != null && spot.next.count < NewNode.count)
			spot = spot.next;// spot <-- spot.next
		}// 3: repeat step 2 until the condition fails
		return spot;// 4: return spot
	}

	public String printList(listNode listHead){

		String list = "listHead-->";
		while(listHead.next != null){
			list = list +  "(\"" + listHead.chStr + "\"," + " "+listHead.prob + ", \"" + listHead.next.chStr+"\")-->";
			listHead = listHead.next;
		}
		return list = list + "(\"" + listHead.chStr+ "\"," + " "+listHead.prob + ", NULL)-->NULL\n";
	}


}