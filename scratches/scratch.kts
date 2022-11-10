import kotlin.math.pow

// I.
// 1.  Find perimeter and surface of trapeze (a = 5, b = 6.25, c = 4.5, d = 5.5, h = 3.825)

val a = 5
val b = 6.25
val c = 4.5
val d = 5.5
val h = 3.825

val perimeter = a + b + c + d + h
perimeter

val area = (a + b) / 2 * h
area


// 2. Find circumference and surface of a circle (r = 12.755)

val r = 12.755

val circumference = 2 * Math.PI * r;
circumference

val circleArea = Math.PI * r.pow(2.0)
circleArea

// II.
// 1. Iterate all numbers from 2 to 100.
//
// 2. For each even number increment a counter.
//
// 3. For each odd number increment a counter.
//
// 4. For each prime number increment a counter.
//
// 5. For each found prime number - print it.
//
// 6. Print the final value of all three counters.

var evenCounter: Int = 0
var oddCounter: Int = 0
var primeCounter: Int = 0

for (i in 2..100) {
    if (i % 2 == 0) {
        evenCounter++
    } else {
        oddCounter++
    }

    if (isPrime(i)) {
        primeCounter++
        println(i)
    }
}

println(evenCounter)
println(oddCounter)
println(primeCounter)

fun isPrime(number: Int): Boolean {
    for (i in 2..number / 2) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}