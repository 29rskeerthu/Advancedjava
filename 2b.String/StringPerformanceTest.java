package ArrayList;

public class StringPerformanceTest {
	
	    public static void main(String[] args) {
	        final int ITERATIONS = 10000;
	        final String text = "AIET";

	        // Measure time for StringBuffer
	        StringBuffer stringBuffer = new StringBuffer();
	        long startTimeBuffer = System.nanoTime();

	        for (int i = 0; i < ITERATIONS; i++) {
	            stringBuffer.append(text);
	        }

	        long endTimeBuffer = System.nanoTime();
	        long durationBuffer = endTimeBuffer - startTimeBuffer;
	        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

	        // Measure time for StringBuilder
	        StringBuilder stringBuilder = new StringBuilder();
	        long startTimeBuilder = System.nanoTime();

	        for (int i = 0; i < ITERATIONS; i++) {
	            stringBuilder.append(text);
	        }

	        long endTimeBuilder = System.nanoTime();
	        long durationBuilder = endTimeBuilder - startTimeBuilder;
	        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

	        // Justification
	        if (durationBuffer > durationBuilder) {
	            System.out.println("StringBuilder is faster than StringBuffer.");
	        } else if (durationBuffer < durationBuilder) {
	            System.out.println("StringBuffer is faster than StringBuilder.");
	        } else {
	            System.out.println("Both have similar performance.");
	        }
	    }
	}


