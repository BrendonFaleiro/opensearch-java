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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: slm.execute_lifecycle.Response
public final class ExecuteLifecycleResponse implements ToJsonp {
	private final String snapshotName;

	// ---------------------------------------------------------------------------------------------

	protected ExecuteLifecycleResponse(Builder builder) {

		this.snapshotName = Objects.requireNonNull(builder.snapshotName, "snapshot_name");

	}

	/**
	 * API name: {@code snapshot_name}
	 */
	public String snapshotName() {
		return this.snapshotName;
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

		generator.writeKey("snapshot_name");
		generator.write(this.snapshotName);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecuteLifecycleResponse}.
	 */
	public static class Builder implements ObjectBuilder<ExecuteLifecycleResponse> {
		private String snapshotName;

		/**
		 * API name: {@code snapshot_name}
		 */
		public Builder snapshotName(String value) {
			this.snapshotName = value;
			return this;
		}

		/**
		 * Builds a {@link ExecuteLifecycleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecuteLifecycleResponse build() {

			return new ExecuteLifecycleResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ExecuteLifecycleResponse
	 */
	public static final JsonpValueParser<ExecuteLifecycleResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ExecuteLifecycleResponse::setupExecuteLifecycleResponseParser);

	protected static void setupExecuteLifecycleResponseParser(
			DelegatingJsonpValueParser<ExecuteLifecycleResponse.Builder> op) {

		op.add(Builder::snapshotName, JsonpValueParser.stringParser(), "snapshot_name");

	}

}