class Solution {
    fun solution(n: Long): IntArray {
        val list = mutableListOf<Int>()
        for(c in "$n"){
            list.add(c.digitToInt())
        }
        return list.reversed().toIntArray()
    }
}