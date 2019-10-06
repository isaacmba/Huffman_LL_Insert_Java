public class listNode {

	String chStr;
	int prob;
	listNode next;

	public listNode(String str, int count){
		chStr=str;
		prob=count;
		next=null;
	}
	public listNode(String str, int count, listNode nextNode){
		chStr=str;
		prob=count;
		next=nextNode;
	}


}