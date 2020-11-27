public class StringUtils {

    public static boolean included(String word, String searched) {
        word = word.toUpperCase();
        searched = searched.toUpperCase();
        if (word.contains(searched.trim())) {
            return true;
        }
        return false;
    }
}
