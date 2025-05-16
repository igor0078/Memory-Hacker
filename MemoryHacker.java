import java.util.Scanner;

public class MemoryHacker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== MEMORY HACKER ===");
        System.out.println("Je bent verbonden met de AI-geheugenwereld...");
        System.out.println("Doel: Vind en herstel de kernel van de AI.\n");

        int score = 0;

        // Eerste kamer
        System.out.println("==[ Neuron Node 3A ]==");
        System.out.println("Firewall actief. Los de puzzel op om verder te gaan.");
        System.out.println("Decodeer dit binair getal: 101101");

        System.out.print("Jouw antwoord (in decimaal): ");
        String input = scanner.nextLine();

        if (input.equals("45")) {
            System.out.println("Toegang verleend. Firewall uitgeschakeld.");
            score++;
        } else {
            System.out.println("Toegang geweigerd. Verbinding verbroken.");
            System.exit(0);
        }

        // Tweede kamer (voorbeeld)
        System.out.println("\n==[ Neuron Node 7F ]==");
        System.out.println("Firewall actief. Los de puzzel op om verder te gaan.");
        System.out.println("Wat is de XOR van 12 en 5?");

        System.out.print("Jouw antwoord: ");
        input = scanner.nextLine();

        if (input.equals("9")) {
            System.out.println("Firewall gedeactiveerd. Je gaat dieper in het systeem.");
            score++;
        } else {
            System.out.println("Fout. Je wordt teruggestuurd.");
            System.exit(0);
        }

        System.out.println("\n==[ KERNEL NADERD ]==");
        System.out.println("Je hebt " + score + " firewalls gehackt.");
        System.out.println("Meer levels volgen...");

        scanner.close();
    }
}
