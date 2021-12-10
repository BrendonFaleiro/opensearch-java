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

package org.opensearch.clients.elasticsearch._types.aggregations;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.function.Function;

// typedef: _types.aggregations.GeoLineSort

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/aggregations/metric.ts#L80-L82">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoLineSort implements JsonpSerializable {
	private final String field;

	// ---------------------------------------------------------------------------------------------

	private GeoLineSort(Builder builder) {

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

	}

	public static GeoLineSort of(Function<Builder, ObjectBuilder<GeoLineSort>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
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

		generator.writeKey("field");
		generator.write(this.field);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoLineSort}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GeoLineSort> {
		private String field;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Builds a {@link GeoLineSort}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoLineSort build() {
			_checkSingleUse();

			return new GeoLineSort(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoLineSort}
	 */
	public static final JsonpDeserializer<GeoLineSort> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoLineSort::setupGeoLineSortDeserializer);

	protected static void setupGeoLineSortDeserializer(ObjectDeserializer<GeoLineSort.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");

	}

}