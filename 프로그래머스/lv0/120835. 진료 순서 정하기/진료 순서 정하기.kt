class Solution {
    fun solution(emergency: IntArray): IntArray {
        
        return emergency.map { emergency.sortedDescending().indexOf(it) + 1 }.toIntArray()
    }
}