import java.io.*;
import java.net.*;
classclientRCE
{
public static void main(String args[]) throws IOException
{
try
{
String str;Socket client=new Socket("127.0.0.1",6555);
PrintStreamps=new PrintStream(client.getOutputStream());
BufferedReaderbr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\t\t\t\tCLIENT WINDOW\n\n\t\tEnterTheCommand:");
str=br.readLine();
ps.println(str);
}
catch(IOException e)
{
System.out.println("Error"+e);
}
}
}
