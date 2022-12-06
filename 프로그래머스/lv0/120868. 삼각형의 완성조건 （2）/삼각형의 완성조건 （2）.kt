class Solution {
    fun solution(sides: IntArray): Int {
        sides.sort()
        val min = sides[0]
        val max = sides[1]
        return (1..max).count { it + min > max } + min - 1
    }
}