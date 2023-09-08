import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Album album1 = new Album();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter album1 title");
            album1.setTitle(scanner.next());

        System.out.println("Please enter album1 performer");
            album1.setPerformer(scanner.next());

        System.out.println("Please enter album1 genre");
        String genreInput = scanner.next();
            switch (genreInput) {
                case "hip-hop":
                case "easy_listening":
                case "orchestral":
                case  "your_parents":
                case "theatre":
                    album1.setGenre(genreInput);
                    break;
                default:
                    album1.setGenre("easy listening_default");
                    break;
            }


        System.out.println("please enter album1 Number of Songs");
            album1.setNumSongs(scanner.nextInt());
                album1.isLong();

        System.out.println(album1.toString());

        Album album2 = new Album();  // start of second album prompt

        System.out.println("Please enter album2 title");
            album2.setTitle(scanner.next());

        System.out.println("Please enter album2 performer");
            album2.setPerformer(scanner.next());

        System.out.println("Please enter album 2 genre");
        String genreInput2 = scanner.next();
        switch (genreInput2) {
            case "hip-hop":
            case "easy_listening":
            case "orchestral":
            case "your_parents":
            case "theatre":
                album2.setGenre(genreInput2);
                break;
            default:
                album2.setGenre("easy listening_default");
                break;
            }

            System.out.println("please enter album2 Number of Songs");
                album2.setNumSongs(scanner.nextInt());
                album2.isLong();

            System.out.println(album2.toString());

        Album album3 = new Album();  // start of third album prompt

        System.out.println("Please enter album3 title");
            album3.setTitle(scanner.next());

        System.out.println("Please enter album3 performer");
            album3.setPerformer(scanner.next());

        System.out.println("Please enter album3 genre");
        String genreInput3 = scanner.next();
        switch (genreInput3) {
            case "hip-hop":
            case "easy_listening":
            case "orchestral":
            case "your_parents":
            case "theatre":
                album3.setGenre(genreInput3);
                break;
            default:
                album3.setGenre("easy listening_default");
                break;
        }

        System.out.println("please enter album3 Number of Songs");
            album3.setNumSongs(scanner.nextInt());
            album3.isLong();

        System.out.println(album3.toString());

    }
}