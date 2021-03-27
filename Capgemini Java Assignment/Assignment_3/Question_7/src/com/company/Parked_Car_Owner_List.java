package com.company;

import java.util.*;

public class Parked_Car_Owner_List {
    private static int sequence = 0;
    private static HashMap<Car_to_Token,Parked_Car_Owner_Details> R_Mall = new HashMap<>();
    public void add_new_car(Parked_Car_Owner_Details obj)
    {
        obj.setToken(++sequence);
        int total_loc_number = sequence%20;
        int sec = ((sequence - total_loc_number)/20)%4;
        int l = ((sequence - total_loc_number)/20);
        double floor = Math.ceil((l - l%4)/3);
        obj.setCarLoc(" Car is located at "+ floor + "th floor in " + sec + " section at "+total_loc_number+" in the parking slot");
        Car_to_Token C = new Car_to_Token(obj.carNo, sequence);
        R_Mall.put(C,obj);
    }

    public void remove_car()
    {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your car no that u want to delete : ");
        int carNo = sc.nextInt();

        if(R_Mall.size()>=1)
        {
            Car_to_Token T = null;
            Iterator I = R_Mall.entrySet().iterator();
            while (I.hasNext())
            {
                Map.Entry E = (Map.Entry) I.next();
                Car_to_Token C = (Car_to_Token) E;
                if(C.carNo == carNo)
                {
                    T = C;
                    break;
                }
            }
            if(T!=null)
                R_Mall.remove(T);
            else
                System.out.println("this car No is not present int the R-Mall");
        }
        else
        {
            System.out.println("there is no car in Parking slot");
        }
    }
    int get_parked_car_location(int token)
    {
        return 1;
    }
    public static void main(String[] args) {
        // write your code here
        int i = 0;

        Parked_Car_Owner_List P = new Parked_Car_Owner_List();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the R-Mall Parking Slot ");
        System.out.println();
        while(++i<=240)
        {
            System.out.println("Select the option");
            System.out.println("1. Add Car ");
            System.out.println("2. Remove Car");
            System.out.println("3. get the location of your car");
            System.out.print("Enter your choice : ");
            int c = sc.nextInt();
            switch (c)
            {
                case 1 :    System.out.println();
                            System.out.println();
                            System.out.println("Enter your Car and OwnerShip Details ");
                            System.out.print("Enter your name : ");
                            String ownerName = sc.nextLine();
                            sc.nextLine();
                            System.out.print("Enter your car Model : ");
                            String carModel = sc.nextLine();
                            System.out.print("Enter your car number : ");
                            int carNo = sc.nextInt();
                            System.out.print("Enter your mobile number : ");
                            long ownerMobileNo = sc.nextLong();
                            System.out.print("Enter your Address : ");
                            String ownerAddress = sc.nextLine();
                            Parked_Car_Owner_Details O = new Parked_Car_Owner_Details(ownerName,carModel,carNo,ownerMobileNo,ownerAddress);
                            P.add_new_car(O);
                            System.out.println(" =====  Car is Added in Parking Slot ===== ");
                            break;

                case 2 :    P.remove_car();
                            break;

                case 3 :    System.out.print("Enter the Car Number : ");
                            carNo = sc.nextInt();
                            Car_to_Token T = null;
                            Iterator I = R_Mall.entrySet().iterator();
                            while (I.hasNext())
                            {
                            Map.Entry E = (Map.Entry) I.next();
                            Car_to_Token C = (Car_to_Token) E;
                            if(C.carNo == carNo)
                            {
                                P.get_parked_car_location(C.getToken());
                                break;
                            }
                            }
                            if(T==null)
                                System.out.println("this car No is not present int the R-Mall");
                            break;


                default:    System.out.println("There is no option like that !!!");
            }

        }

    }
}
