package org.benoit.utils.vaadin;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class VaadinRepositoryEditor<T extends PagingAndSortingRepository<?, ?>> extends VerticalLayout {

	public T repo;

	public VaadinRepositoryEditor(T repo) {
		// TODO Auto-generated constructor stub
		super();
		this.repo = repo;
	}
}
