import java.util.*;
public class Q9{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int row = input.nextInt();
  for(int i=1;i<=row;i++){
    for(int j=1;j<=row-i;j++){
      System.out.print(" ");
  }
  for(int j=1;j<=i;j++){
    if(i<row){
    if(j==1 || j==i){
      if(j==1){
      System.out.print((row+1)-i);
      }
      else{
      System.out.print((row));
      }
    }
    else{
      System.out.print(" ");
    }
  }
    else{
    System.out.print(j);
    }
  }
    System.out.println();
  }
}
}