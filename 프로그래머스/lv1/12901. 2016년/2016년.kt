class Solution {
    fun solution(a: Int, b: Int): String {
        val month = listOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val day = listOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
        val count = (0 until a - 1).foldIndexed(b) { index, acc, i -> acc + month[index] }
        return day[count % day.size]
    }
}