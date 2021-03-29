/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaqueue;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Yamin
 */
public class JavaQueue {
    private static int[]queue=new int[10];
    private static int counters=0;
    
    private static boolean queueStorage(){
        if(counters<queue.length){
            return true;
        }
        else{
            return false;
        }
    }
    private static void createQueue(){
        int loopX =0;
        int alpha =0;
        while(loopX==0){
            System.out.print("Input Data (numbers only): ");
            Scanner alphaX= new Scanner(System.in);
            try{
                alpha= alphaX.nextInt();
                loopX= 1;
            }
            catch(InputMismatchException e){
                System.out.println("Alert, you must input number only !");
                loopX= 0;
            }
        }
        queue[counters]=alpha;
        counters++;
    }
    private static void removeQueue(){
        counters--;
        for(int i=0; i<counters; i++){
            queue[i]=queue[i+1];
        }
        System.out.println("First data was out");
    }
    private static void aListQueue(){
        String aList = null;
        
        System.out.println("One of the first data has been out\t:"+aList);
    }
    private static void displayDataQueue(){
        System.out.print("Data in Queue : ");
        for(int i=0; i<counters; i++){
            System.out.print("["+i+"=>"+queue[i]+"]");
        }
        System.out.println("");
    }
    private static void cleanQueue() {
    counters = 0;
}
    
    private static void quitApp(){
        String quitss ="Of Course";
        System.out.print("Exit from this program?(Of Course/maybe later)");
        quitss=new Scanner(System.in).nextLine();
        if(quitss.equalsIgnoreCase("Of Course")){
            System.exit(0);
        }
        else{
            menuProgram();
        }
    }
    private static void menuChooser(int choosenMenu){
        switch(choosenMenu){
            case 1:
                boolean insert = queueStorage();
                if(insert){
                    createQueue();
                }
                 insert = queueStorage();
                if(insert){
                    createQueue();
                }
                else{
                    System.out.println("The Queue is full! clear one of the data first, please");
                }
                break;
            case 2:
                removeQueue();
                break;
            case 3:
                aListQueue();
                break;
            case 4:
               cleanQueue () ;
                break;
            case 5:
                displayDataQueue();
                break;
            case 6:
                quitApp();
                break;
        }
        menuProgram();
    }
    private static void menuProgram(){
        int loopX = 0;
        int choosenMenu = 0;
        while(loopX==0){
            System.out.println("Program Queue Java: ");
            System.out.println("1. Add Queue Data");
            System.out.println("2. Delete 1 data from Queue");
            System.out.println("3. Deletes 1 of the data in the queue");
            System.out.println("4. Erase all data");
            System.out.println("5. Show all data queue");
            System.out.println("6. Exit from Queue program");
            System.out.println("Choose Menu(1-6)");
            Scanner menuOption = new Scanner(System.in);
            try{
                choosenMenu= menuOption.nextInt();
                loopX =1;
            }catch(InputMismatchException e){
                System.out.println("Input must be number!");
            }
        }
        System.out.println("");
        menuChooser(choosenMenu);
    }
    public static void main(String[]args){
        menuProgram();
    }

    private static void pollQueue() {
        throw new UnsupportedOperationException("Not supported yet."); 
  
}

    private static void alistQueue() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static void insertQueue() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
