class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        val map = sizes.map { if (it[0] > it[1]) it[0] to it[1] else it[1] to it[0] }
        val x = map.maxOf { it.first }
        val y = map.maxOf { it.second }
        return x * y
    }
}