import java.util.Scanner;

import PackageBuilder.*;
import Internet.*;
import WebServer.*;
import Payments.*;




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter The Type of Package you want to create: ");
            System.out.println("1. Basic Package");
            System.out.println("2. Standard Package");
            System.out.println("3. Advanced Package");
            System.out.println("4. Premium Package");

            int choice = sc.nextInt();
            PackageBuilder packageFactory = null;
            
            switch(choice){
                case 1:
                    packageFactory= new BasicPackageBuilder();
                    break;
                case 2:
                    packageFactory = new StandardPackageBuilder();
                    break;
                case 3:
                    packageFactory = new AdvancedPackageBuilder();
                    break;
                case 4:
                    packageFactory = new PremiumPackageBuilder();
                    break;
                default:
                    System.out.println("Invalid Choice.Please choose again between 1-4");
                    return;
            }

            System.out.println("Enter the Type of internet-connection you want: ");
            System.out.println("1. GSM");
            System.out.println("2. Wifi");
            if(choice == 4 || choice == 3)
            System.out.println("3. Ethernet");

            int internetChoice = sc.nextInt();
            Internet internet= null;

            switch (internetChoice) {
                case 1:
                     internet = new Gsm();
                    break;
                case 2:
                     internet = new Wifi();
                    break;
                case 3:
                    if (choice == 1 || choice == 2){
                        System.out.println("Inavalid choice.Ethernet is not available for Basic and Standard Package");
                        return;
                    }
                    internet = new Ethernet();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    return;
            }

            int webServerChoice;
            System.out.println("Enter the Type of WebServer you want: ");
            System.out.println("1. Django");
            System.out.println("2. nodejs");
            System.out.println("3. Ruby");
            webServerChoice = sc.nextInt();

            Webserver webServer = null;

            switch (webServerChoice) {
                case 1:
                    webServer = new Django();
                    break;
                case 2:
                    webServer = new Nodejs();
                    break;
                case 3:
                    webServer = new Ruby();
                default:
                    System.out.println("Invalid choice. Please make a choice between 1-3");
            }
            switch (choice) {
                case 1:
                    packageFactory.createMicrocontroller();
                    packageFactory.createDisplay();
                    packageFactory.createIdentification();
                    packageFactory.createStorage();
                    packageFactory.createController();
                    break;
                case 2:
                    packageFactory.createMicrocontroller();
                    packageFactory.createDisplay();
                    packageFactory.createIdentification();
                    packageFactory.createStorage();
                    packageFactory.createController();
                    break;
                case 3:
                    packageFactory.createMicrocontroller();
                    packageFactory.createDisplay();
                    packageFactory.createIdentification();
                    packageFactory.createStorage();
                    packageFactory.createController();
                    break;
                case 4:
                    packageFactory.createMicrocontroller();
                    packageFactory.createDisplay();
                    packageFactory.createIdentification();
                    packageFactory.createStorage();
                    packageFactory.createController();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    return;
            }

            switch(internetChoice){
                case 1:
                    internet.makeInternetConnection();
                    break;
                case 2:
                    internet.makeInternetConnection();
                    break;
                case 3:
                    internet.makeInternetConnection();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    return;
            }

            switch(webServerChoice){
                case 1:
                    webServer.returnWebserver();
                    break;
                case 2:
                    webServer.returnWebserver();
                    break;
                case 3:
                    webServer.returnWebserver();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    return;
            }

            Cash cash = new Cash();
            cash.makePayment();


            
                
        }catch(Exception e){
            System.out.println("Error: "+e);

        }finally{
            sc.close();
        }
    }
    
}