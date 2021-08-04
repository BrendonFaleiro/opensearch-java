/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.opensearch.indices.get_mapping;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.opensearch._types.mapping.TypeMapping;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.function.Function;

// typedef: indices.get_mapping.IndexMappingRecord
public final class IndexMappingRecord implements ToJsonp {
	@Nullable
	private final TypeMapping item;

	private final TypeMapping mappings;

	// ---------------------------------------------------------------------------------------------

	protected IndexMappingRecord(Builder builder) {

		this.item = builder.item;
		this.mappings = Objects.requireNonNull(builder.mappings, "mappings");

	}

	/**
	 * API name: {@code item}
	 */
	@Nullable
	public TypeMapping item() {
		return this.item;
	}

	/**
	 * API name: {@code mappings}
	 */
	public TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.item != null) {

			generator.writeKey("item");
			this.item.toJsonp(generator, mapper);

		}

		generator.writeKey("mappings");
		this.mappings.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexMappingRecord}.
	 */
	public static class Builder implements ObjectBuilder<IndexMappingRecord> {
		@Nullable
		private TypeMapping item;

		private TypeMapping mappings;

		/**
		 * API name: {@code item}
		 */
		public Builder item(@Nullable TypeMapping value) {
			this.item = value;
			return this;
		}

		/**
		 * API name: {@code item}
		 */
		public Builder item(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.item(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * API name: {@code mappings}
		 */
		public Builder mappings(TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * API name: {@code mappings}
		 */
		public Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * Builds a {@link IndexMappingRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexMappingRecord build() {

			return new IndexMappingRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndexMappingRecord
	 */
	public static final JsonpDeserializer<IndexMappingRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndexMappingRecord::setupIndexMappingRecordDeserializer);

	protected static void setupIndexMappingRecordDeserializer(DelegatingDeserializer<IndexMappingRecord.Builder> op) {

		op.add(Builder::item, TypeMapping.DESERIALIZER, "item");
		op.add(Builder::mappings, TypeMapping.DESERIALIZER, "mappings");

	}

}
