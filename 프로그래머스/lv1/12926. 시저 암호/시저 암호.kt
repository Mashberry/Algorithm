class Solution {
    fun solution(s: String, n: Int): String {
        var result = ""
        val lowerMin = 'a'.code
        val lowerMax = 'z'.code
        val lowerRange = lowerMax - lowerMin + 1
        val lowerRegex = "^[a-z]+$".toRegex()
        val upperMin = 'A'.code
        val upperMax = 'Z'.code
        val upperRange = upperMax - upperMin + 1
        val upperRegex = "^[A-Z]+$".toRegex()

        for (c in s) {
            val isUpper = c.toString().matches(upperRegex)
            val plusStr = (c.code + n).toChar().toString()
            result +=
                if (c == ' ') c
                else if (isUpper) {
                    if (plusStr.matches(upperRegex)) c + n
                    else ((c.code + n - upperMax) % upperRange + upperMin - 1).toChar()
                } else if (plusStr.matches(lowerRegex)) c + n
                else ((c.code + n - lowerMax) % lowerRange + lowerMin - 1).toChar()
        }
        return result
    }
}