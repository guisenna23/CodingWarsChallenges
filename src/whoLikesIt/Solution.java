package whoLikesIt;

import java.text.MessageFormat;

public class Solution {
    public static String whoLikesIt(String... names) {

        StringBuilder builder = new StringBuilder();
        int qtyLikes = names.length;

        if(qtyLikes == 0)
            return "no one likes this";
        else if (qtyLikes == 1)
            return builder.append(names[0]).append(" likes this").toString();
        else if (qtyLikes == 2)
            return builder.append(names[0]).append(" and ").append(names[1]).append(" like this").toString();
        else if (qtyLikes == 3)
            return builder.append(names[0]).append(", ").append(names[1]).append(" and ").append(names[2]).append(" like this").toString();
        else
            return builder.append(names[0]).append(", ").append(names[1]).append(" and ").append(qtyLikes-2).append(" others").append(" like this").toString();
    }

    public static void main(String[] args) {
        System.out.println(Solution.whoLikesIt("Pedro","Maria","Joao","Carlos"));
    }
}
