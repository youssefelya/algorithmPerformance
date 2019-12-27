
import edu.princeton.cs.algs4.StdRandom;
public class Percolation {
	private int n;
	private char[][] grid; 
	
	private int numOpenSite; 

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
    	if( n<=0 ) throw new IllegalArgumentException();
    	this.n = n;
    	grid = new char[n][n];
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<n; j++) {
    			grid[i][j] = 'B'; // B for block, O for open, F for full;
    		}
    	}
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
    	if( row<0 || col <0 || row>=n || col>= n ) throw new IllegalArgumentException();
    	if(grid[row][col] !=  'O' && (grid[row][col] !=  'F')) {numOpenSite++; } ; 	
    	grid[row][col] =  'O';
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
    	if( row<0 || col <0 || row>=n || col>= n ) throw new IllegalArgumentException();
    	return grid[row][col] == 'O';
    	}

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
    	if( row<0 || col <0 || row>=n || col>= n ) throw new IllegalArgumentException();
    	return grid[row][col] == 'F'; 
    	}

    // returns the number of open sites
    public int numberOfOpenSites() {
    	return this.numOpenSite;
    	}

    // does the system percolate?
    public boolean percolates() {
    	return false;
    	}
    
    // test client (optional)
    public static void main(String[] args) {
    	System.out.println(StdRandom.gaussian());
    	
    }
}