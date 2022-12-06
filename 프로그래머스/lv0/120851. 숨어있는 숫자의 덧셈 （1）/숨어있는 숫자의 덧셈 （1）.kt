class Solution {
    fun solution(my_string: String): Int {
        
        
        return my_string.sumOf { it.digitToIntOrNull() ?: 0 }
    }
}