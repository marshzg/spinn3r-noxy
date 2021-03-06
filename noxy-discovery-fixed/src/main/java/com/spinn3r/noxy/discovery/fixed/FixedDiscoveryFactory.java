package com.spinn3r.noxy.discovery.fixed;

import com.google.inject.Inject;
import com.spinn3r.noxy.discovery.*;
import com.spinn3r.noxy.discovery.fixed.FixedDiscovery;
import com.spinn3r.noxy.discovery.fixed.init.FixedDiscoveryConfig;

/**
 *
 */
public class FixedDiscoveryFactory implements DiscoveryFactory {

    private final FixedDiscoveryConfig fixedDiscoveryConfig;

    @Inject
    FixedDiscoveryFactory(FixedDiscoveryConfig fixedDiscoveryConfig) {
        this.fixedDiscoveryConfig = fixedDiscoveryConfig;
    }

    @Override
    public Discovery create(Cluster cluster, DiscoveryListener discoveryListener) throws DiscoveryListenerException {
        return new FixedDiscovery( fixedDiscoveryConfig, cluster, discoveryListener );
    }

}
