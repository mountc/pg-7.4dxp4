package com.liferay.cs.test.events.internal.upgrade.registry;

import com.liferay.cs.test.events.internal.upgrade.registry.v1_0_1.ExampleUpgradeProcess;
import com.liferay.portal.kernel.service.ReleaseLocalService;
import com.liferay.portal.kernel.upgrade.DummyUpgradeStep;
import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;
import com.liferay.portal.upgrade.release.ReleaseRenamingUpgradeStep;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Chris Mount
 */
@Component(service = UpgradeStepRegistrator.class)
public class EventsServiceUpgradeStepRegistrator implements UpgradeStepRegistrator {

    @Override
    public void register(Registry registry) {
        registry.registerReleaseCreationUpgradeSteps(
                new ReleaseRenamingUpgradeStep(
                        "com.liferay.cs.test.events.service",
                        "events-portlet",
                        _releaseLocalService));

            registry.register("0.0.1", "1.0.0", new DummyUpgradeStep());

            registry.register("1.0.0", "1.0.1", new ExampleUpgradeProcess());
    }

    @Reference
    private ReleaseLocalService _releaseLocalService;
}
