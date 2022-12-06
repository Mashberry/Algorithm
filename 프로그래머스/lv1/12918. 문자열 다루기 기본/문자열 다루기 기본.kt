class Solution {
    fun solution(s: String): Boolean {
        val length = s.length
        return (length == 4 || length == 6) && s.matches("^[0-9]+$".toRegex())
    }
}