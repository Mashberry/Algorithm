class Solution {
    fun solution(numbers: IntArray): IntArray {
        val size = numbers.size
        var list = mutableListOf<Int>()
        
        for(i in 0 .. size - 2) {
            for(j in i + 1 .. size - 1) {
                list.add(numbers[i] + numbers[j])
            }
        }
        
        return list.distinct().sorted().toIntArray()
    }
}