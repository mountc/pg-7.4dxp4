package com.liferay.cs.test.events.internal.upgrade.registry.v1_0_1;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upgrade.UpgradeProcess;

/**
 * @author Chris Mount
 */
public class ExampleUpgradeProcess extends UpgradeProcess {

    @Override
    protected void doUpgrade() throws Exception {

        _log.info("Upgrading -> Events Service to 1.0.1");

    }

    private static final Log _log = LogFactoryUtil.getLog(ExampleUpgradeProcess.class);
}
