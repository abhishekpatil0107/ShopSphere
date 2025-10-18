package filehandling;
import java.io.*;
public class DataIpOpStreamEx 
{
	public static void main(String args[]) throws IOException
	  {
	    FileOutputStream fout=new FileOutputStream("C:\\Users\\Abhishek\\OneDrive\\Desktop\\New1.txt");
	    DataOutputStream dout=new DataOutputStream(fout);
	    dout.write(8);
	    dout.write(885263);
	    dout.writeChar('A');
	    dout.writeDouble(88.55);
	    dout.writeFloat(90.52f);
	    dout.writeUTF("Yess Infotech");
	    dout.writeLong(895624851l);
	    dout.writeBoolean(false);
	    
	    dout.close();
	    fout.close();
	    
	    FileInputStream fin=new FileInputStream("C:\\Users\\Abhishek\\OneDrive\\Desktop\\New1.txt");
	    DataInputStream din=new DataInputStream(fin);
	    byte b=din.readByte();
	    int i=din.readInt();
	    double d=din.readDouble();
	    float f=din.readFloat();
	    char ch=din.readChar();
	    String s=din.readUTF();
	    long l=din.readLong();
	    boolean b1=din.readBoolean();
	    
	    System.out.println("Byte:"+b+"\nInteger:"+i+"\nDoouble:"+d+"\nFloat:"+f+"\nChar:"+ch+"\nString:"+s);
	    System.out.println("Long:"+l+"\nBoolaen"+b1);
	    
	    din.close();
	    fin.close();
	    
	    
	  }

}
