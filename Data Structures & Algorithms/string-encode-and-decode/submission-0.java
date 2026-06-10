class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        
        List<String> list = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find #
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            // Length of word
            int len = Integer.parseInt(str.substring(i, j));

            // Actual string
            String word = str.substring(j + 1, j + 1 + len);

            list.add(word);

            // Move pointer
            i = j + 1 + len;
        }

        return list;
    }
}
