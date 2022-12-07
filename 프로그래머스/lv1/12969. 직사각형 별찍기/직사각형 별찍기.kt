fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    for(i in 1..a*b) {
        if(i % a == 0) println('*') else print('*')
    }
}