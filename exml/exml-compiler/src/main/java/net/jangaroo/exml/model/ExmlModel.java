package net.jangaroo.exml.model;

import net.jangaroo.exml.json.JsonObject;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExmlModel {
  private String packageName;
  private String className;
  private String parentClassName;
  private Set<String> imports = new LinkedHashSet<String>();
  private JsonObject jsonObject = new JsonObject();

  public String getPackageName() {
    return packageName;
  }

  public String getClassName() {
    return className;
  }

  public String getParentClassName() {
    return parentClassName;
  }

  public Set<String> getImports() {
    return imports;
  }

  public JsonObject getJsonObject() {
    return jsonObject;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public void setParentClassName(String parentClassName) {
    this.parentClassName = parentClassName;
    addImport(parentClassName);
  }

  public void addImport(String parentClassName) {
    imports.add(parentClassName);
  }
}