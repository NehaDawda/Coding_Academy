/*
//file object is used to obtain or manipulate the informatio associated with
disk file
such as permission, time , date and path etc.
Files are a primary source and destination for data within many programs
constructor
File(String path)
File(String path, String file name)
File(File dirobj, String FileName)
File(URI obj)
*/
package batch2.day15;
import java.io.*;

class FileDemo
{
	public static void main(String s[])
	{
	File f1 = new File("D:\\IOStreamFiles\\FileInfo.txt");
	
	System.out.println("File Name" + f1.getName());
	System.out.println("File Path" + f1.getPath());
	System.out.println("File Absolute Path" + f1.getAbsolutePath());
	System.out.println("File Parent" + f1.getParent());
	System.out.println("File Exist?" + f1.exists());
	System.out.println("File Redable" + f1.canRead());
	System.out.println("File Writable" + f1.canWrite());

	}
}