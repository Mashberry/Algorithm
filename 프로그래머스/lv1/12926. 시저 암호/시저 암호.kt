class Solution {
    fun solution(s: String, n: Int): String {
        val range = 'z' - 'a' + 1
        return s.fold("") { acc, c ->
            acc + if (c == ' ') c
            else if (c.isUpperCase()) 'A' + (c + n - 'A') % range
            else 'a' + (c + n - 'a') % range
        }
    }
}