package org.sitefolder.gui.vaadin;

import org.benoit.utils.vaadin.VaadinRepositoryEditor;
import org.sitefolder.Site;
import org.sitefolder.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.viritin.grid.MGrid;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;


@SpringComponent
@UIScope
public class SiteEditor extends VaadinRepositoryEditor<SiteRepository> {
	
	@Autowired
	public SiteEditor(SiteRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
		addComponent(new Label("Site list"));

		Grid<Site> grid = new Grid<>(Site.class);
		grid.setItems(repo.findAll());
		grid.setColumns("id", "name");
		
		addComponent(grid);
		
//		MGrid<Site> mGrid = new MGrid<>(Site.class);
//		mGrid.setItems(repo.findAll());
//		mGrid.setColumns("id", "name");
//		addComponent(mGrid);
//		for(Site site: repo.findAll()) {
//			addComponent(new Label("Site Name: " + site.getName()));
//			
//			site.
//		}
	}
}
