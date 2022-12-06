class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        return absolutes.foldIndexed(0) { i, sum, e -> sum + if(signs[i]) e else -e }
    }
}