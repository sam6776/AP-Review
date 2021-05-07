public class MergeSort
{
/** mergeSortString
    * Initiates the merge sort on the Strings
    * @param words
    */
    public static void mergeSortString(String[] words)
    {
    	doMergeSort(words, 0, words.length - 1);
    }
   /** doMergeSort
    * Creates the sub arrays and calls the method to sort them, 
    * recursively builds to the entire array
    * 
    * @param words 
    * @param start
    * @param end
    */
    private static void doMergeSort (String[] words, int start, int end)
    {
       if (start < end)
       {
          int middle = (start + end) / 2;
          doMergeSort (words, start, middle);
          doMergeSort (words, middle + 1, end);
          merge(words, start, middle, end);
       }
    }
    /** merge
     * compares the strings in the two sub arrays lexicographically
     * @param words
     * @param start
     * @param middle
     * @param end
     */
    private static void merge (String[] words, int start, int middle,
            int end)
    {
    	// temporary array for the two subarray's sorted values
    	String[] tmp = new String[end - start + 1];

    	int index1 = start;
    	int index2 = middle + 1;
    	int indexTmp = 0;

    	// compare and loop until one sub array is maxed out
    	while (index1 <= middle && index2 <= end)
    	{
    		if (words[index1].length() < words[index2].length())
    		{
    			tmp[indexTmp] = words[index1];
    			index1++;
    		}
    		else if(words[index1].length() > words[index2].length())
    		{
    			tmp[indexTmp] = words[index2];
    			index2++;
    		}
    		else if(words[index1].compareTo(words[index2]) < 0)
    		{
    			tmp[indexTmp] = words[index1];
    			index1++;
    		}
    		else
    		{
    			tmp[indexTmp] = words[index2];
    			index2++;
    		}
    		indexTmp++;
    	}
    	
    	// fill in the rest of the temp array with the non-exhausted sub array
    	while (index1 <= middle)
    	{
    		tmp[indexTmp] = words[index1];
    		index1++;
    		indexTmp++;
    	}
    	while (index2 <= end)
    	{
    		tmp[indexTmp] = words[index2];
    		index2++;
    		indexTmp++;
    	}

    	// substitute the values from the temp array into the main array
    	for (indexTmp = 0; indexTmp < tmp.length; indexTmp++)
    	{
    		words[start + indexTmp] = tmp[indexTmp];
    	}
    }
}
