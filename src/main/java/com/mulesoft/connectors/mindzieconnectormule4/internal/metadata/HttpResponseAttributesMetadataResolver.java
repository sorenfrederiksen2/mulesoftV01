package com.mulesoft.connectors.mindzieconnectormule4.internal.metadata;

import com.mulesoft.connectors.mindzieconnectormule4.internal.extension.MindzieConnectorMule4;

/**
 * Metadata output attributes resolver for {@link
 * com.mulesoft.connectivity.rest.commons.api.operation.HttpResponseAttributes}.
 */
public class HttpResponseAttributesMetadataResolver
    extends com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output
        .HttpResponseAttributesMetadataResolver {
  @Override
  public String getCategoryName() {
    return MindzieConnectorMule4.API_METADATA_CATEGORY;
  }
}
