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

package org.opensearch.clients.opensearch.features;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.base.OpenSearchError;
import org.opensearch.clients.base.Endpoint;
import org.opensearch.clients.opensearch._types.RequestBase;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// typedef: features.get_features.Request
public final class GetFeaturesRequest extends RequestBase implements ToJsonp {
	private final String stubA;

	private final String stubB;

	private final String stubC;

	// ---------------------------------------------------------------------------------------------

	protected GetFeaturesRequest(Builder builder) {

		this.stubA = Objects.requireNonNull(builder.stubA, "stub_a");
		this.stubB = Objects.requireNonNull(builder.stubB, "stub_b");
		this.stubC = Objects.requireNonNull(builder.stubC, "stub_c");

	}

	/**
	 * API name: {@code stub_a}
	 */
	public String stubA() {
		return this.stubA;
	}

	/**
	 * API name: {@code stub_b}
	 */
	public String stubB() {
		return this.stubB;
	}

	/**
	 * API name: {@code stub_c}
	 */
	public String stubC() {
		return this.stubC;
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

		generator.writeKey("stub_c");
		generator.write(this.stubC);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetFeaturesRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetFeaturesRequest> {
		private String stubA;

		private String stubB;

		private String stubC;

		/**
		 * API name: {@code stub_a}
		 */
		public Builder stubA(String value) {
			this.stubA = value;
			return this;
		}

		/**
		 * API name: {@code stub_b}
		 */
		public Builder stubB(String value) {
			this.stubB = value;
			return this;
		}

		/**
		 * API name: {@code stub_c}
		 */
		public Builder stubC(String value) {
			this.stubC = value;
			return this;
		}

		/**
		 * Builds a {@link GetFeaturesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetFeaturesRequest build() {

			return new GetFeaturesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetFeaturesRequest
	 */
	public static final JsonpDeserializer<GetFeaturesRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetFeaturesRequest::setupGetFeaturesRequestDeserializer);

	protected static void setupGetFeaturesRequestDeserializer(DelegatingDeserializer<GetFeaturesRequest.Builder> op) {

		op.add(Builder::stubC, JsonpDeserializer.stringDeserializer(), "stub_c");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code features.get_features}".
	 */
	public static final Endpoint<GetFeaturesRequest, GetFeaturesResponse, OpenSearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_features";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("stub_b", request.stubB);
				return params;

			}, Endpoint.Simple.emptyMap(), true, GetFeaturesResponse.DESERIALIZER);
}
