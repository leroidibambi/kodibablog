package lu.kodiba.blog.examples.vaadin.sidebar;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.vaadin.spring.sidebar.annotation.FontAwesomeIcon;
import org.vaadin.spring.sidebar.annotation.SideBarItem;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Notification;

@SideBarItem(sectionId = Sections.SECTION1, caption = "Item1")
@FontAwesomeIcon(FontAwesome.ANDROID)
@Component
public class ActionItem1 implements Runnable, Serializable {

	private static final long serialVersionUID = 7376470664287797415L;

	@Override
	public void run() {
		Notification.show("Item1 triggered!");
	}

}
