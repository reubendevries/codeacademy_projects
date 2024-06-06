public class SinoTibetan extends Language {

  public SinoTibetan(String name, int numSpeakers) {
    super(name, numSpeakers, "Asia", "subject-object-verb");
    if (name == "Chinese") {
      this.wordOrder = "subject-verb-object";
    }
  }
}
