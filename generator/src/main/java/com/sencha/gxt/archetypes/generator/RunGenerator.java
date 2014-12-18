package com.sencha.gxt.archetypes.generator;

import java.util.ArrayList;
import java.util.List;

import org.gonevertical.archetypes.generator.GwtArchetypeGenerator;

public class RunGenerator {

  public static void main(String[] args) {
    new RunGenerator().run();
  }
  
  public void run() {
    List<String> projects = new ArrayList<String>();
    projects.add("gwt-basic-public-3x");
    projects.add("gwt-basic-support-3x");

    GwtArchetypeGenerator generate = new GwtArchetypeGenerator();
    generate.setProjects(projects);
    generate.setDeploy(true);
    generate.run();
  }

}
