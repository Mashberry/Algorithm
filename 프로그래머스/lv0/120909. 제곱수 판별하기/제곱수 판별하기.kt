class Solution {
    fun solution(n: Int): Int {
        val sqrt = Math.sqrt(n * 1.0).toInt()
        var answer: Int = if(n % sqrt == 0) 1 else 2
        return answer
    }
}