package org.renderfly.example.action;

import java.io.IOException;

import javax.inject.Named;
import javax.inject.Singleton;

import org.renderfly.core.HandlerResult;
import org.renderfly.core.HttpGetHandler;
import org.renderfly.core.HttpPostHandler;
import org.rendersnake.HtmlCanvas;

@Singleton @Named("/error.html")
public class ErrorAction implements HttpGetHandler, HttpPostHandler {

    public HandlerResult get(HtmlCanvas html) throws IOException {
        throw new RuntimeException("error GET test");
    }

	@Override
	public HandlerResult post(HtmlCanvas html) throws IOException {
		throw new RuntimeException("error POST test");
	}   
}
