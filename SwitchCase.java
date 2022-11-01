import java.io.*;
public class Switchcase{
static void NumbertoCharacter(string s)
{
for (int i=0;i<s.length();i++){
switch(s.charAt(i)){
case'1':
System.out.print("one");
break;
case'2':
System.out.print("two");
break;
case'3':
System.out.print("three");
break;
case'4':
System.out.print("four");
break;
case'5':
System.out.print("five");
break;
case'6':
system.out.print("six");
break;
case'7':
System.out.print("seven");
break;
case'8':
System.out.print("eight");
break;
case'9':
Systen.out.print("nine");
break;
case'0':
System.out.print("zero");
break;
default:
System.out.print("invaid");
break;
}
}
}
public static void main(string[]args)
{
int n=12345;
NumbertoCharacter(n+"");
}
}