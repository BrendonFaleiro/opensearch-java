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

package org.opensearch.clients.opensearch._types.query_dsl;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: _types.query_dsl.SpanWithinQuery

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/query_dsl/span.ts#L74-L77">API
 *      specification</a>
 */
@JsonpDeserializable
public class SpanWithinQuery extends QueryBase implements SpanQueryVariant, QueryVariant {
	private final SpanQuery big;

	private final SpanQuery little;

	// ---------------------------------------------------------------------------------------------

	private SpanWithinQuery(Builder builder) {
		super(builder);

		this.big = ApiTypeHelper.requireNonNull(builder.big, this, "big");
		this.little = ApiTypeHelper.requireNonNull(builder.little, this, "little");

	}

	public static SpanWithinQuery of(Function<Builder, ObjectBuilder<SpanWithinQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * SpanQuery variant kind.
	 */
	@Override
	public SpanQuery.Kind _spanQueryKind() {
		return SpanQuery.Kind.SpanWithin;
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.SpanWithin;
	}

	/**
	 * Required - API name: {@code big}
	 */
	public final SpanQuery big() {
		return this.big;
	}

	/**
	 * Required - API name: {@code little}
	 */
	public final SpanQuery little() {
		return this.little;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("big");
		this.big.serialize(generator, mapper);

		generator.writeKey("little");
		this.little.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanWithinQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SpanWithinQuery> {
		private SpanQuery big;

		private SpanQuery little;

		/**
		 * Required - API name: {@code big}
		 */
		public final Builder big(SpanQuery value) {
			this.big = value;
			return this;
		}

		/**
		 * Required - API name: {@code big}
		 */
		public final Builder big(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.big(fn.apply(new SpanQuery.Builder()).build());
		}

		/**
		 * Required - API name: {@code little}
		 */
		public final Builder little(SpanQuery value) {
			this.little = value;
			return this;
		}

		/**
		 * Required - API name: {@code little}
		 */
		public final Builder little(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.little(fn.apply(new SpanQuery.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanWithinQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanWithinQuery build() {
			_checkSingleUse();

			return new SpanWithinQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SpanWithinQuery}
	 */
	public static final JsonpDeserializer<SpanWithinQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SpanWithinQuery::setupSpanWithinQueryDeserializer);

	protected static void setupSpanWithinQueryDeserializer(ObjectDeserializer<SpanWithinQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::big, SpanQuery._DESERIALIZER, "big");
		op.add(Builder::little, SpanQuery._DESERIALIZER, "little");

	}

}