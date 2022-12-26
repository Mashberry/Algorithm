class Solution {
    fun solution(answers: IntArray): IntArray {
        val aList = listOf(1, 2, 3, 4, 5)
        val bList = listOf(2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5)
        val cList = listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        val array = Array(3) { Pair(0, 0) }

        for (i in answers.indices) {
            if (answers[i] == aList[i % aList.size]) array[0] = Pair(1, array[0].second + 1)
            if (answers[i] == bList[i % bList.size]) array[1] = Pair(2, array[1].second + 1)
            if (answers[i] == cList[i % cList.size]) array[2] = Pair(3, array[2].second + 1)
        }

        val list = array.sortedByDescending { it.second }.groupBy { it.second }
        val max = list.maxOf { it.key }
        return list[max]!!.map { it.first }.toIntArray()
    }
}