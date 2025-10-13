package structural.decorator.tokenize;

import java.util.List;

public abstract class TokenDecorator implements ITokenize {

    ITokenize tokenize;

    public TokenDecorator(ITokenize tokenize) {
        this.tokenize = tokenize;
    }

    @Override
    public List<String> tokenize() {
        return tokenize.tokenize();
    }
}
