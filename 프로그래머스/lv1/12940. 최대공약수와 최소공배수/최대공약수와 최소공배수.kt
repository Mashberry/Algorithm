class Solution {
    fun gcd(a: Int, b: Int): Int = if(b != 0) gcd(b, a % b) else a
    
    fun solution(n: Int, m: Int): IntArray {
        val gcd = if(n < m) gcd(n, m) else gcd(m, n)
        val lcm = n * m / gcd
        return intArrayOf(gcd, lcm)
    }
}