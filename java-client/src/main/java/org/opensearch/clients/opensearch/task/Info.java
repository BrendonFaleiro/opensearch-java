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

package org.opensearch.clients.opensearch.task;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

// typedef: task._types.Info
public final class Info implements ToJsonp {
	private final String action;

	private final Boolean cancellable;

	@Nullable
	private final List<org.opensearch.clients.opensearch.task.Info> children;

	@Nullable
	private final String description;

	private final Map<String, List<String>> headers;

	private final Number id;

	private final String node;

	private final Number runningTimeInNanos;

	private final Number startTimeInMillis;

	@Nullable
	private final Status status;

	private final String type;

	@Nullable
	private final String parentTaskId;

	// ---------------------------------------------------------------------------------------------

	protected Info(Builder builder) {

		this.action = Objects.requireNonNull(builder.action, "action");
		this.cancellable = Objects.requireNonNull(builder.cancellable, "cancellable");
		this.children = builder.children;
		this.description = builder.description;
		this.headers = Objects.requireNonNull(builder.headers, "headers");
		this.id = Objects.requireNonNull(builder.id, "id");
		this.node = Objects.requireNonNull(builder.node, "node");
		this.runningTimeInNanos = Objects.requireNonNull(builder.runningTimeInNanos, "running_time_in_nanos");
		this.startTimeInMillis = Objects.requireNonNull(builder.startTimeInMillis, "start_time_in_millis");
		this.status = builder.status;
		this.type = Objects.requireNonNull(builder.type, "type");
		this.parentTaskId = builder.parentTaskId;

	}

	/**
	 * API name: {@code action}
	 */
	public String action() {
		return this.action;
	}

	/**
	 * API name: {@code cancellable}
	 */
	public Boolean cancellable() {
		return this.cancellable;
	}

	/**
	 * API name: {@code children}
	 */
	@Nullable
	public List<org.opensearch.clients.opensearch.task.Info> children() {
		return this.children;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code headers}
	 */
	public Map<String, List<String>> headers() {
		return this.headers;
	}

	/**
	 * API name: {@code id}
	 */
	public Number id() {
		return this.id;
	}

	/**
	 * API name: {@code node}
	 */
	public String node() {
		return this.node;
	}

	/**
	 * API name: {@code running_time_in_nanos}
	 */
	public Number runningTimeInNanos() {
		return this.runningTimeInNanos;
	}

	/**
	 * API name: {@code start_time_in_millis}
	 */
	public Number startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * API name: {@code status}
	 */
	@Nullable
	public Status status() {
		return this.status;
	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code parent_task_id}
	 */
	@Nullable
	public String parentTaskId() {
		return this.parentTaskId;
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

		generator.writeKey("action");
		generator.write(this.action);

		generator.writeKey("cancellable");
		generator.write(this.cancellable);

		if (this.children != null) {

			generator.writeKey("children");
			generator.writeStartArray();
			for (org.opensearch.clients.opensearch.task.Info item0 : this.children) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}

		generator.writeKey("headers");
		generator.writeStartObject();
		for (Map.Entry<String, List<String>> item0 : this.headers.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartArray();
			for (String item1 : item0.getValue()) {
				generator.write(item1);

			}
			generator.writeEnd();

		}
		generator.writeEnd();

		generator.writeKey("id");
		generator.write(this.id.doubleValue());

		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("running_time_in_nanos");
		generator.write(this.runningTimeInNanos.doubleValue());

		generator.writeKey("start_time_in_millis");
		generator.write(this.startTimeInMillis.doubleValue());

		if (this.status != null) {

			generator.writeKey("status");
			this.status.toJsonp(generator, mapper);

		}

		generator.writeKey("type");
		generator.write(this.type);

		if (this.parentTaskId != null) {

			generator.writeKey("parent_task_id");
			generator.write(this.parentTaskId);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Info}.
	 */
	public static class Builder implements ObjectBuilder<Info> {
		private String action;

		private Boolean cancellable;

		@Nullable
		private List<org.opensearch.clients.opensearch.task.Info> children;

		@Nullable
		private String description;

		private Map<String, List<String>> headers;

		private Number id;

		private String node;

		private Number runningTimeInNanos;

		private Number startTimeInMillis;

		@Nullable
		private Status status;

		private String type;

		@Nullable
		private String parentTaskId;

		/**
		 * API name: {@code action}
		 */
		public Builder action(String value) {
			this.action = value;
			return this;
		}

		/**
		 * API name: {@code cancellable}
		 */
		public Builder cancellable(Boolean value) {
			this.cancellable = value;
			return this;
		}

		/**
		 * API name: {@code children}
		 */
		public Builder children(@Nullable List<org.opensearch.clients.opensearch.task.Info> value) {
			this.children = value;
			return this;
		}

		/**
		 * API name: {@code children}
		 */
		public Builder children(org.opensearch.clients.opensearch.task.Info... value) {
			this.children = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #children(List)}, creating the list if needed.
		 */
		public Builder addChildren(org.opensearch.clients.opensearch.task.Info value) {
			if (this.children == null) {
				this.children = new ArrayList<>();
			}
			this.children.add(value);
			return this;
		}

		/**
		 * Set {@link #children(List)} to a singleton list.
		 */
		public Builder children(
				Function<org.opensearch.clients.opensearch.task.Info.Builder,
					ObjectBuilder<org.opensearch.clients.opensearch.task.Info>> fn) {
			return this.children(fn.apply(new org.opensearch.clients.opensearch.task.Info.Builder()).build());
		}

		/**
		 * Add a value to {@link #children(List)}, creating the list if needed.
		 */
		public Builder addChildren(
				Function<org.opensearch.clients.opensearch.task.Info.Builder,
					ObjectBuilder<org.opensearch.clients.opensearch.task.Info>> fn) {
			return this.addChildren(fn.apply(new org.opensearch.clients.opensearch.task.Info.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code headers}
		 */
		public Builder headers(Map<String, List<String>> value) {
			this.headers = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #headers(Map)}, creating the map if needed.
		 */
		public Builder putHeaders(String key, List<String> value) {
			if (this.headers == null) {
				this.headers = new HashMap<>();
			}
			this.headers.put(key, value);
			return this;
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(Number value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public Builder node(String value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code running_time_in_nanos}
		 */
		public Builder runningTimeInNanos(Number value) {
			this.runningTimeInNanos = value;
			return this;
		}

		/**
		 * API name: {@code start_time_in_millis}
		 */
		public Builder startTimeInMillis(Number value) {
			this.startTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(@Nullable Status value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(Function<Status.Builder, ObjectBuilder<Status>> fn) {
			return this.status(fn.apply(new Status.Builder()).build());
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code parent_task_id}
		 */
		public Builder parentTaskId(@Nullable String value) {
			this.parentTaskId = value;
			return this;
		}

		/**
		 * Builds a {@link Info}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Info build() {

			return new Info(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Info
	 */
	public static final JsonpDeserializer<Info> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Info::setupInfoDeserializer);

	protected static void setupInfoDeserializer(DelegatingDeserializer<Info.Builder> op) {

		op.add(Builder::action, JsonpDeserializer.stringDeserializer(), "action");
		op.add(Builder::cancellable, JsonpDeserializer.booleanDeserializer(), "cancellable");
		op.add(Builder::children,
				JsonpDeserializer.arrayDeserializer(org.opensearch.clients.opensearch.task.Info.DESERIALIZER),
				"children");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::headers, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "headers");
		op.add(Builder::id, JsonpDeserializer.numberDeserializer(), "id");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::runningTimeInNanos, JsonpDeserializer.numberDeserializer(), "running_time_in_nanos");
		op.add(Builder::startTimeInMillis, JsonpDeserializer.numberDeserializer(), "start_time_in_millis");
		op.add(Builder::status, Status.DESERIALIZER, "status");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::parentTaskId, JsonpDeserializer.stringDeserializer(), "parent_task_id");

	}

}
