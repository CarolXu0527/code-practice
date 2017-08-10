package A31_40;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
	
	public static void main(String[] args){
		char[][] test = {{'.','8','7','6','5','4','3','2','1'},{'2','.','.','.','.','.','.','.','.'},
						{'3','.','.','.','.','.','.','.','.'},{'4','.','.','.','.','.','.','.','.'},
						{'5','.','.','.','.','.','.','.','.'},{'6','.','.','.','.','.','.','.','.'},
						{'7','.','.','.','.','.','.','.','.'},{'8','.','.','.','.','.','.','.','.'},
						{'9','.','.','.','.','.','.','.','.'}};
		System.out.println(isValidSudoku(test));
	}
	
	   public static boolean isValidSudoku(char[][] board) {
	    	
	    	boolean result = true;
	    	
	    	if(board.length ==0||board[0].length==0|| board.length!=board[0].length){
	    		System.out.println("1");
	    		return false;
	    	}
	    	
	    	int width = board[0].length;
	    	for(int i = 0;i<board.length;i++){
	    		result = (!check(board,0,width-1,i,i))?false:result;
	    		//System.out.println("2" + result);
	            if(result==false)return result;
	    	}
	    	
	    	for(int i = 0;i<board.length;i++){
	    		result = (!check(board,i,i,0,width-1))?false:result;
	    		if(result==false)return result;
	    	}
	    	
	    	int cube1 = 0, cube2;
	    	while(cube1<7){
	    		cube2 = 0;
	    		while(cube2<7){
	    			result = (!check(board,cube1,cube1+2,cube2,cube2+2))?false:result;
	    			if(result==false)return result;
	    			cube2= cube2+3;
	    		}
	    		cube1=cube1+3;
	    	}
	        return result;
	    }

		private static boolean check(char[][] board, int width1, int width2, int height1, int height2) {
			// TODO Auto-generated method stub
			Set<Character> temp  = new HashSet<Character>();
			int count = 0;
			for(int i =  width1; i<=width2; i++){
				for(int j = height1; j <=height2;j++){
					if(board[i][j]!='.'){
						temp.add(board[i][j]);
					}else{
						count++;
					}
				}
			}
			
			if(temp.size()+count==9){
				return true;
			}else{
			return false;
			}
		}

}
