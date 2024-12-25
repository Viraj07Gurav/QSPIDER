package Interview_prepation;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="viraj";
		String s1="Gurav";
		String reverse_str="";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			reverse_str=ch+reverse_str;
			
	}
		System.out.println(reverse_str);
		
		StringBuilder res=new StringBuilder();
		res.append(s1);
		
		System.out.println(res.reverse());
		int count=1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j==4||j-i==2||i==3) {
					System.out.print(count++);
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		/////
		int count2=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count2++);
			}
			System.out.println();
		}
//		int count2=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		String st="madam";
		String copy=st;
		String rev="";
		char ch1;
		for(int i=0;i<=copy.length()-1;i++) {
			ch1=st.charAt(i);
			rev=ch1+rev;
		}
		if(st==rev) {
			
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		 String sen = "viraj gurav";  // Original sentence
	        String rev1 = "";             // To store the reversed sentence

	        // Split the sentence into words
	        String[] words = sen.split(" ");
	        System.out.println(words[0]);

	        // Loop through the words array in reverse order
	        for (int i =0;i<=words.length-1;i++) {
	            rev1 =words[i]+rev1 ;  // Append the word to the 'rev' string
	        }

	        // Print the reversed sentence after trimming any extra space
	        System.out.println("Reversed sentence: " + rev1);}
}
