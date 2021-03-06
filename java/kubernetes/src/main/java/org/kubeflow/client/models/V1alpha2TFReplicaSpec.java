/*
 * kubeflow
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1alpha2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.kubeflow.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1PodTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TFReplicaSpec is a description of the TFReplica
 */
@ApiModel(description = "TFReplicaSpec is a description of the TFReplica")

public class V1alpha2TFReplicaSpec {
  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("restartPolicy")
  private String restartPolicy = null;

  @SerializedName("template")
  private V1PodTemplateSpec template = null;

  public V1alpha2TFReplicaSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the desired number of replicas of the given template. If unspecified, defaults to 1.
   * @return replicas
  **/
  @ApiModelProperty(value = "Replicas is the desired number of replicas of the given template. If unspecified, defaults to 1.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public V1alpha2TFReplicaSpec restartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

   /**
   * Restart policy for all TFReplicas within the TFJob. One of Always, OnFailure, Never and ExitCode. Default to Never.
   * @return restartPolicy
  **/
  @ApiModelProperty(value = "Restart policy for all TFReplicas within the TFJob. One of Always, OnFailure, Never and ExitCode. Default to Never.")
  public String getRestartPolicy() {
    return restartPolicy;
  }

  public void setRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
  }

  public V1alpha2TFReplicaSpec template(V1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

   /**
   * Template is the object that describes the pod that will be created for this TFReplica. RestartPolicy in PodTemplateSpec will be overide by RestartPolicy in TFReplicaSpec
   * @return template
  **/
  @ApiModelProperty(value = "Template is the object that describes the pod that will be created for this TFReplica. RestartPolicy in PodTemplateSpec will be overide by RestartPolicy in TFReplicaSpec")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2TFReplicaSpec v1alpha2TFReplicaSpec = (V1alpha2TFReplicaSpec) o;
    return Objects.equals(this.replicas, v1alpha2TFReplicaSpec.replicas) &&
        Objects.equals(this.restartPolicy, v1alpha2TFReplicaSpec.restartPolicy) &&
        Objects.equals(this.template, v1alpha2TFReplicaSpec.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicas, restartPolicy, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2TFReplicaSpec {\n");
    
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

