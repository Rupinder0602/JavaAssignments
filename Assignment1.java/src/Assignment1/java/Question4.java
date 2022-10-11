package Assignment1.java;
	import java.util.Scanner;
	public class Question4 {
		public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    System.out.println("Enter no. of rows: ");
			    int n = sc.nextInt();
			    System.out.println("Enter no. of columns: ");
			    int m = sc.nextInt();
			    int[][] a = new int[n][m];
			    System.out.printf("Enter the elements....");
			    for (int i=0; i<n; i++)
			    {
			      for (int j=0; j<m; j++)
			      {
			          int inp = sc.nextInt();
			          a[i][j]=inp;
			      }
			    }
			    //rows
			    for(int i=0;i<n;i++)
			    {
			      int rs=0;
			      for(int j=0;j<m;j++)
			      {
			         rs+=a[i][j];
			      }
			      System.out.println("Sum of row "+(i+1)+" is "+rs);
			      rs=0;
			    }
			    //columns
			    for(int i=0;i<m;i++)
			    {
			      int cs=0;
			      for(int j=0;j<n;j++)
			      {
			         cs+=a[j][i];
			      }
			      System.out.println("Sum of column "+(i+1)+" is "+cs);
			      cs=0;
			    }
			  }
			}

