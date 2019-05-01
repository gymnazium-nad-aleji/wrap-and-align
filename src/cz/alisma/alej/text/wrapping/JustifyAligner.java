package cz.alisma.alej.text.wrapping;

import java.util.List;

/** Left-aligns a line. */
public class JustifyAligner implements Aligner {

    @Override
    public String format(List<String> words, int width) {
    	int numberOfWords = words.size();
    	String wordsString = words.toString();
    	int lengthOfWords = wordsString.length();
    	int numberOfSpaces = (width - lengthOfWords) / (numberOfWords - 1);
    	int plusSpaces = (width - lengthOfWords) % (numberOfWords - 1);    	
    	
        StringBuilder preResult = new StringBuilder();
        
        boolean first = true;
        for (String w : words) {
            if (!first) {
                preResult.append(" ");
                if (plusSpaces != 0) {
                	preResult.append(" ");
                	plusSpaces -= 1;
                }
                for (int i = 0; i < numberOfSpaces; i++) {
                	preResult.append(" ");
                }
            } else {
                first = false;
            }
            
            preResult.append(w);
        }
        String result = preResult.toString();
        return result;
    }

}
