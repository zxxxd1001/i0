package com.thoughtworks.i0.gradle.puppet

class ModuleSet {
    @Delegate Set<Module> modules = new HashSet<>()

    def module(String notation) {
        add(Module.of(notation))
    }
}
