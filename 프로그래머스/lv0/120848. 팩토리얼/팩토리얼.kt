class Solution {
    fun solution(n: Int): Int {
        var f = 1
        var result = 1
        
        for(i in 1..n) {
            f *= i
            result = i
            
            if(f > n) {
                result--
                break
            }
        }
        
        return result
    }
}