import java.util.Scanner;


public class Addition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rows of matrix: ");
		int row = scan.nextInt();
		System.out.println("Enter col of matrix: ");
		int col = scan.nextInt();
		
		int[][] a=new int[row][col];
		int[][] b=new int[col][col];
		System.out.println("Enter elements for 1st matrix: ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				a[i][j]= scan.nextInt();
			}
		}
		System.out.println("Enter elements for 2nd matrix: ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				b[i][j]= scan.nextInt();
			}
		}
		
		int[][] result=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
					result[i][j] =  a[i][j] + b[i][j];
			}
		}
		
		System.out.println("\n1st matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
		System.out.println("\n2nd matrix is");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
		System.out.println("\nAddition of matrix1 and matrix2 is");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
	}

}
