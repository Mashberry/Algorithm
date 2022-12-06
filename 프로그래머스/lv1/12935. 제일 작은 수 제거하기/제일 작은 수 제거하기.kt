class Solution {
    fun solution(arr: IntArray): IntArray {
        val min = arr.minOf { it }
        return if (arr.size == 1) intArrayOf(-1)
        else arr.filter { it != min }.toIntArray()
    }
}