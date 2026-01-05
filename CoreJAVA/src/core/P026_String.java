package core;

public class P026_String {
	public static void main(String[] args) {
		
		//String is immutable in java
		char[] c = {'j','a','v','a'};
		System.out.println(c);
		String s1 = "java";
		System.out.println(s1);
		String s = "hello java developers";//21(0-20)
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(12));
		System.out.println(s.contains("jav"));
		String s2 = " how are you ?";
		System.out.println(s.concat(s2));
		System.out.println(s);
		String s3 = "java";
		String s4 = "javA";
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareToIgnoreCase(s4));
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		String s5 ="             ja va              ";
		System.out.println(s5);
		System.out.println(s5.trim());
	}
}
