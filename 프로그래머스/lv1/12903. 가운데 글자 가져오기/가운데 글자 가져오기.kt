class Solution {
    fun solution(s: String): String {
        val length = s.length
        if(length == 1) return s
        
        var start = 0
        var end = 0
        
        if(length % 2 == 0) {
            start = length / 2 - 1
            end = start + 2
        } else {
            start = length / 2
            end = start + 1
        }
        
        return s.substring(start, end)
    }
}