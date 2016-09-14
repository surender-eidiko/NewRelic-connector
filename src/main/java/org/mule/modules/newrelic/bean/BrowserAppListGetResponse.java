/**
 *
 */
package org.mule.modules.newrelic.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class BrowserAppListGetResponse.
 */
public class BrowserAppListGetResponse extends StatusResponse{
	
	/** The browser_applications. */
	private Browser_applications[] browser_applications;

    /**
     * Gets the browser_applications.
     *
     * @return the browser_applications
     */
    public Browser_applications[] getBrowser_applications ()
    {
        return browser_applications;
    }

    /**
     * Sets the browser_applications.
     *
     * @param browser_applications the new browser_applications
     */
    public void setBrowser_applications (Browser_applications[] browser_applications)
    {
        this.browser_applications = browser_applications;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [browser_applications = "+browser_applications+"]";
    }
}
