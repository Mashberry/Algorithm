class Solution {
    fun solution(n: Long): Long {
        return "$n".toCharArray().sortedDescending().joinToString("").toLong()
    }
}