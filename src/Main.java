public class Main
{

    public static void main(String[] args)
    {
	boolean correctInput = false;
    int birthMonth;
    birthMonth = 10;
        if (birthMonth >= 1 && birthMonth <= 12)
        {
            correctInput = true;
            System.out.println("Your birth Month is: " + birthMonth);
        }
        else
        {
            System.out.println("You have entered an incorrect month value: "+ birthMonth);
        }


    }

}
