/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.apache.hugegraph.computer.algorithm.community.scan;

import java.io.IOException;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.hugegraph.computer.core.graph.id.Id;
import org.apache.hugegraph.computer.core.graph.value.IdSet;
import org.apache.hugegraph.computer.core.graph.value.Value;
import org.apache.hugegraph.computer.core.graph.value.Value.CustomizeValue;
import org.apache.hugegraph.computer.core.io.RandomAccessInput;
import org.apache.hugegraph.computer.core.io.RandomAccessOutput;

public class ScanValue implements CustomizeValue<Object> {

    private IdSet neighbors;
    private IdSet eps_neighbors;
    private int cluster;

    public ScanValue() {
        this.neighbors = new IdSet();
        this.eps_neighbors = new IdSet();
        this.cluster = 0;
    }

    public void neighbors(IdSet neighbors) {
        this.neighbors = neighbors;
    }

    public IdSet neighbors() {
        return this.neighbors;
    }

    public void epsNbAdd(Id nb) {
        this.eps_neighbors.add(nb);
    }

    public IdSet epsNeighbors() {
        return this.eps_neighbors;
    }

    public void cluster(int cluster) {
        this.cluster = cluster;
    }

    public int cluster() {
        return this.cluster;
    }

    @Override
    public Value copy() {
        ScanValue scanValue = new ScanValue();
        scanValue.neighbors = this.neighbors.copy();
        scanValue.eps_neighbors = this.eps_neighbors.copy();
        scanValue.cluster = this.cluster;
        return scanValue;
    }

    @Override
    public void read(RandomAccessInput in) throws IOException {
        this.neighbors.read(in);
        this.eps_neighbors.read(in);
        this.cluster = in.readInt();
    }

    @Override
    public void write(RandomAccessOutput out) throws IOException {
        this.neighbors.write(out);
        this.eps_neighbors.write(out);
        out.writeInt(this.cluster);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("neighbors", this.neighbors)
                .append("epsNeighbors", this.eps_neighbors)
                .append("cluster", this.cluster)
                .toString();
    }

    @Override
    public Object value() {
        return this.cluster;
    }
}
