fun main(args : Array<String>){
    //if
    val a =3
    val b = 5
    val c = if (a>b) a else b
    print(c)
    //when
    val x = 2
    val d  : String = when(x){
        1->"1"
        2->"2"
        else -> "x value is unknown"
    }
    print(d)
}