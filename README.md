# Artifactory P2 plugin deployment sample project
# Twig Eclipse Plugin -- sample project

   How to use the project?
   ________________________________________
   1. Create a new local Artifactory P2 repository for SNAPSHOTS/RELEASES
       Add it to the pom.xml file, in the area marked by a STEP 1 comment
   2. Create a new virtual Artifactory P2 repository
       Add to it all the urls of the repositories in the comment marked as STEP 2.
       Make sure to add all the urls.
   3. Run the command: mvn clean verify deploy
       This command is used to build and deploy the project as a P2 plugin to the repository
       created on step (1).

   Explanation:
   ________________________________________
   - The Parent pom.xml file defines the project's component, and configures use with Artifactory
   - Each component (plugin, feature, source) is a separate module, stored in a separate folder
   - Each component has its own packaging type: eclipse-plugin, eclipse-feature, eclipse-repository
   - On deploy the project will be organized by its modules


   Additional links
   ________________________________________
   (1)(2) P2 Repositories - JFrog Artifactory Wiki
   	  https://www.jfrog.com/confluence/display/RTF/P2+Repositories

   (3) Eclipse Tycho for building Eclipse Plugins and RCP applications - Tutorial
       Author: Lars Vogel
       http://www.vogella.com/tutorials/EclipseTycho/article.html

