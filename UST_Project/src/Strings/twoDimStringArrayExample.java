package Strings;

public class twoDimStringArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] s = {{"firstuser","seconduser"},{"firstpwd","secondpwd"}};
		
		for (int i =0; i < s.length;i++)
		{
			for(int j=0;j <s.length;j++)
			{
				System.out.print(s[i][j]);
			}
				
		}
		
	}

}
