class Solution {
    fun solution(answers: IntArray): IntArray {
        val supojas = listOf(
            listOf(1, 2, 3, 4, 5),
            listOf(2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5),
            listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        )

        val array = Array(supojas.size) { Pair(0, 0) }

        for (i in answers.indices) {
            for (j in supojas.indices) {
                if (answers[i] == supojas[j][i % supojas[j].size])
                    array[j] = Pair(j + 1, array[j].second + 1)
            }
        }

        val list = array.sortedByDescending { it.second }.groupBy { it.second }
        val max = list.maxOf { it.key }
        return list[max]!!.map { it.first }.toIntArray()
    }
}