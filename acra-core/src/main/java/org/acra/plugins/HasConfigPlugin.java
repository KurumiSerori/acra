/*
 * Copyright (c) 2018
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.acra.plugins;

import android.support.annotation.NonNull;
import org.acra.config.ConfigUtils;
import org.acra.config.Configuration;
import org.acra.config.CoreConfiguration;

/**
 * @author F43nd1r
 * @since 18.04.18
 */
public abstract class HasConfigPlugin implements Plugin {
    private final Class<? extends Configuration> configClass;

    public HasConfigPlugin(Class<? extends Configuration> configClass) {
        this.configClass = configClass;
    }

    @Override
    public final boolean enabled(@NonNull CoreConfiguration config) {
        return ConfigUtils.getPluginConfiguration(config, configClass).enabled();
    }
}
