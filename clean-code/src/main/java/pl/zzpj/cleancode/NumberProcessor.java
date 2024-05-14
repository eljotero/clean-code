package pl.zzpj.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberProcessor {

	private Map<Integer, Integer> numberOccurrences = new HashMap<>();
	private int maxNumber = Integer.MIN_VALUE;
	private int minNumber = Integer.MAX_VALUE;

	public NumberProcessor(List<Integer> numbers) {
		processNumbers(numbers);
	}

	public void processNumbers(List<Integer> numbers) {
		for (Integer number : numbers) {
			processNumber(number);
		}
	}

	public void processNumber(Integer number) {
		numberOccurrences.put(number, numberOccurrences.getOrDefault(number, 0) + 1);

		if (number > maxNumber) {
			maxNumber = number;
		}

		if (number < minNumber) {
			minNumber = number;
		}
	}

	public int getOccurrences(int number) {
		return numberOccurrences.getOrDefault(number, 0);
	}

	public double calculateWeightedAverage() {
		double total = 0;
		double sum = 0;
		for (Map.Entry<Integer, Integer> entry : numberOccurrences.entrySet()) {
			total += entry.getValue();
			sum += entry.getKey() * entry.getValue();
		}
		return sum / total;
	}

	public int getMaxNumber() {
		return maxNumber;
	}

	public int getMinNumber() {
		return minNumber;
	}

	public String getFizzBuzzNumber(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else {
			return Integer.toString(number);
		}
	}
}