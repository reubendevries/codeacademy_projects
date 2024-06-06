import java.util.ArrayList;
import java.util.Arrays;

public class Playlist {
  

  public static void main(String[] args) {
    String[] favoriteSongs = {"Japandroids - Younger Us","Chance the Rapper - Same Drugs","Chris Stapelton - Tennesse Whiskey","Bon Iver - Holoscene","Michael Jackson - Thriller","Sinead O'Conner - Nothing Compares 2 U","Kendrick Lamar - Humble","Jimmy Eat World - 23","John Lennon - Imagine","Marvin Gaye - What's Going On"};
    System.out.println(favoriteSongs[0]);
    System.out.println(favoriteSongs[1]);
    System.out.println(favoriteSongs[2]);

    ArrayList<String> desertIslandPlaylist = new ArrayList<>();
    desertIslandPlaylist.add("The Beatles - Here comes the Sun");
    desertIslandPlaylist.add("Bill Withers - Lovely Day");
    desertIslandPlaylist.add("Katrina and the Waves - Walking on Sunshine");
    desertIslandPlaylist.add("Whitney Houston - I Wanna Dance with Somebody");
    desertIslandPlaylist.add("Cher - Believe");

    System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove("Chris Stapelton - Tennesse Whiskey");
    desertIslandPlaylist.remove("The Beatles - Here comes the Sun");
    desertIslandPlaylist.remove("Bill Withers - Lovely Day");
    desertIslandPlaylist.remove("Marvin Gaye - What's Going On");
    desertIslandPlaylist.remove("Katrina and the Waves - Walking on Sunshine");
    desertIslandPlaylist.remove("Michael Jackson - Thriller");
    desertIslandPlaylist.remove("Whitney Houston - I Wanna Dance with Somebody");
    desertIslandPlaylist.remove("Kendrick Lamar - Humble");
    desertIslandPlaylist.remove("John Lennon - Imagine");
    desertIslandPlaylist.remove("Cher - Believe");
    System.out.println(desertIslandPlaylist);
    int songA = desertIslandPlaylist.indexOf("Chance the Rapper - Same Drugs");
    int songB = desertIslandPlaylist.indexOf("Bon Iver - Holoscene");
    String tempA = "Chance the Rapper - Same Drugs";
    String tempB = "Bon Iver - Holoscene";
    desertIslandPlaylist.set(songA, tempB);
    System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(songB, tempA);
    System.out.println(desertIslandPlaylist);
  }
}
