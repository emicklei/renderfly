package org.renderfly.core.error;

import java.io.IOException;

import org.renderfly.core.HandlerResult;
import org.renderfly.core.HttpGetHandler;
import org.rendersnake.HtmlCanvas;

public class DefaultErrorAction implements HttpGetHandler {
    
    public HandlerResult get(HtmlCanvas html) throws IOException {
        html.render(new ErrorPageWrapper(new ErrorPage()));
        return HandlerResult.ok();
    }
}
