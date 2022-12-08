class Solution {
    fun solution(s: String): String {
        val arr = s.split(" ").toMutableList()
        for(i in arr.indices) {
            arr[i] = arr[i].foldIndexed("") { j, acc, e ->
                acc + if(j % 2 == 0) e.uppercase() else e.lowercase()
            }
        }
        return arr.joinToString(" ")
    }
}