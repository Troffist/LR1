package lr6.ex3;

import java.util.Arrays;

 public class My3 {

        private static int min;
        private static int max;
        private static int mid;

        public My3 () {
            min = 0;
            max = 0;
            mid = 0;
        }

        public static void GetVal(int[] arr) {
            if (arr.length > 0) {
                Arrays.sort(arr);
                min = arr[0];
                max = arr[arr.length - 1];
                mid = GetMiddle(arr);

            }
        }

        private static int GetMiddle(int[] arr) {
            int ret = 0;
            int sum = 0;
            if (arr.length > 0) {
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }
                ret = sum/arr.length;
            }
            return ret;
        }

        public String toString() {
            return "min = " + min + ", max = " + max + ", mid = " + mid;
        }

    }


