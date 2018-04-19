package org.calvin.terview.epi;

import java.util.*;

public class Ch9HashTables {
    public static int stringHash(String s, int modulus) {
        int kMult = 997;
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            val = (val * kMult + c) % modulus;
        }
        return val;
    }

    public static List<List<String>> findAnagrams(List<String> dictionary) {
        Map<String, List<String>> sortedStringToAnagrams = new HashMap<>();
        for (String s : dictionary) {
            // Sorts the string, uses it as a key, and then appends
            // the original string as another value in the hash table.
            char[] sortedCharArray = s.toCharArray();
            Arrays.sort(sortedCharArray);
            String sortedStr = new String(sortedCharArray);
            if (!sortedStringToAnagrams.containsKey(sortedStr)) {
                sortedStringToAnagrams.put(sortedStr, new ArrayList<String>());
            }
            sortedStringToAnagrams.get(sortedStr).add(s);
        }
        List<List<String>> anagramGroups = new ArrayList<>();
        for (Map.Entry<String, List<String>> p :
                sortedStringToAnagrams.entrySet()) {
            if (p.getValue().size() >= 2) { // Found anagrams.
                anagramGroups.add(p.getValue());
            }
        }
        return anagramGroups;
    }

    public static List<ContactList> mergeContactLists(List<ContactList> contacts) {
        return new ArrayList<ContactList>(new HashSet<>(contacts));
    }

    public static class ContactList {
        public List<String> names;

        ContactList(List<String> names) {
            this.names = names;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof ContactList)) {
                return false;
            }
            return this == obj || new HashSet<String>(names).equals(new HashSet<>(((ContactList) obj).names));
        }

        @Override
        public int hashCode() {
            return new HashSet<String>(names).hashCode();
        }
    }
}
