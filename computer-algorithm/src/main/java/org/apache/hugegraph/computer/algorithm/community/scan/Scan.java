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

import java.util.Iterator;

import org.apache.hugegraph.computer.core.config.Config;
import org.apache.hugegraph.computer.core.graph.id.Id;
import org.apache.hugegraph.computer.core.graph.vertex.Vertex;
import org.apache.hugegraph.computer.core.worker.Computation;
import org.apache.hugegraph.computer.core.worker.ComputationContext;

public class Scan implements Computation<Id> {
    public static final String OPTION_MU = "scan.mu";
    public static final String OPTION_EPS = "scan.eps";
    public static final int MU_DEFAULT_VALUE = 2;
    public static final double EPS_DEFAULT_VALUE = 0.6;

    private int mu = 0;
    private double eps = 0.0D;

    @Override
    public String name() {
        return "scan";
    }

    @Override
    public String category() {
        return "community";
    }

    @Override
    public void init(Config config) {
        this.mu = config.getInt(OPTION_MU, MU_DEFAULT_VALUE);
        this.eps = config.getDouble(OPTION_EPS, EPS_DEFAULT_VALUE);
    }

    @Override
    public void compute0(ComputationContext context, Vertex vertex) {
        // TODO
    }

    @Override
    public void compute(ComputationContext context, Vertex vertex, Iterator<Id> messages) {
        // TODO
    }
}
