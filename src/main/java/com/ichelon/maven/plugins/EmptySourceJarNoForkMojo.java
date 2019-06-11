package com.ichelon.maven.plugins;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.source.SourceJarNoForkMojo;
import org.apache.maven.project.MavenProject;

import java.util.Collections;
import java.util.List;

@Mojo(name = "jar-no-fork", defaultPhase = LifecyclePhase.PACKAGE, threadSafe = true)
public class EmptySourceJarNoForkMojo extends SourceJarNoForkMojo {

    @Override
    protected List<String> getSources(MavenProject p) {
        return Collections.emptyList();
    }
}
