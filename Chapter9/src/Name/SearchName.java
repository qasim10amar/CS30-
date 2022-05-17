package Name;

public class SearchName {


	public static int linear(int[] array, int numToFind) {
		int index = 0;

		while ((array[index] != numToFind) && (index < array.length - 1)) {
		index += 1;
		}

		if (array[index] == numToFind) {
		return(index);
		} else {
		return(-1);
		}
		}



		public static int linear(String[] array, String Name) {
		int index = 0;

		while ((! array[index].equals(Name)) && (index < array.length - 1)) {
		index += 1;
		}

		if (array[index].equals(Name)) {
		return(index);
		} else {
		return(-1);
		}
		}
		
	}