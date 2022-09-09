package com.javarush.module1.facultativ2;

import java.util.HashMap;
import java.util.Map;

public class HakEncodedText {
    private final CharacterAnalyzer characterAnalyzer;
    private final AnagramMaker anagramMaker;

    public HakEncodedText(CharacterAnalyzer characterAnalyzer, AnagramMaker anagramMaker) {
        this.characterAnalyzer = characterAnalyzer;
        this.anagramMaker = anagramMaker;
    }

    public Map<Integer, String> hakEncodedText(String encodedText, String textExample){
        // take statics from text example
        Map<Character, Long> symbolToNumberOfUsed = characterAnalyzer.provideStatistics(textExample);
        //... top 3 from symbolToNumberOfUsed  submap ---> a, b, c

        Map<Character, Long> encodeSymbolsToNumberOfUsed = characterAnalyzer.provideStatistics(encodedText);
        // ... top 1 , k
        int delta1= 2;
        int delta2= 12;
        int delta3= 9;

        HashMap<Integer, String> integerStringHashMap = new HashMap<>();

        integerStringHashMap.put(delta1,  anagramMaker.decode(encodedText, delta1));
        integerStringHashMap.put(delta2,  anagramMaker.decode(encodedText, delta2));
        integerStringHashMap.put(delta3,  anagramMaker.decode(encodedText, delta3));

        return integerStringHashMap;
    }
}
