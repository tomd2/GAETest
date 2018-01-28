/**
 * Copyright 2017 Google Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sample;

import com.google.appengine.api.utils.SystemProperty;
import com.googlecode.objectify.Key;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

import static com.googlecode.objectify.ObjectifyService.ofy;

@RestController
public class HelloworldController {
    @GetMapping("/")
    public String index() {
        return "Hello world - springboot-appengine-standard!いえええええい！";
    }

    @GetMapping("/car")
    public String car() {

        return "かー";
    }

    @GetMapping("/hello")
    public String hello() throws Exception {
        Properties properties = System.getProperties();

        return "Hello App Engine - Standard using "
                + SystemProperty.version.get() + " Java " + properties.get("java.specification.version");
    }

    public static String getInfo() {
        return "Version: " + System.getProperty("java.version")
                + " OS: " + System.getProperty("os.name")
                + " User: " + System.getProperty("user.name");
    }

}
