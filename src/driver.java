import java.util.Scanner;
public class driver {

    public static void main(String[] args) {

        String Docket = "";
        double totalPrice = 0;
        double totaltaxComponent = 0;

        System.out.println("Dear customers !! Below we have displayed details of our freshfruits product" + "\n");

        freshfruits f1 = new freshfruits ("Apple", 1, 2, 2, 100);
        freshfruits f2 = new freshfruits ("Orange", 2, 2, 2, 100);
        freshfruits f3 = new freshfruits ("Mango", 3, 2, 2, 100);
        freshfruits f4 = new freshfruits ("Tomato", 4, 2, 2, 100);
        freshfruits f5 = new freshfruits ("Spinach", 5, 2, 2, 200);

        System.out.println(f1.toString() +"\n"+ f2.toString() + "\n"+ f3.toString() + "\n"+ f4.toString() + "\n"+ f5.toString());

        System.out.println("Dear customers !! Below we have displayed details of our packaged product" + "\n");

        Packaged p1 = new Packaged ("Egg", 6, 3, (3+(0.1*3)), 6, "best before 1 months of purchase");
        Packaged p2 = new Packaged ("Chocolate", 7, 5, (5+(0.1*5)), 10, "best before 1 months of purchase");
        Packaged p3 = new Packaged ("Protein Bar", 8, 7, (7+(0.1*7)), 8, "best before 1 months of purchase");
        Packaged p4 = new Packaged ("donut", 9, 3, (3+(0.1*3)), 5, "best before 1 months of purchase");
        Packaged p5 = new Packaged ("rollies", 10, 10, (10+(0.1*10)), 5, "best before 1 months of purchase");

        System.out.println(p1.toString() +"\n"+ p2.toString() + "\n"+ p3.toString() + "\n"+ p4.toString() + "\n"+ p5.toString());

        for(int i = 0; i<=77; i++) {
            System.out.print("#");
        }

        System.out.println("\n" + "Dear customer Lets start Shopping");

        for(int i = 0; i<=77; i++) {
            System.out.print("#");
        }

        Scanner input = new Scanner(System.in);

        int a;

        do{ System.out.println("\n" + "Please enter the product id of the product you wish to buy");
            int value = input.nextInt();

            if(value == 1) {

                Docket = Docket + f1;
                totalPrice = f1.itemPrice + totalPrice;
                totaltaxComponent= totaltaxComponent + 0;
                System.out.println("\n"+"Great choice!! here is what you have in your docket so far"+ "\n" +Docket);
                System.out.println("This is your total amount due " + totalPrice + "\n" + "\n"+ "This is you total tax component " + totaltaxComponent + "\n");
                System.out.println(" Do you want to continue Press 1 if you wish to continue shopping ");
                a = input.nextInt();

            }
            else if (value == 2) {

                Docket = Docket + f2;
                totalPrice = f2.itemPrice + totalPrice;
                totaltaxComponent= totaltaxComponent + 0;
                System.out.println("\n"+"Great choice!! here is what you have in your docket so far"+ "\n" +Docket);
                System.out.println("This is your total amount due " + totalPrice + "\n" + "\n"+ "This is you total tax component " + totaltaxComponent + "\n");
                System.out.println(" Do you want to continue Press 1 if you wish to continue shopping ");
                a = input.nextInt();

            }
            else if (value == 3) {

                Docket = Docket + f3;
                totalPrice = f3.itemPrice + totalPrice;
                totaltaxComponent= totaltaxComponent + 0;
                System.out.println("\n"+"Great choice!! here is what you have in your docket so far"+ "\n" +Docket);
                System.out.println("This is your total amount due " + totalPrice + "\n" + "\n"+ "This is you total tax component " + totaltaxComponent + "\n");
                System.out.println(" Do you want to continue Press 1 if you wish to continue shopping ");
                a = input.nextInt();

            }
            else if (value == 4) {

                Docket = Docket + f4;
                totalPrice = f4.itemPrice + totalPrice;
                totaltaxComponent= totaltaxComponent + 0;
                System.out.println("\n"+"Great choice!! here is what you have in your docket so far"+ "\n" +Docket);
                System.out.println("This is your total amount due " + totalPrice + "\n" + "\n"+ "This is you total tax component " + totaltaxComponent + "\n");
                System.out.println(" Do you want to continue Press 1 if you wish to continue shopping ");
                a = input.nextInt();

            }
            else if (value == 5) {

                Docket = Docket + f5;
                totalPrice = f5.itemPrice + totalPrice;
                totaltaxComponent= totaltaxComponent + 0;
                System.out.println("\n"+"Great choice!! here is what you have in your docket so far"+ "\n" +Docket);
                System.out.println("This is your total amount due " + totalPrice + "\n" + "\n"+ "This is you total tax component " + totaltaxComponent + "\n");
                System.out.println(" Do you want to continue Press 1 if you wish to continue shopping ");
                a = input.nextInt();

            }
            else if (value == 6) {

                Docket = Docket + p1;
                totalPrice = p1.taxPrice + totalPrice;
                totaltaxComponent= totaltaxComponent + (p1.itemPrice * 0.1);
                System.out.println("\n"+"Great choice!! here is what you have in your docket so far"+ "\n" +Docket);
                System.out.println("This is your total amount due " + totalPrice + "\n" + "\n"+ "This is you total tax component " + totaltaxComponent + "\n");
                System.out.println(" Do you want to continue Press 1 if you wish to continue shopping ");
                a = input.nextInt();

            }
            else if (value == 7) {

                Docket = Docket + p2;
                totalPrice = p2.taxPrice + totalPrice;
                totaltaxComponent= totaltaxComponent + (p2.itemPrice * 0.1);
                System.out.println("\n"+"Great choice!! here is what you have in your docket so far"+ "\n" +Docket);
                System.out.println("This is your total amount due " + totalPrice + "\n" + "\n"+ "This is you total tax component " + totaltaxComponent + "\n");
                System.out.println(" Do you want to continue Press 1 if you wish to continue shopping ");
                a = input.nextInt();

            }
            else if (value == 8) {

                Docket = Docket + p3;
                totalPrice = p3.taxPrice + totalPrice;
                totaltaxComponent= totaltaxComponent + (p3.itemPrice * 0.1);
                System.out.println("\n"+"Great choice!! here is what you have in your docket so far"+ "\n" +Docket);
                System.out.println("This is your total amount due " + totalPrice + "\n" + "\n"+ "This is you total tax component " + totaltaxComponent + "\n");
                System.out.println("Do you want to continue Press 1 if you wish to continue shopping ");
                a = input.nextInt();

            }
            else if (value == 9) {

                Docket = Docket + p4;
                totalPrice = p4.taxPrice + totalPrice;
                totaltaxComponent= totaltaxComponent + (p4.itemPrice * 0.1);
                System.out.println("\n"+"Great choice!! here is what you have in your docket so far"+ "\n" +Docket);
                System.out.println("This is your total amount due " + totalPrice + "\n" + "\n"+ "This is you total tax component " + totaltaxComponent + "\n");
                System.out.println("Do you want to continue Press 1 if you wish to continue shopping ");
                a = input.nextInt();

            }
            else if (value == 10) {

                Docket = Docket + p5;
                totalPrice = p5.taxPrice + totalPrice;
                totaltaxComponent= totaltaxComponent + (p5.itemPrice * 0.1);
                System.out.println("\n"+"Great choice!! here is what you have in your docket so far"+ "\n" +Docket);
                System.out.println("This is your total amount due " + totalPrice + "\n" + "\n"+ "This is you total tax component " + totaltaxComponent + "\n");
                System.out.println("Do you want to continue Press 1 if you wish to continue shopping ");
                a =input.nextInt();

            }
            else {

                System.out.println("Invalid response !! Please enter valid product id ");
                System.out.println(" Do you want to continue Press 1 if you wish to continue shopping ");

                a = input.nextInt();
            }
        } while ( a == 1);



    }
}







