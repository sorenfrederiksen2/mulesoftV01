package com.mulesoft.connectors.mindziemule4.internal.metadata;

import com.mulesoft.connectors.mindziemule4.internal.extension.MindzieMule4;

/**
 * Metadata output attributes resolver for {@link
 * com.mulesoft.connectivity.rest.commons.api.operation.HttpResponseAttributes}.
 */
public class HttpResponseAttributesMetadataResolver
    extends com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output
        .HttpResponseAttributesMetadataResolver {
  @Override
  public String getCategoryName() {
    return MindzieMule4.API_METADATA_CATEGORY;
  }
}
