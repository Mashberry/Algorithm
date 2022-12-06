class Solution {
    fun solution(x: Int): Boolean {
        var sum = 0
        for(c in "$x") {
            sum += c.digitToInt()
        }
        return x % sum == 0
    }
}