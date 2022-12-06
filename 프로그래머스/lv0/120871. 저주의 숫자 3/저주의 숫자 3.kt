class Solution {
    fun solution(n: Int): Int {
        var result = 0
        
        repeat(n) {
            result++
            
            while(result % 3 == 0 || "$result".contains("3")) {
                result++
            }
        }
        
        return result
    }
}