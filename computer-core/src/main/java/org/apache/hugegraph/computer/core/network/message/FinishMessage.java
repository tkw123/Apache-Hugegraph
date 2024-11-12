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

package org.apache.hugegraph.computer.core.network.message;

import io.netty.buffer.ByteBuf;

public class FinishMessage extends AbstractMessage implements RequestMessage {

    public FinishMessage(int finishId) {
        super(finishId);
    }

    @Override
    public MessageType type() {
        return MessageType.FINISH;
    }

    public static FinishMessage parseFrom(ByteBuf buf) {
        int ackId = buf.readInt();

        int partition = buf.readInt();
        assert partition == 0;
        int bodyLength = buf.readInt();
        assert bodyLength == 0;
        return new FinishMessage(ackId);
    }
}
