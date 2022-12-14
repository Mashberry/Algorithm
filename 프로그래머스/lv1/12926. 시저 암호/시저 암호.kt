class Solution {
    fun solution(s: String, n: Int): String {
        var result = ""
        val range = 'z' - 'a' + 1

        for (c in s) {
            result +=
                if (c == ' ') c
                else if (c.isUpperCase()) 'A' + (c + n - 'A') % range
                else 'a' + (c + n - 'a') % range
        }
        return result
    }
}