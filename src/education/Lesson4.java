package education;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.LongStream;

import static java.util.Arrays.*;

public class Lesson4 {
    public static void main(String[] args) throws Exception {
        t1();
        t2();
        t3();
        t4();
        t5();
        t6();
    }

    static void t1() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 1");
        AvgWorkArray arr = new AvgWorkArray(10000000);
        arr.avgClone();
        arr.avgCopyOf();
    }

    static void t2() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 5");
    }

    static void t3() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 3");
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5);
        System.out.println("Start array : " + arrayList.toString());
        System.out.println("Result of arrays equals : " + arrayList.equals(decompressArray(compressArray(arrayList))));
    }

    static void t4() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 4");
        long[] array1 = {0, 2, 5, 8, 9};
        long[] array2 = {1, 4, 3, 7, 6};
        unionAndSort(array1, array2);
    }

    static void t5() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 5");
        ArrayList<Long> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 85080473104L, 20470810710L, 67380581309L, 53001582606L, 48201702305L,
                21610343308L, 87310652801L, 97801961912L, 54171573511L, 39561410912L, 11941311809L, 44677392502L, 42528377612L,
                58879103612L, 55758121301L, 28197032810L, 99807815107L, 56538719602L, 89498500712L, 24868203501L, 71238933112L,
                61557888212L);
        billCount(arrayList);
    }

    static void t6() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 6");
        formArrayT6(10);
    }

    private static void formArrayT6(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                result.add(i);
                System.out.print(i + ", ");
            }
        }
    }

    private static void unionAndSort(long[] array1, long[] array2) {
        long[] result = LongStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
        for (long value : result) System.out.print(value + "  ");
    }

    private static ArrayList<Integer> compressArray(ArrayList<Integer> arrayList) {
        ArrayList<Integer> compressedArray = new ArrayList<>();
        if (!arrayList.isEmpty()) {
            int currentValue = arrayList.get(0);
            int currentCount = 1;
            for (int i = 1; i < arrayList.size(); i++) {
                if (arrayList.get(i) == currentValue) {
                    currentCount++;
                } else {
                    compressedArray.add(currentValue);
                    compressedArray.add(currentCount);
                    currentValue = arrayList.get(i);
                    currentCount = 1;
                }
            }
            compressedArray.add(currentValue);
            compressedArray.add(currentCount);
        } else {
            System.out.println("Array is empty...");
        }
        System.out.println("Compressed array: " + compressedArray.toString());
        return compressedArray;
    }

    private static ArrayList<Integer> decompressArray(ArrayList<Integer> arrayList) {
        ArrayList<Integer> decompressedArray = new ArrayList<>();
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i += 2) {
                for (int j = 0; j < arrayList.get(i + 1); j++) {
                    decompressedArray.add(arrayList.get(i));
                }
            }
        } else {
            System.out.println("Array is empty...");
        }
        System.out.println("Decompressed array: " + decompressedArray.toString());
        return decompressedArray;
    }


    private static void billCount(ArrayList<Long> arrayList) {
        Pattern patternChat = Pattern.compile("^\\d\\d\\d\\d(\\d\\d)(\\d\\d\\d)\\d\\d$");
        Map<Integer, Integer> map = new TreeMap<>();
        System.out.println("Start array : " + arrayList.toString());
        Matcher matcher;
        for (Long value : arrayList) {
            matcher = patternChat.matcher(value.toString());
            if (matcher.find()) {
                Integer region = Integer.parseInt(matcher.group(1));
                if (map.containsKey(region)) {
                    map.put(region, map.get(region) + Integer.parseInt(matcher.group(2)));
                } else {
                    map.put(region, Integer.parseInt(matcher.group(2)));
                }
            }
        }
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            System.out.println(it.getKey() + "  " + it.getValue());
        }
    }

    static class AvgWorkArray {
        int[] array;

        public AvgWorkArray(int i) {
            this.array = new int[i];
            for (int counter = 0; counter < i; counter++) {
                this.array[counter] = counter;
            }
        }

        public AvgWorkArray() {
            this.array = new int[0];
        }

        public int[] getArray() {
            return array;

        }

        void avgCopyOf() {
            long m = System.nanoTime();
            int[] res = copyOf(this.array, this.array.length);
            System.out.println("Copy of - time:");
            System.out.println(System.nanoTime() - m);
        }

        void avgClone() {
            long m = System.nanoTime();
            int[] res = this.array.clone();
            System.out.println("Copy Classic - time:");
            System.out.println(System.nanoTime() - m);
        }
    }
}

