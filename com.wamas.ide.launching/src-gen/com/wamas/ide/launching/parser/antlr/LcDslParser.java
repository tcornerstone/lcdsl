/*
 * generated by Xtext 2.28.0
 */
package com.wamas.ide.launching.parser.antlr;

import com.google.inject.Inject;
import com.wamas.ide.launching.parser.antlr.internal.InternalLcDslParser;
import com.wamas.ide.launching.services.LcDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class LcDslParser extends AbstractAntlrParser {

	@Inject
	private LcDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLcDslParser createParser(XtextTokenStream stream) {
		return new InternalLcDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "LCModel";
	}

	public LcDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LcDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
