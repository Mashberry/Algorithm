class Solution {
    fun solution(num: Int): Int {
        var n = num.toLong()
        var count = 0
        
        while(true) {
            if (n == 1L) return count
            if (count == 500) return -1
            if (n % 2L == 0L) n /= 2
            else n = n * 3 + 1
            count++
        }
        
        return count
    }
}