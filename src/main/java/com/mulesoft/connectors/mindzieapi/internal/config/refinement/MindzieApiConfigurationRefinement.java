package com.mulesoft.connectors.mindzieapi.internal.config.refinement;

import com.mulesoft.connectors.mindzieapi.internal.config.base.MindzieApiConfigurationBase;

/**
 * This refinement is the middle layer of the configuration generation gap pattern. It can be
 * overridden to add custom logic in the configuration.
 */
public abstract class MindzieApiConfigurationRefinement extends MindzieApiConfigurationBase {}
