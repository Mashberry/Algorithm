class Solution {
    fun solution(s: String): Int {
        val intList = mutableListOf<String>()
        
        s.split(" ").forEach() {
            if(it == "Z") intList.removeLast()
            else intList.add(it)
        }
        
        return intList.sumOf(String::toInt)
    }
}