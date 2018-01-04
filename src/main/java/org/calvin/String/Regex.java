package org.calvin.String;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String DOTALL_PATTERN = "Address 1:\\s(/(?s).+)Address 2:";
    //simple matcher starting with letter T ending with letter e
    private static final String MULTILINE_PATTERN = "(?m)(^T.*e)$";

    public List<String> parseFirstGroupAddressDotAll(String data) {
        List<String> result = new ArrayList<String>();
        Pattern dotallPattern = Pattern.compile(DOTALL_PATTERN); // can alternatively use Pattern.DOTALL
        Matcher matcher = dotallPattern.matcher(data);

        while (matcher.find()) {
            result.add(matcher.group(1));
        }

        return result;
    }

    public List<String> parseFirstGroupAddressMultiline(String data) {
        List<String> result = new ArrayList<String>();
        Pattern multilinePattern = Pattern.compile(MULTILINE_PATTERN); // can alternatively use Pattern.MULTILINE
        Matcher matcher = multilinePattern.matcher(data);
        while (matcher.find()) {
            result.add(matcher.group(1));
        }

        return result;
    }
}
