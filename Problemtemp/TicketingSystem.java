import java.util.Scanner;

public class TicketingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a package: Basic, Standard, Advanced, Premium");
        String packageChoice = scanner.nextLine();

        PackageFactory packageFactory;

        // Select the package based on user input
        switch (packageChoice.toLowerCase()) {
            case "basic":
                packageFactory = new BasicPackageFactory();
                break;
            case "standard":
                packageFactory = new StandardPackageFactory();
                break;
            case "advanced":
                packageFactory = new AdvancedPackageFactory();
                break;
            case "premium":
                packageFactory = new PremiumPackageFactory();
                break;
            default:
                System.out.println("Invalid package choice.");
                return;
        }

        // Add components based on package
        packageFactory.addMicrocontroller();
        packageFactory.addDisplay();

        // Prompt user for internet option
        System.out.println("Choose an internet option: WiFi, Ethernet, SIM card");
        String internetOption = scanner.nextLine();

        // Prompt user for framework choice
        System.out.println("Choose a framework: Django, Node.js, Ruby");
        String frameworkChoice = scanner.nextLine();

        // Use the builder to finalize the system
        SystemBuilder systemBuilder = new SystemBuilder()
            .setInternetOption(internetOption)
            .setFramework(frameworkChoice);

        systemBuilder.build();
    }
}
