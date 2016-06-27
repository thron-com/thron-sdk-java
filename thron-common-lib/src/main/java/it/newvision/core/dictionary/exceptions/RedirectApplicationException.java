package it.newvision.core.dictionary.exceptions;

import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

/**
 * Redirect HTTP Code 307
 */
public class RedirectApplicationException extends javax.ws.rs.WebApplicationException {

    public RedirectApplicationException(URI redirectUrl) {
        super(Response.temporaryRedirect(redirectUrl).build());
    }

    public RedirectApplicationException(URI redirectUrl, CacheControl cache) {
        super(Response.temporaryRedirect(redirectUrl).cacheControl(cache).build());
    }

}
