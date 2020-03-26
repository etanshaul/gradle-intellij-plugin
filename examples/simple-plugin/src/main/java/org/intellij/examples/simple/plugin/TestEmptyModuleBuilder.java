package org.intellij.examples.simple.plugin;

import com.intellij.ide.util.projectWizard.EmptyModuleBuilder;

public class TestEmptyModuleBuilder extends EmptyModuleBuilder {
    @Override
    public String getPresentableName() {
        return "Test empty module - still shows up in the 'new module' wizard";
    }
}
