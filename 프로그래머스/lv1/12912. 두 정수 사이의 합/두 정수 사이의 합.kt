import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int): Long {
        if(a == b) return a.toLong()

        var max = b
        var min = a

        if(a > b){
            max = a
            min = b
        }

        var result = 0L

        for(i in min..max) {
            result += i
        }

        return result
    }
}