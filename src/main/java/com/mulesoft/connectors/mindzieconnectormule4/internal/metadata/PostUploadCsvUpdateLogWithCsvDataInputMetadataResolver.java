package com.mulesoft.connectors.mindzieconnectormule4.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.StringInputMetadataResolver;
import com.mulesoft.connectors.mindzieconnectormule4.internal.extension.MindzieConnectorMule4;

public class PostUploadCsvUpdateLogWithCsvDataInputMetadataResolver
    extends StringInputMetadataResolver {
  @Override
  public String getResolverName() {
    return "post-upload-csv-update-log-with-csv-data-input-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return MindzieConnectorMule4.API_METADATA_CATEGORY;
  }
}
