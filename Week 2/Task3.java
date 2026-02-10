public static void Task3(List<Integer> arr) {

    long min = arr.get(0);

    long max = arr.get(0);
    long totalSum = 0;

    for (int i = 0; i < arr.size(); i++) {

        long current = arr.get(i);

        totalSum += current;

        if (current < min) {

            min = current;

        }

        if (current > max) {

            max = current;

        }

    }

    long minSum = totalSum - max;

    long maxSum = totalSum - min;

    System.out.println(minSum + ""+ maxSum);

}    