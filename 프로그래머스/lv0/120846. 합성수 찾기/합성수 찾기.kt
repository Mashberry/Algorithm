class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        for(i in 2..n) {
            var check = 0
            for(j in 1..i) {
                if(i % j == 0) check++
                if(check >= 3) {
                    answer++
                    break
                }
            }
        }
        
        return answer
    }
}