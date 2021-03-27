package com.company;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    Scanner sc = new Scanner(System.in);
    Random RandomUserID = new Random(100000);
    Random RandomRoomID = new Random(100);

    // Login User
    public void loginUser(User U , ChatRoom C)
    {
        int i = 0;
        while(++i<=3)
        {
            System.out.println("Enter Room Credentials : ");
            System.out.print("Enter Room ID : ");
            int roomId = sc.nextInt();
            System.out.print("Enter Your user Password : ");
            String userPassword = sc.next();
            if(C.getRoomID() == roomId &&  userPassword.equalsIgnoreCase(U.getUserPassword()))
            {
                U.setLoginStatus(true);
                break;
            }
        }
    }

    // Room Creation
    public ChatRoom createChatRoom()
    {
        int roomId = RandomRoomID.nextInt(10000);
        System.out.println("This is your Room ID : "+roomId);
        System.out.print("Enter Your Room Name : ");
        sc.nextLine();
        String roomName = sc.nextLine();
        System.out.print("Enter Your Room Password : ");
        String roomPassword = sc.next();
        LinkedList<User> L = new LinkedList<>();
        ChatRoom C = new ChatRoom(roomId,roomName,roomPassword,L);
        return C;
    }

    // Add User
    public LinkedList<User> addUser(LinkedList<User> L)
    {

        System.out.println("Enter User Details ");
        int userId = RandomUserID.nextInt(100);
        System.out.println("This is your user Id : "+userId);
        sc.nextLine();
        System.out.print("Enter the name of user : ");
        String userName = sc.nextLine();
        System.out.print("Enter Your user Password : ");
        String userPassword = sc.next();
        User U = new User(userId,userName,userPassword);
        L.add(U);
        return L;
    }

    public void sendMessage(User U , ChatRoom C)
    {
        sc.nextLine();
        String newMessage = U.getUserName() + "  :  " + " ' ";
        System.out.print("Enter the message you want : ");
        newMessage += sc.nextLine() + " ' ";
        C.addMessages(newMessage);
    }

    public static void main(String[] args) {
	// write your code here

        Main M = new Main();
        LinkedList<User> L = new LinkedList<>();
        User U = null;
        ChatRoom C = null;

        System.out.println("Welcome To the Java Chat Application ");
        System.out.println();
        System.out.println();

        while(true)
        {
            System.out.println();
            System.out.println();
            System.out.println("Options : ");
            System.out.println("Choose A : Create a Chat Room ");
            System.out.println("Choose B : Add User in Chat Room ");
            System.out.println("Choose C : want to login as User ");
            System.out.println("Choose D : send a message ");
            System.out.println("Choose E : Display all message from a specific chat room ");
            System.out.println("Choose F : List down all users belonging to specified chat room");
            System.out.println("Choose G : Logout as User ");
            System.out.println("Choose H : Delete a User ");
            System.out.println("Choose I : Delete chat Room ");
            System.out.println();
            System.out.print("Enter Your Choice : ");
            char choice = M.sc.next().charAt(0);
            switch(choice)
            {
                case 'A' :    if(C==null)
                              {
                                  C = M.createChatRoom();
                                  L = new LinkedList<>();
                                  System.out.println();
                                  System.out.println(" ======   Chat Room is Created  =====");
                              }
                              else {
                                  System.out.println("Already There is a room exist Name : " + C.getRoomName() + "\n Our System Support One Room per application at a time ");
                                  System.out.print("do u still want to create your room then : ");
                                  String t = M.sc.next();
                                  if(t.equalsIgnoreCase("Yes"))
                                  {
                                      C = M.createChatRoom();
                                      L = new LinkedList<>();
                                      System.out.println();
                                      System.out.println(" ======   Chat Room is Created  =====");
                                  }
                                  else
                                      break;
                              }
                              break;

                case 'B' :    if(C!=null) {
                                L = M.addUser(L);
                                C.setAdduser(L);
                                System.out.println();
                                System.out.println(" ======   User Added  =====");
                                }
                              else
                                  System.out.println("First Create a Chat Room ");
                              break;

                case 'C' :    System.out.println("Select Yourself from the List of Users Id ");
                              L.forEach((k) -> {
                                  System.out.println("UserId : "+k.getUserID());
                              });
                              System.out.print("Type your user Id : ");
                              int userId = M.sc.nextInt();
                              User u;
                              int ch = 0;
                              for(User k : L)
                                  if(userId == k.getUserID()) {
                                      M.loginUser(k, C);
                                      System.out.println();
                                      System.out.println(" ======   Login Successful  =====");
                                      U = k;
                                      ch = 1;
                                      break;
                                  }
                              if(ch == 1)
                                  break;
                              System.out.println("There is no user like this id exist");
                              break;

                case 'D' :    if(U!=null && C!=null)
                              {
                                if(U.isLoginStatus())
                                {
                                    M.sendMessage(U,C);
                                }
                                else
                                    System.out.println("First Login in the Chat Room");
                              }
                              else
                              {
                                  System.out.println("Either the User Doesn't Exist or Room");
                              }
                              break;

                case 'E' :   if(C!=null)
                                System.out.println(C.getMessages());
                              else
                                  System.out.println("there is no room Exist");
                              break;
                case 'F' :    if(C!=null)
                                L.forEach((k)->{System.out.println("User Id : "+k.getUserID()+" User Name : "+k.getUserName());});
                              else
                                System.out.println("there is no room Exist");
                              break;
                case 'G' :    if(U!=null)
                                {
                                    if(U.isLoginStatus())
                                        U.setLoginStatus(false);
                                    else
                                        System.out.println("Either u already logout or Never login yet");
                                }
                                else
                                    System.out.println("Either u already logout or Never login yet");
                                break;
                case 'H' :      System.out.print("Enter The User Id u want to delete : ");
                                userId = M.sc.nextInt();
                                for(User k : L) {
                                if (userId == k.getUserID()) {
                                L.remove(k);
                                break;
                                }
                                }

                case 'I' :    C=null;
                              U=null;
                              L=new LinkedList<>();
                              break;


                default :   System.out.println("there is no type option Exist here!! , try again");
            }
        }


    }
}
