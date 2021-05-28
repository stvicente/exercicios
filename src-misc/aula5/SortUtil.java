package aula5;

public class SortUtil {
    public static <T> Precedente<T>[] sort(Precedente<T>[]arr) {
        Precedente<T> temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if ((arr[j - 1].precedeA((T) arr[j])) < 0) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }
}
