// 
// Decompiled by Procyon v0.5.30
// 

package com.bdoemu.core.network.sendable;

import com.bdoemu.commons.network.SendByteBuffer;
import com.bdoemu.commons.network.SendablePacket;
import com.bdoemu.core.network.GameClient;
import com.bdoemu.gameserver.model.creature.servant.Servant;

public class SMClearServantDeadCount extends SendablePacket<GameClient> {
    private Servant servant;

    public SMClearServantDeadCount(final Servant servant) {
        this.servant = servant;
    }

    protected void writeBody(final SendByteBuffer buffer) {
        buffer.writeQ(this.servant.getObjectId());
        buffer.writeD(this.servant.getDeathCount());
        buffer.writeC(this.servant.isClearedDeathCount());
    }
}
