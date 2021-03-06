package com.spinn3r.noxy.forward;

import com.spinn3r.artemis.http.init.DefaultWebserverReferencesService;
import com.spinn3r.artemis.http.init.WebserverService;
import com.spinn3r.artemis.init.ServiceReferences;
import com.spinn3r.artemis.init.services.HostnameService;
import com.spinn3r.artemis.init.services.VersionService;
import com.spinn3r.artemis.logging.init.LoggingService;
import com.spinn3r.artemis.metrics.init.GlobalMetricsService;
import com.spinn3r.artemis.sequence.init.SequenceSupportService;
import com.spinn3r.noxy.discovery.support.init.MembershipSupportService;
import com.spinn3r.noxy.forward.init.ForwardProxyService;
//import com.spinn3r.artemis.sequence.zookeeper.init.ZKGlobalMutexService;
import com.spinn3r.artemis.sequence.none.init.NoGlobalMutexService;
import com.spinn3r.artemis.time.init.SystemClockService;
import com.spinn3r.artemis.time.init.UptimeService;

/**
 *
 */
public class ForwardProxyServiceReferences extends ServiceReferences {

    public ForwardProxyServiceReferences() {

        add( SystemClockService.class );
        add( HostnameService.class );
        add( VersionService.class );
        add( LoggingService.class );
        add( SequenceSupportService.class );
        add( GlobalMetricsService.class );
        add( UptimeService.class );
        add( DefaultWebserverReferencesService.class );
        add( MembershipSupportService.class );
        add( ForwardProxyService.class );
        add( WebserverService.class );

    }

}
