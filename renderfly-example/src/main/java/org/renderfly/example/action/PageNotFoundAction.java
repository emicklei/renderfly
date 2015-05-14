package org.renderfly.example.action;

import java.io.IOException;

import javax.inject.Named;
import javax.inject.Singleton;

import org.renderfly.core.HandlerResult;
import org.renderfly.core.HttpGetHandler;
import org.rendersnake.HtmlCanvas;

@Singleton @Named("/404.html")
public class PageNotFoundAction implements HttpGetHandler {

	public HandlerResult get(HtmlCanvas html) throws IOException {
		html.html().body()
		    .h1().content("Page not found (you can create your own 404)")
		    ._body()._html();
		return HandlerResult.ok();
	}
}
