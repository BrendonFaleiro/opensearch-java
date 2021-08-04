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

package org.opensearch.clients.opensearch.cat;

import jakarta.json.JsonValue;
import org.opensearch.clients.base.OpenSearchError;
import org.opensearch.clients.base.Endpoint;
import org.opensearch.clients.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

// typedef: cat.trained_models.Request
public final class TrainedModelsRequest extends CatRequestBase {
	@Nullable
	private final String modelId;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final JsonValue bytes;

	@Nullable
	private final Number from;

	@Nullable
	private final Number size;

	// ---------------------------------------------------------------------------------------------

	protected TrainedModelsRequest(Builder builder) {

		this.modelId = builder.modelId;
		this.allowNoMatch = builder.allowNoMatch;
		this.bytes = builder.bytes;
		this.from = builder.from;
		this.size = builder.size;

	}

	/**
	 * API name: {@code model_id}
	 */
	@Nullable
	public String modelId() {
		return this.modelId;
	}

	/**
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * API name: {@code bytes}
	 */
	@Nullable
	public JsonValue bytes() {
		return this.bytes;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelsRequest}.
	 */
	public static class Builder implements ObjectBuilder<TrainedModelsRequest> {
		@Nullable
		private String modelId;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private JsonValue bytes;

		@Nullable
		private Number from;

		@Nullable
		private Number size;

		/**
		 * API name: {@code model_id}
		 */
		public Builder modelId(@Nullable String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * API name: {@code allow_no_match}
		 */
		public Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * API name: {@code bytes}
		 */
		public Builder bytes(@Nullable JsonValue value) {
			this.bytes = value;
			return this;
		}

		/**
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Number value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link TrainedModelsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelsRequest build() {

			return new TrainedModelsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.ml_trained_models}".
	 */
	public static final Endpoint<TrainedModelsRequest, TrainedModelsResponse, OpenSearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _modelId = 1 << 0;

				int propsSet = 0;

				if (request.modelId() != null)
					propsSet |= _modelId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/ml");
					buf.append("/trained_models");
					return buf.toString();
				}
				if (propsSet == (_modelId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/ml");
					buf.append("/trained_models");
					buf.append("/");
					buf.append(request.modelId);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				if (request.bytes != null) {
					params.put("bytes", request.bytes.toString());
				}
				if (request.from != null) {
					params.put("from", request.from.toString());
				}
				if (request.size != null) {
					params.put("size", request.size.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, TrainedModelsResponse.DESERIALIZER);
}
