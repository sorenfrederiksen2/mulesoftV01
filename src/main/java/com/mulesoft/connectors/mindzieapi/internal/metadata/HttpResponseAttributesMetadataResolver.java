package com.mulesoft.connectors.mindzieapi.internal.metadata;

import com.mulesoft.connectors.mindzieapi.internal.extension.MindzieApi;

/**
 * Metadata output attributes resolver for {@link
 * com.mulesoft.connectivity.rest.commons.api.operation.HttpResponseAttributes}.
 */
public class HttpResponseAttributesMetadataResolver
    extends com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output
        .HttpResponseAttributesMetadataResolver {
  @Override
  public String getCategoryName() {
    return MindzieApi.API_METADATA_CATEGORY;
  }
}
