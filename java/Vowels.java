import java.util.Scanner;

class Vowels
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // String name = "ABC";
        // char gender = 'M';
        char alphabet = sc.next().charAt(0);

        switch (alphabet)
        {
            case 'a':
            System.out.println("Vowel");
            break;

            case 'e':
            System.out.println("Vowel");
            break;

            case 'i':
            System.out.println("Vowel");
            break;

            case 'o':
            System.out.println("Vowel");
            break;

            case 'u':
            System.out.println("Vowel");
            break;

            default:
            System.out.println("Consonant");
        }
    }
}