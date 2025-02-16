import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PasswordManager {

    private Map<String, String> passwordMap;
    private MessageDigest messageDigest;

    public PasswordManager() {
        passwordMap = new HashMap<>();

        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public String hashPassword(String password) {
        messageDigest.update(password.getBytes());
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();

        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }

    public void addPassword(String website, String password) {
        String hashedPassword = hashPassword(password);
        passwordMap.put(website, hashedPassword);
    }

    public String getPassword(String website) {
        return passwordMap.get(website);
    }

    public static void main(String[] args) {
        PasswordManager passwordManager = new PasswordManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Password");
            System.out.println("2. Get Password");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter website: ");
                    String website = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    passwordManager.addPassword(website, password);
                    System.out.println("Password added successfully!");
                    break;
                case 2:
                    System.out.print("Enter website: ");
                    String websiteToRetrieve = scanner.nextLine();
                    String retrievedPassword = passwordManager.getPassword(websiteToRetrieve);
                    if (retrievedPassword != null) {
                        System.out.println("Password: " + retrievedPassword);
                    } else {
                        System.out.println("No password found for the website!");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println();
        }
    }
}
