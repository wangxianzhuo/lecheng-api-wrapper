/*
 * Copyright 2021 xianzhuo<wangshangjie1992@gmail.com>
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

package com.github.wangxianzhuo.lecheng.api.wrapper.api;

import com.github.wangxianzhuo.lecheng.api.wrapper.request.RequestTestBase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * description: ApiTestBase
 * date: 2021/4/19 17:46
 *
 * @author: shangjie
 * @version: 1.0
 */
public class ApiTestBase extends RequestTestBase {
    protected String deviceId;
    protected String channelId;

    protected void basicParamsCheck() {
        deviceId = System.getProperty("test.device.id");
        channelId = System.getProperty("test.channel.id");
        assertNotNull(deviceId, "don't config vm options test.device.id");
        assertNotNull(channelId, "don't config vm options test.channel.id");
    }

    protected void loadPropertiesFromFile(String propertyFileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(propertyFileName));
        System.getProperties().load(bufferedReader);
    }
}
