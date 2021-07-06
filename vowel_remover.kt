package week_5_assessment

import java.lang.StringBuilder

fun main() {
    print(onlyConsonant("lokoja"))

}


fun onlyConsonant(text: String): String {
    val result = StringBuilder()
    for (char: Char in text) {
        if (!"aeiou".contains(char.toLowerCase())) {
            result.append(char)
        }
    }
    return (result.toString())

}



