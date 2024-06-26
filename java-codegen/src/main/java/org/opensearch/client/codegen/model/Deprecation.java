/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.codegen.model;

import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Deprecation {
    @Nullable
    private final String description;
    @Nullable
    private final String version;

    public Deprecation(@Nullable String description, @Nullable String version) {
        this.description = description;
        this.version = version;
    }

    @Nonnull
    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    @Nonnull
    public Optional<String> getVersion() {
        return Optional.ofNullable(version);
    }
}
