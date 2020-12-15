package com.phonedigits.phone;

import java.util.HashMap;

public class Keyboard {
    public static final HashMap<Character,String> map = new HashMap<Character,String>(){
        {
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");
        }
    };
}
