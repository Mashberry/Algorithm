class Solution {
    fun solution(chicken: Int): Int {
        var coupon = chicken
        var count = 0
        
        while(coupon >= 10) {
            val service = coupon / 10
            coupon = (coupon % 10) + service
            count += service
        }
        
        return count
    }
}