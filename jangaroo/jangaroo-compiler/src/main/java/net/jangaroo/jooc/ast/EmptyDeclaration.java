package net.jangaroo.jooc.ast;

import net.jangaroo.jooc.JooSymbol;
import net.jangaroo.jooc.JsWriter;
import net.jangaroo.jooc.Scope;
import net.jangaroo.jooc.ast.AstVisitor;
import net.jangaroo.jooc.ast.Declaration;

import java.io.IOException;

/**
 * @author Frank Wienberg
 */
public class EmptyDeclaration extends Declaration {

  private JooSymbol symSemicolon;

  public EmptyDeclaration(JooSymbol symSemicolon) {
    super(new JooSymbol[0]);
    this.symSemicolon = symSemicolon;
  }

  @Override
  public void visit(AstVisitor visitor) {
    visitor.visitEmptyDeclaration(this);
  }

  @Override
  public void scope(final Scope scope) {
  }

  public JooSymbol getSymbol() {
    return symSemicolon;
  }

  @Override
  public void generateAsApiCode(final JsWriter out) throws IOException {
    out.writeSymbol(symSemicolon);
  }

  public void generateJsCode(JsWriter out) throws IOException {
    out.writeSymbolWhitespace(symSemicolon);
  }
}