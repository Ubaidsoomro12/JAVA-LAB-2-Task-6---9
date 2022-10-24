import java.util.Scanner;

class Restaurant{
    public static void main(String[] args){
        int a;
        boolean b = false;
        Scanner sc = new Scanner(System.in);
        //Printing out the options and Taking user input.
        while(true)
{
        System.out.println("Welcome To Our Restaurant! Press The Following Codes For Menu Item Prices: \n1) Chicken Borgir\n2) Beef Borgir\n3) Cheese Borgir\n4) Pizza\n5) Fries\n6) Chicken Biryani\n7) Rice Pulao\n8)  Chicken Tikka\n9) Fish Fry\n10) Coldrink\n11) Cofee\n12) Chayee\n13) Salat\n14) Raiyta\n15)");
        a = sc.nextInt();
        //Using switch to display price for the selected item.
           

        switch(a){
           
            case 1:
                System.out.println("special karachi karahi per kg  = Rs.2500");
                break;
            case 2:
                System.out.println("Beef karahi per kg  = Rs.250");
                break;
            case 3:
                System.out.println("mutton karahi per kg  = Rs.2800 per kg ");
                break;
            case 4:
                System.out.println("white chicken karahi per kg = Rs.2500 per kg ");
                break;
            case 5:
                System.out.println("chicken karahi per kg  = Rs.1500 pr kg ");
                break;
            case 6:
                System.out.println("Fries = Rs. 150 ");
                break;
            case 7:
                System.out.println("Cheiken Biryani  = Rs.250 per kg ");
                break;
            case 8:
                System.out.println("Rice Pilao = Rs. 200 per kg ");
                break;
            case 9:
                System.out.println("Chiken Tikka = Rs. 200 ");
                break;
            case 10:
                System.out.println("Fish Fry = Rs. 2200 per kg ");
                break;
            case 11:
                System.out.println("Coldrink = Rs. 50");
                break;
            case 12:
                System.out.println("CoFee = Rs. 120 ");
                break;
            case 13:
                System.out.println("Chayee = Rs. 60 ");
                break;
            case 14:
                System.out.println("Salat = RS. 30 ");
                break;
            case 15:
                System.out.println("Raita = Rs. 30 ");
                break;    
            default:
                System.out.println("Please Select Items From 1 to 15");
             System.exit(0);
        }
}
    }
}