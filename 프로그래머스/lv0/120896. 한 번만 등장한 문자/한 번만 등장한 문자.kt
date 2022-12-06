class Solution {
    fun solution(s: String): String {
        val list = mutableListOf<Char>()

        for(c in s){
            if(s.count { c == it } == 1) list.add(c)
        }

        return list.sorted().joinToString("")
    }
}