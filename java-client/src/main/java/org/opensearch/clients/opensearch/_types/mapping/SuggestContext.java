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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.opensearch._types.mapping;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.SuggestContext
@JsonpDeserializable
public class SuggestContext implements JsonpSerializable {
	private final String name;

	@Nullable
	private final String path;

	private final String type;

	@Nullable
	private final String precision;

	// ---------------------------------------------------------------------------------------------

	private SuggestContext(Builder builder) {

		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.path = builder.path;
		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");
		this.precision = builder.precision;

	}

	public static SuggestContext of(Function<Builder, ObjectBuilder<SuggestContext>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code path}
	 */
	@Nullable
	public final String path() {
		return this.path;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * API name: {@code precision}
	 */
	@Nullable
	public final String precision() {
		return this.precision;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("name");
		generator.write(this.name);

		if (this.path != null) {
			generator.writeKey("path");
			generator.write(this.path);

		}
		generator.writeKey("type");
		generator.write(this.type);

		if (this.precision != null) {
			generator.writeKey("precision");
			generator.write(this.precision);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SuggestContext}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SuggestContext> {
		private String name;

		@Nullable
		private String path;

		private String type;

		@Nullable
		private String precision;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code path}
		 */
		public final Builder path(@Nullable String value) {
			this.path = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code precision}
		 */
		public final Builder precision(@Nullable String value) {
			this.precision = value;
			return this;
		}

		/**
		 * Builds a {@link SuggestContext}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SuggestContext build() {
			_checkSingleUse();

			return new SuggestContext(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SuggestContext}
	 */
	public static final JsonpDeserializer<SuggestContext> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SuggestContext::setupSuggestContextDeserializer, Builder::build);

	protected static void setupSuggestContextDeserializer(DelegatingDeserializer<SuggestContext.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::precision, JsonpDeserializer.stringDeserializer(), "precision");

	}

}