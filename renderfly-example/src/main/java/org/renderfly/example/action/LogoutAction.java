package org.renderfly.example.action;

import java.io.IOException;

import javax.inject.Named;
import javax.inject.Singleton;

import org.renderfly.core.HandlerResult;
import org.renderfly.core.HttpGetHandler;
import org.renderfly.http.session.HttpSession;
import org.rendersnake.HtmlCanvas;

@Singleton @Named("/logout.html")
public class LogoutAction implements HttpGetHandler {

    public HandlerResult get(HtmlCanvas html) throws IOException {
        ((HttpSession)html.getSession()).invalidate();
        return HandlerResult.redirectTo("/index.html");
    }        
}
