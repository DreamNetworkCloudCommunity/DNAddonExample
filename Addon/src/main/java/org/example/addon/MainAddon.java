package org.example.addon;

import be.alexandre01.dreamnetwork.api.addons.Addon;
import be.alexandre01.dreamnetwork.api.addons.DreamExtension;

public class MainAddon extends DreamExtension {
    public MainAddon(Addon addon){
        super(addon);
    }

    @Override
    public void onLoad(){
        // If you want to compile it with Plugins in ressource use "mvn clean install -P PlugInAddon" instead of "mvn clean install"
        // Remove the comment if you want to register a plugin to the servers
        // -> "//" registerPluginToServers(MainAddon.class.getResourceAsStream("Plugins-1.0-SNAPSHOT.jar"),"YourPlugins.jar");
    }

}