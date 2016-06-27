package it.newvision.core.dictionary.exceptions;

import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Response;
import java.net.URI;

import static javax.ws.rs.core.Response.status;

/**
 * Redirect HTTP code 302 (also if old is used by AKAMAI for cache)
 */
public class TempRedirectApplicationException extends javax.ws.rs.WebApplicationException {

    public TempRedirectApplicationException(URI redirectUrl) {
        super(status(302).location(redirectUrl).build());
    }

    public TempRedirectApplicationException(URI redirectUrl, CacheControl cache) {
        super(status(302).location(redirectUrl).cacheControl(cache).build());
    }

}
