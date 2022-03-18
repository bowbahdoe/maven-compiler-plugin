package dev.mccue.compiler;

import org.codehaus.plexus.compiler.CompilerMessage;

public final class AwesomeCompilerMessage extends CompilerMessage {
    public AwesomeCompilerMessage(CompilerMessage compilerMessage) {
        super(compilerMessage.getFile(),
                compilerMessage.getKind(),
                compilerMessage.getStartLine(),
                compilerMessage.getStartColumn(),
                compilerMessage.getEndLine(),
                compilerMessage.getEndColumn(),
                compilerMessage.getMessage()
        );
    }

    @Override
    public String toString() {
        return "TESTIN: " + super.toString();
    }
}
