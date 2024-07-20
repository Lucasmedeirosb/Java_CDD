package basico3;

public class ex05 {

    public static void main(String[] args) {
        String exemplo[] = {"a", "vida", "é", "bela"};
        
        // Print the elements in reverse order in uppercase
        for (int i = exemplo.length - 1; i >= 0; i--) {
            System.out.print(exemplo[i].toUpperCase() + " ");
        }
    }

}
