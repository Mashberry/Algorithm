class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        for(d in db) {
            if(d[0] == id_pw[0] && d[1] == id_pw[1]) return "login"
            else if(d[0] == id_pw[0]) return "wrong pw"
        }
        
        return "fail"
    }
}