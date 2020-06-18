package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestRoworColumn {

	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int n_rows = Integer.parseInt(strRowsCols[0]);
        int m_cols = Integer.parseInt(strRowsCols[1]);

        if (n_rows == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n_rows][m_cols];

        for (int row = 0; row < n_rows; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            
            for (int col = 0; col < m_cols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            LargestRoworColumn.findLargest(mat);
            System.out.println();

            t -= 1;
        }
    }
    public static void findLargest(int mat[][]){
		//Your code goes here
    	int row = mat.length;
    	int col = mat[0].length;
    	if(row==0 || col==0) {
    		System.out.print("row 0 -2147483648");
    		return;
    	}
    	String ans="";
    	int maxSum = -Integer.MIN_VALUE;
    	int index=-1;
    	for(int i=0;i<row;i++) {
    		int sum=0;
    		for(int j=0;j<col;j++) {
    			sum = sum + mat[i][j];
    		}
    		if(maxSum<sum) {
    			maxSum = sum;
    			index=i;
    			ans="row";
    		}
    	}
    	for(int j=0;j<col;j++) {
    		int sum=0;
    		for(int i=0;i<row;i++) {
    			sum =sum+mat[i][j];
    		}
    		if(maxSum<sum) {
    			maxSum = sum;
    			index=j;
    			ans = "col";
    		}
    	}
    	
    	System.out.println(ans + " " + index + " " + maxSum);
    	
	}

}
