class Solution {
    fun solution(letter: String): String {
        val morse = """
            '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
            '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
            '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
            '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
            '-.--':'y','--..':'z'
        """.trimIndent().split(",")
        val letters = letter.split(" ")
        
        var result = ""
        for(l in letters) {
            for(m in morse) {
                if(m.contains("'$l'")) result += m.split(":")[1].replace("'", "")
            }
        }
        
        return result
    }
}