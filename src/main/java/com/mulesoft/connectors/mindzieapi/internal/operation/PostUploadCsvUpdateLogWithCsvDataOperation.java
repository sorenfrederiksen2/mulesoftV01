package com.mulesoft.connectors.mindzieapi.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.mindzieapi.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.mindzieapi.internal.metadata.PostUploadCsvUpdateLogWithCsvDataInputMetadataResolver;
import com.mulesoft.connectors.mindzieapi.internal.metadata.PostUploadCsvUpdateLogWithCsvDataOutputMetadataResolver;
import com.mulesoft.connectors.mindzieapi.internal.operation.refinement.PostUploadCsvUpdateLogWithCsvDataOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.api.metadata.TypedValue;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class PostUploadCsvUpdateLogWithCsvDataOperation
    extends PostUploadCsvUpdateLogWithCsvDataOperationRefinement {
  public PostUploadCsvUpdateLogWithCsvDataOperation() {
    super();
  }

  public PostUploadCsvUpdateLogWithCsvDataOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * This operation makes an HTTP POST request to the /UploadCsv/UpdateLogWithCsvData endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param logIdQueryParam
   * @param delimiterQueryParam
   * @param cultureQueryParam
   * @param encodingQueryParam
   * @param postUploadCsvUpdateLogWithCsvDataBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Create Upload Csv Update Log With Csv Data")
  @MediaType("application/json")
  @OutputResolver(
      output = PostUploadCsvUpdateLogWithCsvDataOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postUploadCsvUpdateLogWithCsvData(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional @DisplayName("Log Id") String logIdQueryParam,
      @Optional @DisplayName("Delimiter") String delimiterQueryParam,
      @Optional @DisplayName("Culture") String cultureQueryParam,
      @Optional @DisplayName("Encoding") String encodingQueryParam,
      @Content
          @DisplayName("Body")
          @TypeResolver(PostUploadCsvUpdateLogWithCsvDataInputMetadataResolver.class)
          TypedValue<InputStream> postUploadCsvUpdateLogWithCsvDataBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      CompletionCallback<InputStream, Object> callback) {
    super.postUploadCsvUpdateLogWithCsvData(
        config,
        connection,
        logIdQueryParam,
        delimiterQueryParam,
        cultureQueryParam,
        encodingQueryParam,
        postUploadCsvUpdateLogWithCsvDataBody,
        parameters,
        overrides,
        callback);
  }
}
