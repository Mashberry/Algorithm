class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val filter = arr.filter { it % divisor == 0 }
        return if (filter.size > 0) filter.sorted().toIntArray() else IntArray(1) { -1 }
        
    }
}