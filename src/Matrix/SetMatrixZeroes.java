//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//
//You must do it in place.
//
//Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
//Output: [[1,0,1],[0,0,0],[1,0,1]]
//
//
//		Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//				Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
package Matrix;


public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
    	int m = matrix.length;
    	int n = matrix[0].length;
    	int[] nextGen = new int[m*n];
    	int index =0;
    	
    	for (int i = 0; i < m; i++) {
    		for (int j = 0; j < n; j++) {
    			if (matrix[i][j] == 0) {
    				helper(i, j, m, n, nextGen, index);
    			}else {
    				index++;
    			}
    		}
    	}
    }
    private void helper (int i , int j, int m, int n, int[] arr, int index) {
    	
    }
    
    public static void main(String[] args) {
    	SetMatrixZeroes smz = new SetMatrixZeroes();
    	int[][] arr = {{1,1,1}, {1,0,1}, {1,1,1}};
    	smz.setZeroes(arr);
    }
}
