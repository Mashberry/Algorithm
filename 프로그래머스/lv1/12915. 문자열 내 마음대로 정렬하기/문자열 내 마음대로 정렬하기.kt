class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        val listList = strings.sorted().groupBy { it[n] }.toSortedMap().map { it.value }
        val result = mutableListOf<String>()
        for (ll in listList) {
            for (l in ll) {
                result.add(l)
            }
        }
        return result.toTypedArray()
    }
}