package de.mechrain.device.sink;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.mechrain.log.Logging;
import de.mechrain.protocol.AbstractMechRainDataUnit;

public class DummySink implements IDataSink {

	private static final long serialVersionUID = -6425353735176602940L;

	private static final Logger LOG = LogManager.getLogger(Logging.DATA);

	@Override
	public boolean connect() {
		return true;
	}

	@Override
	public boolean isAvailable() {
		return true;
	}

	@Override
	public void handleDataUnit(final AbstractMechRainDataUnit mdu) {
		LOG.info(() -> "Received data unit - " + mdu);
	}

	@Override
	public void disconnect() {
	}
}
