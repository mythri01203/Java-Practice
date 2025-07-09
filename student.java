
class Mythri 
{
    public static void main(String[] args) 
{
        char letter='a';
        if(letter>='A'&&letter<='Z')
        {
            letter=(char)(letter+32);
            System.out.println("The letter is:"+ letter);
        }
        else if(letter>='a'&&letter<='z')
        {
            letter=(char)(letter-32);
            System.out.println("The letter is:"+ letter);
        }
    }
}