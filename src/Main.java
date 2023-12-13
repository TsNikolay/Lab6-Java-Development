import java.util.Scanner;

/**
 * The Main class represents the entry point of the program. It demonstrates the usage of the Disk
 * class to manage a collection of songs and perform various operations on them.
 */
public class Main {
    /**
     * The main method is the starting point of the program. It initializes a Scanner for user input,
     * creates instances of different song genres, adds them to a Disk, and performs operations like
     * sorting and searching based on user input.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args)  {
        try (Scanner scanner = new Scanner(System.in)) {
            int studentBookNumber = 1122;
            System.out.println("Номер заліковки: " + studentBookNumber);
            System.out.println("С13 = " + studentBookNumber % 13 + " => Пісні та альбоми");
            Disk disk = new Disk();

            Rap rapSong1 = new Rap("Search", "Lyrics", 240, "NF", 2020, 120);
            Rap rapSong2 = new Rap("Hope", "Dramatic", 220, "NF", 2022, 140);
            Rap rapSong3 = new Rap("Therapy Session", "Storytelling", 250, "NF", 2019, 100);
            Rock rockSong1 = new Rock("Believer", "Energetic", 190, "Imagine Dragons", 2016, 50);
            Jazz jazzSong1 = new Jazz("What a wonderful world", "Blues", 195, "Lui Armstrong", 1990, true);

            disk.addSong(rapSong1);
            disk.addSong(rockSong1);
            disk.addSong(rapSong2);
            disk.addSong(jazzSong1);
            disk.addSong(rapSong3);

            System.out.println("Тривалість альбому: " + disk.countAlbumDuration() + "\n");

            System.out.println("Альбом:");
            disk.printList();

            disk.sortSongBySubGenre();
            System.out.println("\nАльбом відсортований по суб-жанрам:");
            disk.printList();

            System.out.println("Введіть мінімальну довжину пісні, щоб знайти потрібну:");
            int min = scanner.nextInt();
            System.out.println("Введіть максимальну довжину пісні, щоб знайти потрібну:");
            int max = scanner.nextInt();
            disk.findSongsByDurationRange(min, max);

        } catch (Exception  e) {
        System.out.println("Помилка введення. Введіть число.");
    }
    }
}
