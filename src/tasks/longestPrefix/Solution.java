package tasks.longestPrefix;

public class Solution {
    public static void main(String[] args) {
        String n1 = "privet";
        String n2 = "privet";
        String n3 = "nuche";

        Solution solution = new Solution();
        String [] arr = {"leeyo", "leet", "lee", "leeo", "leep"};
        System.out.println(solution.longestCommonPrefix(arr));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
