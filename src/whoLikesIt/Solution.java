package whoLikesIt;

public class Solution {
    public static String whoLikesIt(String... names) {
        int qtyLikes = names.length;
        final String Template1 = "%s likes this";
        final String Template2 = "%s and %s like this";
        final String Template3 = "%s, %s and %s like this";
        final String TemplateN = "%s, %s and %d others like this";
        return
                qtyLikes == 0 ? "no one likes this" :
                qtyLikes == 1 ? String.format(Template1, names[0]) :
                qtyLikes == 2 ? String.format(Template2, names[0], names[1]) :
                qtyLikes == 3 ? String.format(Template3, names[0], names[1], names[2]) :
                String.format(TemplateN, names[0], names[1], qtyLikes-2);
    }

    public static void main(String[] args) {
        System.out.println(Solution.whoLikesIt("Pedro","Maria"));
    }
}
