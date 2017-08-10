package A41_50;

/*
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?


 */

public class RotateImage {
	
	public static void main(String[] args){
		int[][] matrix = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		rotate(matrix);
	}
	
    public static void rotate(int[][] matrix) {
    	int length = matrix.length;
    	for(int i=0; i<length;i++){
    		for(int j=i;j<length-1-i;j++){
    			System.out.println("i: " + i + " j: " + j);
    			int temp = matrix[length-1-j][i];
    			matrix[length-1-j][i] = matrix[length-1-i][length-1-j];
    			matrix[length-1-i][length-1-j] = matrix[j][length-1-i];
    			matrix[j][length-1-i] = matrix[i][j];
    			matrix[i][j] = temp;
    		}
    	}
        
    }
}

