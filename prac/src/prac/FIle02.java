package prac;

import java.io.*;

public class FIle02 {
	public static void main(String[] args) {
	FileReader fr = null;
	FileWriter fw = null;
	
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	try {
		fr = new FileReader("prac.txt");
		fw = new FileWriter("result.txt");
		br = new BufferedReader(fr);
		bw = new BufferedWriter(fw);
		String readLine;
		while((readLine = br.readLine()) != null) {
			bw.write(readLine);
		}
		br.close();
		bw.close();
	}
	catch(IOException e) {}
}
}
