public class Droid {

    String name;
    int batteryLevel;

    public Droid(String droidName) {

        this.name = droidName;
        batteryLevel = 100;

    }

    public String toString() {
        return "Hello, I'm the Droid: " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public void energyReport() {
        System.out.println("Battery level is: " + batteryLevel);
    }

    public void energyTransfer(Droid droid, int transfer) {
        droid.batteryLevel += transfer;
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.performTask("cooking");
        codey.performTask("coding");
        codey.performTask("swimming");
        codey.energyReport();
        codey.energyTransfer(codey, 40);
        codey.energyReport();
    }
}