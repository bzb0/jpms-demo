/*
 * Copyright 2017-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zbit.modules.rest.resources;

import com.zbit.strings.util.StringCreator;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.xml.XMLConstants;

@Path("/")
public class HelloResource {

  @GET
  @Path("/hello")
  public String sayHello() {
    return "Hello. 'The XML_NS_URI' is: " + XMLConstants.XML_NS_URI;
  }

  @GET
  @Path("/random")
  public String getRandom() {
    return new StringCreator().generateRandomString();
  }
}