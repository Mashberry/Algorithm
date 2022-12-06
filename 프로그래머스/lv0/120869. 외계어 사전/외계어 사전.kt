class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        return if(dic.any { s -> spell.all { s.contains(it) } }) 1 else 2
    }
}