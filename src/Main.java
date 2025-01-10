public class Main
{
    public static void main(String[] args)
    {
        try
        {
            NullPointerExceptionGenerator.genException();
        }
        catch (NullPointerException e)
        {
            System.out.println("Wystąpił wyjątek - odwołanie do wartości \"null\"");
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
