package recruitment_puzzle;

import java.util.ArrayList;

public class PLC {

      int state = 0;

    public  int getState() {
        return state;
    }




    public void displayState(){
        System.out.println(state);
    }


    public void changeState(){
        if (state == 0) state = 1;


    }

    public static void main(String[] args) {
//
//        for (int i = 1; i < 101; i++) { create 101 myPLCs maybe?
//
//        }
    PLC myPLC = new PLC();

    ArrayList<PLC> listOfPLCs = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            listOfPLCs.add(i,myPLC);
        }

        System.out.print("index 0 = ");
        listOfPLCs.get(0).displayState();
        System.out.print("index 1 = ");
        listOfPLCs.get(1).displayState();
        System.out.print("index 2 = ");
        listOfPLCs.get(2).displayState();
        System.out.print("index 3 = ");
        listOfPLCs.get(3).displayState();
        System.out.print("index 100 = ");
        listOfPLCs.get(100).displayState();

        for (int i = 2; i < 100; i++) { // i = employee no. 1, 2, etc
            for (int j = 0; j < 100; j+=i-1) {
                listOfPLCs.get(j).changeState();
            }
        }

        for (int i = 0; i < 101; i++) {
            listOfPLCs.get(i).displayState();
        }
        }
    }

