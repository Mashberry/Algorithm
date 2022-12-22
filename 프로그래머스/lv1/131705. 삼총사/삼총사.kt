class Solution {
    fun solution(number: IntArray): Int {
        var result = 0
        for(i in number.indices){
            var second = i + 1
            var third = second + 1
            if(third > number.size - 1) break
            while(second <= number.size - 2){
                while(third <= number.size - 1) {
                    if(number[i] + number[second] + number[third] == 0) result++
                    third++
                }
                second++
                third = second + 1
            }
        }
        return result
    }
}