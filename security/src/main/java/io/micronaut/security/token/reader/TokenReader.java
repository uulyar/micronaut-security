/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.security.token.reader;

import io.micronaut.core.order.Ordered;
import io.micronaut.http.HttpRequest;
import java.util.Optional;

/**
 * Responsible for reading the token data from a request.
 *
 * @author Sergio del Amo
 * @since 1.0
 */
@FunctionalInterface
public interface TokenReader extends Ordered {

    /**
     * Attempts to retrieve a token in a request.
     *
     * @param request The request to look for the token in
     * @return An optional token string
     */
    Optional<String> findToken(HttpRequest<?> request);
}
