class Solution {
    fun solution(my_string: String, letter: String): String {
        val result = StringBuilder()
        for(c in my_string){
            if(c != letter[0]) result.append(c)
        }
        var answer: String = result.toString()
        return answer
    }
}