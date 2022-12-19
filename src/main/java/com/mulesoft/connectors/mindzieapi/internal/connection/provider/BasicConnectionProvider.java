package com.mulesoft.connectors.mindzieapi.internal.connection.provider;

import com.mulesoft.connectors.mindzieapi.internal.connection.provider.refinement.BasicConnectionProviderRefinement;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

/**
 * This is the last layer of the connection provider generation gap pattern. It is what finally gets
 * exposed as the connection provider, including all customizations made in the refinement layer.
 */
@Alias("basic")
@DisplayName("Basic Connection Provider")
public class BasicConnectionProvider extends BasicConnectionProviderRefinement {}
