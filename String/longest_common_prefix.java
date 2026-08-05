package  String;
public class longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {

            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i == strs[j].length() || strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
    public static void main(String[] args) {
        longest_common_prefix lcp = new longest_common_prefix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(lcp.longestCommonPrefix(strs)); // Output: "fl"
    }
}

