package Default;

public class Palindromestack {
	String  s2="";
	public void palindrome(String s) {
		Stack<Character> s1=new Stack<Character>(s.length());
		
		for(int i=0;i<s.length();i++) {
			s1.push(s.charAt(i));
		}
		for(int i=0;i<s.length();i++) {
			s2 +=s1.pop();
		}
		if(s.equals(s2))
		System.out.println("String is palindrome");
		else
			System.out.println("string is not palindrome");
	}

}
