
package cz.alisma.alej.text.wrapping;

import java.util.List;

/** Left-aligns a line. */
public class RightAligner implements Aligner {

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
        for (int i = 0; i < width - theResult.length(); i++) {
        	beginSpaces.append(" ");
        }
        String result = beginSpaces.toString() + theResult;
        return result;
    }

}
