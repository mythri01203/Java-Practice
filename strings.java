class Mythri
{
	public static void main(String args[])
	{
		String s="hello all";
		int capital=0,small=0,consonant=0,vowels=0,digit=0,symbol=0,space=0;
		for(int x=0;x<=s.length()-1;x++)
		{
			char c=s.charAt(x);
			if(c>='a'&&c<='z')
			{
				small++;
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					vowels++;
				}
				else
				consonant++;
			}
			else if(c>='A'&&c<='Z')
			{
				capital++;
				if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				{
					vowels++;
				}
				else
				consonant++;
			}
			else if(c>='0'&&c<='9')
			{
				digit++;
			}
			else if(c==' ')
			{
				space++;
			}
			else
				symbol++;
		}
		System.out.println("small"+small+" vowels"+vowels+"capital"+ capital+" consonants"+consonant+"digits "+digit+"symbols "+symbol+" space"+space);
	}
} 


			
			