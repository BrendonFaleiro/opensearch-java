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

package co.elastic.clients.elasticsearch.cluster.remote_info;

import co.elastic.clients.json.JsonpSerializable;

/**
 * Base interface for {@link ClusterRemoteInfo} variants.
 */
public interface ClusterRemoteInfoVariant extends JsonpSerializable {

	ClusterRemoteInfo.Kind _clusterRemoteInfoKind();

	default ClusterRemoteInfo _toClusterRemoteInfo() {
		return new ClusterRemoteInfo(this);
	}

}