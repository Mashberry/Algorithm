class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        val resultList = mutableListOf<String>()
        for(q in quiz){
            val list = q.split(" = ")
            val result = list[1].toInt()
            val a = list[0]
            val cal = if(a.contains("+")) a.split(" + ").let { it[0].toInt() + it[1].toInt() }
                else a.split(" - ").let { it[0].toInt() - it[1].toInt() }
            resultList.add(if(result == cal) "O" else "X")
        }
        
        return resultList.toTypedArray()
    }
}