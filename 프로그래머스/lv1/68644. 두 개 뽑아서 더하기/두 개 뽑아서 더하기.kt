class Solution {
    fun solution(numbers: IntArray): IntArray {
        val size = numbers.size
        var intSet = mutableSetOf<Int>()
        
        for(i in 0 .. size - 2) {
            for(j in i + 1 .. size - 1) {
                intSet.add(numbers[i] + numbers[j])
            }
        }
        
        return intSet.sorted().toIntArray()
    }
}