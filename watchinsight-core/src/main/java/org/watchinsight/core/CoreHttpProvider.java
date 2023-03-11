/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.watchinsight.core;

import org.watchinsight.core.configuration.HttpProviderConfig;
import org.watchinsight.core.provider.AbstractProviderDefine;

/**
 * @author Created by gerry
 * @date 2023-03-10-23:22
 */
public class CoreHttpProvider extends AbstractProviderDefine {
    
    public static final String HTTP = "http";
    
    private HttpProviderConfig providerConfig;
    
    @Override
    public String name() {
        return HTTP;
    }
    
    @Override
    public HttpProviderConfig createConfig() {
        this.providerConfig = new HttpProviderConfig();
        return this.providerConfig;
    }
    
    @Override
    public void prepare() {
    }
    
    @Override
    public void start() {
    }
    
    @Override
    public void after() {
    }
    
    @Override
    public void stop() {
    }
    
}
