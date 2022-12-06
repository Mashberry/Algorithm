class Solution {
    fun solution(age: Int): String {
        val ageList = age.toString().toList()
        val ageStr = "abcdefghij".toList()
        return ageList.map { ageStr[it.toString().toInt()] }.joinToString("")
    }
}