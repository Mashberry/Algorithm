class Solution {
    fun solution(left: Int, right: Int): Int {
        return (left..right).sumOf { it.yak() }
    }
    
    fun Int.yak(): Int {
        return if((1..this).count { this % it == 0 } % 2 == 0) this else -this
    } 
}