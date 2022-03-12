fun main() {
    print("Masukkan tinggi segitiga: ")
    val t = readln().toInt()
    println("Pola 1:")
    piramidaBintang(t)
    println("Pola 2:")
    piramidaBintangTerbalik(t)
    println("Pola 3:")
    layangLayang(t)
    println("Pola 4:")
    polaX(t)
    println("Pola 5:")
    segitigaSiku(t)
}

fun piramidaBintang(t: Int) {
    for (i in 1..t){
        for (j in t downTo i+1){
            print(" ")
        }
        for (k in 1 until (i*2-1)){
            print("*")
        }
        println()
    }
}

fun piramidaBintangTerbalik(t: Int) {
    for (i in t downTo 1){
        for (j in t-1 downTo i){
            print(" ")
        }
        for (k in i*2-1 downTo 1){
            print("*")
        }
        println()
    }
}

fun layangLayang(t: Int) {
    for (i in 1..t){
        if (i==t){
            break
        }
        for (j in t downTo i+1){
            print(" ")
        }
        for (k in 1 until (i*2-1)){
            print("*")
        }
        println()
    }
    for (i in t downTo 1){
        for (j in t-1 downTo i){
            print(" ")
        }
        for (k in i*2-1 downTo 1){
            print("*")
        }
        println()
    }
}

fun polaX(t: Int) {
    for (i in t downTo 1){
        if (i==1){
            break
        }
        for (j in t-1 downTo i){
            print(" ")
        }
        for (k in i*2-1 downTo 1){
            if (k == i*2-1 || k==1){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }
    for (i in 1..t){
        for (j in t downTo i+1){
            print(" ")
        }
        for (k in 1 until (i*2-1)){
            if (k == i*2-1 || k==1){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }
}

fun segitigaSiku(t: Int) {
    for (i in 1..t){
        for (j in 1..i){
            print("*")
        }
        println()
    }
}