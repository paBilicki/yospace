package locator;

public class testLocator {

	public static void main(String[] args) {
		int foundIndex;
		LocatorSolution testSolution = new LocatorSolution();
		
		String candidate = "John";
		
		// normal case
		String[] candidatesTest1= { "Alice", "Bob", "Jack", "John" };
		foundIndex = testSolution.getIndex(candidate, candidatesTest1);
		testSolution.printIndex(candidate, foundIndex);
		
		// case with unsorted list
		String[] candidatesTest2 = { "Bob", "Alice", "Jack" };
		foundIndex = testSolution.getIndex(candidate, candidatesTest2);
		testSolution.printIndex(candidate, foundIndex);
		
		// case without the sought item
		String[] candidatesTest3 = { "Alice", "Bob", "Jack" };
		foundIndex = testSolution.getIndex(candidate, candidatesTest2);
		testSolution.printIndex(candidate, foundIndex);
		
		// case with an empty array
		String[] candidatesTest4 = {};
		foundIndex = testSolution.getIndex(candidate, candidatesTest3);
		testSolution.printIndex(candidate, foundIndex);
	}
}
