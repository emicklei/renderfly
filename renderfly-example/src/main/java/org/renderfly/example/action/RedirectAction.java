package org.renderfly.example.action;

import java.io.IOException;

import javax.inject.Named;
import javax.inject.Singleton;

import org.renderfly.core.HandlerResult;
import org.renderfly.core.HttpGetHandler;
import org.rendersnake.HtmlCanvas;

@Singleton @Named("/redirect.html")
public class RedirectAction implements HttpGetHandler {

    public HandlerResult get(HtmlCanvas html) throws IOException {
        return HandlerResult.redirectTo("/login.html");
    }
}
