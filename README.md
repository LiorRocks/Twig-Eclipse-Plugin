# Artifactory P2 plugin deployment sample project
# Twig Eclipse Plugin -- sample project

   How to use the project?
   ________________________________________
   1. Create a new local Artifactory P2 repository for SNAPSHOTS/RELEASES
      Add it to the pom.xml file, in the area marked by a STEP 1 comment.
      In the attached example settings.xml file it's called p2-local.
   2. Create a new virtual Artifactory P2 repository
      Add to it the following urls:

      http://p2-dev.pdt-extensions.org/
      https://hudson.eclipse.org/hudson/job/dltk-nightly/lastSuccessfulBuild/artifact/org.eclipse.dltk.releng/build/update.site/target/site/
      http://download.eclipse.org/releases/luna
      http://download.eclipse.org/tools/pdt/updates/3.3-nightly/
      http://download.eclipse.org/tools/orbit/downloads/drops/R20130827064939/repository/

      These are the repositories which contain the dependecies.
      Make sure to add all the urls.

   3. Add an entry for the p2-virtual
   4. Run the command: mvn clean verify deploy
      This command is used to build and deploy the project as a P2 plugin to the repository
      created on step (1).
   5. The artifacts are deployed in a P2 compatible Maven layout.
      To install it in Eclipse, add p2-local to a virtual P2 repository, like p2-virtual.

   Explanation:
   ________________________________________
   1. The Parent pom.xml file defines the project's component, and configures use with Artifactory
   2. Each component (plugin, feature, source) is a separate module, stored in a separate folder
   3. Each component has its own packaging type: eclipse-plugin, eclipse-feature, eclipse-repository
   4. On deploy the project will be organized by its modules


   Additional links
   ________________________________________
   (1)(2) P2 Repositories - JFrog Artifactory Wiki
   	  https://www.jfrog.com/confluence/display/RTF/P2+Repositories

   (3) Eclipse Tycho for building Eclipse Plugins and RCP applications - Tutorial
       Author: Lars Vogel
       http://www.vogella.com/tutorials/EclipseTycho/article.html

