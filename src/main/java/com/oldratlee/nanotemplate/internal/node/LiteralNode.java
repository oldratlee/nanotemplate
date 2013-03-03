package com.oldratlee.nanotemplate.internal.node;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

/**
 * @author Jerry Lee (oldratlee AT gmail DOT com)
 */
public class LiteralNode implements Node {
    String literal;

    public LiteralNode(String literal) {
        this.literal = literal;
    }

    public String getLiteral() {
        return literal;
    }

    public void setLiteral(String literal) {
        this.literal = literal;
    }

    public void execute(Map<String, Object> context, Writer result) throws IOException {
        result.write(literal);
    }
}