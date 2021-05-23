package stringToCamelCase;

public class Solution {
    static String toCamelCase(String s){
        StringBuilder builder = new StringBuilder(s);

        //Starts with 1 because I dont wanna convert the first letter to upperCase
        for(int i=1;i<builder.length();i++){
            if(builder.charAt(i)=='-' || builder.charAt(i)=='_'){
                //Remove dashes and underscores
                builder.deleteCharAt(i);

                builder.replace(i,i+1,String.valueOf(builder.charAt(i)).toUpperCase());
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String s = "the-stealth-warrior";
        System.out.println(toCamelCase(s));

    }
}
