import java.util.ArrayList;
import java.util.List;


        public class Main {
            public static void main(String[] args) {

                List<Integer> sampleList = new ArrayList<>();
                sampleList.add(1);
                sampleList.add(2);
                sampleList.add(3);
                sampleList.add(4);
                sampleList.add(5);
                sampleList.add(6);

                List<Integer> emptyList = new ArrayList<>();
                List<Integer> oddOnlyList = new ArrayList<>();
                oddOnlyList.add(1);
                oddOnlyList.add(3);
                oddOnlyList.add(5);


                System.out.println("Original List: " + sampleList);
                System.out.println("Filtered Even Numbers: " + EvenNumberFilter.filterEvenNumbers(sampleList));


                System.out.println("\nOriginal Empty List: " + emptyList);
                System.out.println("Filtered Even Numbers: " + EvenNumberFilter.filterEvenNumbers(emptyList));


                System.out.println("\nOriginal Odd Numbers List: " + oddOnlyList);
                System.out.println("Filtered Even Numbers: " + EvenNumberFilter.filterEvenNumbers(oddOnlyList));
            }
        }

