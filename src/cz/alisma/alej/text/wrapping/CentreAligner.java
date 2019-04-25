
package cz.alisma.alej.text.wrapping;

import java.util.List;

/** Left-aligns a line. */
public class CentreAligner implements Aligner {

	@Override
    public String format(List<String> words, int width) {
        StringBuilder preResult = new StringBuilder();
        
        boolean first = true;
        for (String w : words) {
            if (!first) {
                preResult.append(" ");
            } else {
                first = false;
            }
            preResult.append(w);
        }
        
        String theResult = preResult.toString();
        
        StringBuilder beginSpaces = new StringBuilder();
        StringBuilder endSpaces = new StringBuilder();
        int numberOfBeginSpaces;
        int numberOfEndSpaces;
        
        if ((width - theResult.length()) / 2 == 0) {
        	numberOfBeginSpaces = (width - theResult.length()) / 2;
        	numberOfEndSpaces = numberOfBeginSpaces;
        }
        else {
        	numberOfBeginSpaces = (width - theResult.length()) / 2;
        	numberOfEndSpaces = numberOfBeginSpaces + 1;
        }
        
        for (int i = 0; i < numberOfBeginSpaces; i++) {
        	beginSpaces.append(" ");
        }
        for (int j = 0; j < numberOfEndSpaces; j++) {
        	endSpaces.append(" ");
        }
        
        String result = beginSpaces.toString() + theResult + endSpaces.toString();
        return result;
    }

}
