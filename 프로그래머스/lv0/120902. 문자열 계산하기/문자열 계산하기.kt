class Solution {
    fun solution(my_string: String): Int {
        val list = my_string.split(" ").toMutableList()
        
        for(i in 1 until list.size - 1 step 2) {
            if (list[i] == "+") {
                list[i] = "0"
                list[i + 1] = list[i + 1]
            } else if (list[i] == "-") {
                list[i] = "0"
                list[i + 1] = "-${list[i + 1]}"
            }
        }
        
        return list.sumOf{ it.toInt() }
    }
}