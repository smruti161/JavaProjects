package pattern;

public class InvertPyramid {

	public static void main(String[] args) {
		int n=4;
		int star=(n*2)-1;
		int space=0;
		for(int i=1; i<=n;i++)
		{
			for(int j=1; j<=space; j++)//for space
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)//for star
			{
				System.out.print("*");
			}
			System.out.println();
			star-=2;
			space++;
		}
	}
}
