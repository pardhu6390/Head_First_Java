import java.io.*;
import java.util.*;

public class GameHelper {
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49 ;
	private int [] grid = new int[gridSize];
	private int comCount = 0;
	public ArrayList<String>placeDotCom(int comSize) {
		
		ArrayList<String> alphacells = new ArrayList<String>();
	String [] alphacoords = new String [comSize];
	int attempts = 0;
	boolean success = false;
	int location = 0;
	
	com count++ ;
	int incr = 1;
	
	public String getUserInput(String prompt)  {
		String inputLine = null;
		System.out.print(prompt + " ");
		
			BufferedReader is = new BufferedReader(
			new inputStreamReader(System.in));
			inputLine = is.readLine ();
		if (inputLine.length () == 0 ) return null;{
			return inputLine.toLowerCase();
	}  
	  



	
	if ((comcount % 2) == 1) {
		incr = gridLength;
	}while ( !success & attempts++ <200) {
		location = (int) (Math.random() * gridSize);
		//System.out.print("try " + location);
		int x = 0;
		success = true;
		while(success && x < comSize) {
			if (grid[location] == 0) {
				coords[x++] = location;
				location += incr;
				if (location >= gridSize) {
					success = false;
				}
				if (x>0 && (location % gridLength == 0)) {
					success = false;
			}
		}
		else {
			//System.out.print(" used " + location);
			success = false;
		}
	}
}
int x = 0;
int row = 0;
int column = 0;
//System.out.println("\n");
while (x < comSize)  {
	grid[coords[x] ] = 1;
	row = (int) (coords[x] / gridLength);
	column = coords[x]  % gridLength;
	temp = String.valueOf(alphabet.charAt(column));
	alpha.Cells.add(temp.concat(Integer.toString(row)));
	x++;
	// System.out.print("coord "+x+" = " + aplhaCells.get(x-1));
}
//System.out.println("\n");
return alphaCells;


	
	
	
