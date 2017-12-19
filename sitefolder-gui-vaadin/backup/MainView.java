package org.sitefolder.gui.vaadin.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;



/*
 * MainView is a simple HorizontalLayout that wraps the menu on the
 * left and creates a simple container for the navigator on the right.
 */
@Component
public class MainView extends HorizontalLayout  {
    
	@Autowired
	public MainView(SitefolderMenu siteFolderMenu) {
        setSizeFull();
        addStyleName("mainview");
        setSpacing(false);
        
        System.out.println("===========================================================================");
        System.out.println(siteFolderMenu);
        System.out.println("===========================================================================");
        addComponent(siteFolderMenu);

        ComponentContainer content = new CssLayout();
        content.addStyleName("view-content");
        content.setSizeFull();
        addComponent(content);
        setExpandRatio(content, 1.0f);

        //new SiteFolderNavigator(content);
    }
}
