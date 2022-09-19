package memorymanagement;


public class TestFileProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the fileprocessor object takes the path as an argument(customized)	
		FileProcessor fileProcessor = new FileProcessor("C:/Users/srava/OneDrive/Desktop/New Text Document.txt");
		
		//fileProcessor.processFile();
		
		//this pbject becomes eligible for garbage collection
		fileProcessor = null;
	}

}
