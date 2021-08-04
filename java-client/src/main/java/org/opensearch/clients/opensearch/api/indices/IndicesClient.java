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

package org.opensearch.clients.opensearch.api.indices;

import org.opensearch.client.RequestOptions;
import org.opensearch.clients.base.ApiClient;
import org.opensearch.clients.base.BooleanResponse;
import org.opensearch.clients.base.Transport;
import org.opensearch.clients.opensearch.indices.AddBlockRequest;
import org.opensearch.clients.opensearch.indices.AddBlockResponse;
import org.opensearch.clients.opensearch.indices.AnalyzeRequest;
import org.opensearch.clients.opensearch.indices.AnalyzeResponse;
import org.opensearch.clients.opensearch.indices.ClearCacheRequest;
import org.opensearch.clients.opensearch.indices.ClearCacheResponse;
import org.opensearch.clients.opensearch.indices.CloneRequest;
import org.opensearch.clients.opensearch.indices.CloneResponse;
import org.opensearch.clients.opensearch.indices.CloseRequest;
import org.opensearch.clients.opensearch.indices.CloseResponse;
import org.opensearch.clients.opensearch.indices.CreateDataStreamRequest;
import org.opensearch.clients.opensearch.indices.CreateDataStreamResponse;
import org.opensearch.clients.opensearch.indices.CreateRequest;
import org.opensearch.clients.opensearch.indices.CreateResponse;
import org.opensearch.clients.opensearch.indices.DataStreamsStatsRequest;
import org.opensearch.clients.opensearch.indices.DataStreamsStatsResponse;
import org.opensearch.clients.opensearch.indices.DeleteAliasRequest;
import org.opensearch.clients.opensearch.indices.DeleteAliasResponse;
import org.opensearch.clients.opensearch.indices.DeleteDataStreamRequest;
import org.opensearch.clients.opensearch.indices.DeleteDataStreamResponse;
import org.opensearch.clients.opensearch.indices.DeleteIndexTemplateRequest;
import org.opensearch.clients.opensearch.indices.DeleteIndexTemplateResponse;
import org.opensearch.clients.opensearch.indices.DeleteRequest;
import org.opensearch.clients.opensearch.indices.DeleteResponse;
import org.opensearch.clients.opensearch.indices.DeleteTemplateRequest;
import org.opensearch.clients.opensearch.indices.DeleteTemplateResponse;
import org.opensearch.clients.opensearch.indices.ExistsAliasRequest;
import org.opensearch.clients.opensearch.indices.ExistsIndexTemplateRequest;
import org.opensearch.clients.opensearch.indices.ExistsRequest;
import org.opensearch.clients.opensearch.indices.ExistsTemplateRequest;
import org.opensearch.clients.opensearch.indices.ExistsTypeRequest;
import org.opensearch.clients.opensearch.indices.FlushRequest;
import org.opensearch.clients.opensearch.indices.FlushResponse;
import org.opensearch.clients.opensearch.indices.FlushSyncedRequest;
import org.opensearch.clients.opensearch.indices.FlushSyncedResponse;
import org.opensearch.clients.opensearch.indices.ForcemergeRequest;
import org.opensearch.clients.opensearch.indices.ForcemergeResponse;
import org.opensearch.clients.opensearch.indices.FreezeRequest;
import org.opensearch.clients.opensearch.indices.FreezeResponse;
import org.opensearch.clients.opensearch.indices.GetAliasRequest;
import org.opensearch.clients.opensearch.indices.GetAliasResponse;
import org.opensearch.clients.opensearch.indices.GetDataStreamRequest;
import org.opensearch.clients.opensearch.indices.GetDataStreamResponse;
import org.opensearch.clients.opensearch.indices.GetFieldMappingRequest;
import org.opensearch.clients.opensearch.indices.GetFieldMappingResponse;
import org.opensearch.clients.opensearch.indices.GetIndexTemplateRequest;
import org.opensearch.clients.opensearch.indices.GetIndexTemplateResponse;
import org.opensearch.clients.opensearch.indices.GetMappingRequest;
import org.opensearch.clients.opensearch.indices.GetMappingResponse;
import org.opensearch.clients.opensearch.indices.GetRequest;
import org.opensearch.clients.opensearch.indices.GetResponse;
import org.opensearch.clients.opensearch.indices.GetSettingsRequest;
import org.opensearch.clients.opensearch.indices.GetSettingsResponse;
import org.opensearch.clients.opensearch.indices.GetTemplateRequest;
import org.opensearch.clients.opensearch.indices.GetTemplateResponse;
import org.opensearch.clients.opensearch.indices.GetUpgradeRequest;
import org.opensearch.clients.opensearch.indices.GetUpgradeResponse;
import org.opensearch.clients.opensearch.indices.MigrateToDataStreamRequest;
import org.opensearch.clients.opensearch.indices.MigrateToDataStreamResponse;
import org.opensearch.clients.opensearch.indices.OpenRequest;
import org.opensearch.clients.opensearch.indices.OpenResponse;
import org.opensearch.clients.opensearch.indices.PutAliasRequest;
import org.opensearch.clients.opensearch.indices.PutAliasResponse;
import org.opensearch.clients.opensearch.indices.PutIndexTemplateRequest;
import org.opensearch.clients.opensearch.indices.PutIndexTemplateResponse;
import org.opensearch.clients.opensearch.indices.PutMappingRequest;
import org.opensearch.clients.opensearch.indices.PutMappingResponse;
import org.opensearch.clients.opensearch.indices.PutSettingsRequest;
import org.opensearch.clients.opensearch.indices.PutSettingsResponse;
import org.opensearch.clients.opensearch.indices.PutTemplateRequest;
import org.opensearch.clients.opensearch.indices.PutTemplateResponse;
import org.opensearch.clients.opensearch.indices.RecoveryRequest;
import org.opensearch.clients.opensearch.indices.RecoveryResponse;
import org.opensearch.clients.opensearch.indices.RefreshRequest;
import org.opensearch.clients.opensearch.indices.RefreshResponse;
import org.opensearch.clients.opensearch.indices.ReloadSearchAnalyzersRequest;
import org.opensearch.clients.opensearch.indices.ReloadSearchAnalyzersResponse;
import org.opensearch.clients.opensearch.indices.ResolveIndexRequest;
import org.opensearch.clients.opensearch.indices.ResolveIndexResponse;
import org.opensearch.clients.opensearch.indices.RolloverRequest;
import org.opensearch.clients.opensearch.indices.RolloverResponse;
import org.opensearch.clients.opensearch.indices.SegmentsRequest;
import org.opensearch.clients.opensearch.indices.SegmentsResponse;
import org.opensearch.clients.opensearch.indices.ShardStoresRequest;
import org.opensearch.clients.opensearch.indices.ShardStoresResponse;
import org.opensearch.clients.opensearch.indices.ShrinkRequest;
import org.opensearch.clients.opensearch.indices.ShrinkResponse;
import org.opensearch.clients.opensearch.indices.SimulateIndexTemplateRequest;
import org.opensearch.clients.opensearch.indices.SimulateIndexTemplateResponse;
import org.opensearch.clients.opensearch.indices.SimulateTemplateRequest;
import org.opensearch.clients.opensearch.indices.SimulateTemplateResponse;
import org.opensearch.clients.opensearch.indices.SplitRequest;
import org.opensearch.clients.opensearch.indices.SplitResponse;
import org.opensearch.clients.opensearch.indices.StatsRequest;
import org.opensearch.clients.opensearch.indices.StatsResponse;
import org.opensearch.clients.opensearch.indices.UnfreezeRequest;
import org.opensearch.clients.opensearch.indices.UnfreezeResponse;
import org.opensearch.clients.opensearch.indices.UpdateAliasesRequest;
import org.opensearch.clients.opensearch.indices.UpdateAliasesResponse;
import org.opensearch.clients.opensearch.indices.UpgradeRequest;
import org.opensearch.clients.opensearch.indices.UpgradeResponse;
import org.opensearch.clients.opensearch.indices.ValidateQueryRequest;
import org.opensearch.clients.opensearch.indices.ValidateQueryResponse;
import org.opensearch.clients.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.function.Function;

/**
 * Client for the indices namespace.
 */
public class IndicesClient extends ApiClient<IndicesClient> {

	public IndicesClient(Transport transport) {
		super(transport, null);
	}

	public IndicesClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: indices.add_block

	/**
	 * Adds a block to an index.
	 *
	 */

	public AddBlockResponse addBlock(AddBlockRequest request) throws IOException {
		return this.transport.performRequest(request, AddBlockRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Adds a block to an index.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final AddBlockResponse addBlock(Function<AddBlockRequest.Builder, ObjectBuilder<AddBlockRequest>> fn)
			throws IOException {
		return addBlock(fn.apply(new AddBlockRequest.Builder()).build());
	}

	// ----- Endpoint: indices.analyze

	/**
	 * Performs the analysis process on a text and return the tokens breakdown of
	 * the text.
	 *
	 */

	public AnalyzeResponse analyze(AnalyzeRequest request) throws IOException {
		return this.transport.performRequest(request, AnalyzeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Performs the analysis process on a text and return the tokens breakdown of
	 * the text.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final AnalyzeResponse analyze(Function<AnalyzeRequest.Builder, ObjectBuilder<AnalyzeRequest>> fn)
			throws IOException {
		return analyze(fn.apply(new AnalyzeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.clear_cache

	/**
	 * Clears all or specific caches for one or more indices.
	 *
	 */

	public ClearCacheResponse clearCache(ClearCacheRequest request) throws IOException {
		return this.transport.performRequest(request, ClearCacheRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Clears all or specific caches for one or more indices.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ClearCacheResponse clearCache(Function<ClearCacheRequest.Builder, ObjectBuilder<ClearCacheRequest>> fn)
			throws IOException {
		return clearCache(fn.apply(new ClearCacheRequest.Builder()).build());
	}

	// ----- Endpoint: indices.clone

	/**
	 * Clones an index
	 *
	 */

	public CloneResponse clone(CloneRequest request) throws IOException {
		return this.transport.performRequest(request, CloneRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Clones an index
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CloneResponse clone(Function<CloneRequest.Builder, ObjectBuilder<CloneRequest>> fn)
			throws IOException {
		return clone(fn.apply(new CloneRequest.Builder()).build());
	}

	// ----- Endpoint: indices.close

	/**
	 * Closes an index.
	 *
	 */

	public CloseResponse close(CloseRequest request) throws IOException {
		return this.transport.performRequest(request, CloseRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Closes an index.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CloseResponse close(Function<CloseRequest.Builder, ObjectBuilder<CloseRequest>> fn)
			throws IOException {
		return close(fn.apply(new CloseRequest.Builder()).build());
	}

	// ----- Endpoint: indices.create

	/**
	 * Creates an index with optional settings and mappings.
	 *
	 */

	public CreateResponse create(CreateRequest request) throws IOException {
		return this.transport.performRequest(request, CreateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates an index with optional settings and mappings.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CreateResponse create(Function<CreateRequest.Builder, ObjectBuilder<CreateRequest>> fn)
			throws IOException {
		return create(fn.apply(new CreateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.create_data_stream

	/**
	 * Creates a data stream
	 *
	 */

	public CreateDataStreamResponse createDataStream(CreateDataStreamRequest request) throws IOException {
		return this.transport.performRequest(request, CreateDataStreamRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates a data stream
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CreateDataStreamResponse createDataStream(
			Function<CreateDataStreamRequest.Builder, ObjectBuilder<CreateDataStreamRequest>> fn) throws IOException {
		return createDataStream(fn.apply(new CreateDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.data_streams_stats

	/**
	 * Provides statistics on operations happening in a data stream.
	 *
	 */

	public DataStreamsStatsResponse dataStreamsStats(DataStreamsStatsRequest request) throws IOException {
		return this.transport.performRequest(request, DataStreamsStatsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Provides statistics on operations happening in a data stream.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DataStreamsStatsResponse dataStreamsStats(
			Function<DataStreamsStatsRequest.Builder, ObjectBuilder<DataStreamsStatsRequest>> fn) throws IOException {
		return dataStreamsStats(fn.apply(new DataStreamsStatsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete

	/**
	 * Deletes an index.
	 *
	 */

	public DeleteResponse delete(DeleteRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an index.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DeleteResponse delete(Function<DeleteRequest.Builder, ObjectBuilder<DeleteRequest>> fn)
			throws IOException {
		return delete(fn.apply(new DeleteRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_alias

	/**
	 * Deletes an alias.
	 *
	 */

	public DeleteAliasResponse deleteAlias(DeleteAliasRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteAliasRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an alias.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DeleteAliasResponse deleteAlias(
			Function<DeleteAliasRequest.Builder, ObjectBuilder<DeleteAliasRequest>> fn) throws IOException {
		return deleteAlias(fn.apply(new DeleteAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_data_stream

	/**
	 * Deletes a data stream.
	 *
	 */

	public DeleteDataStreamResponse deleteDataStream(DeleteDataStreamRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteDataStreamRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes a data stream.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DeleteDataStreamResponse deleteDataStream(
			Function<DeleteDataStreamRequest.Builder, ObjectBuilder<DeleteDataStreamRequest>> fn) throws IOException {
		return deleteDataStream(fn.apply(new DeleteDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_index_template

	/**
	 * Deletes an index template.
	 *
	 */

	public DeleteIndexTemplateResponse deleteIndexTemplate(DeleteIndexTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteIndexTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an index template.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DeleteIndexTemplateResponse deleteIndexTemplate(
			Function<DeleteIndexTemplateRequest.Builder, ObjectBuilder<DeleteIndexTemplateRequest>> fn)
			throws IOException {
		return deleteIndexTemplate(fn.apply(new DeleteIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_template

	/**
	 * Deletes an index template.
	 *
	 */

	public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an index template.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DeleteTemplateResponse deleteTemplate(
			Function<DeleteTemplateRequest.Builder, ObjectBuilder<DeleteTemplateRequest>> fn) throws IOException {
		return deleteTemplate(fn.apply(new DeleteTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists

	/**
	 * Returns information about whether a particular index exists.
	 *
	 */

	public BooleanResponse exists(ExistsRequest request) throws IOException {
		return this.transport.performRequest(request, ExistsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about whether a particular index exists.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final BooleanResponse exists(Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn)
			throws IOException {
		return exists(fn.apply(new ExistsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_alias

	/**
	 * Returns information about whether a particular alias exists.
	 *
	 */

	public BooleanResponse existsAlias(ExistsAliasRequest request) throws IOException {
		return this.transport.performRequest(request, ExistsAliasRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about whether a particular alias exists.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final BooleanResponse existsAlias(Function<ExistsAliasRequest.Builder, ObjectBuilder<ExistsAliasRequest>> fn)
			throws IOException {
		return existsAlias(fn.apply(new ExistsAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_index_template

	/**
	 * Returns information about whether a particular index template exists.
	 *
	 */

	public BooleanResponse existsIndexTemplate(ExistsIndexTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, ExistsIndexTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about whether a particular index template exists.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final BooleanResponse existsIndexTemplate(
			Function<ExistsIndexTemplateRequest.Builder, ObjectBuilder<ExistsIndexTemplateRequest>> fn)
			throws IOException {
		return existsIndexTemplate(fn.apply(new ExistsIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_template

	/**
	 * Returns information about whether a particular index template exists.
	 *
	 */

	public BooleanResponse existsTemplate(ExistsTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, ExistsTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about whether a particular index template exists.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final BooleanResponse existsTemplate(
			Function<ExistsTemplateRequest.Builder, ObjectBuilder<ExistsTemplateRequest>> fn) throws IOException {
		return existsTemplate(fn.apply(new ExistsTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_type

	/**
	 * Returns information about whether a particular document type exists.
	 * (DEPRECATED)
	 *
	 */

	public BooleanResponse existsType(ExistsTypeRequest request) throws IOException {
		return this.transport.performRequest(request, ExistsTypeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about whether a particular document type exists.
	 * (DEPRECATED)
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final BooleanResponse existsType(Function<ExistsTypeRequest.Builder, ObjectBuilder<ExistsTypeRequest>> fn)
			throws IOException {
		return existsType(fn.apply(new ExistsTypeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.flush

	/**
	 * Performs the flush operation on one or more indices.
	 *
	 */

	public FlushResponse flush(FlushRequest request) throws IOException {
		return this.transport.performRequest(request, FlushRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Performs the flush operation on one or more indices.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final FlushResponse flush(Function<FlushRequest.Builder, ObjectBuilder<FlushRequest>> fn)
			throws IOException {
		return flush(fn.apply(new FlushRequest.Builder()).build());
	}

	// ----- Endpoint: indices.flush_synced

	/**
	 * Performs a synced flush operation on one or more indices. Synced flush is
	 * deprecated and will be removed in 8.0. Use flush instead
	 *
	 */

	public FlushSyncedResponse flushSynced(FlushSyncedRequest request) throws IOException {
		return this.transport.performRequest(request, FlushSyncedRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Performs a synced flush operation on one or more indices. Synced flush is
	 * deprecated and will be removed in 8.0. Use flush instead
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final FlushSyncedResponse flushSynced(
			Function<FlushSyncedRequest.Builder, ObjectBuilder<FlushSyncedRequest>> fn) throws IOException {
		return flushSynced(fn.apply(new FlushSyncedRequest.Builder()).build());
	}

	// ----- Endpoint: indices.forcemerge

	/**
	 * Performs the force merge operation on one or more indices.
	 *
	 */

	public ForcemergeResponse forcemerge(ForcemergeRequest request) throws IOException {
		return this.transport.performRequest(request, ForcemergeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Performs the force merge operation on one or more indices.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ForcemergeResponse forcemerge(Function<ForcemergeRequest.Builder, ObjectBuilder<ForcemergeRequest>> fn)
			throws IOException {
		return forcemerge(fn.apply(new ForcemergeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.freeze

	/**
	 * Freezes an index. A frozen index has almost no overhead on the cluster
	 * (except for maintaining its metadata in memory) and is read-only.
	 *
	 */

	public FreezeResponse freeze(FreezeRequest request) throws IOException {
		return this.transport.performRequest(request, FreezeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Freezes an index. A frozen index has almost no overhead on the cluster
	 * (except for maintaining its metadata in memory) and is read-only.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final FreezeResponse freeze(Function<FreezeRequest.Builder, ObjectBuilder<FreezeRequest>> fn)
			throws IOException {
		return freeze(fn.apply(new FreezeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get

	/**
	 * Returns information about one or more indices.
	 *
	 */

	public GetResponse get(GetRequest request) throws IOException {
		return this.transport.performRequest(request, GetRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about one or more indices.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetResponse get(Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn) throws IOException {
		return get(fn.apply(new GetRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_alias

	/**
	 * Returns an alias.
	 *
	 */

	public GetAliasResponse getAlias(GetAliasRequest request) throws IOException {
		return this.transport.performRequest(request, GetAliasRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns an alias.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetAliasResponse getAlias(Function<GetAliasRequest.Builder, ObjectBuilder<GetAliasRequest>> fn)
			throws IOException {
		return getAlias(fn.apply(new GetAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_data_stream

	/**
	 * Returns data streams.
	 *
	 */

	public GetDataStreamResponse getDataStream(GetDataStreamRequest request) throws IOException {
		return this.transport.performRequest(request, GetDataStreamRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns data streams.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetDataStreamResponse getDataStream(
			Function<GetDataStreamRequest.Builder, ObjectBuilder<GetDataStreamRequest>> fn) throws IOException {
		return getDataStream(fn.apply(new GetDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_field_mapping

	/**
	 * Returns mapping for one or more fields.
	 *
	 */

	public GetFieldMappingResponse getFieldMapping(GetFieldMappingRequest request) throws IOException {
		return this.transport.performRequest(request, GetFieldMappingRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns mapping for one or more fields.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetFieldMappingResponse getFieldMapping(
			Function<GetFieldMappingRequest.Builder, ObjectBuilder<GetFieldMappingRequest>> fn) throws IOException {
		return getFieldMapping(fn.apply(new GetFieldMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_index_template

	/**
	 * Returns an index template.
	 *
	 */

	public GetIndexTemplateResponse getIndexTemplate(GetIndexTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, GetIndexTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns an index template.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetIndexTemplateResponse getIndexTemplate(
			Function<GetIndexTemplateRequest.Builder, ObjectBuilder<GetIndexTemplateRequest>> fn) throws IOException {
		return getIndexTemplate(fn.apply(new GetIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_mapping

	/**
	 * Returns mappings for one or more indices.
	 *
	 */

	public GetMappingResponse getMapping(GetMappingRequest request) throws IOException {
		return this.transport.performRequest(request, GetMappingRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns mappings for one or more indices.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetMappingResponse getMapping(Function<GetMappingRequest.Builder, ObjectBuilder<GetMappingRequest>> fn)
			throws IOException {
		return getMapping(fn.apply(new GetMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_settings

	/**
	 * Returns settings for one or more indices.
	 *
	 */

	public GetSettingsResponse getSettings(GetSettingsRequest request) throws IOException {
		return this.transport.performRequest(request, GetSettingsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns settings for one or more indices.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetSettingsResponse getSettings(
			Function<GetSettingsRequest.Builder, ObjectBuilder<GetSettingsRequest>> fn) throws IOException {
		return getSettings(fn.apply(new GetSettingsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_template

	/**
	 * Returns an index template.
	 *
	 */

	public GetTemplateResponse getTemplate(GetTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, GetTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns an index template.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetTemplateResponse getTemplate(
			Function<GetTemplateRequest.Builder, ObjectBuilder<GetTemplateRequest>> fn) throws IOException {
		return getTemplate(fn.apply(new GetTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_upgrade

	/**
	 * DEPRECATED Returns a progress status of current upgrade.
	 *
	 */

	public GetUpgradeResponse getUpgrade(GetUpgradeRequest request) throws IOException {
		return this.transport.performRequest(request, GetUpgradeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * DEPRECATED Returns a progress status of current upgrade.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetUpgradeResponse getUpgrade(Function<GetUpgradeRequest.Builder, ObjectBuilder<GetUpgradeRequest>> fn)
			throws IOException {
		return getUpgrade(fn.apply(new GetUpgradeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.migrate_to_data_stream

	/**
	 * Migrates an alias to a data stream
	 *
	 */

	public MigrateToDataStreamResponse migrateToDataStream(MigrateToDataStreamRequest request) throws IOException {
		return this.transport.performRequest(request, MigrateToDataStreamRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Migrates an alias to a data stream
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final MigrateToDataStreamResponse migrateToDataStream(
			Function<MigrateToDataStreamRequest.Builder, ObjectBuilder<MigrateToDataStreamRequest>> fn)
			throws IOException {
		return migrateToDataStream(fn.apply(new MigrateToDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.open

	/**
	 * Opens an index.
	 *
	 */

	public OpenResponse open(OpenRequest request) throws IOException {
		return this.transport.performRequest(request, OpenRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Opens an index.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final OpenResponse open(Function<OpenRequest.Builder, ObjectBuilder<OpenRequest>> fn) throws IOException {
		return open(fn.apply(new OpenRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_alias

	/**
	 * Creates or updates an alias.
	 *
	 */

	public PutAliasResponse putAlias(PutAliasRequest request) throws IOException {
		return this.transport.performRequest(request, PutAliasRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates or updates an alias.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PutAliasResponse putAlias(Function<PutAliasRequest.Builder, ObjectBuilder<PutAliasRequest>> fn)
			throws IOException {
		return putAlias(fn.apply(new PutAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_index_template

	/**
	 * Creates or updates an index template.
	 *
	 */

	public PutIndexTemplateResponse putIndexTemplate(PutIndexTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, PutIndexTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates or updates an index template.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PutIndexTemplateResponse putIndexTemplate(
			Function<PutIndexTemplateRequest.Builder, ObjectBuilder<PutIndexTemplateRequest>> fn) throws IOException {
		return putIndexTemplate(fn.apply(new PutIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_mapping

	/**
	 * Updates the index mappings.
	 *
	 */

	public PutMappingResponse putMapping(PutMappingRequest request) throws IOException {
		return this.transport.performRequest(request, PutMappingRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates the index mappings.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PutMappingResponse putMapping(Function<PutMappingRequest.Builder, ObjectBuilder<PutMappingRequest>> fn)
			throws IOException {
		return putMapping(fn.apply(new PutMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_settings

	/**
	 * Updates the index settings.
	 *
	 */

	public PutSettingsResponse putSettings(PutSettingsRequest request) throws IOException {
		return this.transport.performRequest(request, PutSettingsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates the index settings.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PutSettingsResponse putSettings(
			Function<PutSettingsRequest.Builder, ObjectBuilder<PutSettingsRequest>> fn) throws IOException {
		return putSettings(fn.apply(new PutSettingsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_template

	/**
	 * Creates or updates an index template.
	 *
	 */

	public PutTemplateResponse putTemplate(PutTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, PutTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates or updates an index template.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PutTemplateResponse putTemplate(
			Function<PutTemplateRequest.Builder, ObjectBuilder<PutTemplateRequest>> fn) throws IOException {
		return putTemplate(fn.apply(new PutTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.recovery

	/**
	 * Returns information about ongoing index shard recoveries.
	 *
	 */

	public RecoveryResponse recovery(RecoveryRequest request) throws IOException {
		return this.transport.performRequest(request, RecoveryRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about ongoing index shard recoveries.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final RecoveryResponse recovery(Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn)
			throws IOException {
		return recovery(fn.apply(new RecoveryRequest.Builder()).build());
	}

	// ----- Endpoint: indices.refresh

	/**
	 * Performs the refresh operation in one or more indices.
	 *
	 */

	public RefreshResponse refresh(RefreshRequest request) throws IOException {
		return this.transport.performRequest(request, RefreshRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Performs the refresh operation in one or more indices.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final RefreshResponse refresh(Function<RefreshRequest.Builder, ObjectBuilder<RefreshRequest>> fn)
			throws IOException {
		return refresh(fn.apply(new RefreshRequest.Builder()).build());
	}

	// ----- Endpoint: indices.reload_search_analyzers

	/**
	 * Reloads an index's search analyzers and their resources.
	 *
	 */

	public ReloadSearchAnalyzersResponse reloadSearchAnalyzers(ReloadSearchAnalyzersRequest request)
			throws IOException {
		return this.transport.performRequest(request, ReloadSearchAnalyzersRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Reloads an index's search analyzers and their resources.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ReloadSearchAnalyzersResponse reloadSearchAnalyzers(
			Function<ReloadSearchAnalyzersRequest.Builder, ObjectBuilder<ReloadSearchAnalyzersRequest>> fn)
			throws IOException {
		return reloadSearchAnalyzers(fn.apply(new ReloadSearchAnalyzersRequest.Builder()).build());
	}

	// ----- Endpoint: indices.resolve_index

	/**
	 * Returns information about any matching indices, aliases, and data streams
	 *
	 */

	public ResolveIndexResponse resolveIndex(ResolveIndexRequest request) throws IOException {
		return this.transport.performRequest(request, ResolveIndexRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about any matching indices, aliases, and data streams
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ResolveIndexResponse resolveIndex(
			Function<ResolveIndexRequest.Builder, ObjectBuilder<ResolveIndexRequest>> fn) throws IOException {
		return resolveIndex(fn.apply(new ResolveIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.rollover

	/**
	 * Updates an alias to point to a new index when the existing index is
	 * considered to be too large or too old.
	 *
	 */

	public RolloverResponse rollover(RolloverRequest request) throws IOException {
		return this.transport.performRequest(request, RolloverRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates an alias to point to a new index when the existing index is
	 * considered to be too large or too old.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final RolloverResponse rollover(Function<RolloverRequest.Builder, ObjectBuilder<RolloverRequest>> fn)
			throws IOException {
		return rollover(fn.apply(new RolloverRequest.Builder()).build());
	}

	// ----- Endpoint: indices.segments

	/**
	 * Provides low-level information about segments in a Lucene index.
	 *
	 */

	public SegmentsResponse segments(SegmentsRequest request) throws IOException {
		return this.transport.performRequest(request, SegmentsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Provides low-level information about segments in a Lucene index.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final SegmentsResponse segments(Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn)
			throws IOException {
		return segments(fn.apply(new SegmentsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.shard_stores

	/**
	 * Provides store information for shard copies of indices.
	 *
	 */

	public ShardStoresResponse shardStores(ShardStoresRequest request) throws IOException {
		return this.transport.performRequest(request, ShardStoresRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Provides store information for shard copies of indices.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ShardStoresResponse shardStores(
			Function<ShardStoresRequest.Builder, ObjectBuilder<ShardStoresRequest>> fn) throws IOException {
		return shardStores(fn.apply(new ShardStoresRequest.Builder()).build());
	}

	// ----- Endpoint: indices.shrink

	/**
	 * Allow to shrink an existing index into a new index with fewer primary shards.
	 *
	 */

	public ShrinkResponse shrink(ShrinkRequest request) throws IOException {
		return this.transport.performRequest(request, ShrinkRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Allow to shrink an existing index into a new index with fewer primary shards.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ShrinkResponse shrink(Function<ShrinkRequest.Builder, ObjectBuilder<ShrinkRequest>> fn)
			throws IOException {
		return shrink(fn.apply(new ShrinkRequest.Builder()).build());
	}

	// ----- Endpoint: indices.simulate_index_template

	/**
	 * Simulate matching the given index name against the index templates in the
	 * system
	 *
	 */

	public SimulateIndexTemplateResponse simulateIndexTemplate(SimulateIndexTemplateRequest request)
			throws IOException {
		return this.transport.performRequest(request, SimulateIndexTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Simulate matching the given index name against the index templates in the
	 * system
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final SimulateIndexTemplateResponse simulateIndexTemplate(
			Function<SimulateIndexTemplateRequest.Builder, ObjectBuilder<SimulateIndexTemplateRequest>> fn)
			throws IOException {
		return simulateIndexTemplate(fn.apply(new SimulateIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.simulate_template

	/**
	 * Simulate resolving the given template name or body
	 *
	 */

	public SimulateTemplateResponse simulateTemplate(SimulateTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, SimulateTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Simulate resolving the given template name or body
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final SimulateTemplateResponse simulateTemplate(
			Function<SimulateTemplateRequest.Builder, ObjectBuilder<SimulateTemplateRequest>> fn) throws IOException {
		return simulateTemplate(fn.apply(new SimulateTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.split

	/**
	 * Allows you to split an existing index into a new index with more primary
	 * shards.
	 *
	 */

	public SplitResponse split(SplitRequest request) throws IOException {
		return this.transport.performRequest(request, SplitRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Allows you to split an existing index into a new index with more primary
	 * shards.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final SplitResponse split(Function<SplitRequest.Builder, ObjectBuilder<SplitRequest>> fn)
			throws IOException {
		return split(fn.apply(new SplitRequest.Builder()).build());
	}

	// ----- Endpoint: indices.stats

	/**
	 * Provides statistics on operations happening in an index.
	 *
	 */

	public StatsResponse stats(StatsRequest request) throws IOException {
		return this.transport.performRequest(request, StatsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Provides statistics on operations happening in an index.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final StatsResponse stats(Function<StatsRequest.Builder, ObjectBuilder<StatsRequest>> fn)
			throws IOException {
		return stats(fn.apply(new StatsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.unfreeze

	/**
	 * Unfreezes an index. When a frozen index is unfrozen, the index goes through
	 * the normal recovery process and becomes writeable again.
	 *
	 */

	public UnfreezeResponse unfreeze(UnfreezeRequest request) throws IOException {
		return this.transport.performRequest(request, UnfreezeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Unfreezes an index. When a frozen index is unfrozen, the index goes through
	 * the normal recovery process and becomes writeable again.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final UnfreezeResponse unfreeze(Function<UnfreezeRequest.Builder, ObjectBuilder<UnfreezeRequest>> fn)
			throws IOException {
		return unfreeze(fn.apply(new UnfreezeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.update_aliases

	/**
	 * Updates index aliases.
	 *
	 */

	public UpdateAliasesResponse updateAliases(UpdateAliasesRequest request) throws IOException {
		return this.transport.performRequest(request, UpdateAliasesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates index aliases.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final UpdateAliasesResponse updateAliases(
			Function<UpdateAliasesRequest.Builder, ObjectBuilder<UpdateAliasesRequest>> fn) throws IOException {
		return updateAliases(fn.apply(new UpdateAliasesRequest.Builder()).build());
	}

	// ----- Endpoint: indices.upgrade

	/**
	 * DEPRECATED Upgrades to the current version of Lucene.
	 *
	 */

	public UpgradeResponse upgrade(UpgradeRequest request) throws IOException {
		return this.transport.performRequest(request, UpgradeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * DEPRECATED Upgrades to the current version of Lucene.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final UpgradeResponse upgrade(Function<UpgradeRequest.Builder, ObjectBuilder<UpgradeRequest>> fn)
			throws IOException {
		return upgrade(fn.apply(new UpgradeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.validate_query

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 *
	 */

	public ValidateQueryResponse validateQuery(ValidateQueryRequest request) throws IOException {
		return this.transport.performRequest(request, ValidateQueryRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ValidateQueryResponse validateQuery(
			Function<ValidateQueryRequest.Builder, ObjectBuilder<ValidateQueryRequest>> fn) throws IOException {
		return validateQuery(fn.apply(new ValidateQueryRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #IndicesClient} with specific request options.
	 */
	@Override
	public IndicesClient withRequestOptions(@Nullable RequestOptions options) {
		return new IndicesClient(transport, options);
	}

	/**
	 * Creates a new {@link #IndicesClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public IndicesClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
