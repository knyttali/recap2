package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        /* footballCalculator go = new footballCalculator();
        go.run(); 
        orienteringstavling or = new orienteringstavling();
        or.run();*/
        StringFilter go = new StringFilter();
        go.run();
    }
}
