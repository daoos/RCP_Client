package org.hive2hive.rcp.client.handler;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Shell;
import org.hive2hive.rcp.client.bundleresourceloader.IBundleResourceLoader;
import org.hive2hive.rcp.client.handler.dialog.ConnectingToNetworkDialog;
import org.hive2hive.rcp.client.services.INetworkConnectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetworkConnectHandler {

	private static final Logger logger = LoggerFactory.getLogger(NetworkConnectHandler.class);

	@CanExecute
	public boolean canExecue(INetworkConnectionService networkConnectionService) {
		boolean canExecute = true;
		if (networkConnectionService.getCurrentNode() != null) {
			canExecute = !networkConnectionService.getCurrentNode().isConnected();
		}
		logger.debug("Was asked if can be executed, return [{}]", canExecute);
		return canExecute;
	}

	@Execute
	public void execute(Shell shell, INetworkConnectionService networkConnectionService,
			IBundleResourceLoader resourceLoader, IEventBroker eventBroker) {
		logger.debug("Connecting to the network now.");
		ConnectingToNetworkDialog dialog = new ConnectingToNetworkDialog(shell, resourceLoader);
		if (IDialogConstants.OK_ID == dialog.open()) {
			logger.debug("Connect was pressed");
			logger.debug("Have to create initial node = {}", dialog.isCreateInitialNodeSelected());
			if (dialog.isCreateInitialNodeSelected()) {
				networkConnectionService.createInitialNode(eventBroker);
			} else {
				logger.debug("Have to connect to node with address '{}:{}'", dialog.getIpAddress(), dialog.getPort());
				networkConnectionService.bootstrapToNetwork(dialog.getIpAddress(), dialog.getPort(), eventBroker);
			}
		} else {
			logger.debug("Cancel was pressed");
		}

	}

}
