class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        return num_list.toList().chunked(n).map { it.toIntArray() }.toTypedArray()
    }
}