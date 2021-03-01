import java.io.*;
import java.util.*;
public class DiagonalTraversal {
    public static void main(String[]args)throws Exception{
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int [][]arr=new int[r][c];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[0].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        for(int gap=0;gap<arr.length;gap++){
            for(int i=0,j=gap;j< arr.length;i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
