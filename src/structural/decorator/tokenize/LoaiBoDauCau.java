package structural.decorator.tokenize;

import java.util.ArrayList;
import java.util.List;

public class LoaiBoDauCau extends TokenDecorator{
    public LoaiBoDauCau(ITokenize tokenize) {
        super(tokenize);
    }

    @Override
    public List<String> tokenize() {
        List<String> tokens = super.tokenize();
        List<String> result = new ArrayList<>();

        for (String s : tokens) {
            String cleaned = s.replaceAll("[\\p{Punct}]", "");

            if (!cleaned.isEmpty()) {
                result.add(cleaned);
            }
        }

        return result;
    }
}
