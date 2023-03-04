package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main()
        sort()
    }

    fun main() {
        val strings = arrayOf("клоун", "колбаса", "огурец", "трактор", "троллейбус")

        // Получаем первые буквы из каждого слова в массиве и фильтруем их
        val firstLetters = strings
            .map { it[0] }
            .filter { it in setOf('к', 'о', 'т') }
            .distinct() // Удаляем повторяющиеся буквы

        // Создаем строку, содержащую буквы, похожие на буквы в слове "кот",
        // и преобразуем ее к верхнему регистру
        val result = String(firstLetters.toCharArray()).toUpperCase()

        // Выводим результат
        println(result)
    }
    fun sort() {
        var array =
            arrayOf("клоун", "колбаса", "огурец", "трактор", "folder", "троллейбус")
        var name = "кот"
        var newName = ""
        var correctlyNewName = ""

        for (i in array) {
            for (j in name) {
                if (i.contains(j)) {
                    if (!newName.contains(j)) {
                        newName += j
                    }
                }
            }
        }

        for (i in name) {
            if (newName.contains(i)) {
                correctlyNewName += i
            }
        }

        println(correctlyNewName)
    }
}




