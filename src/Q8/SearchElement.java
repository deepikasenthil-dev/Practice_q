package Q8;

public class SearchElement {

        public static void main(String[] args) {

            int[] arr = {12, 45, 7, 89, 23};

            int search = 89;
            boolean found = false;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == search) {
                    System.out.println("Element Found at Index " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Element Not Found");
            }

    }
}
