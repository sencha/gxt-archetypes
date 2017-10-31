package com.sencha.gxt.archetypes.generator;

import java.util.ArrayList;
import java.util.List;

import org.gonevertical.archetypes.generator.GwtArchetypeGenerator;

public class RunGenerator {

  public static void main(String[] args) {
    new RunGenerator().run();
  }

  public class GwtArchetypeGeneratorExt extends GwtArchetypeGenerator {
    @Override
    protected void findAndReplaceInFileTypes() {
      super.findAndReplaceInFileTypes();

      // GXT - basePackage = "tld.domain.project"
      if (gwtClientPackage != null && !gwtClientPackage.isEmpty()) {
        regexFindAndReplaceFiles(".theme", gwtClientPackage, "\\${package}");
      }
    }
  }

  public void run() {
    List<String> projects = new ArrayList<String>();

    // GXT 3
    // projects.add("gxt-basic-public-3x");
    // projects.add("gxt-basic-support-3x");
    // projects.add("gxt-theme-31x");

    // GXT 4
    // projects.add("gxt-basic-support-4x");
    projects.add("gxt-theme-40x"); // with theme
    projects.add("gxt-theme-40x-ap"); // with theme and ap
    projects.add("gxt-theme-40x-gwtp");

    // GXT 5
    // projects.add("gxt-basic-support-5x");

    GwtArchetypeGenerator generate = new GwtArchetypeGeneratorExt();
    generate.setProjects(projects);
    generate.setDeploy(true);
    generate.run();
  }

}
