import java.util.*;
public class Q8{
public static void main (String args[]){
  Scanner input = new Scanner(System.in);
  int value = input.nextInt();
  int count=0;
  for(int i=1;i<=value;i++){
  if(value%i==0){
  System.out.print(i + " ");
  count++;
  }
  }
  System.out.println();
  System.out.println(count);
}
}