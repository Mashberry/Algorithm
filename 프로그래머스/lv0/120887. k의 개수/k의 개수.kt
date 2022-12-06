class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
         var count = 0
        (i..j).forEach {
            if ("$it".contains("$k"))
                count += "$it".toList().count { c -> c == k.digitToChar() }
        }
        return count
    }
}