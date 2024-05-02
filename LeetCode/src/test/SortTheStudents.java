package test;

public class SortTheStudents {
	 public static int[][] sortTheStudents(int[][] score, int k)
	 {
		 //{{10,6,9,1},{7,5,11,2},{4,8,3,15}}
		 
		 for(int i=0;i<score.length;i++) {
			 for(int j=0;j<score.length;j++) {
				 if(score[i][k]>score[j][k]) {
					 int[] dummy=score[i];
					 score[i]=score[j];
					 score[j]=dummy;
				 }
			 }
		 }
		return score;
	 }
	 public static void main(String[] args) 
	 {
		int[][] score= {{10,6,9,1},{7,5,11,2},{4,8,3,15}};
		int k=2;
		int [][] res=sortTheStudents(score, k);
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	 }
}
