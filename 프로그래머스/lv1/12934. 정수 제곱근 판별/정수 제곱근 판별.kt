class Solution {
    fun solution(n: Long): Long {
        return Math.sqrt(n.toDouble()).let {
            if(it % 1.0 == 0.0) (it + 1.0) * (it + 1.0)
            else -1
        }.toLong()
    }
}