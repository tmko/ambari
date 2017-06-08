/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ambari.server.agent;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;


public class CommandReport {

  private String role;
  private String actionId;
  private String stdout;
  private String stderr;
  private String structuredOut;
  private String status;
  int exitCode;
  private String clusterName;
  private String serviceName;
  private long taskId;
  private String roleCommand;
  private String customCommand;
  private Map<String, Map<String, String>> configurationTags;

  @JsonProperty("customCommand")
  @com.fasterxml.jackson.annotation.JsonProperty("customCommand")
  public String getCustomCommand() {
    return customCommand;
  }

  @JsonProperty("customCommand")
  @com.fasterxml.jackson.annotation.JsonProperty("customCommand")
  public void setCustomCommand(String customCommand) {
    this.customCommand = customCommand;
  }

  @JsonProperty("taskId")
  @com.fasterxml.jackson.annotation.JsonProperty("taskId")
  public long getTaskId() {
    return taskId;
  }
  
  @JsonProperty("taskId")
  @com.fasterxml.jackson.annotation.JsonProperty("taskId")
  public void setTaskId(long taskId) {
    this.taskId = taskId;
  }
  
  @JsonProperty("clusterName")
  @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }
  
  @JsonProperty("clusterName")
  @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
  public String getClusterName() {
    return this.clusterName;
  }

  @JsonProperty("actionId")
  @com.fasterxml.jackson.annotation.JsonProperty("actionId")
  public String getActionId() {
    return this.actionId;
  }
  
  @JsonProperty("actionId")
  @com.fasterxml.jackson.annotation.JsonProperty("actionId")
  public void setActionId(String actionId) {
    this.actionId = actionId;
  }
  
  @JsonProperty("stderr")
  @com.fasterxml.jackson.annotation.JsonProperty("stderr")
  public String getStdErr() {
    return this.stderr;
  }
  
  @JsonProperty("stderr")
  @com.fasterxml.jackson.annotation.JsonProperty("stderr")
  public void setStdErr(String stderr) {
    this.stderr = stderr;
  }
  
  @JsonProperty("exitcode")
  @com.fasterxml.jackson.annotation.JsonProperty("exitcode")
  public int getExitCode() {
    return this.exitCode;
  }
  
  @JsonProperty("exitcode")
  @com.fasterxml.jackson.annotation.JsonProperty("exitcode")
  public void setExitCode(int exitCode) {
    this.exitCode = exitCode;
  }
  
  @JsonProperty("stdout")
  @com.fasterxml.jackson.annotation.JsonProperty("stdout")
  public String getStdOut() {
    return this.stdout;
  }
  
  @JsonProperty("stdout")
  @com.fasterxml.jackson.annotation.JsonProperty("stdout")
  public void setStdOut(String stdout) {
    this.stdout = stdout;
  }

  @JsonProperty("structuredOut")
  @com.fasterxml.jackson.annotation.JsonProperty("structuredOut")
  public String getStructuredOut() {
    return this.structuredOut;
  }


  @JsonProperty("structuredOut")
  @com.fasterxml.jackson.annotation.JsonProperty("structuredOut")
  public void setStructuredOut(String structuredOut) {
    this.structuredOut = structuredOut;
  }

  @JsonProperty("roleCommand")
  @com.fasterxml.jackson.annotation.JsonProperty("roleCommand")
  public String getRoleCommand() {
    return this.roleCommand;
  }

  @JsonProperty("roleCommand")
  @com.fasterxml.jackson.annotation.JsonProperty("roleCommand")
  public void setRoleCommand(String roleCommand) {
    this.roleCommand = roleCommand;
  }

  @JsonProperty("role")
  @com.fasterxml.jackson.annotation.JsonProperty("role")
  public String getRole() {
    return role;
  }
  
  @JsonProperty("role")
  @com.fasterxml.jackson.annotation.JsonProperty("role")
  public void setRole(String role) {
    this.role = role;
  }
  
  @JsonProperty("status")
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  public String getStatus() {
    return status;
  }
  
  @JsonProperty("status")
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }
  
  @JsonProperty("serviceName")
  @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }
  
  @JsonProperty("serviceName")
  @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * @param tags the config tags that match this command
   */
  @JsonProperty("configurationTags")
  @com.fasterxml.jackson.annotation.JsonProperty("configurationTags")
  public void setConfigurationTags(Map<String, Map<String,String>> tags) {
    configurationTags = tags;
  }
  
  /**
   * @return the config tags that match this command, or <code>null</code>
   * if none are present
   */
  @JsonProperty("configurationTags")
  @com.fasterxml.jackson.annotation.JsonProperty("configurationTags")
  public Map<String, Map<String,String>> getConfigurationTags() {
    return configurationTags;
  }

  @Override
  public String toString() {
    return "CommandReport{" +
            "role='" + role + '\'' +
            ", actionId='" + actionId + '\'' +
            ", status='" + status + '\'' +
            ", exitCode=" + exitCode +
            ", clusterName='" + clusterName + '\'' +
            ", serviceName='" + serviceName + '\'' +
            ", taskId=" + taskId +
            ", roleCommand=" + roleCommand +
            ", configurationTags=" + configurationTags +
            ", customCommand=" + customCommand +
            '}';
  }
}
