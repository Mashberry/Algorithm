class Solution {
    fun solution(dot: IntArray): Int {
        val x = dot[0]
        val y = dot[1]
        var answer: Int = when{
            x > 0 && y > 0 -> 1
            x < 0 && y > 0 -> 2
            x < 0 && y < 0 -> 3
            else -> 4
        }
        return answer
    }
}