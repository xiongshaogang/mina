/*
 *   @(#) $Id$
 *
 *   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package org.apache.mina.transport.socket.nio;

import org.apache.mina.common.IoConnector;
import org.apache.mina.common.support.DelegatedIoConnector;
import org.apache.mina.transport.socket.nio.support.DatagramConnectorDelegate;

/**
 * {@link IoConnector} for datagram transport (UDP/IP).
 * 
 * @author The Apache Directory Project (dev@directory.apache.org)
 * @version $Rev$, $Date$
 */
public class DatagramConnector extends DelegatedIoConnector implements DatagramSessionManager
{
    /**
     * Creates a new instance.
     */
    public DatagramConnector()
    {
        init( new DatagramConnectorDelegate( this ) );
    }

    public int getReceiveBufferSize()
    {
        return ( ( DatagramConnectorDelegate ) delegate ).getReceiveBufferSize();
    }

    public void setReceiveBufferSize( int receiveBufferSize )
    {
        ( ( DatagramConnectorDelegate ) delegate ).setReceiveBufferSize( receiveBufferSize );
    }

    public boolean getBroadcast()
    {
        return ( ( DatagramConnectorDelegate ) delegate ).getBroadcast();
    }

    public void setBroadcast( boolean broadcast )
    {
        ( ( DatagramConnectorDelegate ) delegate ).setBroadcast( broadcast );
    }

    public int getSendBufferSize()
    {
        return ( ( DatagramConnectorDelegate ) delegate ).getSendBufferSize();
    }

    public void setSendBufferSize( int sendBufferSize )
    {
        ( ( DatagramConnectorDelegate ) delegate ).setSendBufferSize( sendBufferSize );
    }

    public int getTrafficClass()
    {
        return ( ( DatagramConnectorDelegate ) delegate ).getTrafficClass();
    }

    public void setTrafficClass( int trafficClass )
    {
        ( ( DatagramConnectorDelegate ) delegate ).setTrafficClass( trafficClass );
    }


    public boolean getReuseAddress()
    {
        return ( ( DatagramConnectorDelegate ) delegate ).getReuseAddress();
    }

    public void setReuseAddress( boolean reuseAddress )
    {
        ( ( DatagramConnectorDelegate ) delegate ).setReuseAddress( reuseAddress );
    }
}
