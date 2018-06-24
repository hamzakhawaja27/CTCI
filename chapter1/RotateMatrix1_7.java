package chapter1;
public class RotateMatrix1_7 {
	public static void rotate90(int[][] mat){
		int LM=mat.length;
		int[][] mat_new=new int[LM][LM];
		for(int i=LM-1;i>=0;i--){
			for(int j=LM-1;j>=0;j--){
				mat_new[i][j]= mat[j][LM-1-i];
				System.out.print(mat_new[i][j]+" ");
			}
			System.out.println();
			}	
	}
	public static void main(String[] args) {
		int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
		rotate90(matrix);
	}
	
}
