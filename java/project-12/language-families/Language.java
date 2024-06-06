public class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
    this.name = name;
    this.numSpeakers = numSpeakers;
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
  }

  public void getInfo() {
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". The language follows the word order: " + wordOrder);
  }

  public static void main(String[] args) {

    Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
    spanish.getInfo();
    
    Mayan mayan = new Mayan("Ki\'che\'", 2330000);
    mayan.getInfo();

    SinoTibetan chinese = new SinoTibetan("Chinese", 1110000000);
    chinese.getInfo();
    SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
    burmese.getInfo();
  }


}
