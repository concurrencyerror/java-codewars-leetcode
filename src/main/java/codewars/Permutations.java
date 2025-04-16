package codewars;

import org.w3c.dom.css.Counter;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.*;

/**
 * 回溯算法遍历组合
 */
public class Permutations {
    public static List<String> singlePermutations(String s) {
        HashSet<String> set = new HashSet<>();
        backTrace(new StringBuilder(), s, set, 0);
        return new ArrayList<>(set);
    }

    private static void backTrace(StringBuilder builder, String s, Set<String> set, int index) {
        if (builder.length() == s.length()) {
            set.add(builder.toString());
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i == index) {
                continue;
            }
            char c = s.charAt(i);
            builder.append(c);
            backTrace(builder, s, set, i);
            builder.deleteCharAt(builder.length() - 1);
        }
    }


    static <T> Gatherer<T, ?, T> limit(long limit) {
        class Count {
            int count;
        }
        return Gatherer.ofSequential(Count::new,
                ((state, element, downstream) -> {
                    if (downstream.isRejecting()) {
                        return false;
                    }
                    if (state.count++ < limit) {
                        downstream.push(element);
                    }
                    return state.count < limit;
                })
        );
    }


    static <T> Gatherer<T, ?, List<T>> slidingWindow(int limit) {
        class SlidingWindow {
            List<T> list = new ArrayList<>(limit);
        }
        return Gatherer.ofSequential(SlidingWindow::new,
                Gatherer.Integrator.ofGreedy((state, element, downstream) -> {
                    state.list.add(element);
                    if (state.list.size() == limit) {
                        downstream.push(List.copyOf(state.list));
                        state.list.clear();
                    }
                    return true;
                }), (state, downstream) -> {
                    if (!downstream.isRejecting() && !state.list.isEmpty()) {
                        downstream.push(List.copyOf(state.list));
                    }
                }
        );
    }

//    static <T> Gatherer<Map<T, Count>, T, Map.Entry<T, Long>> count() {
//        class Count {
//            int count;
//        }
//        Supplier<Map<T, Count>> supplier = HashMap::new;
//        return Gatherer.ofSequential(supplier, (state, element, downstream) -> {
//            if (downstream.isRejecting()) {
//                return false;
//            } else {
//            }
//        });
//    }

    public static void main(String[] args) {
//        List<Integer> list = Stream.of("123", "456", "point", "432")
//                .mapMultiToInt((s, downstream) -> {
//                    try {
//                        downstream.accept(Integer.parseInt(s));
//                    } catch (NumberFormatException e) {
//                        System.out.println("wrong number");
//                    }
//                }).boxed().toList();
        Map<Integer, List<String>> collect = Stream.of("test", "the", "stream", "of", "string")
                .collect(Collectors.groupingBy(String::length, Collector.<String, List<String>, List<String>>of(
                        ArrayList::new,
                        List::add,
                        (l1, l2) -> {
                            l1.addAll(l2);
                            return l1;
                        }, Collections::unmodifiableList
                )));
//        List<String> stringList = Stream.of("test", "the", "stream", "of", "string")
//                .gather(Gatherer.<String, String>of(
//                        (_, item, downstream) ->
//                                downstream.push(item.toUpperCase()))).toList();

        List<List<String>> list1 = Stream.of("test", "the", "stream", "of", "string")
                .map(s -> {
                    System.out.println(s);
                    return s.toUpperCase();
                })
                .gather(slidingWindow(2))
//                .limit(3L)
                .toList();
        System.out.println(list1);
//        System.out.println(stringList);
//                .collect(Collectors.joining(",", "-", "*"));
//        System.out.println(collect);
//        System.out.println(list);
    }

}
