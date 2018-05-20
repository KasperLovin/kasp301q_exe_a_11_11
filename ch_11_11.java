import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ch_11_11
{
    /*
    Write a method called symmetricSetDifference that accepts two Sets as parameters and returns a new Set containing
their symmetric set difference (that is, the set of elements contained in either of the two sets but not in both). For
example, the symmetric difference between the sets [1, 4, 7, 9] and [2, 4, 5, 6, 7] is [1, 2, 5, 6, 9].
    */
    public static void main(String[] args)
    {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2,3,4,5));
        System.out.println("-- Original sets:\n" + set1 + "\n" + set2);
        System.out.println("Symmetric set Difference");
        System.out.println(symmetricSetDifference(set1, set2));
    }

    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> setIntersect = new HashSet<>(set1);
        setIntersect.removeAll(set2);

        set2.removeAll(set1);
        setIntersect.addAll(set2);

       return setIntersect;
    }
}

