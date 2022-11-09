import kotlin.math.pow

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