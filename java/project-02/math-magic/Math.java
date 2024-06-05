public class Math {
    public static void main(String[] args) {
        
        // should be known as original number or myNumber from now on.
        int myNumber = 65;

        int stepOne = (myNumber * myNumber);

        int stepTwo = (stepOne + myNumber);

        int stepThree = (stepTwo / myNumber);

        int stepFour = (stepThree + 17);

        int stepFive = (stepFour - myNumber);

        int stepSix = (stepFive / 6);

        System.out.println("The final result is " + stepSix + "!");

    }
}
