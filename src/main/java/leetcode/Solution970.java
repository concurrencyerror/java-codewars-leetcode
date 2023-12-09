package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Solution970 {
    public static List<Integer> powerfulIntegers(int x, int y, int bound) {
        if (bound == 0) {
            return new ArrayList<>();
        }
        List<Integer> list1;
        List<Integer> list2;
        if (x == 1) {
            list1 = new ArrayList<>();
            list1.add(1);
        } else {
            list1 = IntStream.generate(new SolutionSupplier(x, 0))
                    .takeWhile(i -> i <= bound).boxed().toList();
        }
        if (y == 1) {
            list2 = new ArrayList<>();
            list2.add(1);
        } else {
            list2 = IntStream.generate(new SolutionSupplier(y, 0))
                    .takeWhile(i -> i <= bound).boxed().toList();

        }
        return list1.stream().map(integer -> list2.stream().map(item -> integer + item).toList()).flatMap(Collection::stream)
                .filter(i -> i <= bound).distinct().toList();
    }

    static class SolutionSupplier implements IntSupplier {
        private final int num;

        private int pow;

        public SolutionSupplier(int num, int pow) {
            this.num = num;
            this.pow = pow;
        }

        @Override
        public int getAsInt() {
            double result = Math.pow(num, pow);
            pow++;
            return (int) result;
        }
    }

    public static void main(String[] args) {
        System.out.println(powerfulIntegers(2, 1, 10));
    }

}
