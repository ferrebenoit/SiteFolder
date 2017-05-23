package org.sitefolder.gui.vaadin;

import org.sitefolder.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI(path="/valo")
//@Theme("dashboard")
@Title("Site folder")
@Component
public class SiteFolderUI extends UI {
	private static final long serialVersionUID = 1L;
	
	private SiteEditor siteEditor;
	
	@Autowired
	public SiteFolderUI(SiteEditor siteEditor, SiteRepository siteRepo) {
		this.siteEditor = siteEditor;
		System.out.println("SiteFolderUI");
	}
	
	@Override
	protected void init(VaadinRequest request) {
		// TODO Auto-generated method stub
		setContent(siteEditor);
	} 

	
	protected void updateContent() {
	}
}
