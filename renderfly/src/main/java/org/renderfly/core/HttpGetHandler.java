package org.renderfly.core;

import java.io.IOException;

import org.rendersnake.HtmlCanvas;

public interface HttpGetHandler {
    HandlerResult get(HtmlCanvas html) throws IOException;
}
