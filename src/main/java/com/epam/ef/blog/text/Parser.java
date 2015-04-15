package com.epam.ef.blog.text;

import java.util.*;

public class Parser {

    static final String REGEX_PARAGRAPH_SEPARATOR = "\\n";
    static final String REGEX_SENTENCE_SEPARATOR = "\\. ";
    static final String REGEX_WORD_SEPARATOR = " ";
    static final String REGEX_SYMBOL_SEPARATOR = "";

    static final Map<Type, String> SEPARATOR_MAP = new EnumMap<Type, String>(Type.class);

    static Map<Character, Symbol> symbolMap = new HashMap<Character, Symbol>();

    static Symbol addSymbol(char c) {
        Symbol symbol = new Symbol(Character.toString(c));
        symbolMap.put(c, symbol);
        return symbol;
    }

    static Symbol getSymbol(char c) {
        if (symbolMap.containsKey(c)) {
            return symbolMap.get(c);
        }
        return addSymbol(c);
    }

    static {
        SEPARATOR_MAP.put(Type.PARAGRAPH, REGEX_PARAGRAPH_SEPARATOR);
        SEPARATOR_MAP.put(Type.SENTENCE, REGEX_SENTENCE_SEPARATOR);
        SEPARATOR_MAP.put(Type.WORD, REGEX_WORD_SEPARATOR);
        SEPARATOR_MAP.put(Type.SYMBOL, REGEX_SYMBOL_SEPARATOR);
    }

    public static Text parse(String string) {
        Text text = new Text(string);
        return text;
    }

    public static Part parseAny(String string, Type type) { // FixMe: Make this method is worked
        List<Part> parts = new ArrayList<Part>();
        int typeNumber = type.ordinal();
        String[] split = string.split(SEPARATOR_MAP.get(type));
        for (String part : split) {
            Part p = parseAny(part, Type.values()[typeNumber++]);
            parts.add(p);
        }
        return parts.get(0);
    }

    public static List<Part> parseAnyTwo(String string, Type type) { // FixMe: Make this method is worked
        List<Part> parts = new ArrayList<Part>();
        int typeNumber = type.ordinal();
        String[] split = string.split(SEPARATOR_MAP.get(type));
        for (String part : split) {
            List<Part> p = parseAnyTwo(part, Type.values()[typeNumber++]);
            for (Part pp : p) {

            }
        }
        return parts;
    }

}
