class Solution {
    fun solution(s: String): Int {
        val list = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var result = s
        for(i in list.indices) {
            result = result.replace(list[i], "$i")
        }
        return result.toInt()
    }
}