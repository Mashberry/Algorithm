class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        return numbers[2 * (k - 1) % numbers.size]
    }
}