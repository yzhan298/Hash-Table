
public class HashTable {

	private int arraySize;
	private DataStruc[] hashArr;
	private DataStruc nonItem; // used for deleting
	
	public HashTable(int size) { // constructor
		arraySize = size;
		hashArr = new DataStruc[arraySize];
		nonItem = new DataStruc(-1);
	}
	
	public int hashFunc(int key) {
		return key%arraySize;
	}
	
	public void showTable() {
		for(int i=0;i<arraySize;i++) {
			if(hashArr[i] != null)
				System.out.print(hashArr[i].getKey() + " ");
			else
				System.out.print("** ");
		}
			System.out.println(" ");
	}
	
	public void insert(DataStruc d) {
		if(!isFull()){
			int key = d.getKey();
			int hashValue = hashFunc(key);
			if(hashArr[hashValue] != null && hashArr[hashValue].getKey() != -1) {
				hashValue++;
				hashValue %= arraySize;
			}	
			hashArr[hashValue] = d;
		}
	}
	
	public boolean isFull() {
		if(hashArr.length==arraySize)
			return true;
		else
			return false;
	}
	
	public boolean isAmpty() {
		if(hashArr.length==0)
			return true;
		else
			return false;
	}
}
