public class Main {
    public static void main(String[] args) {
        // Doesn't insert a new line
        System.out.print("Java is awesome!");
        // I add an extra space in front of the sentence for better readability
        System.out.print(" That's why I like Java!");

        // Insert a new line
        System.out.println("Hello World!");
        System.out.println(100);
        System.out.println(5+5);

        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        // It's declare the variable as "final" or "constant" such as final int = 5, which means unchangeable and read-only

        int time = 22;
        if (time < 10) {
            System.out.println("Good Morning!");
        } else if (time < 18) {
            System.out.println("Good Afternoon!");
        } else {
            System.out.println("Good Evening!");
        }

        // Simple Write
        int times = 20;
        String result = (times < 18) ? "Good Afternoon!" : "Good Evening!";
        System.out.println(result);

        // Use switch case
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking for what day?");
        }

        // Print even multiple number of 2
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        // Print even multiple number of 2 under 10
        for (int j = 0; j < 10; j = j + 2) {
            System.out.println(j);
        }

        // Outer loop
        for (int k = 1; k <= 2; k++) {
            System.out.println("Outer: " + k); // Executes 2 times

            // Inner loop
            for (int m = 1; m <= 3; m++) {
                System.out.println(" Inner: " + m); // Executes 6 times (2 * 3)
            }
        }
    }
}