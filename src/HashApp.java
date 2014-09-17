
public class HashApp {

	public static void main(String[] args) {
		HashTable newTable = new HashTable(5);
		DataStruc newData = new DataStruc(1);
		newTable.insert(newData);
		newTable.showTable();
	}

}
