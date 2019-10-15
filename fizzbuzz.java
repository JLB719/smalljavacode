public class fizzbuzz {
    private static final int numberOfTimes = 100;
    private static final int start = 1;
    private static final int keyDivisor1 = 3;
    private static final int keyDivisor2 = 5;
    public static void main(String[] args) {
        String startString = "";
        char charac = 'A';
        System.out.println(charac);
        int charactint = (int)(charac);
        System.out.println(charactint);
        /*
        for (int i = start; i <=numberOfTimes; i++) {
            if (i % keyDivisor1 == 0 && i % keyDivisor2 == 0) {
                startString+="FizzBuzz ";
            } else if (i % keyDivisor1 == 0) {
                startString+="Fizz ";
            } else if (i % keyDivisor2 == 0) {
                startString += "Buzz ";
            } else {
                startString += i + " ";
            }
        }
        System.out.println(startString);
        */
    }
}
