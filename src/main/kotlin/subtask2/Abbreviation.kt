package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val strA = a.toUpperCase().filter { b.contains(it) }
        return if (strA == b) "YES" else "NO"
    }
}
