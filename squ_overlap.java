import java.util.*;
class squ_overlap
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("ENTER THE X1 Y1 CO-ORDINATES");
int x1=in.nextInt();
int y1=in.nextInt();
System.out.println("ENTER THE X2 Y2 CO-ORDINATES");
int x2=in.nextInt();
int y2=in.nextInt();
System.out.println("ENTER THE X3 Y3 CO-ORDINATES");
int x3=in.nextInt();
int y3=in.nextInt();
System.out.println("ENTER THE X4 Y4 CO-ORDINATES");
int x4=in.nextInt();
int y4=in.nextInt();
System.out.println("ENTER THE X1 Y1 CO-ORDINATES OF SMALL SQUARE");
int a1=in.nextInt();
int b1=in.nextInt();
System.out.println("ENTER THE X2 Y2 CO-ORDINATES OF SMALL SQUARE");
int a2=in.nextInt();
int b2=in.nextInt();
System.out.println("ENTER THE X3 Y3 CO-ORDINATES OF SMALL SQUARE");
int a3=in.nextInt();
int b3=in.nextInt();
System.out.println("ENTER THE X4 Y4 CO-ORDINATES OF SMALL SQUARE");
int a4=in.nextInt();
int b4=in.nextInt();


if((a1>=x1)&&(a1<=x2)||(a2>=x1)&&(a2<=x2)||(a3>=x1)&&(a3<=x2)||(a4>=x1)&&(a4<=x2))
System.out.println("IT's OVERLAPPED");
else
System.out.println("IT's Not OVERLAPPED");
}
}