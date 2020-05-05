import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class Simulation {

    private ArrayList<Item> items;

    // constructor for Simulation class
    public Simulation(){
        items = new ArrayList<>();
    }

    // method that read list of items from the text file, add items to the ArrayList and print out message if text file not found
    public void loadItems(String path) {
        File phase = new File(path);
        try {
            Scanner fileScanner = new Scanner(phase);
            while (fileScanner.hasNextLine()) {
                String nextThing = fileScanner.nextLine();
                int index = nextThing.indexOf("=");
                Item item = new Item(nextThing.substring(0, index), Integer.parseInt(nextThing.substring(index + 1)) / 1000);
                items.add(item);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }
    }

    // method that returns the number of U1 rockets to carry the listed items
    public ArrayList<Rocket> loadU1(){
        ArrayList<Rocket> u1rockets = new ArrayList<>();
        int i = 0;
        while(i<items.size()){
            Rocket u1 = new U1();
            while(i<items.size() && u1.canCarry(items.get(i))){
                u1.carry(items.get(i));
                i++;
            }
            u1rockets.add(u1);
        }
        return u1rockets;
     }

    // method that returns the number of U2 rockets to carry the listed items
    public ArrayList<Rocket> loadU2(){
        ArrayList<Rocket> u2rockets = new ArrayList<>();
        int i = 0;
        while(i<items.size()){
            Rocket u2 = new U2();
            while(i<items.size() && u2.canCarry(items.get(i))){
                u2.carry(items.get(i));
                i++;
            }
            u2rockets.add(u2);
        }
        return u2rockets;
    }

    // method that returns total budget needed to launch and land all U1 & U2 rockets and number of failed attempts
    public int runSimulation(ArrayList<Rocket> rockets){
        int totalBudget = 0;
        int failedAttempts = 0;
        for(Rocket r : rockets){
            totalBudget += r.getCost();
            while(!r.launch() || !r.land()){
                totalBudget += r.getCost();
                failedAttempts++;
            }
        }
        System.out.println("Failed attempts of rocket launching/landing: " + failedAttempts);
        return totalBudget;
    }
}







