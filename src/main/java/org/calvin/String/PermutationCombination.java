/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class PermutationCombination {
    private final List<String> result = new ArrayList<>();
    private final String in;
    private boolean[] used;
    private StringBuilder out = new StringBuilder();

    public PermutationCombination() {
        in = "";
    }
    public PermutationCombination(final String str ){
        in = str;
        used = new boolean[ in.length() ];
    }

    public void permute( ){
        if( out.length() == in.length() ){
            result.add(out.toString());
            return;
        }
        for( int i = 0; i < in.length(); ++i ){ if( used[i] ) continue;
            out.append( in.charAt(i) );
            used[i] = true;
            permute();
            used[i] = false;
            out.setLength( out.length() - 1 );
        }
    }

    public List<List<Character>> permute(char[] chars) {
        List<List<Character>> ans = new ArrayList<List<Character>>();
        if (chars.length ==0) return ans;
        List<Character> l0 = new ArrayList<Character>();
        l0.add(chars[0]);
        ans.add(l0);
        for (int i = 1; i< chars.length; ++i){
            List<List<Character>> new_ans = new ArrayList<List<Character>>();
            for (int j = 0; j<=i; ++j){
                for (List<Character> l : ans){
                    List<Character> new_l = new ArrayList<Character>(l);
                    new_l.add(j,chars[i]);
                    new_ans.add(new_l);
                }
            }
            ans = new_ans;
        }
        return ans;
    }

    // accepting repetition
    public void combination(char set[], String tracker, int n, int k) {
        if (k == 0) {
            result.add(tracker);
            return;
        }
        for (int i = 0; i < n; i++) {
            String newPrefix = tracker + set[i];
            combination(set, newPrefix, n, k - 1);
        }
    }

    // no repetition - simple
    public void combination3(String prefix, String s) {
        result.add(prefix);
        for (int i = 0; i < s.length(); i++) {
            combination3(prefix + s.charAt(i), s.substring(i+1));
        }
    }
}
