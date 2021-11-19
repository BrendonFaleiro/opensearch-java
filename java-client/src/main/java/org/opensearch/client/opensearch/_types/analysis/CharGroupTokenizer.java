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

package org.opensearch.client.opensearch._types.analysis;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.CharGroupTokenizer
@JsonpDeserializable
public class CharGroupTokenizer extends TokenizerBase implements TokenizerVariant {
	private final List<String> tokenizeOnChars;

	@Nullable
	private final Integer maxTokenLength;

	// ---------------------------------------------------------------------------------------------

	private CharGroupTokenizer(Builder builder) {
		super(builder);

		this.tokenizeOnChars = ModelTypeHelper.unmodifiableRequired(builder.tokenizeOnChars, this, "tokenizeOnChars");
		this.maxTokenLength = builder.maxTokenLength;

	}

	public static CharGroupTokenizer of(Function<Builder, ObjectBuilder<CharGroupTokenizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Tokenizer} variant type
	 */
	@Override
	public String _variantType() {
		return "char_group";
	}

	/**
	 * Required - API name: {@code tokenize_on_chars}
	 */
	public final List<String> tokenizeOnChars() {
		return this.tokenizeOnChars;
	}

	/**
	 * API name: {@code max_token_length}
	 */
	@Nullable
	public final Integer maxTokenLength() {
		return this.maxTokenLength;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "char_group");
		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.tokenizeOnChars)) {
			generator.writeKey("tokenize_on_chars");
			generator.writeStartArray();
			for (String item0 : this.tokenizeOnChars) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.maxTokenLength != null) {
			generator.writeKey("max_token_length");
			generator.write(this.maxTokenLength);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CharGroupTokenizer}.
	 */
	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CharGroupTokenizer> {
		private List<String> tokenizeOnChars;

		@Nullable
		private Integer maxTokenLength;

		/**
		 * Required - API name: {@code tokenize_on_chars}
		 */
		public final Builder tokenizeOnChars(List<String> value) {
			this.tokenizeOnChars = value;
			return this;
		}

		/**
		 * Required - API name: {@code tokenize_on_chars}
		 */
		public final Builder tokenizeOnChars(String... value) {
			this.tokenizeOnChars = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code max_token_length}
		 */
		public final Builder maxTokenLength(@Nullable Integer value) {
			this.maxTokenLength = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CharGroupTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CharGroupTokenizer build() {
			_checkSingleUse();

			return new CharGroupTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CharGroupTokenizer}
	 */
	public static final JsonpDeserializer<CharGroupTokenizer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CharGroupTokenizer::setupCharGroupTokenizerDeserializer, Builder::build);

	protected static void setupCharGroupTokenizerDeserializer(DelegatingDeserializer<CharGroupTokenizer.Builder> op) {
		setupTokenizerBaseDeserializer(op);
		op.add(Builder::tokenizeOnChars, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"tokenize_on_chars");
		op.add(Builder::maxTokenLength, JsonpDeserializer.integerDeserializer(), "max_token_length");

		op.ignore("type");
	}

}
