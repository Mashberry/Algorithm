class Solution {
    fun solution(numbers: IntArray): Int {
        return (0..9).sum() - numbers.sum()
    }
}