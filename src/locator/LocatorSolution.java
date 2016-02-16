package locator;

public class LocatorSolution implements Locator {
	public static final int NOT_FOUND = -1;

	/**
	 * @param itemSought
	 *            the item for which the index is sought
	 * @param candidates
	 *            a sorted array of items, from within which the itemSought must
	 *            be found
	 * @return calling the binarySearch method in order to find the sought index
	 */
	@Override
	public int getIndex(String itemSought, String[] candidates) {
		int left = 0;
		int right = candidates.length - 1;
		return binarySearch(candidates, itemSought, left, right);
	}

	/**
	 * @param itemSought
	 *            name of the candidate that the index is sought
	 * @param index
	 *            the found index of the sought item
	 */
	public void printIndex(String itemSought, int index) {
		System.out.println("ItemSought: " + itemSought + ", index: " + index);
	}

	/**
	 * @param arr
	 *            a sorted array of items, from within which the itemSought must
	 *            be found
	 * @param searchValue
	 *            the item for which the index is sought
	 * @param left
	 *            left end of the range where the sought index must be found
	 * @param right
	 *            right end of the range where the sought index must be found
	 * @return calling the method itself in order to set a narrower range and
	 *         return the middle index of the range when it is equal to the sought index 
	 */
	private static int binarySearch(String[] arr, String searchValue, int left, int right) {
		if (right < left) {
			return NOT_FOUND;
		}

		int mid = (left + right) >>> 1;

		if (searchValue.compareToIgnoreCase(arr[mid]) > 0) {
			return binarySearch(arr, searchValue, mid + 1, right);

		} else if (searchValue.compareToIgnoreCase(arr[mid]) < 0) {
			return binarySearch(arr, searchValue, left, mid - 1);

		} else {
			return mid;
		}
	}

}
