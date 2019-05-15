package ru.geekbrains.JavaCore2.lesson3Collections;

import java.util.*;

public class CollectionWordCount {
    public static void main(String[] args) {
        String[] words = {"яблоко", "груша", "вишенка", "апельсин", "гранат", "капуста", "картошка", "абрикос", "смородина", "помидор", "огурец", "вишенка", "груша", "вишенка", "абрикос", "абрикос", "абрикос"};

        // заполняем коллекцию уникальными словами из массива
        Set wordsSet = new HashSet();
        for (String str : words) {
            wordsSet.add(str);
        }
        System.out.println(wordsSet);

        // создаём HashMap-таблицу cлово:количество и считаем количество вхождений в массив каждого слова
        Map<String, Integer> wordCountTable = new HashMap<>();
        for (String wrd : words) {
            int inclusionCounter = 0;
            for (String wrd1 : words) {
                if (wrd.equals(wrd1)) {
                    inclusionCounter++;
                }
            }
            wordCountTable.put(wrd, inclusionCounter);
        }
        System.out.println(wordCountTable);


    }

}
