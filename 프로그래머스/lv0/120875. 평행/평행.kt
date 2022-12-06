class Solution {
    fun solution(dots: Array<IntArray>): Int {
        return if(degree(dots[0], dots[1]) == degree(dots[2], dots[3])
           || degree(dots[0], dots[2]) == degree(dots[1], dots[3])
           || degree(dots[0], dots[3]) == degree(dots[1], dots[2])){
            1
        } else 0
    }
    
    fun degree(first: IntArray, second: IntArray): Double {
        return Math.abs(first[0] - second[0]).toDouble() / Math.abs(first[1] - second[1]).toDouble()
    }
}