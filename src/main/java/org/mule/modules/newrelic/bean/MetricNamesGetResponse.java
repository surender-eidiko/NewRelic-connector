/**
 *
 */
package org.mule.modules.newrelic.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class MetricNamesGetResponse.
 */
public class MetricNamesGetResponse extends StatusResponse {
	
	/** The metrics. */
	private Metrics[] metrics;

    /**
     * Gets the metrics.
     *
     * @return the metrics
     */
    public Metrics[] getMetrics ()
    {
        return metrics;
    }

    /**
     * Sets the metrics.
     *
     * @param metrics the new metrics
     */
    public void setMetrics (Metrics[] metrics)
    {
        this.metrics = metrics;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [metrics = "+metrics+"]";
}
}
