package us.deloitteinnovation.tieout.user.service.tableDataIdentifier.utils;

import java.util.*;

/**
 * This is equivalent to Numpy in python
 * <p>
 * Created by marram on 12-01-2016.
 */

public class NumPyUtils {
    /**
     * It is equivalent to numpy.bincount method
     *
     * @param array
     * @return
     */
    public static int[] bincount(ArrayList<Integer> array) {
        try {
            if (array != null) {
                int[] binArray = new int[Collections.max(array) + 1];

                for (int element : array) {
                    binArray[element] = Collections.frequency(array, element);
                }
                return binArray;
            }
        } catch (Exception e) {}
        return null;
    }

    public static ArrayList<Integer> intToList(int[] source) {
        try {
            ArrayList<Integer> destination = new ArrayList<>();
            for (int element : source) destination.add(element);
            return destination;
        } catch (Exception e) {

        }
        return null;
    }

    /**
     * It is equivalent to the method in numpy.argmax method
     *
     * @param array
     * @return
     */
    public static int argmax(ArrayList<Integer> array) {
        try {
            return array.indexOf(Collections.max(array));
        } catch (Exception e) {

        }
        return -1;
    }

    /**
     * It is equivalent to the method in numpy.argsort method
     *
     * @param list      is an ArrayList of Integers
     * @param ascending true for ascending
     * @return
     */
    public static int[] argsort(List<Integer> list, final boolean ascending) {
        final int[] array = TableDataIdentifierUtils.getIntegerArray(list);
        Integer[] indexes = new Integer[array.length];
        for (int i = 0; i < indexes.length; i++) {
            indexes[i] = i;
        }
        Arrays.sort(indexes, new Comparator<Integer>() {
            @Override
            public int compare(final Integer i1, final Integer i2) {
                return (ascending ? 1 : -1) * Float.compare(array[i1], array[i2]);
            }
        });
        return asArray(indexes);
    }

    /**
     * It is equivalent to the method in numpy.argsort method
     *
     * @param array     is array of integers
     * @param ascending true for ascending
     * @return
     */

    public static int[] argsort(final int[] array, final boolean ascending) {

        Integer[] indexes = new Integer[array.length];
        for (int i = 0; i < indexes.length; i++) {
            indexes[i] = i;
        }
        Arrays.sort(indexes, new Comparator<Integer>() {
            @Override
            public int compare(final Integer i1, final Integer i2) {
                return (ascending ? 1 : -1) * Float.compare(array[i1], array[i2]);
            }
        });
        return asArray(indexes);
    }

    public static <T extends Number> int[] asArray(final T... a) {
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i].intValue();
        }
        return b;
    }
	
	    /**
     * It is equivalent to numpy.bincount method
     *
     * @param array
     * @return
     */
    public static int[] bincount(ArrayList<Integer> array) {
        try {
            if (array != null) {
                int[] binArray = new int[Collections.max(array) + 1];

                for (int element : array) {
                    binArray[element] = Collections.frequency(array, element);
                }
                return binArray;
            }
        } catch (Exception e) {
            LOGGER.info("bin count Exception came and here is the array : " + array);
        }
        return null;
    }

    public static ArrayList<Integer> intToList(int[] source) {
        try {
            ArrayList<Integer> destination = new ArrayList<>();
            for (int element : source) destination.add(element);
            return destination;
        } catch (Exception e) {
            LOGGER.info("int to List Exception came and here is the array : " + source);
        }
        return null;
    }

    /**
     * It is equivalent to the method in numpy.argmax method
     *
     * @param array
     * @return
     */
    public static int argmax(ArrayList<Integer> array) {
        try {
            return array.indexOf(Collections.max(array));
        } catch (Exception e) {
            LOGGER.info("argmax Exception came and here is the array : " + array);
        }
        return -1;
    }
}