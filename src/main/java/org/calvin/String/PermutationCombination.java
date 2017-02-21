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
}
