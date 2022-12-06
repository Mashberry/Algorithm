import java.math.BigInteger
class Solution {
    fun solution(balls: Int, share: Int): Int {
        if(balls == share) return 1
        return (fac(balls) / (fac(balls-share) * fac(share))).toInt()
    }
    
    fun fac(n: Int): BigInteger {
        var f: BigInteger = BigInteger.valueOf(1)
        for(i in 1..n) {
            f *= BigInteger.valueOf(i.toLong())
        }
        return f
    }
}