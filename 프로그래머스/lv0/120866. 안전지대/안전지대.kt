class Solution {
    fun solution(board: Array<IntArray>): Int {
        var arr = board.toMutableList()
        
        for(i in arr.indices) {
            for(j in arr[i].indices) {
                if(arr[i][j] == 1) {
                    if(i - 1 >= 0) {
                        if(j - 1 >= 0) arr[i-1][j-1] = getVal(arr[i-1][j-1])
                        if(j + 1 < arr[i].size) arr[i-1][j+1] = getVal(arr[i-1][j+1])
                        arr[i-1][j] = getVal(arr[i-1][j])
                    }
                    
                    if(i + 1 < arr.size) {
                        if(j - 1 >= 0) arr[i+1][j-1] = getVal(arr[i+1][j-1])
                        if(j + 1 < arr[i].size) arr[i+1][j+1] = getVal(arr[i+1][j+1])
                        arr[i+1][j] = getVal(arr[i+1][j])
                    }
                    
                    if(j - 1 >= 0) arr[i][j-1] = getVal(arr[i][j-1])
                    if(j + 1 < arr[i].size) arr[i][j+1] = getVal(arr[i][j+1])
                    else arr[i][j] = getVal(arr[i][j])
                }
            }
        }
        
        return arr.sumOf { it.count { intArr -> intArr == 0 } }
    }
    
    fun getVal(va: Int): Int {
        return if(va != 1) 2 else 1
    }
}