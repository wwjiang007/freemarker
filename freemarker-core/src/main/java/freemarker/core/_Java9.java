/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package freemarker.core;

/**
 * Used internally only, might change without notice!
 * Used for accessing functionality that's only present in Java 9 or later.
 */
public interface _Java9 {
    /**
     * Using "JEP 238: Multi-Release JAR Files", links to the proper version of the {@link _Java9Impl} class.
     */
    _Java9 INSTANCE = new _Java9Impl();

    /**
     * Tells if Java 9 features can be used in the current run-time environment.
     */
    boolean isSupported();

    boolean isAccessibleAccordingToModuleExports(Class<?> m);

}
