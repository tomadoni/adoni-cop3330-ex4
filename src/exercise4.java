import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        String noun= "";
        String verb="";
        String adjective="";
        String adverb="";
        System.out.println("Enter a noun: ");
        noun=kb.nextLine();
        System.out.println("Enter a verb: ");
        verb=kb.nextLine();
        System.out.println("Enter an adjective: ");
        adjective=kb.nextLine();
        System.out.println("Enter an adverb: ");
        adverb=kb.nextLine();
        System.out.println("Do you "+verb+" your "+adjective+" "+noun+" "+adverb+"? That's hilarious!");
    }
}
