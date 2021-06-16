package subtask1

import java.lang.Exception
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            val formatter = DateTimeFormatter.ofPattern("dd MMMM")
            val formattedDate = date.format(formatter)
            val textDayOfTheWeek = getDayOfWeekRu(date.dayOfWeek)
            "$formattedDate, $textDayOfTheWeek"
        } catch (e: Exception) {
            "Такого дня не существует"
        }
    }

    private fun getDayOfWeekRu(d: DayOfWeek) =
        when (d) {
            DayOfWeek.MONDAY -> "понедельник"
            DayOfWeek.TUESDAY -> "вторник"
            DayOfWeek.WEDNESDAY -> "среда"
            DayOfWeek.THURSDAY -> "четверг"
            DayOfWeek.FRIDAY -> "пятница"
            DayOfWeek.SATURDAY -> "суббота"
            DayOfWeek.SUNDAY -> "воскресенье"

            else -> "Такого дня не существует"
        }
}
