class Solution {
    fun solution(left: Int, right: Int): Int {
        return (left..right).sumOf { if((1..it).count { n -> it % n == 0 } % 2 == 0) it else -it }
    }
}