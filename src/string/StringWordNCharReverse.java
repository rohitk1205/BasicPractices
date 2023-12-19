package string;

public class StringWordNCharReverse {
	public static void main(String[]args) {
		StringWordNCharReverse ob=new StringWordNCharReverse();
		ob.byWord();
		byChara();
	}
   public void byWord() {
	   String s1="I am winning the game";
	   String []part=s1.split(" ");
	   for(int i=part.length-1; i>=0; i--) {
		   System.out.print(part[i]+" ");
	   }
	   System.out.println();
	}
   public static void byChara() {
	   String s2="I am winning the game";
	   String []p=s2.split("");
	   for(int i=p.length-1; i>=0; i--) {
		   System.out.print(p[i]);
	   }
   }
}
