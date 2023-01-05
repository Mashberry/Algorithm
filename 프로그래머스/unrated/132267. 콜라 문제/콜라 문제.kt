class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var remain = n
        var result = 0
        var c = 0

        while (remain >= a) {
            c = remain / a * b
            remain = remain % a + c
            result += c
        }
        
        return result
    }
}