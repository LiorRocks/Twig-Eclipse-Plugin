package org.eclipse.twig.core.codeassist.strategies;

import org.eclipse.dltk.internal.core.SourceRange;
import org.eclipse.php.core.codeassist.ICompletionContext;
import org.eclipse.php.internal.core.codeassist.CodeAssistUtils;
import org.eclipse.php.internal.core.codeassist.ICompletionReporter;
import org.eclipse.twig.core.codeassist.context.KeywordContext;

@SuppressWarnings({ "restriction", "deprecation" })
public class KeywordStrategy extends AbstractTwigCompletionStrategy {



	private String[] KEYWORDS = new String[] { "as", "filter", "endfilter", "macro", "endmacro",
			"set", "import", "if", "elseif", "else", "endif", "for",
			"in", "endfor", "autoescape", "endautoescape", "true", "false", "include",
			"extends", "block", "endblock", "raw", "endraw", "spaceless",
			"endspaceless" };	
	
	public KeywordStrategy(ICompletionContext context) {
		super(context);

	}

	
	@Override
	public void apply(ICompletionReporter reporter) throws Exception {
	
		KeywordContext ctx = (KeywordContext) getContext();

		String prefix = ctx.getPrefix();
		SourceRange range = getReplacementRange(getContext());
		
		for (String keyword : KEYWORDS) {		
			if (CodeAssistUtils.startsWithIgnoreCase(keyword, prefix)) {
				reporter.reportKeyword(keyword, "", range);
			}
		}
	}
}