package org.bbop.apollo.gwt.client;


import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.SplitLayoutPanel;

/**
 * Created by ndunn on 12/15/14.
 */
public class FeaturePanel extends SplitLayoutPanel{

    final HTML label = new HTML("Organism Panel");


    public FeaturePanel(){
        add(label);
    }


}