/*
 * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.hal.client.bootstrap;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import org.jboss.hal.client.bootstrap.endpoint.EndpointManager;
import org.jboss.hal.client.bootstrap.endpoint.EndpointStorage;
import org.jboss.hal.client.bootstrap.tasks.BootstrapTasks;
import org.jboss.hal.client.bootstrap.tasks.BootstrapTasksRx;
import org.jboss.hal.client.bootstrap.tasks.FindDomainController;
import org.jboss.hal.client.bootstrap.tasks.FindDomainControllerRx;
import org.jboss.hal.client.bootstrap.tasks.LoadSettings;
import org.jboss.hal.client.bootstrap.tasks.LoadSettingsRx;
import org.jboss.hal.client.bootstrap.tasks.ReadAuthentication;
import org.jboss.hal.client.bootstrap.tasks.ReadAuthenticationRx;
import org.jboss.hal.client.bootstrap.tasks.ReadEnvironment;
import org.jboss.hal.client.bootstrap.tasks.ReadEnvironmentRx;
import org.jboss.hal.client.bootstrap.tasks.ReadExtensions;
import org.jboss.hal.client.bootstrap.tasks.ReadExtensionsRx;
import org.jboss.hal.client.bootstrap.tasks.RegisterStaticCapabilities;
import org.jboss.hal.client.bootstrap.tasks.RegisterStaticCapabilitiesRx;
import org.jboss.hal.spi.GinModule;

@GinModule
public class BootstrapModule extends AbstractGinModule {

    @Override
    protected void configure() {
        bind(EndpointManager.class).in(Singleton.class);
        bind(EndpointStorage.class).in(Singleton.class);

        bind(LoadSettings.class).in(Singleton.class);
        bind(LoadSettingsRx.class).in(Singleton.class);
        bind(ReadEnvironment.class).in(Singleton.class);
        bind(ReadEnvironmentRx.class).in(Singleton.class);
        bind(ReadExtensions.class).in(Singleton.class);
        bind(ReadExtensionsRx.class).in(Singleton.class);
        bind(ReadAuthentication.class).in(Singleton.class);
        bind(ReadAuthenticationRx.class).in(Singleton.class);
        bind(FindDomainController.class).in(Singleton.class);
        bind(FindDomainControllerRx.class).in(Singleton.class);
        bind(RegisterStaticCapabilities.class).in(Singleton.class);
        bind(RegisterStaticCapabilitiesRx.class).in(Singleton.class);
        bind(BootstrapTasks.class).in(Singleton.class);
        bind(BootstrapTasksRx.class).in(Singleton.class);
    }
}
