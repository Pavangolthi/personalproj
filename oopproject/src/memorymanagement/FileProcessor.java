package memorymanagement;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileProcessor {

	private FileReader fileReader;
	
	public FileProcessor() {
		// TODO Auto-generated constructor stub
	}

	public FileProcessor(String fileName) {
		try {
			//fileReader object represents an input stream
			//filReader object is an resource object
			fileReader = new FileReader(fileName);	

			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	
	public void processFile() {
		try {
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			//readLine() when it reaches the end of the file it returns null
			//first we need to check if there are any lines in the file or the first line itself returns null
			String line = bufferedReader.readLine();
			
			while (line!=null) {
				System.out.println(line);
				
				line = bufferedReader.readLine();
			}
			
			//fileReader and bufferReader are resource objects and needs to be closed. The super classes of FileReader and BufferReader
			//implement autoCloseable interface and have close method. Hence, they need to be closed.
			fileReader.close();
	
			bufferedReader.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		//cleanup code
		fileReader.close();
	}
	
	
}
