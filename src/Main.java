public class Main {

    public static void main(String[] args) {

        // create simulation object
        Simulation simulation = new Simulation();

        // load items from phase1 & phase2
        simulation.loadItems("phase-1.txt");
        simulation.loadItems("phase-2.txt");

        System.out.println("Simulation for U1 rocket has been started");
        // load items rocket U1
        int budgetU1 = simulation.runSimulation(simulation.loadU1());

        System.out.println("Budget for U1 rocket:" +
                "\n" + budgetU1 + " millions $");

        System.out.println("Simulation for U2 rocket has been started");
        // load items rocket U2
        int budgetU2 = simulation.runSimulation(simulation.loadU2());

        System.out.println("Budget for U2 rocket:" +
                "\n" + budgetU2 + " millions $");
    }
}

