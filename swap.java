import java.io.*;
import java.util.*;
class swap{
public static void main (String []args){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
int t =x;
x = y;
y = t;
System.out.println(x + "\n" + y);
}
}
