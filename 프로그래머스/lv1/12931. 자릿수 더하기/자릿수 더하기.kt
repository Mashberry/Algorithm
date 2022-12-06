class Solution {
    fun solution(n: Int): Int {
        var result = 0
        for(c in "$n") {
            result += c.digitToInt()
        }
        return result
    }
}