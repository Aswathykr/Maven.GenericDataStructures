package MapFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T,R> List<R> map(ArrayList<T> input, Function<T, R> function){

        List<R> collector = input.stream()
                .map(function)
                .collect(Collectors.toList());
        return collector;
    }

}
