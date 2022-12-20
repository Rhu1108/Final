import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        // Welcome to school! You already hate the tech department of your school.
        // Get ready to troll these people!

        System.out.println("FROM: theelonmusk@gmail.com");
        System.out.println("SUBJECT: Your future at this school");
        System.out.println("Dear valued employee,");
        System.out.println();
        System.out.println("As the owner of the public education system, I would like to say that I have the irresistible urge to fire you.");
        System.out.println(" Please document any objections to this in a minimum of 500 words.");
        System.out.println();
        System.out.println("Hoping you have a wacky wednesday,");
        System.out.println("Elon Musk");

        Scanner sc = new Scanner(System.in);

        System.out.println("Replying to theelonmusk@gmail.com");
        System.out.println("Enter message: ");
        String message = "";

        // Step 1.
        // Insert a while loop that will get lines from the user using the scanner and add them to the message variable until the user types "send"

        System.out.println();

        // Step 2.
        // Insert a for loop that will email the tech guy the reverse of his email 100 times
        // This means print "FROM: theelonmusk@gmail.com\n" + reverseString(message) 100 times

        System.out.println("FROM: theelonmusk@gmail.com");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣤⣤⣤⣤⣴⡶⠶⠶⠶⠶⠶⠶⠶⠶⠤⠤⢤⣤⣤⣤⣤⣤⣄⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠋⠀⠀⠀⠀⢀⣀⠤⠖⠚⢉⣉⣉⣉⣉⣀⠀⠀⠀⠀⠀⠀⠈⠉⠩⠛⠛⠛⠻⠷⣦⣄⡀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⣠⡿⠋⠀⠀⠀⣀⠤⠒⣉⠤⢒⣊⡉⠠⠤⠤⢤⡄⠈⠉⠉⠀⠂⠀⠀⠐⠂⠀⠉⠉⠉⠉⠂⠀⠙⠻⣶⣄⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⣰⡿⠁⠀⠀⡠⠊⢀⠔⣫⠔⠊⠁⠀⠀⠀⠀⠀⠀⠙⡄⠀⠀⠀⠀⠀⠘⣩⠋⠀⠀⠀⠉⠳⣄⠀⠀⠀⠈⢻⡇⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⣰⡿⠁⠀⠀⠀⠀⠀⠁⠜⠁⣀⣤⣴⣶⣶⣶⣤⣤⣀⠀⠃⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠈⠆⠀⠀⠀⠸⣧⡀⠀⠀");
        System.out.println("⠀⠀⠀⣠⣾⣿⣥⠤⢄⡀⠀⢠⣤⠔⢠⣾⣿⣿⣿⣿⣿⣯⣄⡈⠙⢿⣦⠀⠀⠀⠀⡀⢀⣤⣶⣿⣿⣿⣿⣿⣦⠀⣀⣀⣀⣀⡙⢿⣦⡀");
        System.out.println("⠀⣠⡾⣻⠋⢀⣠⣴⠶⠾⢶⣤⣄⡚⠉⠉⠉⠁⣠⣼⠏⠉⠙⠛⠷⡾⠛⠀⠀⠀⠘⠛⢿⡟⠛⠋⠉⠉⠉⠁⠀⠀⠀⠀⠀⠦⣝⠦⡙⣿");
        System.out.println("⢰⡟⠁⡇⢠⣾⠋⠀⠀⣼⣄⠉⠙⠛⠷⠶⠶⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣇⠀⠀⠀⠠⣦⣄⣴⡾⢛⡛⠻⠷⠘⡄⢸⣿");
        System.out.println("⢸⡇⠀⡇⢸⣇⢀⣤⣴⣿⠻⠷⣦⣄⣀⠀⠀⠀⢀⡀⠀⣀⠰⣤⡶⠶⠆⠀⠀⠀⠀⠀⠈⠛⢿⣦⣄⠀⠈⠉⠉⠁⢸⣇⠀⠀⣠⠃⢸⣿");
        System.out.println("⠸⣿⡀⢇⠘⣿⡌⠁⠈⣿⣆⠀⠀⠉⢻⣿⣶⣦⣤⣀⡀⠀⠀⢻⣦⠰⡶⠿⠶⠄⠀⠀⠀⣠⣾⠿⠟⠓⠦⡄⠀⢀⣾⣿⡇⢈⠡⠔⣿⡟");
        System.out.println("⠀⠙⢿⣌⡑⠲⠄⠀⠀⠙⢿⣿⣶⣦⣼⣿⣄⠀⠈⠉⠛⠻⣿⣶⣯⣤⣀⣀⡀⠀⠘⠿⠾⠟⠁⠀⠀⢀⣀⣤⣾⣿⢿⣿⣇⠀⠀⣼⡟⠀");
        System.out.println("⠀⠀⠀⠹⣿⣇⠀⠀⠀⠀⠈⢻⣦⠈⠙⣿⣿⣷⣶⣤⣄⣠⣿⠁⠀⠈⠉⠙⢻⡟⠛⠻⠿⣿⠿⠛⠛⢻⣿⠁⢈⣿⣨⣿⣿⠀⢰⡿⠀⠀");
        System.out.println("⠀⠀⠀⠀⠈⢻⣇⠀⠀⠀⠀⠀⠙⢷⣶⡿⠀⠈⠙⠛⠿⣿⣿⣶⣶⣦⣤⣤⣼⣧⣤⣤⣤⣿⣦⣤⣤⣶⣿⣷⣾⣿⣿⣿⡟⠀⢸⡇⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠈⢿⣦⠀⠀⠀⠀⠀⠀⠙⢷⣦⡀⠀⠀⢀⣿⠁⠉⠙⠛⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢸⣷⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠙⢷⣄⠀⢀⡀⠀⣀⡀⠈⠻⢷⣦⣾⡃⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⢹⡟⠉⠉⣿⠏⢡⣿⠃⣾⣷⡿⠁⠀⠘⣿⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⣤⣉⠒⠤⣉⠓⠦⣀⡈⠉⠛⠿⠶⢶⣤⣤⣾⣧⣀⣀⣀⣿⣄⣠⣼⣿⣤⣿⠷⠾⠟⠋⠀⠀⠀⠀⣿⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠿⣶⣄⡉⠒⠤⢌⣑⠲⠤⣀⡀⠀⠀⠀⠈⠍⠉⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⣠⠏⠀⢰⠀⠀⣿⡄⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠿⢷⣦⣄⡉⠑⠒⠪⠭⢄⣀⣀⠀⠐⠒⠒⠒⠒⠀⠀⠐⠒⠊⠉⠀⢀⡠⠚⠀⠀⢸⡇⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⢷⣦⣀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠓⠒⠒⠒⠊⠁⠀⠀⠀⢠⣿⠃⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠛⠷⠶⣶⣦⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣴⠟⠁⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠙⠛⠛⠷⠶⠶⠶⠶⠶⠾⠛⠛⠉⠀⠀⠀⠀⠀");
    }

    public static String reverseString(String input) {
        String rev = "";

        // Step 3.
        // reverse the String called input
        // to do this, loop through every character of input backwards and add it to the String called rev

        return rev;
    }
}