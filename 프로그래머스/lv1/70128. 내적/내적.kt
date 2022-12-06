class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        return a.foldIndexed(0) { i, sum, e -> sum + (b[i] * e) }
    }
}