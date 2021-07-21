class MyStrings
{
    public static void main(String[] args)
    {
        String message = "Hello world!";

        //Getting a character from a string
        char alphabet = message.charAt(6);
        System.out.println(alphabet);

        //String concatenation
        String fullMessage = message.concat("How are you?"); 
        System.out.println(fullMessage);

        //Equality check
        boolean check1 = message.equals("hello world!");
        System.out.println(check1);

        boolean check2 = message.equalsIgnoreCase("HELLO WORLD!");
        System.out.println(check2);

        //Length
        System.out.println(message.length());

        //Change cases
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());

        //Splitting a string
        String[] z = message.split(" ");

        //Substring
    }
}