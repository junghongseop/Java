package Class03;

import java.util.Scanner;

public class space {
    public static void main(String[] args) {
        String[] planetNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        int[] planetSizes = {2440, 6052, 6378, 3390, 69911, 58232, 25362, 24622};
        double[] planetMasses = {3.3011E23, 4.8675E24, 5.97237E24, 6.4171E23,
                1.8982E27, 5.6834E26, 8.6810E25 ,1.02413E26};

        // Print all planet names
        System.out.println("Planet Names:");
        for (String name : planetNames) {
            System.out.println(name);
        }

        // Get user input for a planet name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a planet name: ");
        String inputName = scanner.nextLine();

        // Find the index of the entered planet name (case-insensitive)
        int index = -1;
        for (int i = 0; i < planetNames.length; i++) {
            if (planetNames[i].equalsIgnoreCase(inputName)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // Print the information of the entered planet
            System.out.println("Planet Information:");
            System.out.println("Name: " + planetNames[index]);
            System.out.println("Size: " + planetSizes[index] + " km");
            System.out.println("Mass: " + planetMasses[index] + " kg");
        } else {
            // If the entered name is not found in the array
            System.out.println("Invalid input or unknown planet.");
        }
    }
}
