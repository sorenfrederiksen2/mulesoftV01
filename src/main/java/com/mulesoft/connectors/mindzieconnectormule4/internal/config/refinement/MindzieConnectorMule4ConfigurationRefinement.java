package com.mulesoft.connectors.mindzieconnectormule4.internal.config.refinement;

import com.mulesoft.connectors.mindzieconnectormule4.internal.config.base.MindzieConnectorMule4ConfigurationBase;

/**
 * This refinement is the middle layer of the configuration generation gap pattern. It can be
 * overridden to add custom logic in the configuration.
 */
public abstract class MindzieConnectorMule4ConfigurationRefinement
    extends MindzieConnectorMule4ConfigurationBase {}
