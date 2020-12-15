package com.phonedigits.phone;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Get the combination of numbers
 */
public class Conbination {

    public Conbination(Map<Character, String> keyboard) {
        this.keyboard = keyboard;
    }

    /**
     *  Keyboard model
     */
    private Map<Character,String> keyboard;

    /**
     * one or more digits 2-9
     */
    private Pattern pattern = Pattern.compile("^[2-9]+$");

    /**
     * Get letter component by digits
     * @param digits Combination of numbers
     * @return List<String> Type letter combinations
     */
    public List<String> letterCombinations(String digits){
        // letter component result
        List<String> res = new ArrayList<>();

        // check input type
        if(digits == null || !pattern.matcher(digits).matches()) return res;

        // temporary storage letter group
        List<Character> charList = new ArrayList<>();

        // call handler
        handler(digits,0,charList,res);

        // return results
        return res;
    }

    /**
     * recursion handle the combination of letters that numbers match
     * @param digits input digits
     * @param start element subscript for processing
     * @param charList temporary storage letter group
     * @param res letter combinations
     */
    private void handler(String digits,int start,List<Character> charList,List<String> res){
        /*
         * When the length of the two list is the same, it will be converted to a string
         * and saved to the result of letter combination after end recursion
         */
        if(charList.size() == digits.length()){
            StringBuilder sb = new StringBuilder();
            for (Character character : charList) {
                sb.append(character);
            }
            res.add(sb.toString());
            return;
        }

        // get a single number by index
        Character digit = digits.charAt(start);

        // get key letter combination by numbers
        String letters = keyboard.get(digit);

        /*
         * use the loop to save the letters to the temporary alphabet
         * and process the next letter
         * the length of the temporary alphabet is reduced by one each time
         */
        for (int i = 0; i < letters.length(); i++) {
            charList.add(letters.charAt(i));
            handler(digits, start+1, charList, res);
            charList.remove(charList.size() - 1);
        }
    }

}
