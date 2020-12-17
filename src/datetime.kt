/**
 * 1. default format
 *
 * */

import java.time.LocalDate
import java.time.LocalTime

//fun main(args: Array<String>) {
//    val current =LocalDate.now()
//    val time=LocalTime.now()
//
//    println("Current Date Is :$current")
//    println("Current Time Is :$time")
//
//}

/**
 * 2.With Pattern
 *
 * */
//import java.time.LocalDateTime
//import java.time.format.DateTimeFormatter

//fun main(args: Array<String>) {
//    val current=LocalDateTime.now()
//
//    val formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss.SSS")
//    val formatted=current.format(formatter)
//
//    println("Current Date and Time is:$formatted")
//}
/**
 * 3. Predefined Constants
 * */

//fun main(args: Array<String>) {
//    val current=LocalDateTime.now()
//
//    val formatter=DateTimeFormatter.BASIC_ISO_DATE
//    val formatted=current.format(formatter)
//
//    print("Current Ddate is :$formatted")
//}
/**
4.localized style
 */
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle


fun main(args: Array<String>) {
        val current=LocalDateTime.now()

        val formatter=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        val formatted=current.format(formatter)

        println("date is: $formatted")
}