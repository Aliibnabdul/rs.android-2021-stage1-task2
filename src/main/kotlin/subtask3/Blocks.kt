package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        return when (blockB) {
            String::class -> {
                blockA.filterIsInstance<String>().joinToString("")
            }
            Int::class -> {
                val al: ArrayList<Int> = blockA.filterIsInstance<Int>() as ArrayList<Int>
                al.sum()
            }
            LocalDate::class -> {
                val al = blockA.filterIsInstance<LocalDate>() as ArrayList<LocalDate>
                al.max()!!.format(DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale("ru")))
            }
            else -> throw NotImplementedError("Not implemented")
        }
    }
}
