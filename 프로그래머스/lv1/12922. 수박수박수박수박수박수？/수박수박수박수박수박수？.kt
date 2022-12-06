class Solution {
    fun solution(n: Int): String {
        return (1..n).foldIndexed("") { i, result, e -> result + if(i % 2 == 0) "수" else "박" }
    }
}