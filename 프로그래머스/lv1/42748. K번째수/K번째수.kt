class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val result = arrayListOf<Int>()
        for(c in commands) {
            result.add(array.sliceArray(c[0] - 1..c[1] - 1).sorted()[c[2] - 1])
        }
        return result.toIntArray()
    }
}