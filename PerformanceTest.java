package java;

public class PerformanceTest {



    public static void main(String[] args) {
        int iterations = 10000;
        String textToAppend = "AIET";

        // Performance Test for StringBuffer
        long startTime = System.currentTimeMillis();
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sBuffer.append(textToAppend);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + "ms");

        // Performance Test for StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sBuilder.append(textToAppend);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + "ms");
    }
}
