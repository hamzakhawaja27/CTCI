package chapter1;
import java.util.ArrayList;

public class ZeroMatrix {

	public static void Findzero(int[][] mat){
		int R=mat.length;
		int C=mat[0].length;
		
		boolean[] RM=new boolean[R];
		boolean[] CM=new boolean[C];
		
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
			
				if(mat[i][j]==0){
						RM[i]=true;
						CM[j]=true;				
				}
				}
			}
		
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
			
				if(RM[i]==true || CM[j]==true){
					mat[i][j]=0;
				}
				System.out.print(mat[i][j]+" ");
				}
			System.out.println();
			}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={{1,2,5},{0,5,0},{7,8,10}};
		
		Findzero(matrix);
	}
}
