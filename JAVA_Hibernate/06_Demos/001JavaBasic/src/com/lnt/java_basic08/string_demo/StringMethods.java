/**
 * 
 */
package com.lnt.java_basic08.string_demo;

/**
 * @author Smita
 *
 */
public class StringMethods {
	public static void main(String[] args) {
		String str1="lnt";
		int len = str1.length();
		System.out.println("The length of str1 : "+len);
		String str2="Infotech";
		System.out.println("The company name is : "+str1.concat(str2));//contact and will not assign to str1
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		str1=str1.concat(str2);
		System.out.println("str1=str1.concat(str2) : "+str1);
		String str3=" India";
		str1+=str3;//contact and assign to str1
		System.out.println("str1 : "+str1);
		
		String s1="Zara";
		String s2="Zara";
		System.out.println("two string are equals then compareTo returns : "+s1.compareTo(s2));//compares values and return int (0)
		String s3="Yara";
		System.out.println("if second string is greater the compareTo returns : "+s3.compareTo(s2));//compares values and return int (-1)
		String s4="Yana";
		System.out.println("if first string is greater the compareTo returns : "+s1.compareTo(s4));//compares values and return int (1)
		System.out.println("Uppercase : "+s1.toUpperCase());
		System.out.println("Lowercase : "+s1.toLowerCase());
		
		String s5="hello how are you?";
		System.out.println("s5 : "+s5);
		String news5 =s5.replace('h', 't');
		System.out.println("replace 'h' with 't' :"+news5);
		
		String coName="My Company is Lnt ";
		String replacedStr=coName.replace("Lnt", "LTI");
		System.out.println("coName: "+coName);
		System.out.println("replacedStr : "+replacedStr);
		
		System.out.println("coName.conatains(Lnt) : "+coName.contains("Lnt"));
		System.out.println("coName.conatains(Company is Lnt) : "+coName.contains("Company is Lnt"));
		System.out.println("coName.conatains(CG) : "+coName.contains("CG"));
		
		//equals method compares values
		//equalsIgnoreCase compares the value ignoring cases
		String username="helloworld";
		String password="Hello@123";
		
		System.out.println("Checking username with equalsIgnoreCase: "+ username.equalsIgnoreCase("HelloWorld"));
		System.out.println("Checking password : "+ password.equals("Hello@123"));
		System.out.println("Checking username with equals : "+ username.equals("HelloWorld"));
		
		String msg="Hello, How are you?";
		System.out.println("Ends with you : "+msg.endsWith("you"));
		System.out.println("Ends with you? : "+msg.endsWith("you?"));
		
		String m1 ="quick brown fox jump over the lazy dog";
		System.out.println("substring starting from index 15 : "+m1.substring(15));
		//print the string from start with 15th index 
		
		System.out.println("substring starting from index 15  till 26-1: "+m1.substring(15,26));
	}

}




