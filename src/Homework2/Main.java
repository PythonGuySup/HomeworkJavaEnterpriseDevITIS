package Homework2;

import Homework2.utils.IntsFrequency;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
	public static void main(String[] args){
		int randomAge;
		String name;
		Human[] arrayOfHumans = new Human[100];

		for (int i=0; i<100; i++) {
			randomAge =  ThreadLocalRandom.current().nextInt(1, 120 + 1);
			name = "user" + (i + 1);
			arrayOfHumans[i] = new Human(randomAge, name);
		}

		int[] age_sequence = Arrays.stream(arrayOfHumans).mapToInt(Human::getAge).toArray();
		int result = IntsFrequency.maxFrequency(1, 120, age_sequence);

		System.out.println(Arrays.toString(arrayOfHumans));
		System.out.println(result);
	}
}
		
		
			
		
		
			
			