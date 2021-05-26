//BROWSING HISTORY CODE 

import java.util.*;
public class First{
    public static LinkedList<String> browserhistory = new LinkedList<String>();
    public static Boolean isBrowsingHistoryEmpty() {
    if(browserhistory.size()>0){
        return false;
    }
    return true;
}
public static String mostRecentlyVisitedSite() {
    
    return browserhistory.getLast();
   
}
public static void addSiteToHistory(String url) {
        browserhistory.addLast(url);
}
public static void goBackInTime(int n) {
   for(int in=0;in<n;in++){
         browserhistory.removeLast();
      }
                    
}
public static void printBrowsingHistory() {
    System.out.println("browserhistory : "+browserhistory);
}    
    
    
    
public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      //System.out.println("Welcome To Supriya Raj Broswer\n\n");
      
      //System.out.println("We have Following Functions for you");
      System.out.print("1.isBrowsingHistoryEmpty\n2.mostRecentlyVisitedSite"+
      "\n3.addSiteToHistory\n4.goBackInTime\n5.printBrowsingHistory");
      
      
    int i = 1;
    while(i>0){
            System.out.print("\n\nEnter Your Choice : ");
      int ch = scan.nextInt();
         switch(ch){
         case 1: System.out.println(isBrowsingHistoryEmpty());
                 break;
         case 2:try{ 
             System.out.println("You most recent visit link is  = "+mostRecentlyVisitedSite());
         }
           catch(Exception e){
       System.out.println("Empty Browser History");
   }
                 break;
         case 3: System.out.print("Enter Url = ");
                 String url = scan.next();
                 addSiteToHistory(url);
                 break;
         case 4: try{System.out.print("Enter N = ");
                 int j = scan.nextInt();
                 goBackInTime(j);
         }
         catch(Exception es){
             System.out.println("Sorry Unexpected Error Occure");
         }
                 break;
         case 5: printBrowsingHistory();
                 break;
        default : System.out.println("You enter wrong Choice");
    
     }
     
    }
      
      
     }
}